package com.example.evalkotlin.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.evalkotlin.data.model.Character
import com.example.evalkotlin.ui.composables.CharacterCard


//Screen de la liste des personnages (cards)
@Composable
fun CharacterListScreen(characters: List<Character>, onCharacterClick: (Character) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(characters.chunked(1)) { chunk -> // Affiche 1 carte par ligne
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center // Centrage des éléments à l'écran
                ) {
                    chunk.forEach { character ->
                        Box(
                            modifier = Modifier
                                .wrapContentWidth() // Ajuste la largeur à la taille de la carte
                        ) {
                            CharacterCard(character = character, onClick = onCharacterClick)
                        }
                    }
                    // Remplir l'espace vide si un seul élément dans la ligne
                    if (chunk.size < 1) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

