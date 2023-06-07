package com.alanmejia.pokemonapp.ui.pokemons

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PokemonsScreen(){
    
    PokemonsScreenContent()
}

@Composable
fun PokemonsScreenContent() {
    LazyColumn {
        items(count = 5) { 
            Text(text = "Hello wortld")
        }
    }
}
