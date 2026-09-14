###### README.md >> markdown 
# 📄 Assets
- PlanteVerte
Ce dossier contient toutes les ressources statiques utilisées par l’application PlanteVerte.  
Elles sont organisées par type afin de garantir une structure propre, évolutive et facile à maintenir.

---

### 📁 Structure du dossier
```text
assets/
├── icons/
├── plants/
├── ai-models/
└── pdf/
```

---

### 🖼️ 1. icons/
- Contient toutes les icônes utilisées dans l’application :
   - icônes UI (navigation, boutons, actions)
   - icônes thématiques (plantes, scanner, paramètres)
   - formats recommandés : SVG ou WebP

Bonnes pratiques :
- nommage en snake_case
- éviter les PNG lourds
- privilégier les versions monochromes pour Material 3

---

### 🌿 2. plants/
- Images de plantes utilisées pour :
   - les fiches d’apprentissage
   - les exemples du scanner
   - les tutoriels
   - les tests IA
- Formats recommandés :
   - WebP (optimisé)
   - JPEG (qualité 80%)

---

### 🧠 3. ai-models/
- Contient les modèles IA utilisés par le scanner :
   - fichiers .tflite
   - labels .txt
   - versions du modèle (ex : modelv1.tflite, modelv2.tflite)

- Règles :
   - chaque modèle doit être documenté dans docs/ai/model-training.md
   - les modèles doivent être versionnés (v1, v2, v3…)

---

### 📄 4. pdf/
Templates ou ressources pour l’export PDF :
- logos
- en-têtes
- templates de mise en page
- images décoratives

Utilisé par :
- PdfExporter.kt

---

### 🎯 Objectifs du dossier
- Centraliser toutes les ressources statiques
- Faciliter la mise à jour des modèles IA
- Séparer clairement les assets UI et les assets techniques
- Garantir une structure propre pour les futures versions (v6.0+)

---

### 🔗 Liens utiles
- Architecture du projet : STRUCTURE.md
- Documentation IA : docs/ai/
- Export PDF : utils/PdfExporter.kt

---
