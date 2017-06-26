package testingStrutturale;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import sviluppo.App;
import sviluppo.AppleStore;
import sviluppo.GoogleStore;
import sviluppo.Gruppo;
import sviluppo.Sistema;
import sviluppo.WinStore;

public class testingInsAppStrutturale {

	//In base al costruttore riesco a creare un "sistema" con associati degli 
	//appstore che posseggono una lista di app pre-generata
	//oppure un "sistema2" dove gli appstore non sono stati ancora associati 
	//e quindi non potro ricavare liste di apps
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
	
	//Test positivo,il sistema recupera la lista delle app su tutti gli appstore
	@Test
	public void testGetListaApps(){
		//Setto il risultato aspettato
		ArrayList<ArrayList<App>> expectedResult = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	expectedResult.add(appsG);
    	expectedResult.add(appsW);
    	expectedResult.add(appsA);
    	//Ottengo il risultato
		ArrayList<ArrayList<App>> result = new ArrayList<ArrayList<App>>();
		result = sistema.getListaApps();
		//Controllo il risultato
		assertEquals(expectedResult,result);
	}
	
	/*	
	 * Test negativo considerando che all'interno degli store inseriti nel sistema	
	 * non ci siamo applicazioni
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
	
	/*
	 * Test avendo un sistema con la sua lista app vuota
	 * e inserisce un'app dal google store
	 */
	@Test
	public void testInserimentoAppGoogleListaAppsVuotaPositivo(){
		//Genero parametri di input
		String names = "Google";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
    	ArrayList<App> apps = new ArrayList<>();
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);		
	}
	
	//Test per inserire nel sistema un'app dal windows store
	@Test
	public void testInserimentoAppWinPositivo(){
		//Genero parametri di input
		String names = "Windows";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
    	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(2,"Auto","Windows"));
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);		
	}
	
	//Test per inserire nel sistema un'app dall'apple store
	@Test
	public void testInserimentoAppApplePositivo(){
		//Genero parametri di input
		String names = "Apple";
		String napp = "3";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
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
	 *Test per inserire nel sistema un'app dal google store
	 *ma con l'indice dell'app inserito dall'utente errato
	*/
	@Test
	public void testInserimentoAppGoogleIndiceErrato(){
		//Genero parametri di input
		String names = "Google";
		String napp = "7";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
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
	*Test per inserire nel sistema un'app dall'apple store
	*ma con l'indice dell'app inserito dall'utente errato
	*/
	@Test
	public void testInserimentoAppAppleIndiceErrato(){
		//Genero parametri di input
		String names = "Apple";
		String napp = "7";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
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
	 * Test per inserire nel sistema un'app dal win store 	
	 * ma con l'indice dell'app inserito dall'utente errato
	 */
	@Test
	public void testInserimentoAppWinIndiceErrato(){
		//Genero parametri di input
		String names = "Windows";
		String napp = "7";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
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
	 * Test per inserire nel sistema un'app dall'apple store 
	 * ma il nome dello store e' stato inserito in modo errato
	 */
	@Test
	public void testInserimentoAppNomeStoreErrato(){
		//Genero parametri di input
		String names = "storedistore";
		String napp = "7";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
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
	 * Test avendo un sistema con la sua lista app piena e l'applicazione 
	 * che vuole inserire l'utente non e' presente nel sistema
	 */
	@Test
	public void testInserimentoAppOkListaAppsPiena(){
		//Genero parametri di input
		String names = "Google";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
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
	 * Test avendo un sistema con la sua lista app piena e l'applicazione 
	 * che l'utente vuole inserie e' gia presente nel sistema
	 */
	@Test
	public void testInserimentoAppGiaPresente(){
		//Genero parametri di input
		String names = "Google";
		String napp = "1";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
    	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(1,"Calcio","Google"));
    	//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);		
	}
	
	/*
	 * Test avendo un sistema con la sua lista app piena e l'applicazione 
	 * che l'utente vuole inserie e' gia presente nel sistema
	 */
	@Test
	public void testInserimentoAppConversioneIndiceError(){
		//Genero parametri di input
		String names = "Google";
		String napp = "f";		
		ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
		ArrayList<App> appsG = new ArrayList<>();
		appsG.add(new App(1,"Calcio","Google"));
    	appsG.add(new App(2,"Basket","Google"));
    	appsG.add(new App(3,"Golf","Google"));
    	ArrayList<App> appsW = new ArrayList<>();
    	appsW.add(new App(1,"Vela","Windows"));
    	appsW.add(new App(2,"Auto","Windows"));
    	appsW.add(new App(3,"Sport","Windows"));
    	ArrayList<App> appsA = new ArrayList<>();
    	appsA.add(new App(1,"Mercato","Apple"));
    	appsA.add(new App(2,"MathLab","Apple"));
    	appsA.add(new App(3,"Simulink","Apple"));
    	listone.add(appsG);
    	listone.add(appsW);
    	listone.add(appsA);	
    	ArrayList<App> apps = new ArrayList<>();
    	apps.add(new App(1,"Calcio","Google"));
    	//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = sistema.inserimentoApp(names, napp, listone, apps);
		//Controllo il risultato
		assertEquals(expectedResult,result);		
	}
}
