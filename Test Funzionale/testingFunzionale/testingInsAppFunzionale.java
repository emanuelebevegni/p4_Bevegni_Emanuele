package testingFunzionale;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import sviluppo.App;
import sviluppo.AppleStore;
import sviluppo.GoogleStore;
import sviluppo.Sistema;
import sviluppo.WinStore;

public class testingInsAppFunzionale {

	/*
	 * In base al costruttore riesco a creare un "sistema" con associati degli appstore 
	 * che posseggono una lista di app pre-generata oppure un "sistema2" dove gli appstore non sono stati ancora 
	 * associati e quindi non potro ricavare liste di apps
	 */
	private static Sistema sistema = null;
	private static Sistema sistema2 = null;
	@BeforeClass
	public static void setUp() {
		sistema = new Sistema();
		System.out.println("Creo il sistema");
		
		GoogleStore g = null;
		AppleStore a = null;
		WinStore w = null;
		sistema2 = new Sistema(g, a, w);
	}
	
	/*
	 * Test per verificare l'inserimento di un'app 
	 * con la lista delle app del sistema vuota
	 */
	@Test
	public void testInserimentoAppListaVuota(){
		//Genero parametri di input
		String names = "Windows";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		//Ottengo il risultato per gestListaApp
		listone = sistema.getListaApps();
	   	ArrayList<App> apps = new ArrayList<>();
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	/*
	 * Test per verificare l'inserimento di un'app (google) non presente 
	 * nella lista delle app del sistema
	 */
	
	@Test
	public void testInserimentoAppPositivoGoole(){
		//Genero parametri di input
		String names = "Google";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		//Ottengo il risultato per gestListaApp
		listone = sistema.getListaApps();
	   	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(2,"Auto","Windows"));
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
		
	/*
	 * Test per verificare l'inserimento di un'app (windows) 
	 * non presente nella lista delle app del sistema
	 */
	@Test
	public void testInserimentoAppPositivoApple(){
		//Genero parametri di input
		String names = "Apple";
		String napp = "3";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		//Ottengo il risultato per gestListaApp
		listone = sistema.getListaApps();
	   	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(2,"Auto","Windows"));
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	/*
	 * Test per verificare l'inserimento di un'app (apple) 
	 * non presente nella lista delle app del sistema
	 */
	@Test
	public void testInserimentoAppPositivoWin(){
		//Genero parametri di input
		String names = "Windows";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		//Ottengo il risultato per gestListaApp
		listone = sistema.getListaApps();
	   	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(2,"Auto","Windows"));
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
		
	
	/*
	 * Test per verificare l'inserimento di un'app 
	 * presente nella lista delle app del sistema
	 */
	@Test
	public void testInserimentoAppNegativo(){
		//Genero parametri di input
		String names = "Windows";
		String napp = "2";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		//Ottengo il risultato per gestListaApp
		listone = sistema.getListaApps();
	   	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(2,"Auto","Windows"));
    	//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	/*
	 * Testing considerando che dagli store 
	 * otterro delle liste di apps tutte vuote
	 */
	@Test
	public void testGetListaAppsVuota(){
		//Setto il risultato aspettato
		ArrayList<ArrayList<App>> expectedResult = null;
		//Ottengo il risultato
		ArrayList<ArrayList<App>> result = new ArrayList<ArrayList<App>>();
		result = sistema2.getListaApps();
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
}
