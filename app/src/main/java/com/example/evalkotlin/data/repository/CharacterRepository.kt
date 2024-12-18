package com.example.evalkotlin.data.repository

import android.content.Context
import com.example.evalkotlin.R
import com.example.evalkotlin.data.model.Character
import com.example.evalkotlin.data.model.Ability

class CharacterRepository(private val context: Context) {

    // Récupérer la liste des personnages en fonction de la langue
    fun getMockedCharacters(): List<Character> {
        // Retourne la liste de tous les personnage mockés
        // id, nom, role, description, liste des capacités
        // On récupère les chaînes de caractères depuis les ressources de string.xml
        return listOf(
            Character(
                id = 1,
                name = context.getString(R.string.character_phoenix_name),
                role = context.getString(R.string.character_phoenix_role),
                description = context.getString(R.string.character_phoenix_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_phoenix_ability_blaze),
                        description = context.getString(R.string.character_phoenix_ability_blaze_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_phoenix_ability_curveball),
                        description = context.getString(R.string.character_phoenix_ability_curveball_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_phoenix_ability_hothands),
                        description = context.getString(R.string.character_phoenix_ability_hothands_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_phoenix_ability_runitback),
                        description = context.getString(R.string.character_phoenix_ability_runitback_desc)
                    )
                )
            ),
            Character(
                id = 2,
                name = context.getString(R.string.character_sage_name),
                role = context.getString(R.string.character_sage_role),
                description = context.getString(R.string.character_sage_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_sage_ability_barrierorb),
                        description = context.getString(R.string.character_sage_ability_barrierorb_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_sage_ability_sloworb),
                        description = context.getString(R.string.character_sage_ability_sloworb_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_sage_ability_healingorb),
                        description = context.getString(R.string.character_sage_ability_healingorb_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_sage_ability_resurrection),
                        description = context.getString(R.string.character_sage_ability_resurrection_desc)
                    )
                )
            ),
            Character(
                id = 3,
                name = context.getString(R.string.character_gekko_name),
                role = context.getString(R.string.character_gekko_role),
                description = context.getString(R.string.character_gekko_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_gekko_ability_wingman),
                        description = context.getString(R.string.character_gekko_ability_wingman_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_gekko_ability_dizzy),
                        description = context.getString(R.string.character_gekko_ability_dizzy_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_gekko_ability_moshpit),
                        description = context.getString(R.string.character_gekko_ability_moshpit_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_gekko_ability_thrash),
                        description = context.getString(R.string.character_gekko_ability_thrash_desc)
                    )
                )
            ),
            Character(
                id = 4,
                name = context.getString(R.string.character_jett_name),
                role = context.getString(R.string.character_jett_role),
                description = context.getString(R.string.character_jett_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_jett_ability_cloudburst),
                        description = context.getString(R.string.character_jett_ability_cloudburst_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_jett_ability_updraft),
                        description = context.getString(R.string.character_jett_ability_updraft_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_jett_ability_tailwind),
                        description = context.getString(R.string.character_jett_ability_tailwind_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_jett_ability_bladestorm),
                        description = context.getString(R.string.character_jett_ability_bladestorm_desc)
                    )
                )
            ),
            Character(
                id = 5,
                name = context.getString(R.string.character_sova_name),
                role = context.getString(R.string.character_sova_role),
                description = context.getString(R.string.character_sova_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_sova_ability_shockbolt),
                        description = context.getString(R.string.character_sova_ability_shockbolt_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_sova_ability_reconbolt),
                        description = context.getString(R.string.character_sova_ability_reconbolt_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_sova_ability_owldrone),
                        description = context.getString(R.string.character_sova_ability_owldrone_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_sova_ability_huntersfury),
                        description = context.getString(R.string.character_sova_ability_huntersfury_desc)
                    )
                )
            ),
            Character(
                id = 6,
                name = context.getString(R.string.character_cypher_name),
                role = context.getString(R.string.character_cypher_role),
                description = context.getString(R.string.character_cypher_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_cypher_ability_trapwire),
                        description = context.getString(R.string.character_cypher_ability_trapwire_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_cypher_ability_cybercage),
                        description = context.getString(R.string.character_cypher_ability_cybercage_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_cypher_ability_spycam),
                        description = context.getString(R.string.character_cypher_ability_spycam_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_cypher_ability_neuraltheft),
                        description = context.getString(R.string.character_cypher_ability_neuraltheft_desc)
                    )
                )
            ),
            Character(
                id = 7,
                name = context.getString(R.string.character_raze_name),
                role = context.getString(R.string.character_raze_role),
                description = context.getString(R.string.character_raze_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_raze_ability_boombot),
                        description = context.getString(R.string.character_raze_ability_boombot_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_raze_ability_blastpack),
                        description = context.getString(R.string.character_raze_ability_blastpack_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_raze_ability_paintshells),
                        description = context.getString(R.string.character_raze_ability_paintshells_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_raze_ability_showstopper),
                        description = context.getString(R.string.character_raze_ability_showstopper_desc)
                    )
                )
            ),
            Character(
                id = 8,
                name = context.getString(R.string.character_killjoy_name),
                role = context.getString(R.string.character_killjoy_role),
                description = context.getString(R.string.character_killjoy_description),
                abilities = listOf(
                    Ability(
                        name = context.getString(R.string.character_killjoy_ability_alarmbot),
                        description = context.getString(R.string.character_killjoy_ability_alarmbot_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_killjoy_ability_turret),
                        description = context.getString(R.string.character_killjoy_ability_turret_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_killjoy_ability_nanoswarm),
                        description = context.getString(R.string.character_killjoy_ability_nanoswarm_desc)
                    ),
                    Ability(
                        name = context.getString(R.string.character_killjoy_ability_lockdown),
                        description = context.getString(R.string.character_killjoy_ability_lockdown_desc)
                    )
                )
            )
        )
    }
}
