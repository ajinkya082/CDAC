import React, { useEffect, useState } from 'react';
import { useNavigate,useParams } from 'react-router-dom';
import axios from 'axios';


const ProductUpdateComp = () => {
    const nav=useNavigate();//to perform automatic navigation
    const {pid}=useParams(); //to get id from url

     const [myproduct,setMyProduct]=useState({
            pid:"",pname:"", pprice:"", pquan:"",pcom:""
        });
    
    useEffect(()=>{
        axios.get(`http://localhost:2000/product/${pid}`).then((res)=>{
            setMyProduct(...res.data)
        }).catch((error)=>{})
    },[])   ; 

     const inputChangeHandler=(event)=>{
        const {type,name,value}=event.target;
        setMyProduct({...myproduct,[name]:value});
    }
    
    const updateProduct=(event)=>{
        event.preventDefault();
        axios.put(`http://localhost:2000/product/${pid}`,myproduct).then(()=>{
            window.alert("Product Updated Successfully!");
            nav("/dashboard/productDashboard");
        }).catch((error)=>{})
    }

    return (
        <div>
            <h2>This is ProductUpdateComp</h2>
             <div className='row'>
                <div className='col-md-3'></div>
                <div className='col-md-6'>
                    <form onSubmit={updateProduct}>
                        <label className='from-label'>Enter Product Name:</label>
                        <input type="text" className='form-control' name='pname' onChange={inputChangeHandler} value={myproduct.pname}/><br/>
                        
                        <label className='from-label'>Enter Product Price:</label>
                        <input type="text" className='form-control' name='pprice' onChange={inputChangeHandler} value={myproduct.pprice}/><br/>

                        <label className='from-label'>Enter Product Company:</label>
                        <input type="text" className='form-control' name='pcompnay' onChange={inputChangeHandler} value={myproduct.pcom}/><br/>

                        <label className='from-label'>Enter Product Quantity:</label>
                        <input type="text" className='form-control' name='pquantity' onChange={inputChangeHandler} value={myproduct.pquan}/><br/>

                        <button type='submit' className='btn btn-success mt-2'>Submit</button>

                    </form>
                </div>
                <div className='col-md-3'></div>

            </div>
            
        </div>
    )
}

export default ProductUpdateComp
