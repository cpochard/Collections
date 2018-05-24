package com.cpochard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// déclaration d'une liste chainée qui va contenir des chaines de caractères et
		// initialisation (affectation) :
		LinkedList<String> listeChaine = new LinkedList();
		// Ajouter des éléments dans la liste :
		listeChaine.add("Nicolas");
		listeChaine.add("Adrien");
		listeChaine.add("Lucie");
		listeChaine.add("Pierre");
		listeChaine.add("Laure");

		System.out.println("Taille de ma liste chainée :" + listeChaine.size());
		System.out.println("\nAffichage de la liste chainée avec un itérateur");

		// Je lie ma liste chainée à un iterateur :
		afficherListeAvecIterateur(listeChaine);

		afficherListeAvecForEach(listeChaine);

		// Pour afficher le dernier élément
		afficheDernierElementDansListe(listeChaine);

		// Pour afficher les 3 premiers éléments
		afficherLesNPremiersElementsDansListe(listeChaine, 3);

		// Faire une TreeSet (trie automatiquement)
		TreeSet listeTriAuto = new TreeSet();
		// A besoin d'intégrer un objet donc on integre la liste chainée
		listeTriAuto.addAll(listeChaine);
		System.out.println("\n J'affiche la liste Tree" + listeTriAuto);

		// Faire une HashSet
		// Je créé une variable de type HashSet qui contient un objet HashSet()
		HashSet listeHash = new HashSet();
		// A besoin d'intégrer un objet donc on integre la liste chainée
		// Donc j'ajoute des éléments dans ma liste, stockés dans une autre liste
		listeHash.addAll(listeChaine);
		// Je créé une nouvelle variable de type ArrayList et je créé un nouvel objet
		// (ArrayList) qui prend des valeurs par défaut
		ArrayList tableATrier = new ArrayList(listeHash);
		// J'appelle la fonction sort disponible dans la classe Collections
		// Cette fonction me permet de trier mon tableau (de A à Z par défaut)
		Collections.sort(tableATrier);
		System.out.println("\n J'affiche la liste Hash" + listeHash);

		// Pour déclarer un clavier
		System.out.print("Combien d'éléments souhaites-tu afficher :");
		Scanner clavier = new Scanner(System.in);
		int choixUtilisateur = clavier.nextInt();
		System.out.println("Je vais afficher" + choixUtilisateur + "personnes");
		afficherLesNPremiersElementsDansListe(listeChaine, choixUtilisateur);

		// Faire appel à l'autre Classe TestCollection et on appelle la fonction
		TestCollection.testerLesCollections();

		// Utiliser la fonction Switch
		decouvrirSwitch();
	}

	/**
	 * Pour afficher les N premiers éléments de la liste chainée de chaine de
	 * caractères
	 * 
	 * @param listeChaine
	 *            Liste chainée
	 * @param i
	 *            Nombre d'éléments à afficher
	 */

	private static void afficherLesNPremiersElementsDansListe(LinkedList<String> listeChaine, int i) {
		for (int index = 0; index < i; index++) {
			System.out.println(listeChaine.get(index));
		}
	}

	private static void afficheDernierElementDansListe(LinkedList<String> listeChaine) {
		System.out.println("J'affiche le dernier élément:" + listeChaine.get(listeChaine.size() - 1));
	}

	private static void afficherListeAvecIterateur(LinkedList<String> listeChaine) {
		Iterator<String> iterateur = listeChaine.iterator();

		// J'utilise l'iterateur et sa fonction HasNext pour vérifier si l'élément
		// suivant existe
		while (iterateur.hasNext()) {
			// J'affiche l'élément suivant
			System.out.println(iterateur.next());
		}
	}

	private static int afficherListeAvecForEach(LinkedList<String> listeChaine) {
		System.out.println("\nAffichage de prénoms avec la boucle ForEach");
		// Pour chaque élément de la liste...
		for (String prenom : listeChaine) {
			// J'affiche l'élément
			System.out.println(prenom);
		}
		return 0;

	}

	// Comprendre la fonction Switch
	private static void decouvrirSwitch() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez un âge :");
		int age = clavier.nextInt();
		// 0 rien, 1 à 2 bébé, 3 à 11 enfant, 12 à 17 ado, 18 à 30 jeune, 31 à 49
		// adulte,
		// 50 à 59 vieux, 60 à 199 senior, 100 à 999 momie et +1000 dinosaure
		// Utilisation du if
		String etatPersonne = null; // ici on dit que pour l'instant etatPersonne n'a pas de valeur
		if (age == 0) {
			etatPersonne = "Rien";
		} else if (age < 3) {
			etatPersonne = "Bébé";
		} else if (age < 12) {
			etatPersonne = "Enfant";
		} else if (age < 18) {
			etatPersonne = "Ado";
		} else if (age < 31) {
			etatPersonne = "Jeune";
		} else if (age < 50) {
			etatPersonne = "Adulte";
		} else if (age < 60) {
			etatPersonne = "Vieux";
		} else if (age < 100) {
			etatPersonne = "Senior";
		} else if (age < 1000) {
			etatPersonne = "Momie";
		} else {
			etatPersonne = "Dinosaure";
			System.out.println("Etat de la personne :" + etatPersonne);
		}

		// Utilisation de la fonction switch basée sur ce qui est définit par le else if
		switch (etatPersonne) {
		case "Rien":
			System.out.println("Ce truc ne peut pas parler");
			break;
		case "Bébé":
			System.out.println("Areuh");
			break;
		case "Enfant":
			System.out.println("Blabla");
			break;
		case "Ado":
			System.out.println("Wesh");
			break;
		case "Jeune":
			System.out.println("Youpi");
			break;
		case "Adulte":
			System.out.println("Je vieillis...");
			break;
		case "Vieux":
			System.out.println("Bientot la retraite");
			break;
		case "Senior":
			System.out.println("Aie ma hanche");
			break;
		case "Momie":
			System.out.println("Argh");
			break;
		case "Dinosaure":
			System.out.println("GRRR");
			break;
		}

		// Utilisation autre de switch
		switch (age) {
		case 0:
			System.out.println("Ce truc ne peut pas parler");
			break;
		case 1:
		case 2:
			System.out.println("Areuh");
			break;
		default:
			switch (age) {
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Blabla");
				break;
				//On continue comme ça avec tous les ages à tester... 
				//Donc méthode utile quand on veut tester peu de condition
				//Par exemple pour comparer deux conditions
			default:
				System.out.println("Etc jusqu'au bout");
				break;

			}
		}
	}
}
