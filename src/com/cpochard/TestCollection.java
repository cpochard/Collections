package com.cpochard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	public static void testerLesCollections() {
		
		//Je cr�� une variable de type g�n�rique Collection (parent)
		//Cette variable prend en valeur un objet de type ArrayList (fille)
		Collection names = new ArrayList();
		//J'ajoute de nouveaux �l�ments dans ma collection
		names.add("tmp.txt");
		names.add("toto.odt");
		//La toute premi�re fois qu'on rencle dans la boucle, on cr�� une variable de type 
		//iterateur qui sera initialis� � partir de la fonction '.iterator()' disponible
		//dans l'objet names.
		//A chaque passage dans la boucle on v�rifie qu'il existe un �l�ment suivant.
		for (Iterator it = names.iterator(); it.hasNext();) {
			//on convertit en chaine de caract�res et on affiche le nom trouv�
			String name = (String) it.next();
			System.out.println("Nom trouv� :" + name);
		}
	}
}
