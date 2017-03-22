# POO-teaching

Ce dépôt est un support à la séance de soutien pour le module de POO. L'ensemble des bases de la programmation orientée objet est abordé ici au travers d'exemples concrets et de mise en pratique.

*La programmation se pratique avant toute de chose*.

## Le contexte

Vous êtes actuellement concessionnaire automobile et vous souhaitez gérer au mieux votre parc de voiture ! Pour ce faire, vous avez décidé d'écrire un programme permettant de déterminer la taille de votre parc automobile, la valeur que représente ce dernier et d'effectuer diverses fonctions ...

## 1. Les classes, les constructeurs, les objets, les variables, les méthodes
> Objectifs : avant de vous lancer dans le développement du "gros" de l'application vous souhaitez avant tout modéliser une voiture

De votre point de vue (celui du concessionnaire), vous caractérisez une voiture ainsi :
* Une voiture c'est avant tout un prix *(money is money)*
* Une plaque d'immatriculation
* Une couleur de carrosserie
* Un nombre de places
* Une puissance de moteur (généralement en chevaux)
* Un kilométrage

Vous pouvez effectuer différentes opérations sur une voiture
* Changer son prix
* Modifier la couleur de sa carrosserie
* Modifier son moteur (changer sa puissance)
* Truquer le compteur de kilomètre *(on n'a jamais dit que vous étiez honnête)*

Une voiture c'est donc toutes ces propriétés !

Il est à présent temps de passer à la pratique !

### Énoncé
Écrivez une **classe** (en JAVA) nommée Voiture qui reprend l'ensemble de ces caractéristiques. Testez-là grâce à une classe Main qui sera le **point d'entrée** de votre programme.

*Vous pourrez utiliser l'ensemble des types primitifs (int, double, ...), ainsi que la classe String*

### Rappels de cours
Lien utile : [Développons en Java](https://www.jmdoudoux.fr/java/dej/chap-poo.htm)

## 2. Les interfaces
> Objectif : concervoir une interface Voiture

Un autre concessionnaire a eu la même idée que vous et veut vous vendre une classe Voiture qu'il a lui-même écrite. Le problème c'est qu'il ne veut pas vous montrer le code avant que vous l'ayez achetée ...

C'est problématique, car vous voulez tout de même vous assurer que cette classe a bien les mêmes fonctionnalités que celles que vous avez imaginées. Vous décidez donc de définir une interface spécifiant toutes les méthodes que vous avez imaginées (écrites à l'étape une)

### Énoncé
Écrivez une interface Voiture qui spécifie toutes les méthodes que vous écrites au préalable.

Quelle modification devra apporter votre concurrent pour assurer que la classe qu'il cherche à vous vendre **implémente** bien toutes les méthodes définies par l'interface ?

## 3. Héritage
> Objectif : Concevoir une architecture hiérarchique

À présent, vous vous rendez compte que chaque modèle a un comportement un peu différent. En effet les modèles Clio possèdent une propriété en plus qui est la couleur du siège. Les modèles BMW permettent quant à lui de disposer de phare LED ou non. Et les Teslas peuvent être équipés ou non du système d'autopilote. On considérera que vous gérez exclusivement ces trois modèles *(libre à vous d'en imaginer d'autres)*.

### Énoncé
Écrivez les classes Clio, BMW et Tesla, sans oublier d'implémenter les propriétés précédemment définie et commune à ces trois classes. Testez le comportement.


**Rien ne vous choque ?**

Vous vous rendez compte que les propriétés décrites dans la partie 1 et communes à tous les modèles sont écrites trois fois. Votre code est donc **redondant** et peut être **factorisé**.

Pour ce faire, nous allons nous appuyer sur un système hiérarchique. La classe Voiture écrite dans la partie 1 sera utilisée comme classe mère et vos trois modèles hériteront des propriétés définies par la classe Voiture. Ainis, les propriétés communes aux trois modèles et qui définissent une voiture au sens général du terme ne seront pas répliquées dans les classes de vous modèles.

### Énoncé
Reprenez votre classe Voiture et modifiez-là de façon à ce qu'elle soit la classe mère. Modifiez vos classes Clio, BMW et Tesla pour qu'elles héritent de Voiture et retirez le code redondant. Testez le comportement et vérifiez que le comportement est identique au précédent.
