package testingStrutturale;

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

public class testingVisualStrutturale {

	private static Sistema sistema = null;
	@BeforeClass
	public static void setUp() {
		sistema = new Sistema();
	//	Main.istanzioDatiGruppo();
		System.out.println("Creo il sistema");
	}
	
	/*
	 * Test di visualizzazione su singola app 
	 * con i propri dati associati nulli
	 */
	@Test
	public void VisualAppNull(){
		//Genero parametri di input
		App app = new App(1,"Calcio","Google");
		Dati dati = null;
		//Setto il risultato aspettato
		boolean expectedResult = false;
		//Ottengo il risultato
		boolean result = app.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		app.visualizzaDati();
	}
	
	/*
	 * Test di visualizzazione su singola app google 
	 * con i propri dati associati settati (tutti con un valore)
	 */
	@Test
	public void VisualAppGoogleSettati(){
		//Genero parametri di input
		App app = new App(1,"Calcio","Google"); 
		Dati dati = Main.istanzioDatiApp(app);
    	//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = app.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		app.visualizzaDati();
	}
	
	/*
	 * Test di visualizzazione su singola app google con i 
	 * propri dati associati non settati (tutti a dim 0)
	 */
	@Test
	public void VisualAppGoogleVuoti(){
		//Genero parametri di input
		App app = new App(1,"Calcio","Google");
		Dati dati = new Dati();
    		
		dati.setProvenienza(app.getProvenienza());
		// Setto le medie voti rispetto alla versione dell'app
		ArrayList<String> apv = new ArrayList<String>();
    	ArrayList<Double> daav = new ArrayList<Double>();
    	ArrayList<Double> taav = new ArrayList<Double>();
        	    	
    	dati.setApp_version(apv);
    	dati.setDaily_average_app_version(daav);
    	dati.setTotal_average_app_version(taav);
    	
    	// Setto le medie voti rispetto all'operatore telefonico
		ArrayList<String> ca = new ArrayList<String>();
    	ArrayList<String> cad = new ArrayList<String>();
    	ArrayList<Double> cdac = new ArrayList<Double>();
       	ArrayList<Double> ctac = new ArrayList<Double>();
        	    	
    	dati.setCarrier(ca);
    	dati.setData_carrier(cad);
    	dati.setDaily_average_carrier(cdac);
    	dati.setTotal_average_carrier(ctac);;
    	
    	// Setto le medie voti rispetto al paese
		ArrayList<String> coa = new ArrayList<String>();
       	ArrayList<String> coad = new ArrayList<String>();
    	ArrayList<Double> codac = new ArrayList<Double>();
      	ArrayList<Double> cotac = new ArrayList<Double>();
        	    	
    	dati.setCountry(coa);
    	dati.setData_country(coad);
    	dati.setDaily_average_country(codac);
    	dati.setTotal_average_country(cotac);
    	
    	// Setto le medie voti rispetto al dispositivo
		ArrayList<String> doa = new ArrayList<String>();
       	ArrayList<String> dad = new ArrayList<String>();
    	ArrayList<Double> ddac = new ArrayList<Double>();
     	ArrayList<Double> dtac = new ArrayList<Double>();
    	    	
    	dati.setDevice(doa);
    	dati.setData_device(dad);
    	dati.setDaily_average_device(ddac);
    	dati.setTotal_average_device(dtac);
    	
    	// Setto le medie voti rispetto alla lingua
		ArrayList<String> loa = new ArrayList<String>();
     	ArrayList<String> lad = new ArrayList<String>();
     	ArrayList<Double> ldac = new ArrayList<Double>();
    	ArrayList<Double> ltac = new ArrayList<Double>();
     	    	
    	dati.setLanguage(loa);
    	dati.setData_language(lad);
    	dati.setDaily_average_language(ldac);
    	dati.setTotal_average_language(ltac);
    	
     	// Setto le medie voti rispetto al OS
		ArrayList<String> osoa = new ArrayList<String>();
    	ArrayList<String> osad = new ArrayList<String>();
     	ArrayList<Double> osdac = new ArrayList<Double>();
     	ArrayList<Double> ostac = new ArrayList<Double>();
     	    	
    	dati.setOs_version(osoa);
    	dati.setData_os_version(osad);
    	dati.setDaily_average_os_version(osdac);
    	dati.setTotal_average_os_version(ostac);
    	
    	// Setto le medie voti rispetto ai tablet
		ArrayList<String> toa = new ArrayList<String>();
    	ArrayList<String> tad = new ArrayList<String>();
    	ArrayList<Double> tdac = new ArrayList<Double>();
     	ArrayList<Double> ttac = new ArrayList<Double>();
    	    	
    	dati.setTablet(toa);
    	dati.setData_tablet(tad);
    	dati.setDaily_average_tablet(tdac);
    	dati.setTotal_average_tablet(ttac);
    	
    	// Setto le medie voti generale
	  	ArrayList<String> oad = new ArrayList<String>();
    	ArrayList<Double> odac = new ArrayList<Double>();
    	ArrayList<Double> otac = new ArrayList<Double>();
     	    	
    	dati.setData_overview(oad);
    	dati.setDaily_average_overview(odac);
    	dati.setTotal_average_overview(otac);
    	
		// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> date = new ArrayList<String>();
    	ArrayList<Integer> idui = new ArrayList<Integer>();
     	ArrayList<Integer> itui = new ArrayList<Integer>();
    	ArrayList<Integer> iduu = new ArrayList<Integer>();
    	ArrayList<Integer> iadi = new ArrayList<Integer>();
     	    	
    	dati.setOverview_data(date);
    	dati.setOverview_dailyUserInstalls(idui);
    	dati.setOverview_totUserInstalls(itui);
    	dati.setOverview_dailyUserUninstalls(iduu);
    	dati.setOverview_activeDeviceInstalls(iadi);
    	
    	// Setto i dati sulle installazioni rispetto alle compagnie telefoniche
    	ArrayList<Integer> cdui = new ArrayList<Integer>();
    	ArrayList<Integer> ctui = new ArrayList<Integer>();
    	ArrayList<Integer> cduu = new ArrayList<Integer>();
    	ArrayList<Integer> cadi = new ArrayList<Integer>();
     	
    	dati.setCarrier_data(date);
    	dati.setCarrier_dailyUserInstalls(cdui);
    	dati.setCarrier_totUserInstalls(ctui);
    	dati.setCarrier_dailyUserUninstalls(cduu);
    	dati.setCarrier_activeDeviceInstalls(cadi);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> codui = new ArrayList<Integer>();
    	ArrayList<Integer> cotui = new ArrayList<Integer>();
    	ArrayList<Integer> coduu = new ArrayList<Integer>();
    	ArrayList<Integer> coadi = new ArrayList<Integer>();
     	
    	dati.setCountry_data(date);
    	dati.setCountry_dailyUserInstalls(codui);
    	dati.setCountry_totUserInstalls(cotui);
    	dati.setCountry_dailyUserUninstalls(coduu);
    	dati.setCountry_activeDeviceInstalls(coadi);
    	
    	// Setto i dati sulle installazioni rispetto ai device
      	ArrayList<Integer> ddui = new ArrayList<Integer>();
     	ArrayList<Integer> dtui = new ArrayList<Integer>();
    	ArrayList<Integer> dduu = new ArrayList<Integer>();
    	ArrayList<Integer> dadi = new ArrayList<Integer>();
    	
    	dati.setDevice_data(date);
    	dati.setDevice_dailyUserInstalls(ddui);
    	dati.setDevice_totUserInstalls(dtui);
    	dati.setDevice_dailyUserUninstalls(dduu);
    	dati.setDevice_activeDeviceInstalls(dadi);
    	
    	// Setto i dati sulle installazioni rispetto alla lingua
      	ArrayList<Integer> ldui = new ArrayList<Integer>();
    	ArrayList<Integer> ltui = new ArrayList<Integer>();
    	ArrayList<Integer> lduu = new ArrayList<Integer>();
    	ArrayList<Integer> ladi = new ArrayList<Integer>();
     	
    	dati.setLang_data(date);
    	dati.setLang_dailyUserInstalls(ldui);
    	dati.setLang_totUserInstalls(ltui);
    	dati.setLang_dailyUserUninstalls(lduu);
    	dati.setLang_activeDeviceInstalls(ladi);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osdui = new ArrayList<Integer>();
    	ArrayList<Integer> ostui = new ArrayList<Integer>();
    	ArrayList<Integer> osduu = new ArrayList<Integer>();
    	ArrayList<Integer> osadi = new ArrayList<Integer>();
     	
    	dati.setOsVersion_data(date);
    	dati.setOsVersion_dailyUserInstalls(osdui);
    	dati.setOsVersion_totUserInstalls(ostui);
    	dati.setOsVersion_dailyUserUninstalls(osduu);
    	dati.setOsVersion_activeDeviceInstalls(osadi);
    	
    	// Setto i dati sulle installazioni rispetto ai table
    	ArrayList<Integer> tdui = new ArrayList<Integer>();
    	ArrayList<Integer> ttui = new ArrayList<Integer>();
    	ArrayList<Integer> tduu = new ArrayList<Integer>();
    	ArrayList<Integer> tadi = new ArrayList<Integer>();
     	
    	dati.setTablet_data(date);
    	dati.setTablet_dailyUserInstalls(tdui);
    	dati.setTablet_totUserInstalls(ttui);
    	dati.setTablet_dailyUserUninstalls(tduu);
    	dati.setTablet_activeDeviceInstalls(tadi);
	    
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = app.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		app.visualizzaDati();
	}
	
