package com.wiapp.SuperHeroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SuperHeroesSource(
    @StringRes val heroeName: Int,
    @DrawableRes val heroeImg: Int,
    @StringRes val heroeDesc: Int
)
