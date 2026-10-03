import React, { useEffect } from 'react'
import { useDispatch,useSelector } from 'react-redux';
import { fetchData } from '../redux/apiSlice';

const UserListComp = () => {
    const dispatch=  useDispatch();
    const data=useSelector((state)=>state.api.data);
    const status=useSelector((state)=>state.api.status);
    const error=useSelector((state)=>state.api.error);

    useEffect(()=>{
        if(status==="idle"){
            dispatch(fetchData());
        }
    },[status,dispatch])
    let content=[];
    if(status==="loading"){
        content=<div>Loading...</div>
    }
    else if(status==="succeeded"){
        content=data
    }
    else if(status==="failed"){
        content=<div>{error}</div>
    }

  return (
    <div>
      <h2>This is UserListComp</h2>
      <table  className='table table-bordered table-hover'>
        <thead>
            <tr>
                <th>Sr.no</th><th>Name</th><th>Price</th><th>Quantity</th><th>Company</th>
            </tr>
        </thead>
        <tbody>
            {
               content.length>0 && content.map((val,index)=>{
                    return <tr key={index}>
                        <td>{val.pid}</td>
                        <td>{val.pname}</td>
                        <td>{val.pprice}</td>
                        <td>{val.pquan}</td>
                        <td>{val.pcom}</td>
                    </tr>
                })
            }
        </tbody>
      </table>
    </div>
  )
}

export default UserListComp
