# UCE Génie Logiciel Avancé : Techniques de tests

[![CircleCI](https://circleci.com/gh/K-Lovelace/ceri-m1-test/tree/master.svg?style=svg)](https://circleci.com/gh/K-Lovelace/ceri-m1-test/tree/master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/189be5cb4232476186897bf057a3a188)](https://www.codacy.com/app/K-Lovelace/ceri-m1-test?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=K-Lovelace/ceri-m1-test&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/189be5cb4232476186897bf057a3a188)](https://www.codacy.com/app/K-Lovelace/ceri-m1-test?utm_source=github.com&utm_medium=referral&utm_content=K-Lovelace/ceri-m1-test&utm_campaign=Badge_Coverage)

Gael Cuminal

Alternant

## Détails d'implémentation

Pour réaliser ce TP, plusieurs choix ont été faits:

Pour créer un pokémon, j'utilise un serveur d'un calculateur d'IVs en ligne.
C'est le seul calculateur qui fait une partie du travail de calcul via une requête que j'ai pu trouver.
J'ai dû interpréter le JSON retourné, et pour cela les résultats peuvent différer de cas réels.

En ce qui concerne la sauvegarde du Pokédex, j'utilise l'interface Serializable. 
J'ai donc légèrement modifié l'API pour que les classes Pokemon et PokemonMetadata implémentent cette interface.
Un seul pokédex peut être stocké dans un fichier Pokedex.ser. 
On pourrait améliorer le programme en donnant un ID unique à chaque Trainer pour pouvoir stocker plusieurs pokédexs à la fois.
