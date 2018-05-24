package com.cpochard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	public static void testerLesCollections() {
		
		//Je créé une variable de type générique Collection (parent)
		//Cette variable prend en valeur un objet de type ArrayList (fille)
		Collection names = new ArrayList();
		//J'ajoute de nouveaux éléments dans ma collection
		names.add("tmp.txt");
		names.add("toto.odt");
		//La toute première fois qu'on rencle dans la boucle, on créé une variable de type 
		//iterateur qui sera initialisé à partir de la fonction '.iterator()' disponible
		//dans l'objet names.
		//A chaque passage dans la boucle on vérifie qu'il existe un élément suivant.
		for (Iterator it = names.iterator(); it.hasNext();) {
			//on convertit en chaine de caractères et on affiche le nom trouvé
			String name = (String) it.next();
			System.out.println("Nom trouvé :" + name);
		}
	}
}
