package testingFunzionale;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import sviluppo.App;
import sviluppo.Gruppo;
import sviluppo.Sistema;

public class testingCancFunzionale {

	private static Sistema sistema = null;
	@BeforeClass
	public static void setUp() {
		sistema = new Sistema();
		System.out.println("Creo il sistema");
	}
	
	/*
	 * In questo test cancello solo l'app dalla lista delle app
	 * in quanto non ci sono gruppi creati
	 */
	@Test
	public void cancellazioneAppSingola(){
		//Genero parametri di input
		String input = "1";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
       	apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato della visualizzazione
		boolean resultv = sistema.visualizzaApps(apps);
		//Controllo il risultato della visualizzazione
		assertEquals(expectedResult,resultv);
		//Ottengo il risultato della cancellazione;
		boolean resultc = sistema.cancellaApp(scelta,input, apps, gruppi);
		assertEquals(expectedResult,resultc);
		
	}
	
	/*
	 * In questo test viene cancellata l'app sia dalla lista delle app 
	 * sia dal gruppo in cui e' stata inserita
	 */
	@Test
	public void cancellazioneAppCompleta(){
		//Genero parametri di input
		String input = "1";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		apps.add(new App(1,"Calcio","Google"));
		apps.add(new App(2,"Basket","Windows"));
		apps.add(new App(3,"Golf","Apple"));
		ArrayList<Gruppo> gruppi = new ArrayList<>();
		gruppi.add(new Gruppo(1,"SuperTesting"));
		gruppi.get(0).addApp(new App(1,"Calcio","Google"));
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato della visualizzazione
		boolean resultv = sistema.visualizzaApps(apps);
		//Controllo il risultato della visualizzazione
		assertEquals(expectedResult,resultv);
		//Ottengo il risultato della cancellazione;
		boolean resultc = sistema.cancellaApp(scelta,input, apps, gruppi);
		assertEquals(expectedResult,resultc);
		
	}
	/*
	 * In questo test viene cancellata solo l'app dalla lista delle app 
	 * in quanto non sara' presente in nessun gruppo
	 */
	@Test
	public void cancellazioneAppSistema(){
		//Genero parametri di input
		String input = "1";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		apps.add(new App(1,"Calcio","Google"));
		apps.add(new App(2,"Basket","Windows"));
		apps.add(new App(3,"Golf","Apple"));
		ArrayList<Gruppo> gruppi = new ArrayList<>();
		gruppi.add(new Gruppo(1,"SuperTesting"));
		gruppi.get(0).addApp(new App(2,"Basket","windows"));
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato della visualizzazione
		boolean resultv = sistema.visualizzaApps(apps);
		//Controllo il risultato della visualizzazione
		assertEquals(expectedResult,resultv);
		//Ottengo il risultato della cancellazione;
		boolean resultc = sistema.cancellaApp(scelta,input, apps, gruppi);
		assertEquals(expectedResult,resultc);
		
	}
	/*
	 * In questo test l'app selezionata non viene cancellata 
	 * in quanto l'utente non ha confermato la sua scelta
	 */
	@Test
	public void cancellazioneSceltaNonConfermata(){
		//Genero parametri di input
		String input = "1";
		String scelta = "no";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
       	apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato della visualizzazione
		boolean resultv = sistema.visualizzaApps(apps);
		//Controllo il risultato della visualizzazione
		assertEquals(expectedResult,resultv);
		//Setto il risultato aspettato
		boolean expectedResult2 = false;
		//Ottengo il risultato della cancellazione;
		boolean resultc = sistema.cancellaApp(scelta,input, apps, gruppi);
		assertEquals(expectedResult2,resultc);
		
	}
}
