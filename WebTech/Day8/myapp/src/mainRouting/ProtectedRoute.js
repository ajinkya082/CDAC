import React, { useEffect } from 'react'
import { useNavigate } from 'react-router-dom';

const ProtectedRoute = ({Component}) => {
    const nav=useNavigate();

    useEffect(()=>{
        if(!sessionStorage.getItem("user")){
            nav("/");
        }else{
            nav("/dashboard")
        }
    },[])

  return <Component/>
}

export default ProtectedRoute
