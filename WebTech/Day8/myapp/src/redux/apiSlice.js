import { createSlice,createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";
import { data } from "react-router-dom";

const API_URL ="http://localhost:2000/product";

export const fetchData= createAsyncThunk("api/fetchdata",async()=>{
    const response=await axios.get(API_URL);
    return response.data;
});

const apiSlice=createSlice({
    name:"api",
    initialState:{
        data:[],
        status:"idle",
        error:null
    },
    reducers:{},
    extraReducers:(builder)=>{
        builder.addCase(fetchData.pending,(state)=>{
            state.status="loading";
        })
        .addCase(fetchData.fulfilled,(state,action)=>{
            state.status="succeeded";
            state.data=action.payload;
        })
        .addCase(fetchData.rejected,(state,action)=>{
            state.status="failed";
            state.error=action.error.message;
        })
    }

})


export default apiSlice.reducer;