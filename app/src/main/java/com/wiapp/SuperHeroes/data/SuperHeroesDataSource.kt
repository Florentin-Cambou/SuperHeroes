package com.wiapp.SuperHeroes.data

import androidx.compose.runtime.Composable
import com.wiapp.SuperHeroes.R
import com.wiapp.SuperHeroes.model.SuperHeroesSource

class SuperHeroesDataSource{
    @Composable
    fun loadSuperHeroesSource(): List<SuperHeroesSource>{
        return listOf<SuperHeroesSource>(
            SuperHeroesSource(R.string.heroes_1,R.drawable.android_superhero1,R.string.desc_1),
            SuperHeroesSource(R.string.heroes_2,R.drawable.android_superhero2,R.string.desc_2),
            SuperHeroesSource(R.string.heroes_3,R.drawable.android_superhero3,R.string.desc_3),
            SuperHeroesSource(R.string.heroes_4,R.drawable.android_superhero4,R.string.desc_4),
            SuperHeroesSource(R.string.heroes_5,R.drawable.android_superhero5,R.string.desc_5),
            SuperHeroesSource(R.string.heroes_6,R.drawable.android_superhero6,R.string.desc_6),
        )
    }
}