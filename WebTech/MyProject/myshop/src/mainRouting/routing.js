import { createBrowserRouter } from "react-router-dom";
// import Header from "../layout/Header";
import DashboardComp from "../component/DashboardComp";
import MyCaouselComp from "../component/MyCaouselComp";
import ProductDetailsComp from '../component/ProductDetailsComp'
import EnquiryComp from '../component/EnquiryComp'
import ContactComp from '../component/ContactComp'

const router=createBrowserRouter([
    {path:"/dashboard",element:<DashboardComp/>,children:[
        {path:"",element:<MyCaouselComp/>},
        {path:"productdetails",element:<ProductDetailsComp/>},
        {path:"enquiry",element:<EnquiryComp/>},
        {path:"contact" , element:<ContactComp/>}
    ]}
])

export default router;