	/*
	 * Test di visualizzazione su singola app windows 
	 * con i propri dati associati settati
	 */
	@Test
	public void VisualAppWinPieni(){
		//Genero parametri di input
		App app = new App(1,"Vela","Windows");
		Dati dati = Main.istanzioDatiApp(app);
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = app.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		app.visualizzaDati();
	}
	
	/*
	 * Test di visualizzazione su singola app windows 
	 * con i propri dati associati non settati
	 */
	@Test
	public void VisualAppWinVuoti(){
		//Genero parametri di input
		App app = new App(1,"Vela","Windows");
		Dati dati = new Dati();
		dati.setProvenienza(app.getProvenienza());
		
		//Setto i contatori sui Rating ( qui invece che a dimensione uguale a 0,
		//i contatori vengono settati sul valore 0 )
		double cn = 0;
		double cr = 0;
		dati.setCount_new(cn);
		dati.setCount_revised(cr);
		
		//Setto le medie dei voti nel tempo
		ArrayList<String> datewin = new ArrayList<String>();
    	ArrayList<Double> car = new ArrayList<Double>();
    	dati.setDate_win(datewin);
		dati.setCount_average(car);
		
		//Setto le medie dei voti in base al market
		ArrayList<String> market = new ArrayList<String>();
    	ArrayList<Double> ar = new ArrayList<Double>();
    	ArrayList<Integer> nr= new ArrayList<Integer>();
    	dati.setMarket(market);
		dati.setAverage_rating(ar);
		dati.setNumber_rating(nr);
		
		// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> date = new ArrayList<String>();
    	ArrayList<Integer> idui = new ArrayList<Integer>();
    	
    	dati.setOverview_data(date);
    	dati.setOverview_dailyUserInstalls(idui);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> codui = new ArrayList<Integer>();
    	
    	dati.setCountry_data(date);
    	dati.setCountry_dailyUserInstalls(codui);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osdui = new ArrayList<Integer>();
    	
    	dati.setOsVersion_data(date);
    	dati.setOsVersion_dailyUserInstalls(osdui);
    	
    	// Setto i dati sui failure
    	ArrayList<Integer> fc = new ArrayList<Integer>();
    	
    	dati.setFailure_data(date);
    	dati.setFailure_count(fc);
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = app.setDati(dati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		app.visualizzaDati();
	}
	
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
	 * Test di visualizzazione sul gruppo con app al suo interno 
	 * ma non sono stati settati dati aggregati al gruppo per qualche 
	 * errore durante l'aggregazione
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
	 * Test di visualizzazione sul gruppo al 
	 * cui interno ci sono due app di google
	 */
	@Test
	public void VisualGruppo2GoogleApp(){
		//Genero parametri di input
		Gruppo gruppo = new Gruppo(1, "TestingStrut");
		App ap1 = new App(1,"Calcio","Google");
		App ap2 = new App(2,"Basket","Google");
		ap1.setDati(Main.istanzioDatiApp(ap1));
		ap2.setDati(Main.istanzioDatiApp(ap2));
		gruppo.addApp(ap1);
    	gruppo.addApp(ap2);
    	
    	Dati datiAggregati = new Dati();
    	datiAggregati.setProvenienza("Aggregazione");
    	
		// Setto le medie voti rispetto alla versione dell'app
		ArrayList<String> apv = new ArrayList<String>();
    	ArrayList<Double> daav = new ArrayList<Double>();
    	daav.add(((double)(Math.random()*10)/2));
    	daav.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> taav = new ArrayList<Double>();
    	taav.add(((double)(Math.random()*10)/2));
    	taav.add(((double)(Math.random()*10)/2));
    	    	
    	datiAggregati.setApp_version(apv);
    	datiAggregati.setDaily_average_app_version(daav);
    	datiAggregati.setTotal_average_app_version(taav);
    	
    	// Setto le medie voti rispetto all'operatore telefonico
		ArrayList<String> ca = new ArrayList<String>();
    	ArrayList<String> cad = new ArrayList<String>();
    	ArrayList<Double> cdac = new ArrayList<Double>();
    	cdac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ctac = new ArrayList<Double>();
    	ctac.add(((double)(Math.random()*10)/2));
    	    	    	
    	datiAggregati.setCarrier(ca);
    	datiAggregati.setData_carrier(cad);
    	datiAggregati.setDaily_average_carrier(cdac);
    	datiAggregati.setTotal_average_carrier(ctac);;
    	
    	// Setto le medie voti rispetto al paese
		ArrayList<String> coa = new ArrayList<String>();
		ArrayList<String> coad = new ArrayList<String>();
    	ArrayList<Double> codac = new ArrayList<Double>();
    	codac.add(((double)(Math.random()*10)/2));
       	ArrayList<Double> cotac = new ArrayList<Double>();
    	cotac.add(((double)(Math.random()*10)/2));
    		    	    	
    	datiAggregati.setCountry(coa);
    	datiAggregati.setData_country(coad);
    	datiAggregati.setDaily_average_country(codac);
    	datiAggregati.setTotal_average_country(cotac);
    	
    	// Setto le medie voti rispetto al dispositivo
		ArrayList<String> doa = new ArrayList<String>();
    	ArrayList<String> dad = new ArrayList<String>();
    	ArrayList<Double> ddac = new ArrayList<Double>();
    	ddac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> dtac = new ArrayList<Double>();
    	dtac.add(((double)(Math.random()*10)/2));
    		    	    	
    	datiAggregati.setDevice(doa);
    	datiAggregati.setData_device(dad);
    	datiAggregati.setDaily_average_device(ddac);
    	datiAggregati.setTotal_average_device(dtac);
    	
    	// Setto le medie voti rispetto alla lingua
		ArrayList<String> loa = new ArrayList<String>();
    	ArrayList<String> lad = new ArrayList<String>();
    	ArrayList<Double> ldac = new ArrayList<Double>();
    	ldac.add(((double)(Math.random()*10)/2));
       	ArrayList<Double> ltac = new ArrayList<Double>();
    	ltac.add(((double)(Math.random()*10)/2));
    	    	    	
    	datiAggregati.setLanguage(loa);
    	datiAggregati.setData_language(lad);
    	datiAggregati.setDaily_average_language(ldac);
    	datiAggregati.setTotal_average_language(ltac);
    	
     	// Setto le medie voti rispetto al OS
		ArrayList<String> osoa = new ArrayList<String>();
    	ArrayList<String> osad = new ArrayList<String>();
    	ArrayList<Double> osdac = new ArrayList<Double>();
    	osdac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ostac = new ArrayList<Double>();
    	ostac.add(((double)(Math.random()*10)/2));
    	
    	datiAggregati.setOs_version(osoa);
    	datiAggregati.setData_os_version(osad);
    	datiAggregati.setDaily_average_os_version(osdac);
    	datiAggregati.setTotal_average_os_version(ostac);
    	
    	// Setto le medie voti rispetto ai tablet
		ArrayList<String> toa = new ArrayList<String>();
    	ArrayList<String> tad = new ArrayList<String>();
    	ArrayList<Double> tdac = new ArrayList<Double>();
    	tdac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ttac = new ArrayList<Double>();
    	ttac.add(((double)(Math.random()*10)/2));
    	    	
    	datiAggregati.setTablet(toa);
    	datiAggregati.setData_tablet(tad);
    	datiAggregati.setDaily_average_tablet(tdac);
    	datiAggregati.setTotal_average_tablet(ttac);
    	
    	// Setto le medie voti generale
	  	ArrayList<String> oad = new ArrayList<String>();
    	ArrayList<Double> odac = new ArrayList<Double>();
    	odac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> otac = new ArrayList<Double>();
    	otac.add(((double)(Math.random()*10)/2));
    	    	
    	datiAggregati.setData_overview(oad);
    	datiAggregati.setDaily_average_overview(odac);
    	datiAggregati.setTotal_average_overview(otac);
    	
		// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> date = new ArrayList<String>();
    	ArrayList<Integer> idui = new ArrayList<Integer>();
    	idui.add((int)(Math.random()*100));
    	ArrayList<Integer> itui = new ArrayList<Integer>();
    	itui.add((int)(Math.random()*100));
    	ArrayList<Integer> iduu = new ArrayList<Integer>();
    	iduu.add((int)(Math.random()*100));
    	ArrayList<Integer> iadi = new ArrayList<Integer>();
    	iadi.add((int)(Math.random()*100));
    	    	
    	datiAggregati.setOverview_data(date);
    	datiAggregati.setOverview_dailyUserInstalls(idui);
    	datiAggregati.setOverview_totUserInstalls(itui);
    	datiAggregati.setOverview_dailyUserUninstalls(iduu);
    	datiAggregati.setOverview_activeDeviceInstalls(iadi);
    	
    	// Setto i dati sulle installazioni rispetto alle compagnie telefoniche
    	ArrayList<Integer> cdui = new ArrayList<Integer>();
    	cdui.add((int)(Math.random()*100));
    	ArrayList<Integer> ctui = new ArrayList<Integer>();
    	ctui.add((int)(Math.random()*100));
    	ArrayList<Integer> cduu = new ArrayList<Integer>();
    	cduu.add((int)(Math.random()*100));
    	ArrayList<Integer> cadi = new ArrayList<Integer>();
    	cadi.add((int)(Math.random()*100));
     	
    	datiAggregati.setCarrier_data(date);
    	datiAggregati.setCarrier_dailyUserInstalls(cdui);
    	datiAggregati.setCarrier_totUserInstalls(ctui);
    	datiAggregati.setCarrier_dailyUserUninstalls(cduu);
    	datiAggregati.setCarrier_activeDeviceInstalls(cadi);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> codui = new ArrayList<Integer>();
    	codui.add((int)(Math.random()*100));
    	ArrayList<Integer> cotui = new ArrayList<Integer>();
    	cotui.add((int)(Math.random()*100));
    	ArrayList<Integer> coduu = new ArrayList<Integer>();
    	coduu.add((int)(Math.random()*100));
    	ArrayList<Integer> coadi = new ArrayList<Integer>();
    	coadi.add((int)(Math.random()*100));
     	
    	datiAggregati.setCountry_data(date);
    	datiAggregati.setCountry_dailyUserInstalls(codui);
    	datiAggregati.setCountry_totUserInstalls(cotui);
    	datiAggregati.setCountry_dailyUserUninstalls(coduu);
    	datiAggregati.setCountry_activeDeviceInstalls(coadi);
    	
    	// Setto i dati sulle installazioni rispetto ai device
      	ArrayList<Integer> ddui = new ArrayList<Integer>();
    	ddui.add((int)(Math.random()*100));
    	ArrayList<Integer> dtui = new ArrayList<Integer>();
    	dtui.add((int)(Math.random()*100));
    	ArrayList<Integer> dduu = new ArrayList<Integer>();
    	dduu.add((int)(Math.random()*100));
    	ArrayList<Integer> dadi = new ArrayList<Integer>();
    	dadi.add((int)(Math.random()*100));
    	
    	datiAggregati.setDevice_data(date);
    	datiAggregati.setDevice_dailyUserInstalls(ddui);
    	datiAggregati.setDevice_totUserInstalls(dtui);
    	datiAggregati.setDevice_dailyUserUninstalls(dduu);
    	datiAggregati.setDevice_activeDeviceInstalls(dadi);
    	
    	// Setto i dati sulle installazioni rispetto alla lingua
      	ArrayList<Integer> ldui = new ArrayList<Integer>();
    	ldui.add((int)(Math.random()*100));
    	ArrayList<Integer> ltui = new ArrayList<Integer>();
    	ltui.add((int)(Math.random()*100));
    	ArrayList<Integer> lduu = new ArrayList<Integer>();
    	lduu.add((int)(Math.random()*100));
    	ArrayList<Integer> ladi = new ArrayList<Integer>();
    	ladi.add((int)(Math.random()*100));
     	
    	datiAggregati.setLang_data(date);
    	datiAggregati.setLang_dailyUserInstalls(ldui);
    	datiAggregati.setLang_totUserInstalls(ltui);
    	datiAggregati.setLang_dailyUserUninstalls(lduu);
    	datiAggregati.setLang_activeDeviceInstalls(ladi);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osdui = new ArrayList<Integer>();
    	osdui.add((int)(Math.random()*100));
    	ArrayList<Integer> ostui = new ArrayList<Integer>();
    	ostui.add((int)(Math.random()*100));
    	ArrayList<Integer> osduu = new ArrayList<Integer>();
    	osduu.add((int)(Math.random()*100));
    	ArrayList<Integer> osadi = new ArrayList<Integer>();
    	osadi.add((int)(Math.random()*100));
     	
    	datiAggregati.setOsVersion_data(date);
    	datiAggregati.setOsVersion_dailyUserInstalls(osdui);
    	datiAggregati.setOsVersion_totUserInstalls(ostui);
    	datiAggregati.setOsVersion_dailyUserUninstalls(osduu);
    	datiAggregati.setOsVersion_activeDeviceInstalls(osadi);
    	
    	// Setto i dati sulle installazioni rispetto ai table
    	ArrayList<Integer> tdui = new ArrayList<Integer>();
    	tdui.add((int)(Math.random()*100));
    	ArrayList<Integer> ttui = new ArrayList<Integer>();
    	ttui.add((int)(Math.random()*100));
    	ArrayList<Integer> tduu = new ArrayList<Integer>();
    	tduu.add((int)(Math.random()*100));
    	ArrayList<Integer> tadi = new ArrayList<Integer>();
    	tadi.add((int)(Math.random()*100));
     	
    	datiAggregati.setTablet_data(date);
    	datiAggregati.setTablet_dailyUserInstalls(tdui);
    	datiAggregati.setTablet_totUserInstalls(ttui);
    	datiAggregati.setTablet_dailyUserUninstalls(tduu);
    	datiAggregati.setTablet_activeDeviceInstalls(tadi);
    	
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = gruppo.setDati(datiAggregati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		gruppo.visualizzazioneDati();
	}
	
	/*
	 * Test di visualizzazione sul gruppo 
	 * al cui interno ci sono due app di windows
	 */
	@Test
	public void VisualGruppo2WinApp(){
		//Genero parametri di input
		Gruppo gruppo = new Gruppo(1, "TestingStrut");
		App ap1 = new App(1,"Calcio","Windows");
		App ap2 = new App(2,"Basket","Windows");
		ap1.setDati(Main.istanzioDatiApp(ap1));
		ap2.setDati(Main.istanzioDatiApp(ap2));
		gruppo.addApp(ap1);
    	gruppo.addApp(ap2);
    	
    	Dati datiAggregati = new Dati();
    	datiAggregati.setProvenienza("Aggregazione");
    	
    	//Setto i contatori sui Rating
    	double cn = (double)(Math.random()*10);
    	double cr = (double)(Math.random()*10);
    	datiAggregati.setCount_new(cn);
    	datiAggregati.setCount_revised(cr);
    	
    	//Setto le medie dei voti nel tempo
    	ArrayList<String> datewin = new ArrayList<String>();
    	ArrayList<Double> car = new ArrayList<Double>();
    	car.add((double)(Math.random()*100));
    	datiAggregati.setDate_win(datewin);
    	datiAggregati.setCount_average(car);
    	
    	//Setto le medie dei voti in base al market
    	ArrayList<String> market = new ArrayList<String>();
    	ArrayList<Double> ar = new ArrayList<Double>();
    	ar.add((double)(Math.random()*100));
    	ArrayList<Integer> nr= new ArrayList<Integer>();
    	nr.add((int)(Math.random()*100));
    	datiAggregati.setMarket(market);
    	datiAggregati.setAverage_rating(ar);
    	datiAggregati.setNumber_rating(nr);
 
    	// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> date = new ArrayList<String>(); 
    	ArrayList<Integer> idui = new ArrayList<Integer>();
    	idui.add((int)(Math.random()*100));
    	
    	datiAggregati.setOverview_data(date);
    	datiAggregati.setOverview_dailyUserInstalls(idui);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> codui = new ArrayList<Integer>();
    	codui.add((int)(Math.random()*100));
    	
    	datiAggregati.setCountry_data(date);
    	datiAggregati.setCountry_dailyUserInstalls(codui);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osdui = new ArrayList<Integer>();
    	osdui.add((int)(Math.random()*100));
    	
    	datiAggregati.setOsVersion_data(date);
    	datiAggregati.setOsVersion_dailyUserInstalls(osdui);
    	
    	// Setto i dati sui failure
    	ArrayList<Integer> fc = new ArrayList<Integer>();
    	fc.add((int)(Math.random()*100));
    	fc.add((int)(Math.random()*100));
    	
    	datiAggregati.setFailure_data(date);
    	datiAggregati.setFailure_count(fc);
    	
    	    	
		//Setto il risultato aspettato
		boolean expectedResult = true;
		//Ottengo il risultato
		boolean result = gruppo.setDati(datiAggregati);
		//Controllo il risultato
		assertEquals(expectedResult,result);
		gruppo.visualizzazioneDati();
	}
	
	/*
	 * Test di visualizzazione sul gruppo al cui 
	 * interno ci sono una app di Google e una di Windows
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
	
	/*
	 * Test di visualizzazione sul gruppo al cui interno ci sono 
	 * una app di Google e una di Windows nell'ipotesi che i dati (scoperti) 
	 * in comune non vengano aggregati
	 */
	@Test
	public void VisualGruppoAppMiste2(){
		//Genero parametri di input
		Gruppo gruppo = new Gruppo(1, "TestingStrut");
		App ap1 = new App(1,"Calcio","Google");
		App ap2 = new App(2,"Basket","Windows");
		
		Dati dati = new Dati();
		dati.setProvenienza(ap1.getProvenienza());
		// Setto le medie voti rispetto alla versione dell'app
		ArrayList<String> apv = new ArrayList<String>();
    	apv.add("1.0");
    	apv.add("2.0");
    	ArrayList<Double> daav = new ArrayList<Double>();
    	daav.add(((double)(Math.random()*10)/2));
    	daav.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> taav = new ArrayList<Double>();
    	taav.add(((double)(Math.random()*10)/2));
    	taav.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setApp_version(apv);
    	dati.setDaily_average_app_version(daav);
    	dati.setTotal_average_app_version(taav);
    	
    	// Setto le medie voti rispetto all'operatore telefonico
		ArrayList<String> ca = new ArrayList<String>();
    	ca.add("TIM");
    	ca.add("VODAFONE");
    	ca.add("TIM");
    	ca.add("VODAFONE");
    	ArrayList<String> cad = new ArrayList<String>();
    	cad.add("Domenica");
    	cad.add("Domenica");
    	cad.add("Lunedi");
    	cad.add("Lunedi");
    	ArrayList<Double> cdac = new ArrayList<Double>();
    	cdac.add(((double)(Math.random()*10)/2));
    	cdac.add(((double)(Math.random()*10)/2));
    	cdac.add(((double)(Math.random()*10)/2));
    	cdac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ctac = new ArrayList<Double>();
    	ctac.add(((double)(Math.random()*10)/2));
    	ctac.add(((double)(Math.random()*10)/2));
    	ctac.add(((double)(Math.random()*10)/2));
    	ctac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setCarrier(ca);
    	dati.setData_carrier(cad);
    	dati.setDaily_average_carrier(cdac);
    	dati.setTotal_average_carrier(ctac);;
    	
    	// Setto le medie voti rispetto al paese
		ArrayList<String> coa = new ArrayList<String>();
    	coa.add("ITALIA");
    	coa.add("FRANCIA");
    	coa.add("ITALIA");
    	coa.add("FRANCIA");
    	ArrayList<String> coad = new ArrayList<String>();
    	coad.add("Domenica");
    	coad.add("Domenica");
    	coad.add("Lunedi");
    	coad.add("Lunedi");
    	ArrayList<Double> codac = new ArrayList<Double>();
    	codac.add(((double)(Math.random()*10)/2));
    	codac.add(((double)(Math.random()*10)/2));
    	codac.add(((double)(Math.random()*10)/2));
    	codac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> cotac = new ArrayList<Double>();
    	cotac.add(((double)(Math.random()*10)/2));
    	cotac.add(((double)(Math.random()*10)/2));
    	cotac.add(((double)(Math.random()*10)/2));
    	cotac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setCountry(coa);
    	dati.setData_country(coad);
    	dati.setDaily_average_country(codac);
    	dati.setTotal_average_country(cotac);
    	
    	// Setto le medie voti rispetto al dispositivo
		ArrayList<String> doa = new ArrayList<String>();
    	doa.add("SAMSUNG");
    	doa.add("IPHONE");
    	doa.add("SAMSUNG");
    	doa.add("IPHONE");
    	ArrayList<String> dad = new ArrayList<String>();
    	dad.add("Domenica");
    	dad.add("Domenica");
    	dad.add("Lunedi");
    	dad.add("Lunedi");
    	ArrayList<Double> ddac = new ArrayList<Double>();
    	ddac.add(((double)(Math.random()*10)/2));
    	ddac.add(((double)(Math.random()*10)/2));
    	ddac.add(((double)(Math.random()*10)/2));
    	ddac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> dtac = new ArrayList<Double>();
    	dtac.add(((double)(Math.random()*10)/2));
    	dtac.add(((double)(Math.random()*10)/2));
    	dtac.add(((double)(Math.random()*10)/2));
    	dtac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setDevice(doa);
    	dati.setData_device(dad);
    	dati.setDaily_average_device(ddac);
    	dati.setTotal_average_device(dtac);
    	
    	// Setto le medie voti rispetto alla lingua
		ArrayList<String> loa = new ArrayList<String>();
    	loa.add("ITALIANO");
    	loa.add("SPAGNOLO");
    	loa.add("ITALIANO");
    	loa.add("SPAGNOLO");
    	ArrayList<String> lad = new ArrayList<String>();
    	lad.add("Domenica");
    	lad.add("Domenica");
    	lad.add("Lunedi");
    	lad.add("Lunedi");
    	ArrayList<Double> ldac = new ArrayList<Double>();
    	ldac.add(((double)(Math.random()*10)/2));
    	ldac.add(((double)(Math.random()*10)/2));
    	ldac.add(((double)(Math.random()*10)/2));
    	ldac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ltac = new ArrayList<Double>();
    	ltac.add(((double)(Math.random()*10)/2));
    	ltac.add(((double)(Math.random()*10)/2));
    	ltac.add(((double)(Math.random()*10)/2));
    	ltac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setLanguage(loa);
    	dati.setData_language(lad);
    	dati.setDaily_average_language(ldac);
    	dati.setTotal_average_language(ltac);
    	
     	// Setto le medie voti rispetto al OS
		ArrayList<String> osoa = new ArrayList<String>();
		osoa.add("Ice 1.0");
		osoa.add("Iphone 2.1");
		osoa.add("Ice 1.0");
		osoa.add("Iphone 2.1");
    	ArrayList<String> osad = new ArrayList<String>();
    	osad.add("Domenica");
    	osad.add("Domenica");
    	osad.add("Lunedi");
    	osad.add("Lunedi");
    	ArrayList<Double> osdac = new ArrayList<Double>();
    	osdac.add(((double)(Math.random()*10)/2));
    	osdac.add(((double)(Math.random()*10)/2));
    	osdac.add(((double)(Math.random()*10)/2));
    	osdac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ostac = new ArrayList<Double>();
    	ostac.add(((double)(Math.random()*10)/2));
    	ostac.add(((double)(Math.random()*10)/2));
    	ostac.add(((double)(Math.random()*10)/2));
    	ostac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setOs_version(osoa);
    	dati.setData_os_version(osad);
    	dati.setDaily_average_os_version(osdac);
    	dati.setTotal_average_os_version(ostac);
    	 
    	// Setto le medie voti rispetto ai tablet
		ArrayList<String> toa = new ArrayList<String>();
		toa.add("Tablet Samsung");
		toa.add("Tablet Apple");
		toa.add("Tablet Samsung");
		toa.add("Tablet Apple");
    	ArrayList<String> tad = new ArrayList<String>();
    	tad.add("Domenica");
    	tad.add("Domenica");
    	tad.add("Lunedi");
    	tad.add("Lunedi");
    	ArrayList<Double> tdac = new ArrayList<Double>();
    	tdac.add(((double)(Math.random()*10)/2));
    	tdac.add(((double)(Math.random()*10)/2));
    	tdac.add(((double)(Math.random()*10)/2));
    	tdac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ttac = new ArrayList<Double>();
    	ttac.add(((double)(Math.random()*10)/2));
    	ttac.add(((double)(Math.random()*10)/2));
    	ttac.add(((double)(Math.random()*10)/2));
    	ttac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setTablet(toa);
    	dati.setData_tablet(tad);
    	dati.setDaily_average_tablet(tdac);
    	dati.setTotal_average_tablet(ttac);
    	
    	// Setto le medie voti generale
	  	ArrayList<String> oad = new ArrayList<String>();
    	oad.add("Domenica");
    	oad.add("Lunedi");
    	ArrayList<Double> odac = new ArrayList<Double>();
    	odac.add(((double)(Math.random()*10)/2));
    	odac.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> otac = new ArrayList<Double>();
    	otac.add(((double)(Math.random()*10)/2));
    	otac.add(((double)(Math.random()*10)/2));
    	    	
    	dati.setData_overview(oad);
    	dati.setDaily_average_overview(odac);
    	dati.setTotal_average_overview(otac);
    	
		// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> date = new ArrayList<String>();
    	ArrayList<Integer> idui = new ArrayList<Integer>();
       	ArrayList<Integer> itui = new ArrayList<Integer>();
    	ArrayList<Integer> iduu = new ArrayList<Integer>();
    	ArrayList<Integer> iadi = new ArrayList<Integer>();
        	    	
    	dati.setOverview_data(date);
    	dati.setOverview_dailyUserInstalls(idui);
    	dati.setOverview_totUserInstalls(itui);
    	dati.setOverview_dailyUserUninstalls(iduu);
    	dati.setOverview_activeDeviceInstalls(iadi);
    	
    	// Setto i dati sulle installazioni rispetto alle compagnie telefoniche
    	ArrayList<Integer> cdui = new ArrayList<Integer>();
    	cdui.add((int)(Math.random()*100));
    	cdui.add((int)(Math.random()*100));
    	ArrayList<Integer> ctui = new ArrayList<Integer>();
    	ctui.add((int)(Math.random()*100));
    	ctui.add((int)(Math.random()*100));
    	ArrayList<Integer> cduu = new ArrayList<Integer>();
    	cduu.add((int)(Math.random()*100));
    	cduu.add((int)(Math.random()*100));
    	ArrayList<Integer> cadi = new ArrayList<Integer>();
    	cadi.add((int)(Math.random()*100));
    	cadi.add((int)(Math.random()*100));
     	
    	dati.setCarrier_data(date);
    	dati.setCarrier_dailyUserInstalls(cdui);
    	dati.setCarrier_totUserInstalls(ctui);
    	dati.setCarrier_dailyUserUninstalls(cduu);
    	dati.setCarrier_activeDeviceInstalls(cadi);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> codui = new ArrayList<Integer>();
    	ArrayList<Integer> cotui = new ArrayList<Integer>();
     	ArrayList<Integer> coduu = new ArrayList<Integer>();
    	ArrayList<Integer> coadi = new ArrayList<Integer>();
         	
    	dati.setCountry_data(date);
    	dati.setCountry_dailyUserInstalls(codui);
    	dati.setCountry_totUserInstalls(cotui);
    	dati.setCountry_dailyUserUninstalls(coduu);
    	dati.setCountry_activeDeviceInstalls(coadi);
    	
    	// Setto i dati sulle installazioni rispetto ai device
      	ArrayList<Integer> ddui = new ArrayList<Integer>();
    	ddui.add((int)(Math.random()*100));
    	ddui.add((int)(Math.random()*100));
    	ArrayList<Integer> dtui = new ArrayList<Integer>();
    	dtui.add((int)(Math.random()*100));
    	dtui.add((int)(Math.random()*100));
    	ArrayList<Integer> dduu = new ArrayList<Integer>();
    	dduu.add((int)(Math.random()*100));
    	dduu.add((int)(Math.random()*100));
    	ArrayList<Integer> dadi = new ArrayList<Integer>();
    	dadi.add((int)(Math.random()*100));
    	dadi.add((int)(Math.random()*100));
    	
    	dati.setDevice_data(date);
    	dati.setDevice_dailyUserInstalls(ddui);
    	dati.setDevice_totUserInstalls(dtui);
    	dati.setDevice_dailyUserUninstalls(dduu);
    	dati.setDevice_activeDeviceInstalls(dadi);
    	
    	// Setto i dati sulle installazioni rispetto alla lingua
      	ArrayList<Integer> ldui = new ArrayList<Integer>();
    	ldui.add((int)(Math.random()*100));
    	ldui.add((int)(Math.random()*100));
    	ArrayList<Integer> ltui = new ArrayList<Integer>();
    	ltui.add((int)(Math.random()*100));
    	ltui.add((int)(Math.random()*100));
    	ArrayList<Integer> lduu = new ArrayList<Integer>();
    	lduu.add((int)(Math.random()*100));
    	lduu.add((int)(Math.random()*100));
    	ArrayList<Integer> ladi = new ArrayList<Integer>();
    	ladi.add((int)(Math.random()*100));
    	ladi.add((int)(Math.random()*100));
     	
    	dati.setLang_data(date);
    	dati.setLang_dailyUserInstalls(ldui);
    	dati.setLang_totUserInstalls(ltui);
    	dati.setLang_dailyUserUninstalls(lduu);
    	dati.setLang_activeDeviceInstalls(ladi);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osdui = new ArrayList<Integer>();
       	ArrayList<Integer> ostui = new ArrayList<Integer>();
    	ArrayList<Integer> osduu = new ArrayList<Integer>();
    	ArrayList<Integer> osadi = new ArrayList<Integer>();
         	
    	dati.setOsVersion_data(date);
    	dati.setOsVersion_dailyUserInstalls(osdui);
    	dati.setOsVersion_totUserInstalls(ostui);
    	dati.setOsVersion_dailyUserUninstalls(osduu);
    	dati.setOsVersion_activeDeviceInstalls(osadi);
    	
    	// Setto i dati sulle installazioni rispetto ai table
    	ArrayList<Integer> tdui = new ArrayList<Integer>();
    	tdui.add((int)(Math.random()*100));
    	tdui.add((int)(Math.random()*100));
    	ArrayList<Integer> ttui = new ArrayList<Integer>();
    	ttui.add((int)(Math.random()*100));
    	ttui.add((int)(Math.random()*100));
    	ArrayList<Integer> tduu = new ArrayList<Integer>();
    	tduu.add((int)(Math.random()*100));
    	tduu.add((int)(Math.random()*100));
    	ArrayList<Integer> tadi = new ArrayList<Integer>();
    	tadi.add((int)(Math.random()*100));
    	tadi.add((int)(Math.random()*100));
     	
    	dati.setTablet_data(date);
    	dati.setTablet_dailyUserInstalls(tdui);
    	dati.setTablet_totUserInstalls(ttui);
    	dati.setTablet_dailyUserUninstalls(tduu);
    	dati.setTablet_activeDeviceInstalls(tadi);
    	
    	ap1.setDati(dati);
    	
    	Dati datiw = new Dati();
    	dati.setProvenienza(ap2.getProvenienza());
		
		//Setto i contatori sui Rating
		double cn = (double)(Math.random()*10);
		double cr = (double)(Math.random()*10);
		datiw.setCount_new(cn);
		datiw.setCount_revised(cr);
		
		//Setto le medie dei voti nel tempo
		ArrayList<String> datewin = new ArrayList<String>();
    	datewin.add("Domenica 20/05/2016");
    	datewin.add("Domenica 27/05/2016");
    	ArrayList<Double> car = new ArrayList<Double>();
    	car.add((double)(Math.random()*100));
    	car.add((double)(Math.random()*100));
    	datiw.setDate_win(datewin);
		datiw.setCount_average(car);
		
		//Setto le medie dei voti in base al market
		ArrayList<String> market = new ArrayList<String>();
    	market.add("GoogleIT");
    	market.add("GoogleFR");
    	ArrayList<Double> ar = new ArrayList<Double>();
    	ar.add((double)(Math.random()*100));
    	ar.add((double)(Math.random()*100));
    	ArrayList<Integer> nr= new ArrayList<Integer>();
    	nr.add((int)(Math.random()*100));
    	nr.add((int)(Math.random()*100));
		dati.setMarket(market);
		datiw.setAverage_rating(ar);
		datiw.setNumber_rating(nr);
		
		// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> datew = new ArrayList<String>();
    	ArrayList<Integer> iduiw = new ArrayList<Integer>();
    	
    	dati.setOverview_data(datew);
    	dati.setOverview_dailyUserInstalls(iduiw);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> coduiw = new ArrayList<Integer>();
    	
    	datiw.setCountry_data(datew);
    	datiw.setCountry_dailyUserInstalls(coduiw);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osduiw = new ArrayList<Integer>();
    	
    	datiw.setOsVersion_data(datew);
    	datiw.setOsVersion_dailyUserInstalls(osduiw);
    	
    	// Setto i dati sui failure
    	ArrayList<Integer> fcw = new ArrayList<Integer>();
    	fcw.add((int)(Math.random()*100));
    	fcw.add((int)(Math.random()*100));
    	
    	dati.setFailure_data(datew);
    	dati.setFailure_count(fcw);
    	
    	ap2.setDati(datiw);
		
    	gruppo.addApp(ap1);
    	gruppo.addApp(ap2);
    	
    	Dati datiAggregati = new Dati();
    	datiAggregati.setProvenienza("Aggregazione");
    	
		// Setto le medie voti rispetto alla versione dell'app
		ArrayList<String> apvg = new ArrayList<String>();
    	ArrayList<Double> daavg = new ArrayList<Double>();
    	daavg.add(((double)(Math.random()*10)/2));
    	daavg.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> taavg = new ArrayList<Double>();
    	taavg.add(((double)(Math.random()*10)/2));
    	taavg.add(((double)(Math.random()*10)/2));
    	    	
    	datiAggregati.setApp_version(apvg);
    	datiAggregati.setDaily_average_app_version(daavg);
    	datiAggregati.setTotal_average_app_version(taavg);
    	
    	// Setto le medie voti rispetto all'operatore telefonico
		ArrayList<String> cag = new ArrayList<String>();
    	ArrayList<String> cadg = new ArrayList<String>();
    	ArrayList<Double> cdacg = new ArrayList<Double>();
    	cdacg.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ctacg = new ArrayList<Double>();
    	ctacg.add(((double)(Math.random()*10)/2));
    	    	    	
    	datiAggregati.setCarrier(cag);
    	datiAggregati.setData_carrier(cadg);
    	datiAggregati.setDaily_average_carrier(cdacg);
    	datiAggregati.setTotal_average_carrier(ctacg);;
    	
    	// Setto le medie voti rispetto al paese
		ArrayList<String> coag = new ArrayList<String>();
		ArrayList<String> coadg = new ArrayList<String>();
    	ArrayList<Double> codacg = new ArrayList<Double>();
    	codacg.add(((double)(Math.random()*10)/2));
       	ArrayList<Double> cotacg = new ArrayList<Double>();
    	cotacg.add(((double)(Math.random()*10)/2));
    		    	    	
    	datiAggregati.setCountry(coag);
    	datiAggregati.setData_country(coadg);
    	datiAggregati.setDaily_average_country(codacg);
    	datiAggregati.setTotal_average_country(cotacg);
    	
    	// Setto le medie voti rispetto al dispositivo
		ArrayList<String> doag = new ArrayList<String>();
    	ArrayList<String> dadg = new ArrayList<String>();
    	ArrayList<Double> ddacg = new ArrayList<Double>();
    	ddacg.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> dtacg = new ArrayList<Double>();
    	dtacg.add(((double)(Math.random()*10)/2));
    		    	    	
    	datiAggregati.setDevice(doag);
    	datiAggregati.setData_device(dadg);
    	datiAggregati.setDaily_average_device(ddacg);
    	datiAggregati.setTotal_average_device(dtacg);
    	
    	// Setto le medie voti rispetto alla lingua
		ArrayList<String> loag = new ArrayList<String>();
    	ArrayList<String> ladg = new ArrayList<String>();
    	ArrayList<Double> ldacg = new ArrayList<Double>();
    	ldacg.add(((double)(Math.random()*10)/2));
       	ArrayList<Double> ltacg = new ArrayList<Double>();
    	ltacg.add(((double)(Math.random()*10)/2));
    	    	    	
    	datiAggregati.setLanguage(loag);
    	datiAggregati.setData_language(ladg);
    	datiAggregati.setDaily_average_language(ldacg);
    	datiAggregati.setTotal_average_language(ltacg);
    	
     	// Setto le medie voti rispetto al OS
		ArrayList<String> osoag = new ArrayList<String>();
    	ArrayList<String> osadg = new ArrayList<String>();
    	ArrayList<Double> osdacg = new ArrayList<Double>();
    	osdacg.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ostacg = new ArrayList<Double>();
    	ostacg.add(((double)(Math.random()*10)/2));
    	
    	datiAggregati.setOs_version(osoag);
    	datiAggregati.setData_os_version(osadg);
    	datiAggregati.setDaily_average_os_version(osdacg);
    	datiAggregati.setTotal_average_os_version(ostacg);
    	
    	// Setto le medie voti rispetto ai tablet
		ArrayList<String> toag = new ArrayList<String>();
    	ArrayList<String> tadg = new ArrayList<String>();
    	ArrayList<Double> tdacg = new ArrayList<Double>();
    	tdacg.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> ttacg = new ArrayList<Double>();
    	ttacg.add(((double)(Math.random()*10)/2));
    	    	
    	datiAggregati.setTablet(toag);
    	datiAggregati.setData_tablet(tadg);
    	datiAggregati.setDaily_average_tablet(tdacg);
    	datiAggregati.setTotal_average_tablet(ttacg);
    	
    	// Setto le medie voti generale
	  	ArrayList<String> oadg = new ArrayList<String>();
    	ArrayList<Double> odacg = new ArrayList<Double>();
    	odacg.add(((double)(Math.random()*10)/2));
    	ArrayList<Double> otacg = new ArrayList<Double>();
    	otacg.add(((double)(Math.random()*10)/2));
    	    	
    	datiAggregati.setData_overview(oadg);
    	datiAggregati.setDaily_average_overview(odacg);
    	datiAggregati.setTotal_average_overview(otacg);
    	
    	//Setto i contatori sui Rating
    	double cng = (double)(Math.random()*10);
    	double crg = (double)(Math.random()*10);
    	datiAggregati.setCount_new(cng);
    	datiAggregati.setCount_revised(crg);
    	
    	//Setto le medie dei voti nel tempo
    	ArrayList<String> datewing = new ArrayList<String>();
    	ArrayList<Double> carg = new ArrayList<Double>();
    	carg.add((double)(Math.random()*100));
    	datiAggregati.setDate_win(datewing);
    	datiAggregati.setCount_average(carg);
    	
    	//Setto le medie dei voti in base al market
    	ArrayList<String> marketg = new ArrayList<String>();
    	ArrayList<Double> arg = new ArrayList<Double>();
    	arg.add((double)(Math.random()*100));
    	ArrayList<Integer> nrg= new ArrayList<Integer>();
    	nrg.add((int)(Math.random()*100));
    	datiAggregati.setMarket(marketg);
    	datiAggregati.setAverage_rating(arg);
    	datiAggregati.setNumber_rating(nrg);
    	
		// Setto i dati sulle installazioni rispetto alle overview
		ArrayList<String> dateg = new ArrayList<String>(); 
    	ArrayList<Integer> iduig = new ArrayList<Integer>();
    	ArrayList<Integer> ituig = new ArrayList<Integer>();
    	ituig.add((int)(Math.random()*100));
    	ArrayList<Integer> iduug = new ArrayList<Integer>();
    	iduug.add((int)(Math.random()*100));
    	ArrayList<Integer> iadig = new ArrayList<Integer>();
    	iadig.add((int)(Math.random()*100));
    	    	
    	datiAggregati.setOverview_data(dateg);
    	datiAggregati.setOverview_dailyUserInstalls(iduig);
    	datiAggregati.setOverview_totUserInstalls(ituig);
    	datiAggregati.setOverview_dailyUserUninstalls(iduug);
    	datiAggregati.setOverview_activeDeviceInstalls(iadig);
    	
    	// Setto i dati sulle installazioni rispetto alle compagnie telefoniche
    	ArrayList<Integer> cduig = new ArrayList<Integer>();
    	cduig.add((int)(Math.random()*100));
    	ArrayList<Integer> ctuig = new ArrayList<Integer>();
    	ctuig.add((int)(Math.random()*100));
    	ArrayList<Integer> cduug = new ArrayList<Integer>();
    	cduug.add((int)(Math.random()*100));
    	ArrayList<Integer> cadig = new ArrayList<Integer>();
    	cadig.add((int)(Math.random()*100)); 
     	
    	datiAggregati.setCarrier_data(dateg);
    	datiAggregati.setCarrier_dailyUserInstalls(cduig);
    	datiAggregati.setCarrier_totUserInstalls(ctuig);
    	datiAggregati.setCarrier_dailyUserUninstalls(cduug);
    	datiAggregati.setCarrier_activeDeviceInstalls(cadig);
    	
    	// Setto i dati sulle installazioni rispetto ai paesi
    	ArrayList<Integer> coduig = new ArrayList<Integer>();
    	ArrayList<Integer> cotuig = new ArrayList<Integer>();
    	cotuig.add((int)(Math.random()*100));
    	ArrayList<Integer> coduug = new ArrayList<Integer>();
    	coduug.add((int)(Math.random()*100));
    	ArrayList<Integer> coadig = new ArrayList<Integer>();
    	coadig.add((int)(Math.random()*100));
     	
    	datiAggregati.setCountry_data(dateg);
    	datiAggregati.setCountry_dailyUserInstalls(coduig);
    	datiAggregati.setCountry_totUserInstalls(cotuig);
    	datiAggregati.setCountry_dailyUserUninstalls(coduug);
    	datiAggregati.setCountry_activeDeviceInstalls(coadig);
    	
    	// Setto i dati sulle installazioni rispetto ai device
      	ArrayList<Integer> dduig = new ArrayList<Integer>();
    	dduig.add((int)(Math.random()*100));
    	ArrayList<Integer> dtuig = new ArrayList<Integer>();
    	dtuig.add((int)(Math.random()*100));
    	ArrayList<Integer> dduug = new ArrayList<Integer>();
    	dduug.add((int)(Math.random()*100));
    	ArrayList<Integer> dadig = new ArrayList<Integer>();
    	dadig.add((int)(Math.random()*100));
    	
    	datiAggregati.setDevice_data(dateg);
    	datiAggregati.setDevice_dailyUserInstalls(dduig);
    	datiAggregati.setDevice_totUserInstalls(dtuig);
    	datiAggregati.setDevice_dailyUserUninstalls(dduug);
    	datiAggregati.setDevice_activeDeviceInstalls(dadig);
    	
    	// Setto i dati sulle installazioni rispetto alla lingua
      	ArrayList<Integer> lduig = new ArrayList<Integer>();
    	lduig.add((int)(Math.random()*100));
    	ArrayList<Integer> ltuig = new ArrayList<Integer>();
    	ltuig.add((int)(Math.random()*100));
    	ArrayList<Integer> lduug = new ArrayList<Integer>();
    	lduug.add((int)(Math.random()*100));
    	ArrayList<Integer> ladig = new ArrayList<Integer>();
    	ladig.add((int)(Math.random()*100));
     	
    	datiAggregati.setLang_data(dateg);
    	datiAggregati.setLang_dailyUserInstalls(lduig);
    	datiAggregati.setLang_totUserInstalls(ltuig);
    	datiAggregati.setLang_dailyUserUninstalls(lduug);
    	datiAggregati.setLang_activeDeviceInstalls(ladig);
    	
    	// Setto i dati sulle installazioni rispetto alla versione os
    	ArrayList<Integer> osduig = new ArrayList<Integer>();
    	ArrayList<Integer> ostuig = new ArrayList<Integer>();
    	ostuig.add((int)(Math.random()*100));
    	ArrayList<Integer> osduug = new ArrayList<Integer>();
    	osduug.add((int)(Math.random()*100));
    	ArrayList<Integer> osadig = new ArrayList<Integer>();
    	osadig.add((int)(Math.random()*100));
     	
    	datiAggregati.setOsVersion_data(dateg);
    	datiAggregati.setOsVersion_dailyUserInstalls(osduig);
    	datiAggregati.setOsVersion_totUserInstalls(ostuig);
    	datiAggregati.setOsVersion_dailyUserUninstalls(osduug);
    	datiAggregati.setOsVersion_activeDeviceInstalls(osadig);
    	
    	// Setto i dati sulle installazioni rispetto ai table
    	ArrayList<Integer> tduig = new ArrayList<Integer>();
    	tduig.add((int)(Math.random()*100));
    	ArrayList<Integer> ttuig = new ArrayList<Integer>();
    	ttuig.add((int)(Math.random()*100));
    	ArrayList<Integer> tduug = new ArrayList<Integer>();
    	tduug.add((int)(Math.random()*100));
    	ArrayList<Integer> tadig = new ArrayList<Integer>();
    	tadig.add((int)(Math.random()*100));
     	
    	datiAggregati.setTablet_data(dateg);
    	datiAggregati.setTablet_dailyUserInstalls(tduig);
    	datiAggregati.setTablet_totUserInstalls(ttuig);
    	datiAggregati.setTablet_dailyUserUninstalls(tduug);
    	datiAggregati.setTablet_activeDeviceInstalls(tadig);
    	
    	// Setto i dati sui failure
    	ArrayList<Integer> fcg = new ArrayList<Integer>();
    	fcg.add((int)(Math.random()*100));
    	fcg.add((int)(Math.random()*100));
    	datiAggregati.setFailure_data(dateg);
    	datiAggregati.setFailure_count(fcg);
    	
    	//Setto il risultato aspettato
    	boolean expectedResult = true;
    	//Ottengo il risultato
    	boolean result = gruppo.setDati(datiAggregati);
    	//Controllo il risultato
    	assertEquals(expectedResult,result);
    	gruppo.visualizzazioneDati();
	}
	
}
		
