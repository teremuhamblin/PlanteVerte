###### README.md >> markdown 
# 📄 app/
- dossier /app/
- module Android
- PlanteVerte (app/)

Ce dossier contient l’intégralité du code source de l’application Android PlanteVerte.  
Il regroupe l’interface utilisateur, la logique métier, la base de données, l’IA, la synchronisation cloud et les utilitaires.

---

### 📁 Structure du module
```text
app/
├── src/
│   ├── main/
│   │   ├── java/com/planteverte/
│   │   │   ├── activités (UI)
│   │   │   ├── data/ (Room)
│   │   │   ├── utils/ (IA, cloud, PDF, rappels)
│   │   ├── res/ (layouts, styles, thèmes)
│   │   ├── AndroidManifest.xml
│   ├── test/ (tests unitaires)
│   ├── androidTest/ (tests instrumentés)
├── build.gradle
```

---

### 🧩 Détails des sous-dossiers
1. java/com/planteverte/
Contient la logique Kotlin de l’application.
- **Activités principales**
   - MainActivity.kt — écran d’accueil  
   - PlantWizardActivity.kt — assistant plante  
   - JournalActivity.kt — journal + timeline  
   - SettingsActivity.kt — paramètres  
   - ScannerActivity.kt — capture + IA  
   - ScannerResultActivity.kt — résultats IA  

- **Data (Room)**
   - Plant.kt — entité plante  
   - PlantDao.kt — accès aux données  
   - PlantDatabase.kt — base locale  
   - ScanResult.kt — résultat IA  
   - ScanHistoryDao.kt — historique des scans  
   - ScanHistoryDatabase.kt — base historique  

- **Utils**
   - ReminderManager.kt — rappels d’arrosage  
   - ImageAnalyzer.kt — analyse d’image  
   - AiModelLoader.kt — chargement modèle IA  
   - CloudSyncManager.kt — synchronisation Firebase  
   - PdfExporter.kt — export PDF du journal  

---

2. res/
- **Ressources UI** :
   - layout/ — écrans XML  
   - values/ — couleurs, styles, thèmes, strings  

---

3. AndroidManifest.xml
Déclare les activités, permissions et configuration globale de l’application.

---

4. build.gradl
- Définit :
   - les dépendances (Room, Firebase, CameraX, IA, Material 3)  
   - les versions SDK  
   - les options de compilation  
   - les buildTypes (debug / release)

---

### 🎯 Objectifs du module
- Fournir une application Android moderne, stable et évolutive  
- Séparer clairement les responsabilités (UI, data, IA, cloud, PDF)  
- Faciliter la maintenance et l’ajout de nouvelles fonctionnalités  
- Servir de base pour les versions futures (v6.0, v7.0…)

---

### 🔗 Liens utiles
- Structure complète du projet : **STRUCTURE.md**
- Architecture logicielle : **ARCHITECTURE.md**
- Documentation avancée : **docs/** 
- Historique des versions : **CHANGELOG.md**

---

### 📝 Notes

>Ce module est le cœur de PlanteVerte.  
Toute modification majeure doit être documentée dans le CHANGELOG et la ROADMAP.
