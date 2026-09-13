###### LOCALIZATION_GUIDE.md (pour v3.0 multilingue)

`

Guide de Localisation — PlanteVerte

1. Objectif
Permettre à PlanteVerte d’être traduit proprement en plusieurs langues (FR, EN, ES, DE…).

2. Organisation des fichiers
Toutes les chaînes doivent être placées dans :
`
app/src/main/res/values/strings.xml
app/src/main/res/values-en/strings.xml
app/src/main/res/values-es/strings.xml
`

3. Règles
- Aucune chaîne en dur dans le code Kotlin.
- Utiliser @string/... dans les layouts.
- Préférer des clés explicites :
  - plantaddtitle
  - scannerbuttonlabel
  - journalemptymessage

4. Images et icônes
- Éviter le texte dans les images.
- Utiliser des icônes universelles.

5. Tests
- Vérifier les longueurs de texte (anglais souvent plus court, allemand plus long).
- Vérifier les coupures sur petits écrans.

6. Processus de traduction
- Export des chaînes
- Traduction
- Revue
- Intégration
`

---
