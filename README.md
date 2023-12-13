
---
# Application de Gestion de Bibliothèque

## Description
Cette application est conçue pour gérer efficacement une bibliothèque, permettant aux utilisateurs de gérer les livres, les magazines, et autres médias. L'application offre une interface intuitive pour ajouter, supprimer, rechercher et organiser divers médias.

## Fonctionnalités
- **Ajouter des Médias** : Permet aux utilisateurs d'ajouter de nouveaux livres, magazines, etc., à la bibliothèque.
- **Supprimer des Médias** : Supprime les médias sélectionnés de la bibliothèque.
- **Rechercher des Médias** : Permet aux utilisateurs de rechercher des médias par titre, auteur ou catégorie.
- **Organiser des Médias** : Classer les médias par différentes catégories comme le genre, l'auteur, ou la date de publication.
- **Gestion des Utilisateurs** : Gérer les comptes utilisateurs, y compris les emprunts et les retours de livres.

## Diagramme de Classe (Aperçu)
```markdown
Bibliothèque
+ Liste de Médias : Média[]
+ AjouterMédia(m : Média) : void
+ SupprimerMédia(m : Média) : void
+ RechercherMédia(critère : String) : Média[]

Média
+ Titre : String
+ Auteur : String
+ Année de Publication : int

Livre extends Média
+ Genre : String
+ ISBN : String

Magazine extends Média
+ Périodicité : String
+ Numéro : int
```

## Cas d'Utilisation (Aperçu)
1. **Ajout de Média** :
    - Acteur : Bibliothécaire
    - Scénario Principal : Le bibliothécaire ajoute un nouveau livre en spécifiant le titre, l'auteur, l'année de publication, et le genre.
2. **Recherche de Média** :
    - Acteur : Utilisateur
    - Scénario Principal : L'utilisateur recherche un livre en utilisant le titre ou l'auteur. Le système affiche les médias correspondants.
3. **Emprunt de Livre** :
    - Acteur : Utilisateur
    - Scénario Principal : L'utilisateur sélectionne un livre à emprunter. Le système enregistre l'emprunt et met à jour la disponibilité du livre.

---