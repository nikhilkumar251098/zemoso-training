import axios from "axios";
import React from "react";

export const fetchBooks=async () => {
    const response= await axios.get("http://localhost:3005/books")

    console.log("response="+response.data)
    return response.data;
}

