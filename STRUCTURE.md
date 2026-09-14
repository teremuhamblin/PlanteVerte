###### STRUCTURE.md >> markdown
# PlanteVerte v5.0
Documentation officielle de la structure du projet PlanteVerte.  
Ce fichier décrit l’architecture complète, les rôles de chaque dossier, les conventions et les flux internes.

---

### 1. Objectifs de la structure
- Fournir une vue claire et exhaustive du projet.
- Faciliter la navigation pour les contributeurs.
- Séparer proprement les responsabilités (UI, data, IA, cloud, PDF, docs).
- Garantir une cohérence entre les modules.
- Servir de référence pour l’évolution du projet (v1.0 → v5.0).

---

### 2. Arborescence complète
```text
PlanteVerte/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/planteverte/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── PlantWizardActivity.kt
│   │   │   │   ├── JournalActivity.kt
│   │   │   │   ├── SettingsActivity.kt
│   │   │   │   ├── ScannerActivity.kt
│   │   │   │   ├── ScannerResultActivity.kt
│   │   │   │   ├── data/
│   │   │   │   │   ├── Plant.kt
│   │   │   │   │   ├── PlantDao.kt
│   │   │   │   │   ├── PlantDatabase.kt
│   │   │   │   │   ├── ScanResult.kt
│   │   │   │   │   ├── ScanHistoryDao.kt
│   │   │   │   │   ├── ScanHistoryDatabase.kt
│   │   │   │   ├── utils/
│   │   │   │   │   ├── ReminderManager.kt
│   │   │   │   │   ├── ImageAnalyzer.kt
│   │   │   │   │   ├── AiModelLoader.kt
│   │   │   │   │   ├── CloudSyncManager.kt
│   │   │   │   │   ├── PdfExporter.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activityplantwizard.xml
│   │   │   │   │   ├── activity_journal.xml
│   │   │   │   │   ├── activity_settings.xml
│   │   │   │   │   ├── activity_scanner.xml
│   │   │   │   │   ├── activityscannerresult.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── styles.xml
│   │   │   │   │   ├── themes.xml
│   │   │   │   │   ├── strings.xml
│   │   │   ├── AndroidManifest.xml
│   │   ├── test/
│   │   ├── androidTest/
│   ├── build.gradle
│
├── build.gradle
├── settings.gradle
│
├── .gitignore
├── .editorconfig
├── .gitattributes
│
├── README.md
├── STRUCTURE.md
├── ARCHITECTURE.md
├── LOCALIZATION_GUIDE.md
├── RELEASE_NOTES.md
├── CHANGELOG.md
├── ROADMAP.md
├── CODEOFCONDUCT.md
├── LICENSE
│
├── .github/
│   ├── workflows/
│   ├── ISSUE_TEMPLATE/
│   ├── PULLREQUESTTEMPLATE/
│   ├── dependabot.yml
│   ├── FUNDING.yml
│   ├── SECURITY.md
│   ├── SUPPORT.md
│   ├── CODEOWNERS
│
├── docs/
│   ├── design-system/
│   ├── ai/
│   ├── cloud/
│
└── assets/
    ├── icons/
    ├── plants/
    ├── ai-models/
    ├── pdf/
```

---

### 3. Description des dossiers
### 📁 Racine du projet
- Contient les fichiers essentiels :
   - **README.md** — présentation générale du projet  
   - **STRUCTURE.md** — architecture complète du dépôt  
   - **ARCHITECTURE.md** — architecture logicielle interne  
   - **ROADMAP.md** — évolution v1.0 → v5.0  
   - **CHANGELOG.md** — historique des versions  
   - **RELEASE_NOTES.md** — notes de version  
   - **LOCALIZATION_GUIDE.md** — internationalisation  
   - **CODE_OF_CONDUCT.md** — règles de conduite  
   - **LICENSE** — licence du projet  

>Ces fichiers servent de base pour comprendre, utiliser et maintenir le projet.

---

### 📁 app/
- Module Android principal.

### 📁 java/com/planteverte/
Contient toute la logique Kotlin :
- **MainActivity** — écran principal  
- **PlantWizardActivity** — assistant plante  
- **JournalActivity** — journal + timeline  
- **SettingsActivity** — paramètres  
- **ScannerActivity** — capture + IA  
- **ScannerResultActivity** — résultats IA  

### 📁 data/
Couche de données :
- **Room** (Plant, ScanHistory)  
- **DAO**  
- **Databases**  

### 📁 utils/
Modules techniques :
- **ReminderManager** — rappels d’arrosage  
- **ImageAnalyzer** — analyse d’image  
- **AiModelLoader** — chargement modèle IA  
- **CloudSyncManager** — synchronisation Firebase  
- **PdfExporter** — export PDF du journal  

### 📁 res/
Ressources UI :
- **layout/** — écrans XML  
- **values/** — couleurs, styles, thèmes, strings  

### 📁 .github/
Configuration GitHub :
- **workflows/** — CI/CD Android  
- **ISSUE_TEMPLATE/** — templates d’issues  
- **PULL_REQUEST_TEMPLATE/** — template PR  
- **dependabot.yml** — mises à jour automatiques  
- **CODEOWNERS** — propriétaire du code  
- **SECURITY.md** — politique de sécurité  
- **SUPPORT.md** — support utilisateur

### 📁 docs/
Documentation avancée :
- **design-system/** — couleurs, typographie, composants  
- **ai/** — architecture du scanner IA, entraînement  
- **cloud/** — structure Firebase, protocole de sync  

---

### 📁 assets/
Ressources statiques :
- **icons/** — icônes UI  
- **plants/** — images de plantes  
- **ai-models/** — modèles IA TFLite  
- **pdf/** — templates PDF  

---

### 4. Conventions du projet
### Nommage
- Kotlin : `UpperCamelCase` pour classes, `lowerCamelCase` pour variables.  
- XML : `snake_case`.  
- Dossiers : minuscules + tirets.  
- Fichiers Markdown : `UPPERCASE.md`.

### Structure du code
- UI → Activities + XML  
- Data → Room  
- IA → utils/ImageAnalyzer + AiModelLoader  
- Cloud → utils/CloudSyncManager  
- PDF → utils/PdfExporter  

### Documentation
- Chaque dossier doit contenir un **README.md** si complexe.  
- Toute modification majeure doit être ajoutée dans **CHANGELOG.md**.  

---

### 5. Flux internes
### Scanner IA
1. CameraX capture l’image  
2. ImageAnalyzer traite le bitmap  
3. AiModelLoader applique le modèle IA  
4. ScanResult est généré  
5. ScannerResultActivity affiche les résultats  
6. ScanHistoryDatabase peut persister l’historique  

### Journal
1. L’utilisateur ajoute une plante  
2. PlantDatabase stocke les données  
3. JournalActivity affiche la timeline  
4. PdfExporter peut exporter le journal  

### Cloud Sync
1. CloudSyncManager lit la base locale  
2. Envoie vers Firebase  
3. Récupère les données distantes  
4. Merge local ↔ cloud  

---

### 6. Évolution de la structure
- Ajouter un dossier uniquement si nécessaire.  
- Documenter toute modification dans `CHANGELOG.md`.  
- Garder la structure simple, stable et compréhensible.  

---

### 7. Objectif final
Un projet **propre**, **cohérent**, **professionnel**, facile à lire, à maintenir et à faire évoluer.  
PlanteVerte v5.0 est désormais au niveau d’une application Android moderne prête pour publication.

