package testingFunzionale;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import sviluppo.App;
import sviluppo.Dati;
import sviluppo.Gruppo;
import sviluppo.Main;
import sviluppo.Sistema;

public class testingVisualFunzionale {

	private static Sistema sistema = null;
	@BeforeClass
	public static void setUp() {
		sistema = new Sistema();
	//	Main.istanzioDatiGruppo();
		System.out.println("Creo il sistema");
	}
	
	/*Appunto per i testi funzionali
	 * I miei test funzionali sono una ripetizione di alcuni casi
	 * dei test strutturali in quanto io dal sistema mi aspetto determinati 
	 * comportamenti che ho gia visto nei test strutturali. Infatti ho
	 * inserito solo un test di visualizzazione dei dati, in quanto
	 * all'utente interessa che venga stampato qualsiasa a video che questo sia
	 * un valore effettivo oppure NA ( non disponibili )
	 */
	
	/*
	 * Test di visualizzazione sul gruppo 
	 * ma non ci sono app al suo interno
	 */
	@Test
	public void VisualGruppoVuoto(){
		//Genero parametri di input
		Gruppo gruppo = new Gruppo(1, "TestingStrut");
		Dati dati = null;
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = gruppo.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		gruppo.visualizzazioneDati();
	}
	
	/*
	 * Test di visualizzazione sul gruppom con app al suo interno 
	 * ma non sono stati settati dati aggregati al gruppo per qualche errore 
	 * durante l'aggregazione
	 */
	@Test
	public void VisualGruppoNoDati(){
		//Genero parametri di input
		Gruppo gruppo = new Gruppo(1, "TestingStrut");
		gruppo.addApp(new App(1,"Calcio","Google"));
    	gruppo.addApp(new App(2,"Basket","Windows"));
    	Dati dati = null;
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = gruppo.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		gruppo.visualizzazioneDati();
	}
	
	/*
	 * Test di visualizzazione sul gruppo 
	 * al cui interno ci sono una app di Google e una di Windows
	 */
	@Test
	public void VisualGruppoAppMiste(){
		//Genero parametri di input
		Gruppo gruppo = new Gruppo(1, "TestingStrut");
		App ap1 = new App(1,"Calcio","Google");
		App ap2 = new App(2,"Basket","Windows");
		ap1.setDati(Main.istanzioDatiApp(ap1));
		ap2.setDati(Main.istanzioDatiApp(ap2));
		gruppo.addApp(ap1);
    	gruppo.addApp(ap2);
    	//Setto il risultato aspettato
    	boolean expectedResult = true;
    	//Ottengo il risultato
    	boolean result = gruppo.setDati(Main.istanzioDatiGruppo());
    	//Controllo il risultato
    	assertEquals(expectedResult,result);
    	gruppo.visualizzazioneDati();
	}
}
		
