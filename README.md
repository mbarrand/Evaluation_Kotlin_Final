# Evaluation Kotlin

L'API choisie au début fut l'API valorant du site https://dash.valorant-api.com/
Or, j'ai eu beaucoup de problème avec celle-ci et ai malheureusement décidé de continuer avec des données mockées.

J'ai finalement pu implémenter toutes les fonctionnalités demandées et ai pu finalement finaliser le projet.
Quelques précisions : 
- L'application ne présente que 8 personnages sur une vingtaine pour limiter le temps de travail sur les mock de données
- La vibration au click sur une card n'a pas été testé sur un téléphone et est donc testé avec une notification en bas de l'application
- Afin de tester les langues françaises et anglaises, j'ai seulement ajouté une fonction dans le MainActivity. Si on enlève la ligne 19 "setFrenchLanguage()" en commentaire, l'application affiche les données en français. Sinon, en anglais.

Points négatifs : 
- L'application n'est pas liée à une API...
- L'esthétique est très bref, il n'y a pas d'image ce qui rend l'application vide et les textes semblent fades



L'architecture du projet réalisé avec Gitingest : 

└── mbarrand-Evaluation_Kotlin_Final
    ├── app
    │   ├── .gitignore
    │   ├── proguard-rules.pro
    │   ├── build.gradle.kts
    │   └── src
    │       ├── main
    │       │   ├── AndroidManifest.xml
    │       │   ├── java
    │       │   │   └── com
    │       │   │       └── example
    │       │   │           └── evalkotlin
    │       │   │               ├── data
    │       │   │               │   ├── repository
    │       │   │               │   │   └── CharacterRepository.kt
    │       │   │               │   └── model
    │       │   │               │       ├── Ability.kt
    │       │   │               │       └── Character.kt
    │       │   │               ├── ui
    │       │   │               │   ├── composables
    │       │   │               │   │   └── CharacterCard.kt
    │       │   │               │   ├── screen
    │       │   │               │   │   ├── CharacterListScreen.kt
    │       │   │               │   │   └── CharacterDetailScreen.kt
    │       │   │               │   └── theme
    │       │   │               │       ├── Theme.kt
    │       │   │               │       ├── Type.kt
    │       │   │               │       └── Color.kt
    │       │   │               ├── MainActivity.kt
    │       │   │               └── navigation
    │       │   │                   └── NavigationGraph.kt
    │       │   └── res
    │       │       ├── xml
    │       │       │   ├── backup_rules.xml
    │       │       │   └── data_extraction_rules.xml
    │       │       ├── mipmap-mdpi
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xxxhdpi
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-hdpi
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xxhdpi
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── values-notnight
    │       │       │   └── colors.xml
    │       │       ├── drawable
    │       │       │   ├── ic_launcher_background.xml
    │       │       │   └── ic_launcher_foreground.xml
    │       │       ├── values-fr
    │       │       │   └── strings.xml
    │       │       ├── raw
    │       │       │   └── pick.mp3
    │       │       ├── mipmap-xhdpi
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── values-night
    │       │       │   └── colors.xml
    │       │       ├── mipmap-anydpi
    │       │       │   ├── ic_launcher.xml
    │       │       │   └── ic_launcher_round.xml
    │       │       └── values
    │       │           ├── strings.xml
    │       │           ├── themes.xml
    │       │           └── colors.xml
    │       ├── test
    │       │   └── java
    │       │       └── com
    │       │           └── example
    │       │               └── evalkotlin
    │       │                   └── ExampleUnitTest.kt
    │       └── androidTest
    │           └── java
    │               └── com
    │                   └── example
    │                       └── evalkotlin
    │                           └── ExampleInstrumentedTest.kt
    └── local.properties
