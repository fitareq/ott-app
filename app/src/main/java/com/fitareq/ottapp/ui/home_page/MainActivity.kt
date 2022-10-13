package com.fitareq.ottapp.ui.home_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fitareq.ottapp.R
import com.fitareq.ottapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //carousel
        val carouselData = viewModel.getCarouselData()
        val carouselAdapter = CarouselAdapter(carouselData)
        binding.carousel.adapter = carouselAdapter

        //batman movie rail
        binding.batmanMovieRail.railTile.text = getString(R.string.batman_movies)
        binding.batmanMovieRail.moviesRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        viewModel.getBatmanMovies()
        viewModel.batmanMovies.observe(this){
            binding.batmanMovieRail.moviesRv.adapter = RailAdapter(it)
        }

        //latest movie rail
        binding.latestMoviesRail.moviesRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        viewModel.getLatestMovies()
        viewModel.latestMovies.observe(this){
            binding.latestMoviesRail.moviesRv.adapter = RailAdapter(it)
        }
    }
}