import React from 'react'

const ProductAddComp = () => {
    return (
        <div>
            <h2>This is ProductAddComp</h2>
            <div className='row'>
                <div className='col-md-3'></div>
                <div className='col-md-6'>
                    <form>
                        <label className='from-label'>Enter Product Name:</label>
                        <input type="text" className='form-control' name='pname'/><br/>
                        
                        <label className='from-label'>Enter Product Price:</label>
                        <input type="text" className='form-control' name='pprice'/><br/>

                        <label className='from-label'>Enter Product Company:</label>
                        <input type="text" className='form-control' name='pcompnay'/><br/>

                        <label className='from-label'>Enter Product Quantity:</label>
                        <input type="text" className='form-control' name='pquantity'/><br/>

                        <button type='submit' className='btn btn-success mt-2'>Submit</button>

                    </form>
                </div>
                <div className='col-md-3'></div>

            </div>
        </div>
    )
}

export default ProductAddComp
