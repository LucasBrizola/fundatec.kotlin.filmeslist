package com.example.ex_filme

import com.google.gson.annotations.SerializedName

data class ResultSearch(
    @SerializedName("Response")
    var response: String,
    @SerializedName("Search")
    var movies: ArrayList<Movie>,
    @SerializedName("totalResults")
    var totalResults: String
)

data class Movie(
    @SerializedName("imdbID")
    var imdbID: String,
    @SerializedName("Poster")
    var poster: String,
    @SerializedName("Title")
    var title: String,
    @SerializedName("Type")
    var type: String,
    @SerializedName("Year")
    var year: String
)