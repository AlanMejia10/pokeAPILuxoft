package com.alanmejia.pokemonapp.di

import com.alanmejia.domain.get.requests.pokemon.Pokemons
import com.alanmejia.web.NetworkResult
import kotlinx.coroutines.flow.Flow

interface PokemonsRepository {

    fun getPokemons(): Flow<NetworkResult<Pokemons>>
}