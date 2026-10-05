import React from 'react'
import Footer from '../layout/Footer'
import Header from '../layout/Header'
import NavComp from '../layout/NavComp'
import { Outlet } from 'react-router-dom'

const DashboardComp = () => {
  return (
    <div className='container'>
        <div className='card border-primary mt-3'>
          <Header/>
          <hr className='text-primary'/>
            <div className='card-header border-primary'><NavComp/></div>
            <div className='card-body border-primary'><Outlet/></div>
            <div className='card-footer border-primary'>
                 <Footer/>
            </div>
        </div>
     
    </div>
  )
}

export default DashboardComp
