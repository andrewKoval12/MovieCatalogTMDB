package com.example.moviecatalogtmdb.domain.movieusecases

class GetMovieInfoUseCase (
    private val repository: MovieRepository
) {
    operator fun invoke(film: String) = repository.getMovieInfo(film)
}