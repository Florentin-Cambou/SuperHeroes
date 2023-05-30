package com.wiapp.SuperHeroes.composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.wiapp.SuperHeroes.model.SuperHeroesSource

@Composable

fun SuperHeroesList(heroes: List<SuperHeroesSource>) {
    LazyColumn{
        items(heroes) { heroes ->
            SuperHeroesCard(heroes)
        }
    }
}