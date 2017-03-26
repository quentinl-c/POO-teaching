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

**Et si on allait plus loin ...**

Une nouvelle réglementation est sortie et force les concessionnaires à vérifier que leurs voitures respectent bien les normes écologiques en vigueur ... Ces normes sont différentes d'un modèle à un autre !

Nous voulons donc que chaque classe implémente une méthode `boolean estConforme(double rejCarbone )` qui prendra en paramètre une valeur correspondant à l'émission de CO2 mesurée et qui retournera une valeur booléenne `true / false` pour avertir de la conformité ou non-conformité de la voiture en question. Les conditions de conformité sont différentes d'un modèle à un autre. Ce qui signifie que cette méthode ne peut être implémentée dans la classe `Voiture`.

Bon, on se rend compte que notre classe mère `Voiture` joue différents rôles, elle nous permet de factoriser du code ET elle va à présent devoir *"forcer"* ses classes filles à implémenter la méthode `estConforme`, car aucun modèle ne devra déroger à la règle ;-) . De plus, il serait surprenant d'instancier un objet Voiture. En effet, dans la vraie vie, vous n'avez pas une voiture, mais une clio, une Ferrari ... bref, vous avez donc un objet qui hérite des propriétés d'une voiture sans que ce soit exclusivement une voiture. (Cette phrase est peut-être un peu tordue, on y reviendra pendant la séance ...).

Bon, avec tous ces éléments il va falloir modifier notre classe `Voiture` en plus des classes filles. Nous allons adapté notre classe `Voiture`pour que ce soit une **classe abstraite** .

### Énoncé
1. Expliquez pourquoi il est plus intéressant et pertinent que la classe Voiture soit une classe abstraite
2. Appliquez les modifications nécessaires sur la classe Voiture pour qu'elle devienne une classe abstraite.
3. Faites en sorte que la classe Voiture *assure* l'implémentation de la méthode `estConforme`dans ses classes filles
4. Implémentez la méthode `estConforme` dans chaque classe fille avec des conditions de conformité différentes (faites joueur votre imagination ;-) )
5. Testez ;-)

## 4. Les tableaux et les collections

Bon, jusque là on s'est attardé à bien modéliser les voitures ... il est temps de s'attaquer à la concession et au parc automobile ...

On va simplifier les choses et on va décrire les propriétés d'une concession :

*Commençont pas les attributs*

* Une concession a une enseigne (par exemple : "Concession vroum & cie")
* Une concession détient un ensemble de voitures (c'est son parc automobile)
* Une concession connaît le nombre de voiture qu'elle détient
* Une concession détient un compte en banque (pour simplifier, on dira que c'est un `double` qui augmentera lors de rentrées d'argent et qui diminuera lorsqu'il y aura des dépenses)

*À présent, les méthodes*

* Une concession peut acheter / vendre une voiture, ce qui implique l'ajout ou le retrait d'une voiture dans le parc automobile et la modification de la valeur du compte bancaire


### Énoncé

1. Dans un premier temps, écrivez la classe `Concession` qui reprendra les propriétés décrites ci-dessus.  Pour stocker les voitures du parc automobile, vous utiliserez un tableau. Peut-on ajouter une infinité de voitures avec ce type d'implémentation ? Gérez le cas où vous n'avez plus suffisamment de place pour acquérir une nouvelle voiture.
2. Modifier la classe pour cette fois-ci utiliser une collection (par exemple une `ArrayList`)
3. Testez vos implémentations

*Aide : Les méthodes acheter et vendre ont la signature suivante : `void acheter(Voiture v, double prix)` et `Voiture vendre(int numeroVoiture, double prix)`. Les paramètres prix correspondent respectivement au prix d'achat et de vente. Pour l'achat, le paramètre v correspond à la nouvelle acquisition de la concession. La vente s'effectue en désignant la voiture par son rang dans le tableau / la collection (exemple : si un client souhaite acheter la voiture qui se trouve à la seconde case du tableau / de la collection, l'appel de méthode sera le suivant : `vendre(1, 12000.0)`).*

## 5. Les exceptions
Nous devons nous assurer à présent qu'une voiture qui est en passe d'être vendue respecte bien les normes en vigueur (avec la méthode estConforme). La méthode vendre doit à présent passer une exception (du type NonConformeException) à l'appelant lorsque la voiture n'est pas conforme.

### Énoncé
1. Écrivez la classe NonConformeException (qui hérite d'Exception)
2. Modifier la classe vendre qui devra vérifier que la voiture vendue est bien conforme et qui peut soulever une exception lorsque la voiture vendue n'est pas conforme (la signature est de la forme suivante : `Voiture vendre(int numeroVoiture, double prix) throws NonConformeException`)
3. Testez ;-)
