package com.wiapp.SuperHeroes.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperHeroesScaffold() {
    Scaffold(
        topBar = { SuperHeroesTopAppBar()},
        content = { PaddingValues -> SuperHeroesHome(paddingValues = PaddingValues)}
    )
}