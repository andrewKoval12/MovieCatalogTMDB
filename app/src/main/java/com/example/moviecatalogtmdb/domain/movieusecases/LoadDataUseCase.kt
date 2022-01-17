package com.example.moviecatalogtmdb.domain.movieusecases

class LoadDataUseCase (
    private val repository: MovieRepository
) {
    suspend operator fun invoke() = repository.loadData()
}