package fr.mertzel.OSE.modele;

import fr.mertzel.OSE.controleur.*;
import fr.mertzel.OSE.vue.*;

public class Ose {
	public static void main(String [] args){
		PlanSalle modele = new PlanSalle("Sans Nom") ;
		FenetrePrincipale vue = new FenetrePrincipale(modele) ;
		new Controleur(vue,modele) ;
	}
	
	
}