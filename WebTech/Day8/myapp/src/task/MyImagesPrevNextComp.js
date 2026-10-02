import React, { Component } from 'react'
import imgpath from '../shared/constsnt/constantData'


class MyImagesPrevNextComp extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         currentindex:0,
         images:[
            {path:imgpath.iphone},
            {path:imgpath.s26ultra},
            {path:imgpath.nothing},
            {path:imgpath.pixel},
            {path:imgpath.edge70pro},
            {path:imgpath.reno},
         ]
      }
    }
    changeprev=()=>{
        this.setState(()=>{
            if(this.state.currentindex>0){
                return {currentindex:this.state.currentindex-1}
            }
        })
    }
    changenext=()=>{
        this.setState(()=>{
            if(this.state.currentindex<this.state.images.length - 1){
                return {currentindex:this.state.currentindex+1}
            }
        })
    }
    
  render() {
    return (
      <div>
        <h2>Slide Images</h2>
        <img src={this.state.images[this.state.currentindex].path} alt='' /><br/><br/>
        <button type='button' className='btn btn-outline-primary' onClick={this.changeprev}>Prev</button> {"   "}
        <button type='button' className='btn btn-outline-primary' onClick={this.changenext}>Next</button>
      </div>
    )
  }
}

export default MyImagesPrevNextComp
