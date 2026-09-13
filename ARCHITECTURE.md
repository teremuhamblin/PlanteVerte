# Architecture — PlanteVerte

## 1. Vision globale
PlanteVerte est une application Android structurée autour d’une architecture MVVM moderne, utilisant Room pour la persistance locale et des modules indépendants pour les fonctionnalités avancées (Scanner, Journal, Cloud Sync).

## 2. Structure principale
- **UI Layer (Activities + XML)**  
  - MainActivity  
  - ScannerActivity  
  - ScannerResultActivity  
  - JournalActivity  
  - SettingsActivity  

- **Domain Layer**
  - Models : Plant, ScanResult, JournalEntry
  - UseCases (v3.0+) : SmartCare, GrowthPrediction

- **Data Layer**
  - Room Database  
  - DAO : PlantDao, JournalDao  
  - Repository : PlantRepository, JournalRepository

## 3. Modules
### Scanner Module (v1.1 → v2.0)
- Capture photo
- Analyse IA (placeholder v1.1, modèle réel v2.0)
- Résultats détaillés

### SmartCare Module (v3.0)
- Conseils intelligents
- Détection de problèmes
- Prévisions de croissance

### Cloud Sync (v4.0)
- Synchronisation multi‑appareils
- API REST
- Authentification

## 4. Navigation
- Navigation simple via Intents
- Passage de données via extras
- Migration vers Navigation Component (v2.0+)

## 5. Tests
- Unit tests (v2.0)
- Instrumented tests (v3.0)
