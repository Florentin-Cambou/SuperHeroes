package com.wiapp.SuperHeroes.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wiapp.SuperHeroes.data.SuperHeroesDataSource

@Composable
fun SuperHeroesHome(paddingValues: PaddingValues) {
    Surface(
        modifier = Modifier.padding(paddingValues)
    ) {
        SuperHeroesList(heroes = SuperHeroesDataSource().loadSuperHeroesSource())
    }
}