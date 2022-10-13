package com.fitareq.ottapp.model

data class Movies(
    val Search: List<Item>,
    val totalResults:String,
    val Response: String
)
data class Item(
    val Title: String,
    val Year: String,
    val imdbID: String,
    val Type: String,
    val Poster: String
)