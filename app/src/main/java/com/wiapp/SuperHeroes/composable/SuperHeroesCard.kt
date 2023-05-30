package com.wiapp.SuperHeroes.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.wiapp.SuperHeroes.R
import com.wiapp.SuperHeroes.model.SuperHeroesSource

@Composable
fun SuperHeroesCard(heroes: SuperHeroesSource) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        elevation = CardDefaults.elevatedCardElevation(),
    ) {
        Row(
           modifier = Modifier
               .fillMaxWidth()
               .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Column(modifier = Modifier.width(180.dp)) {
                Text(text = stringResource(id = heroes.heroeName))

                Text(text = stringResource(id = heroes.heroeDesc))
            }
            Image(
                modifier = Modifier
                    .size(95.dp)
                    .clip(RoundedCornerShape(5)),
                painter = painterResource(id = heroes.heroeImg),
                contentDescription = stringResource(id = heroes.heroeDesc)
            )
        }
    }
}