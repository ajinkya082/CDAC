import React from 'react'
import { Link } from 'react-router-dom'

const NavComp = () => {
  return (
    <div>
      <Link to={""} className='btn btn-primary'>Dashboard</Link>{" "}
      <Link to={"productdetails"} className='btn btn-primary'>Product Details</Link>{" "}
      <Link to={"enquiry"} className='btn btn-primary'>Enquiry</Link>{" "}
      <Link to={"contact"} className='btn btn-primary'>Contact</Link>{" "}
    </div>
  )
}

export default NavComp
