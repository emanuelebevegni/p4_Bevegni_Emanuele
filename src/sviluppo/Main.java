package sviluppo;
import java.util.ArrayList;

/**
 * Main del nostro sistema
 */
public class Main {
	
	/** Attributi */

    private Sistema sistema;
    private ArrayList<App> apps;
    
	public static void main(String[] args) {
	
		Sistema sistema = new Sistema(new App(1,"Test","Google"),new App(2,"Test","Windows"),new Gruppo(2,"SuperTesting"));
		String check;
		ArrayList<App> app;
		ArrayList<Gruppo> gruppi;
		String input;
		int indice;
		int i = 1;
		
		//Stampo il menu delle operazioni possibili a video
		while(true){
			System.out.println("================================================================");
			System.out.println("PROTOTIPI DI FUNZIONI DEL SISTEMA DI AGGREGAZIONE DATI APP STORE");
			System.out.println("================================================================");
			System.out.println("1) Inserimento App nel sistema");
			System.out.println("2) Cancellamento App dal sistema");
			System.out.println("3) Visualizzazione dati");
			System.out.println("0) Exit");
			
			check = Input.readLine();
			
			switch(check){
			
			case "1":
				sistema.inserimentoApp();
				break;
			case "2":
				sistema.cancellazioneApp();
				break;
			case "3":
				/* In questo case,oltre a dei controlli base
				 * controllo se l'utente vuole visualizzare un'app singola
				 * o un gruppo ed in base a cio richiamo la visualizzazione associata
				 */
				app = sistema.getApps();
				gruppi = sistema.getGruppi();
				if(gruppi.size() == 0 && app.size() == 0){
					System.out.println("Non ci sono applicazione e gruppi nel sistema per la visualizzazione");
					continue;
				}
				
				if(app.size() == 0){
					System.out.println("Non ci sono applicazioni nel sistema di cui visualizzare i dati");
					
				}
				else{
					i = 1;
					System.out.println("Elenco app inserite nel sistema");
					for(App ap : app){
						System.out.println(i + ") " + ap.getNomeApp()+" ("+ap.getProvenienza()+")");
						i++;
						
					}
				}
				if(gruppi.size() == 0){
					System.out.println("Non ci sono gruppi creati nel sistema di cui visualizzare i dati");
					
				}
				else{
					int j = i;
					System.out.println("Elenco gruppi inserite nel sistema");
					for(Gruppo gp : gruppi){
						System.out.println(j + ") " + gp.getNomeGruppo());
						j++;
					}
				}
				System.out.println("Selezionare indice cui visualizzare i dati");
				input = Input.readLine();
				indice = Integer.parseInt(input);
				
				if(indice <=app.size()){
					indice--;
					app.get(indice).setDati(istanzioDatiApp(app.get(indice)));
					app.get(indice).visualizzaDati();
				}				
				else{
					indice= indice - i;
					for(int j=0; j<gruppi.get(indice).getApps().size(); j++){
						gruppi.get(indice).getApps().get(j).setDati(istanzioDatiApp(gruppi.get(indice).getApps().get(j)));
					}
						gruppi.get(indice).setDati(istanzioDatiGruppo());
						gruppi.get(indice).visualizzazioneDati();
				}
				break;
			case "0":
				return;
			default:
				System.out.println("Selezione non valida");
				
			}
		}
	}
	
	 /**
     * Funzione per poter generare dei dati "aggregati" nel gruppo
     *
     *@return datiAggregati (ritorna una classe Dati con tutte le sue variabili settate)
     */
	public static Dati istanzioDatiGruppo(){
    	
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
    	
    	// Setto i dati sui failure
    	ArrayList<Integer> fc = new ArrayList<Integer>();
    	fc.add((int)(Math.random()*100));
    	
    	
    	datiAggregati.setFailure_data(date);
    	datiAggregati.setFailure_count(fc);
    	
    	
    	return datiAggregati;
    }
	
