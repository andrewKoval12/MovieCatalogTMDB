package com.example.moviecatalogtmdb.domain.movieusecases

class GetMovieInfoListUseCase(
    private val repository: MovieRepository
) {
    operator fun invoke() = repository.getMovieInfoList()
}