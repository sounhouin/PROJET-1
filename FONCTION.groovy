script
* Ce fichier contient toutes les fonctions nécessaires au fonctionnement du jeu.
*
************************************************** *******************************/

/**
* Cette fonction affiche dans la console le score de l'utilisateur
* @param { number } score : le score de l'utilisateur
* @param { number } nbMotsProposes : le nombre de mots proposé à l'utilisateur
*/
function  afficherResultat ( score ,  nbMotsProposes )  {
    consoler . log ( "Votre score est de "  +  score  +  " sur "  +  nbMotsProposes )
}

/**
* Cette fonction demande à l'utilisateur de choisir entre "mots" et "phrases" et retourne le choix de l'utilisateur
* @return { string } : le choix de l'utilisateur, ce choix est essentiellement "mots" ou "phrases
*/
fonction  choisirPhrasesOuMots ( )  {
    // Tant que l'utilisateur n'a pas saisi "mots" ou "phrases", on lui redemande de saisir un choix
    let  choix  =  prompt ( "Avec quelle liste désirez-vous jouer : 'mots' ou 'phrases' ?" )
    while  ( choix  !==  "mots"  &&  choix  !==  "phrases" )  {
        choix  =  prompt ( "Avec quelle liste désirez-vous jouer : 'mots' ou 'phrases' ?" )
    }
     choix de retour
}

/**
* Cette fonction lance la boucle de jeu, c'est à dire qu'elle demande à l'utilisateur de saisir tous les mots
* contenus dans le tableau listePropositions. A chaque mot saisi, on incrémente le score de l'utilisateur
*
* @param { array[string] } listePropositions
* @return { number } : le score de l'utilisateur
*/
function  lancerBoucleDeJeu ( listePropositions )  {
    soit  score  =  0
    pour  ( soit  i  =  0 ;  i  <  listePropositions . length ;  i ++ )  {
        // On demande à l'utilisateur de saisir le mot correspondant à l'indice i
        let  motUtilisateur  =  prompt ( "Entrez le mot : "  +  listePropositions [ i ] )
        if  ( motUtilisateur  ===  listePropositions [ i ] )  {
            // Si le mot saisi par l'utilisateur est correct, on incrémente le score
            note ++
        }
    }
     score de retour
}

/**
* Cette fonction lance le jeu.
* Elle demande à l'utilisateur de choisir entre "mots" et "phrases" et lancer la boucle de jeu correspondante
*/
fonction  lancerJeu ( )  {
    // Initialisations
    laisser  choix  =  choisirPhrasesOuMots ( )
    soit  score  =  0
    soit  nbMotsProposes  =  0

    // On détermine la liste des mots ou des phrases à proposer à l'utilisateur
    if  ( choix  ===  "mots" )  {
        score  =  lancerBoucleDeJeu ( listeMots )
        nbMotsProposes  =  listeMots . longueur
    }  autre  {
        score  =  lancerBoucleDeJeu ( listePhrases )
        nbMotsProposes  =  listePhrases . longueur
    }

    Affichage du résultat ( score ,  nbMotsProposes )
}




main


/*************************************************** ********************************
*
* Point d'entrée, c'est lui qui initialise le jeu et lance la boucle de jeu.
*
************************************************** *******************************/

lancerJeu ( )



config

/*************************************************** ********************************
*
* Ce fichier contient toutes les constantes nécessaires au fonctionnement du jeu.
* En particulier les listes de mots et de phrases proposées à l'utilisateur
*
************************************************** *******************************/

// Déclaration des tableaux contenant les listes des mots proposés à l'utilisateur
const  listeMots  =  [ "Cachalot" ,  "Pétunia" ,  "Serviette" ]
const  listePhrases  =  [ "Pas de panique !" ,  "La vie, l'univers et le reste" ,  "Merci pour le poisson" ]


//console.log("Hello World");
//et motTapeOk = true  Essayez de mettre false à la place de true

//if (motTapeOk) {
//    console.log("Bravo, vous avez correctement tapé le mot")
//} else {
 //   console.log("Échec, le mot n'est pas correct")
//}


//let motUtilisateur = prompt("Entrez un mot :")
//console.log(motUtilisateur);


const motApplication = "Bonjour" // Essayez de mettre un autre mot ici !
let motUtilisateur = prompt("Entrez le mot : " + motApplication)

if (motUtilisateur === motApplication) {
    console.log("Bravo !")
} else {
    console.log("Vous avez fait une erreur de frappe.")
}