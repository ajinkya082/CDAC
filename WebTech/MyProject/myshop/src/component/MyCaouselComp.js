import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import imgpath from '../shared/constant/constData';

const MyCaouselComp = () => {
    return (
        <div>
            <h3>This is MyCaouselComp</h3>
            <Carousel>
                <Carousel.Item>
                    {/* <ExampleCarouselImage text="First slide" /> */}
                    <img src={imgpath.iphone} alt='iphone' style={{ width: "100%", height: "510px" }} />
                    <Carousel.Caption>
                        <h3 className='text-warning'>Iphone 18 Pro</h3>
                        <p className='text-warning'>Experience next-level performance, stunning visuals, and cutting-edge innovation with the iPhone 18 Pro, designed for power, style, and seamless everyday use.</p>
                    </Carousel.Caption>
                </Carousel.Item>
                <Carousel.Item>
                    {/* <ExampleCarouselImage text="Second slide" /> */}
                    <img src={imgpath.s26ultra} alt='s26ultra' style={{ width: "100%", height: "510px" }} />
                    <Carousel.Caption>
                        <h3>S26 Ultra</h3>
                        <p>Experience ultimate power with the Samsung Galaxy S26 Ultra, featuring a stunning display, advanced AI, professional-grade cameras, and exceptional performance in a premium design.</p>
                    </Carousel.Caption>
                </Carousel.Item>
                <Carousel.Item>
                    {/* <ExampleCarouselImage text="Third slide" /> */}
                    <img src={imgpath.nothing} alt='nothing4a' style={{ width: "100%", height: "510px" ,backgroundColor:"black"}} />

                    <Carousel.Caption>
                        <h3 className='text-dark'>Nothing 4 a</h3>
                        <p className='text-dark'>
                            Experience the perfect blend of minimalist design, smooth performance, and smart features with the Nothing Phone (4a), crafted to make every moment seamless and stylish.
                        </p>
                    </Carousel.Caption>
                </Carousel.Item>
            </Carousel>
        </div>
    )
}

export default MyCaouselComp
