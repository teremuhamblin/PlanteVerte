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

Voici un résumé court, propre et prêt à intégrer dans ton README.md, présentant les labels utilisés dans ton projet PlanteVerte.

Tu peux le coller tel quel dans une section “Labels GitHub” de ton README.

---

### 🏷️ Labels GitHub utilisés
PlanteVerte utilise un ensemble de labels structurés pour organiser les issues du projet :
- 🐞 bug — #D32F2F  
  Pour signaler un problème ou un comportement inattendu.
- 🌱 enhancement — #4CAF50  
  Pour proposer une amélioration ou une évolution du projet.
- 📘 documentation — #1976D2  
  Pour les mises à jour ou ajouts de documentation.
- 🤖 android — #009688  
  Pour les tâches spécifiques à l’environnement Android.
- 🎨 uiux — #8E24AA  
  Pour les modifications d’interface ou d’expérience utilisateur.
- 🗄 database — #5D4037  
  Pour les changements liés à Room Database ou au stockage.
- ⚡ performance — #FBC02D  
  Pour les optimisations de rapidité ou d’efficacité.
- 🔐 security — #C62828  
  Pour les sujets liés à la sécurité de l’application.
- 🎯 good-first-issue — #64DD17  
  Pour les issues simples, idéales pour les nouveaux contributeurs.
- 🆘 help-wanted — #0277BD  
  Pour les tâches nécessitant de l’aide ou une contribution externe

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
