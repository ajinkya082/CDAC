import React from 'react'
import { Link } from 'react-router-dom'
import imgpath from '../shared/constant/constData'

const Header = () => {
  return (
    <div style={{display:"flex",justifyContent:"center",textAlign:"center",borderRadius:"50"}}>
      <img src={imgpath.iphone} alt='iphone' className='p-3' style={{height:"200px", width:"200px"}}/>
      <div style={{fontSize:"30px"   ,  display: "flex",textAlign: "center",alignItems: "center",flexDirection: "row",justifyContent: "center"}}
      className='text-primary'>Phonewale Mobiles</div>
    </div>
  )
}

export default Header;
