package com.alanmejia.pokemonapp.di

import com.alanmejia.domain.get.requests.pokemon.Pokemons
import com.alanmejia.web.ApiService
import com.alanmejia.web.NetworkResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PokemonsRepositoryImp @Inject constructor(
    private val apiService: ApiService
) : PokemonsRepository {
    override fun getPokemons(): Flow<NetworkResult<Pokemons>> = flow {
        emit(NetworkResult.Loading())

        // missing implementation for the request
        val pokemons = apiService.getPokemons()
    }
}