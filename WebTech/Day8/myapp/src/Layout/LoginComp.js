import axios from 'axios';
import React, { useRef } from 'react'
import { useNavigate } from 'react-router-dom';

const LoginComp = () => {
  const nav=useNavigate();
  let uid=useRef();
  let upass=useRef();
  const getDetailed=()=>{
    // console.log(uid.current.value);
    let userId=uid.current.value;
    let userpass=upass.current.value;
    axios.get("http://localhost:2000/product").then((res)=>{
      let userData=res.data;
      let currentUser=userData.filter((val)=>{return val.pname===userId && val.pcom===userpass})
      if(currentUser.length>0){
        window.alert("Login Successfull");
        sessionStorage.setItem("user",uid);
        nav("/dashboard")
      }else{
        window.alert("Wrong credential");
        uid.current.value="";
        upass.current.value="";
      }
    }).catch((err)=>{})
  }
  return (
    <div style={{width:"400px",border:"2px solid blue", margin:"auto",padding:"10px"}}>
      <h2>This is LoginComp</h2>
      <form>
        <label>Enter User Id:</label>
        <input type="text" name="uid" ref={uid} placeholder="enter user id" className='form-control'/><br/>
        <label>Enter User Password:</label>
        <input type="text" name="upass" ref={upass} placeholder="enter user password" className='form-control'/><br/>
        <button type="button" onClick={()=>getDetailed()} className='btn btn-primary'>Login</button>
      </form>
    </div>
  )
}

export default LoginComp
