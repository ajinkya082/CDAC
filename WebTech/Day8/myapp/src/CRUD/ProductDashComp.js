import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, Outlet } from 'react-router-dom';
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
import AddIcon from '@mui/icons-material/Add';

const ProductDashComp = () => {
    const [products,setProducts]=useState([]);

    useEffect(()=>{
        getData();
    },[])
    const getData=()=>{
            axios.get("http://localhost:2000/product").then((res)=>{
                // console.log(res.data);
                setProducts(res.data);                
            }).catch((error)=>{})
        }
    const deleteproduct=(pid)=>{
        // console.log(pid);
       if(window.confirm(`Are you sure to delete product with id:${pid}`)){
         axios.delete(`http://localhost:2000/product/${pid}`).then((res)=>{
            window.alert("Product Deleted Successfully!")
            getData();

        }).catch((error)=>{});
       }
    }
    return (
        <div>
            <h2>This is ProductDashComp</h2> 
             <Link to="/dashboard/productAdd" className='btn btn-danger btn-sm mb-2'><AddIcon />Product Add</Link>{" "}
            {/* <Link to="ProductUpdate" className='btn btn-danger btn-sm'>Product Update</Link>{" "} */}
            {/* <Outlet/> */}
            <table className='table table-bordered table-hover'>
                <thead>
                    <tr>
                        <th>Sr.no</th><th>Name</th><th>Price</th><th>Quantity</th><th>Company</th><th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {
                    products.map((val,index)=>{
                        return <tr key={index}>
                            <td>{val.pid}</td>
                            <td>{val.pname}</td>
                            <td>{val.pprice}</td>
                            <td>{val.pquan}</td>
                            <td>{val.pcom}</td>
                            <td>
                                <button type='button' className='btn btn-outline-danger btn-sm' onClick={()=>deleteproduct(val.pid)}> <DeleteIcon/></button>{" "}
                                <Link to={`/dashboard/productUpdate/${val.pid}`} className='btn btn-success btn-sm'><EditIcon/></Link>
                            </td>
                        </tr>
                    })
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ProductDashComp
