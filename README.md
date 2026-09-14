###### README.md >> markdown 
# 🌱 PlanteVerte
- Version 5.0.0
Assistant botanique moderne pour Android, permettant d’apprendre à connaître ses plantes, suivre leur évolution, analyser leurs feuilles via un scanner IA, synchroniser ses données dans le cloud et exporter son journal en PDF.
   - PlanteVerte v5.0.0 est une version professionnelle, documentée, sécurisée, et prête pour la publication.

---

### 🚀 Fonctionnalités principales
- 🧠 Scanner IA
   - Analyse d’image via modèle TensorFlow Lite  
   - Détection de plante + niveau de confiance  
   - Suggestions d’entretien  
   - Historique des scans  

### 🌿 Assistant plante (PlantWizard)
- Ajout guidé d’une plante  
- Informations essentielles  
- Notes personnalisées  

### 📘 Journal botanique
- Timeline verticale  
- Notes de croissance  
- Export PDF via PdfExporter.kt  

### ☁️ Cloud Sync (Firebase)
- Synchronisation locale ↔ cloud  
- Sauvegarde automatique  
- Multi‑device (préparé)  

### 🎨 Interface Material 3
- Thème clair/sombre  
- Icônes modernes  
- Layouts optimisés  

### 🔐 Sécurité & Qualité
- CI/CD Android  
- CODEOWNERS  
- dependabot  
- SECURITY.md  
- Code de conduite  
- Documentation complète  

---

### 📁 Structure du projet
La structure complète est disponible dans :  
👉 **STRUCTURE.md**
- Résumé rapide :
```text
app/                → code Android (UI, data, utils, IA, cloud)
docs/               → documentation technique (design system, IA, cloud)
assets/             → icônes, images, modèles IA, templates PDF
.github/            → CI/CD, templates, sécurité
README.md           → présentation globale
CHANGELOG.md        → historique des versions
ROADMAP.md          → évolution du projet
ARCHITECTURE.md     → architecture logicielle
```

---

### 🛠️ Technologies utilisées
- Kotlin
- AndroidX / Material 3
- Room Database
- CameraX
- TensorFlow Lite
- Firebase Firestore
- WorkManager / AlarmManager
- iText PDF
- GitHub Actions (CI/CD)

---

### 📦 Installation
1. Cloner le dépôt  
2. Ouvrir dans Android Studio (Flamingo ou plus récent)  
3. Synchroniser Gradle  
4. Lancer l’application sur un appareil Android (SDK 24+)  

---

### 📚 Documentation
Toute la documentation avancée se trouve dans : **👉 docs/**
- Sections principales :
   - design-system/ — couleurs, typographie, composants  
   - ai/ — architecture du scanner IA, entraînement  
   - cloud/ — structure Firebase, protocole de synchronisation  

---

### 📈 Roadmap & Versions
- Historique complet : CHANGELOG.md  
- Roadmap v1.0 → v5.0 : ROADMAP.md  
- Notes de version : RELEASE_NOTES.md  

---

### 🤝 Contribution
- PlanteVerte suit des standards professionnels :
   - Templates d’issues : .github/ISSUE_TEMPLATE/  
   - Template de pull request : .github/PULLREQUESTTEMPLATE/  
   - Règles de conduite : CODEOFCONDUCT.md  
   - Sécurité : .github/SECURITY.md  
   - Mises à jour automatiques : dependabot.yml  

---

### 📄 Licence
- Voir le fichier LICENSE.

---

### 🎖️ À propos
- PlanteVerte est un assistant botanique moderne, conçu pour apprendre, analyser et suivre ses plantes avec précision et simplicité.
   - Version actuelle : v5.0.0  
   - Statut : Stable — Production Ready

---
