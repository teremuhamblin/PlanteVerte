###### README.md >> markdown 
# 📘 PlanteVerte 🌱
Assistant d’apprentissage pour accompagner la naissance et la croissance d’une plante.

### 🎯 Objectif
- Guider l’utilisateur étape par étape :
  - Choix de la plante
  - Préparation du pot/sol
  - Semis / plantation
  - Suivi de la germination
  - Journal de croissance

### 🧱 Architecture
- MainActivity : écran d’accueil
- PlantWizardActivity : assistant de création de plante
- JournalActivity : journal de croissance
- SettingsActivity : paramètres et rappels
- Room Database pour stocker les plantes (PlanteVerteDatabase, PlantDao, Plant)

###  🧱 Structure du projet
``` text
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
│   │   │   │   ├── data/
│   │   │   │   │   ├── Plant.kt
│   │   │   │   │   ├── PlantDao.kt
│   │   │   │   │   ├── PlantDatabase.kt
│   │   │   │   ├── utils/
│   │   │   │   │   ├── ReminderManager.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_plant_wizard.xml
│   │   │   │   │   ├── activity_journal.xml
│   │   │   │   │   ├── activity_settings.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── styles.xml
│   │   │   ├── AndroidManifest.xml
│   │   ├── test/
│   │   ├── androidTest/
│   ├── build.gradle
│
├── build.gradle
├── settings.gradle
├── .gitignore
├── README.md
├── .github/
      ├── workflows/
      ├── ISSUE_TEMPLATE/
      ├── PULL_REQUEST_TEMPLATE/
```

### 🚀 Installation
1. Cloner le repo :
   ```bash
   git clone https://github.com/<ton-user>/PlanteVerte.git
   ```
2. Ouvrir dans Android Studio.
3. Lancer sur un appareil ou émulateur Android (minSdk 24).

### 🔮 Évolutions possibles
- Ajout de photos pour chaque plante
- Rappels programmés (AlarmManager / WorkManager)
- Conseils pédagogiques détaillés par type de plante
- Thèmes visuels (Night‑Ops / Green‑Ops)

---
