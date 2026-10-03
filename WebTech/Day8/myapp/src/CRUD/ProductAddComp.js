import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const ProductAddComp = () => {
    const nav=useNavigate();
    const [myproduct,setMyProduct]=useState({
        pname:"", pprice:"", pquan:"",pcom:""
    });
    const inputChangeHandler=(event)=>{
        const {type,name,value}=event.target;
        setMyProduct({...myproduct,[name]:value});
    }
    
    const addProduct=(event)=>{
        event.preventDefault();
        axios.post(`http://localhost:2000/product`,myproduct).then(()=>{
            window.alert("Product Added Successfully!");
            nav("/dashboard/productDashboard");
        }).catch((error)=>{})
    }

    return (
        <div>
            <h2>This is ProductAddComp</h2>
            <div className='row'>
                <div className='col-md-3'></div>
                <div className='col-md-6'>
                    <form onSubmit={addProduct}>
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

export default ProductAddComp
