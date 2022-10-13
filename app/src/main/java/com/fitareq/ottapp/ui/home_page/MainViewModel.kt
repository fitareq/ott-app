package com.fitareq.ottapp.ui.home_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fitareq.ottapp.model.Item
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: MainRepository = MainRepository()
) : ViewModel() {

    private var _batmanMovies = MutableLiveData<List<Item>>()
    val batmanMovies: LiveData<List<Item>> = _batmanMovies
    fun getBatmanMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getBatmanMovies().let {
                _batmanMovies.postValue(it.body()?.Search)
            }

        }
    }
    private var _latestMovies = MutableLiveData<List<Item>>()
    val latestMovies: LiveData<List<Item>> = _latestMovies
    fun getLatestMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getLatestMovies().let {
                _latestMovies.postValue(it.body()?.Search)
            }

        }
    }

    fun getCarouselData(): List<String> {
        return repository.getCarouselData()
    }
}
