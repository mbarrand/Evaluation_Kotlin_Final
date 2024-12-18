package com.example.evalkotlin.ui.composables

import android.content.Context
import android.media.MediaPlayer
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.evalkotlin.R
import com.example.evalkotlin.data.model.Character


// Compossable des card des characters
@Composable
fun CharacterCard(character: Character, onClick: (Character) -> Unit) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { // Actions au click
                playClickSound(context) //son
                triggerVibration(context) // vibration
                onClick(character) // nNaviguation vers le détail
            },
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = character.name, // Nom du personnage
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = character.role, // Rôle du personnage
                style = MaterialTheme.typography.bodySmall
            )
            // Image du perso ????
        }
    }
}

// Fonction pour le son au click
fun playClickSound(context: Context) {
    val mediaPlayer = MediaPlayer.create(context, R.raw.pick)
    mediaPlayer.setOnCompletionListener { it.release() }
    mediaPlayer.start()
}

// Fonction pour la vibration au click
fun triggerVibration(context: Context) {
    val vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val vibratorManager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
        vibratorManager.defaultVibrator
    } else {
        context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE))
    } else {
        vibrator.vibrate(200)
    }

    // Affichaged' un message pour confirmer que la vibration a été déclenchée sur émulateur
    Toast.makeText(context, "Vibration déclenchée", Toast.LENGTH_SHORT).show()
}