	 /**
     * Funzione per poter generare dei dati "normalizzati" per l'app
     *@param app (passaggio di un'app)
     *@return dati (ritorna una classe Dati con tutte le sue variabili settate)
     */
	public static Dati istanzioDatiApp(App app){
	    	
	    	Dati dati = new Dati();
	    	
	    	if(app.getProvenienza().equals("Google") || app.getProvenienza().equals("Apple") ){
		    	
	    		dati.setProvenienza(app.getProvenienza());
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
		    	date.add("Domenica");
		    	date.add("Lunedi");
		    	ArrayList<Integer> idui = new ArrayList<Integer>();
		    	idui.add((int)(Math.random()*100));
		    	idui.add((int)(Math.random()*100));
		    	ArrayList<Integer> itui = new ArrayList<Integer>();
		    	itui.add((int)(Math.random()*100));
		    	itui.add((int)(Math.random()*100));
		    	ArrayList<Integer> iduu = new ArrayList<Integer>();
		    	iduu.add((int)(Math.random()*100));
		    	iduu.add((int)(Math.random()*100));
		    	ArrayList<Integer> iadi = new ArrayList<Integer>();
		    	iadi.add((int)(Math.random()*100));
		    	iadi.add((int)(Math.random()*100));
		    	    	
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
		    	codui.add((int)(Math.random()*100));
		    	codui.add((int)(Math.random()*100));
		    	ArrayList<Integer> cotui = new ArrayList<Integer>();
		    	cotui.add((int)(Math.random()*100));
		    	cotui.add((int)(Math.random()*100));
		    	ArrayList<Integer> coduu = new ArrayList<Integer>();
		    	coduu.add((int)(Math.random()*100));
		    	coduu.add((int)(Math.random()*100));
		    	ArrayList<Integer> coadi = new ArrayList<Integer>();
		    	coadi.add((int)(Math.random()*100));
		    	coadi.add((int)(Math.random()*100));
		     	
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
		    	osdui.add((int)(Math.random()*100));
		    	osdui.add((int)(Math.random()*100));
		    	ArrayList<Integer> ostui = new ArrayList<Integer>();
		    	ostui.add((int)(Math.random()*100));
		    	ostui.add((int)(Math.random()*100));
		    	ArrayList<Integer> osduu = new ArrayList<Integer>();
		    	osduu.add((int)(Math.random()*100));
		    	osduu.add((int)(Math.random()*100));
		    	ArrayList<Integer> osadi = new ArrayList<Integer>();
		    	osadi.add((int)(Math.random()*100));
		    	osadi.add((int)(Math.random()*100));
		     	
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
		    	
		    	
	    	}
	    	else{
		    	
	    		dati.setProvenienza(app.getProvenienza());
		    		
	    		//Setto i contatori sui Rating
	    		double cn = (double)(Math.random()*10);
	    		double cr = (double)(Math.random()*10);
	    		dati.setCount_new(cn);
	    		dati.setCount_revised(cr);
	    		
	    		//Setto le medie dei voti nel tempo
	    		ArrayList<String> datewin = new ArrayList<String>();
		    	datewin.add("Domenica 20/05/2016");
		    	datewin.add("Domenica 27/05/2016");
		    	ArrayList<Double> car = new ArrayList<Double>();
		    	car.add((double)(Math.random()*100));
		    	car.add((double)(Math.random()*100));
		    	dati.setDate_win(datewin);
	    		dati.setCount_average(car);
	    		
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
	    		dati.setAverage_rating(ar);
	    		dati.setNumber_rating(nr);
	    		
	    		// Setto i dati sulle installazioni rispetto alle overview
	    		ArrayList<String> date = new ArrayList<String>();
		    	date.add("Domenica");
		    	date.add("Lunedi");
		    	ArrayList<Integer> idui = new ArrayList<Integer>();
		    	idui.add((int)(Math.random()*100));
		    	idui.add((int)(Math.random()*100));
		    	
		    	dati.setOverview_data(date);
		    	dati.setOverview_dailyUserInstalls(idui);
		    	
		    	// Setto i dati sulle installazioni rispetto ai paesi
		    	ArrayList<Integer> codui = new ArrayList<Integer>();
		    	codui.add((int)(Math.random()*100));
		    	codui.add((int)(Math.random()*100));
		    	
		    	dati.setCountry_data(date);
		    	dati.setCountry_dailyUserInstalls(codui);
		    	
		    	// Setto i dati sulle installazioni rispetto alla versione os
		    	ArrayList<Integer> osdui = new ArrayList<Integer>();
		    	osdui.add((int)(Math.random()*100));
		    	osdui.add((int)(Math.random()*100));
		    	
		    	dati.setOsVersion_data(date);
		    	dati.setOsVersion_dailyUserInstalls(osdui);
		    	
		    	// Setto i dati sui failure
		    	ArrayList<Integer> fc = new ArrayList<Integer>();
		    	fc.add((int)(Math.random()*100));
		    	fc.add((int)(Math.random()*100));
		    	
		    	dati.setFailure_data(date);
		    	dati.setFailure_count(fc);
	    }
	    	return dati;
    }
}
