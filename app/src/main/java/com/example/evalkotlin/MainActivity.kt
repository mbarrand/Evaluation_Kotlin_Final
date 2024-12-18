package com.example.evalkotlin

import android.os.Bundle
import android.content.res.Configuration
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.evalkotlin.data.repository.CharacterRepository
import com.example.evalkotlin.navigation.NavigationGraph
import com.example.evalkotlin.ui.theme.EvalKotlinTheme
import java.util.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Forcer la langue française pour tester le francais/anglais
//        setFrenchLanguage()

        val characterRepository = CharacterRepository(this)
        val characters = characterRepository.getMockedCharacters()

        setContent {
            EvalKotlinTheme { // Appel du thème
                val navController = rememberNavController()
                // Utilisation de NavigationGraph pour gérer la navigation
                NavigationGraph(navController = navController, characters = characters)
            }
        }
    }

    // Fonction pour changer la langue de l'application
    private fun setFrenchLanguage() {
        val locale = Locale("fr") // Langue française
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
    }
}
