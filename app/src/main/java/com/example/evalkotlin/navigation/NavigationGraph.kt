package com.example.evalkotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.evalkotlin.ui.screen.CharacterListScreen
import com.example.evalkotlin.ui.screen.CharacterDetailScreen
import com.example.evalkotlin.data.model.Character

@Composable
fun NavigationGraph(navController: NavHostController, characters: List<Character>) {
    // Définit les écrans et les routes dans un NavHost
    NavHost(navController = navController, startDestination = "character_list") {

        // Route pour afficher la liste des personnages (premier screen de l'app)
        composable("character_list") {
            CharacterListScreen(characters = characters) { character ->
                // Naviguer vers l'écran de détail du personnage (second screen) selon l'id
                navController.navigate("character_detail/${character.id}")
            }
        }

        // Route pour afficher les détails du personnage
        composable("character_detail/{characterId}") { backStackEntry ->
            val characterId = backStackEntry.arguments?.getString("characterId")
            val character = characters.find { it.id.toString() == characterId }
            character?.let {
                CharacterDetailScreen(character = it)
            }
        }
    }
}
