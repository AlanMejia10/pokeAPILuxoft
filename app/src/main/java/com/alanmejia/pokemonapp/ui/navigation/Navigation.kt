package com.alanmejia.pokemonapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alanmejia.pokemonapp.ui.pokemons.details.PokemonDetailsScreen
import com.alanmejia.pokemonapp.ui.pokemons.PokemonsScreen

@Composable
fun Navigation(navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screens.POKEMONS
    ) {
        composable(route = Screens.POKEMONS) {
            PokemonsScreen()
        }

        composable(route = Screens.POKEMON_DETAILS) {
            PokemonDetailsScreen()
        }
    }
}