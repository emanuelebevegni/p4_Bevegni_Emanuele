package testingStrutturale;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import sviluppo.App;
import sviluppo.Gruppo;
import sviluppo.Sistema;

public class testingCancStrutturale {

	private static Sistema sistema = null;
	@BeforeClass
	public static void setUp() {
		sistema = new Sistema();
		System.out.println("Creo il sistema");
	}
	
	//Test positivo nel controllare che ci siano app presenti nel sistema da visualizzare
	@Test
	public void testVisualizzaAppsPositivo(){
		//Genero parametri di input
		ArrayList<App> apps = new ArrayList<>();
       	apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.visualizzaApps(apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		
	}
	
	//Test negativo nel controllare che ci siano app presenti nel sistema da visualizzare
	@Test
	public void testVisualizzaAppsNegativo(){
		//Genero parametri di input
		ArrayList<App> apps = new ArrayList<>();
       	//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.visualizzaApps(apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		
	}
	
	//Test che cancella una singola app dal sistema, in assenza di gruppi
	@Test
	public void testCancellaAppSingola(){
		//Genero parametri di input
		String indice = "1";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
       	apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.cancellaApp(scelta,indice,apps,gruppi);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	//Test che cancella una singola app dal sistema e da un gruppo
	@Test
	public void testCancellaAppDalGruppo(){
		//Genero parametri di input
		String indice = "1";
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
		//Ottengo il risultato
		boolean result = sistema.cancellaApp(scelta,indice,apps,gruppi);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	//Test negativo sull'indice inserito dall'utente (eccede la dimensione della lista app)
	@Test
	public void testCancellaIndiceConvertitoMaggiore(){
		//Genero parametri di input
		String indice = "6";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
		gruppi.add(new Gruppo(1,"SuperTesting"));
		gruppi.get(0).addApp(new App(1,"Calcio","Google"));
		apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple")); 
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.cancellaApp(scelta,indice,apps,gruppi);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	//Test negativo sull'indice inserito dall'utente (l'indice non puo essere un valore minone di 1)
	@Test
	public void testCancellaIndiceConvertitoMinore(){
		//Genero parametri di input
		String indice = "-1";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
		gruppi.add(new Gruppo(1,"SuperTesting"));
		gruppi.get(0).addApp(new App(1,"Calcio","Google"));
		apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.cancellaApp(scelta,indice,apps,gruppi);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	//Test negativo sull'indice inserito dall'utente (l'indice non puo essere una lettera/parola)
	@Test
	public void testCancellaIndiceErrato(){
		//Genero parametri di input
		String indice = "f";
		String scelta = "si";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
		gruppi.add(new Gruppo(1,"SuperTesting"));
		gruppi.get(0).addApp(new App(1,"Calcio","Google"));
		apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.cancellaApp(scelta,indice,apps,gruppi);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	//Test negativo l'utente non conferma di voler cancellare
	@Test
	public void testCancellaSceltaNonConfermata(){
		//Genero parametri di input
		String indice = "1";
		String scelta = "no";
		ArrayList<App> apps = new ArrayList<>();
		ArrayList<Gruppo> gruppi = new ArrayList<>();
		gruppi.add(new Gruppo(1,"SuperTesting"));
		gruppi.get(0).addApp(new App(1,"Calcio","Google"));
		apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Windows"));
    	apps.add(new App(3,"Golf","Apple"));
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.cancellaApp(scelta,indice,apps,gruppi);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	
}
