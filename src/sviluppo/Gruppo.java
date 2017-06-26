package sviluppo;
import java.io.File;
import java.util.ArrayList;
/**
 * Classe per la definizione di Gruppo
 */
public class Gruppo{
    /** Attributi */
    private int id;
    private String nomeGruppo; 
	/** Associations */
    private Dati datiAggregati;
    private ArrayList<App> apps; 
   
    /**
     * Costruttore del gruppo
     *
     *@param id (numero intero che rappresenta l'id del gruppo)
     *@param nomeGruppo (nome del gruppo passato come stringa)
     */
    public Gruppo(int id, String nomeGruppo){
    	this.id = id;
    	this.nomeGruppo =  nomeGruppo;
    	this.apps = new ArrayList<App>();
    	
    }
    
    /**
     * Funzione per la visualizzazione dei dati di un Gruppo
     *
     */
    public void visualizzazioneDati(){
    	
    	/*
    	 * Il codice dell'aggragazione prevede che il dato aggregato sia nella posizione 0 
    	 * di un'array se questo viene riempito. Questa ipotesi e' stata concordata con
    	 * i colleghi che hanno preso in carico lo UC dell'aggregazione dati.
    	 * La funzione visualizzazioneDati visualizzera (controllando il contenuto)
    	 * tutti i dati della classe Dati associata al gruppo. 
    	 */
    	
    	if(this.apps.size() > 0 && this.datiAggregati != null){
    			
			System.out.println("MEDIA VOTI RISPETTO ALLA VERSIONE "+ this.getNomeGruppo());
			if(datiAggregati.getDaily_average_app_version().size()!=0){
				System.out.println("	"+"daily_average_version	"+datiAggregati.getDaily_average_app_version().get(0));
			}
			else{
				System.out.println("	"+"daily_average_version	"+"NA");
			}
			if(datiAggregati.getTotal_average_app_version().size()!=0){
				System.out.println("	"+"total_average_version	"+datiAggregati.getTotal_average_app_version().get(0));
			}
			else{
				System.out.println("	"+"total_average_version	"+"NA");
			}
			
		
		   	System.out.println("\nMEDIA VOTI RISPETTO AL CARRIER "+ this.getNomeGruppo());
		   	if(datiAggregati.getDaily_average_carrier().size()!=0){			    	
		   		System.out.println("	"+"daily_average_carrier	"+datiAggregati.getDaily_average_carrier().get(0));
		   	}
		   	else{
				System.out.println("	"+"daily_average_carrier	"+"NA");
			}
			if(datiAggregati.getTotal_average_carrier().size()!=0){    	
				System.out.println("	"+"total_average_carrier	"+datiAggregati.getTotal_average_carrier().get(0));
			}
			else{
				System.out.println("	"+"total_average_carrier	"+"NA");
			}

		   	System.out.println("\nMEDIA VOTI RISPETTO AL PAESE "+ this.getNomeGruppo());
		   	if(datiAggregati.getDaily_average_country().size()!=0){		
		   		System.out.println("	"+"daily_average_country	"+datiAggregati.getDaily_average_country().get(0));
		   	}
		   	else{
				System.out.println("	"+"daily_average_country	"+"NA");
			}
		   	if(datiAggregati.getTotal_average_country().size()!=0){    	
		   		System.out.println("	"+"total_average_country	"+datiAggregati.getTotal_average_country().get(0));
		   	}
		   	else{
				System.out.println("	"+"total_average_country	"+"NA");
			}
			    	
		  	
		    System.out.println("\nMEDIA VOTI RISPETTO AL DEVICE "+ this.getNomeGruppo());
		    if(datiAggregati.getDaily_average_device().size()!=0){ 
		    	System.out.println("	"+"daily_average_device	"+datiAggregati.getDaily_average_device().get(0));
		    }
			else{
				System.out.println("	"+"daily_average_device	"+"NA");
			}
    		if(datiAggregati.getTotal_average_device().size()!=0){ 
    			System.out.println("	"+"total_average_device	"+datiAggregati.getTotal_average_device().get(0));
    		}
    		else{
				System.out.println("	"+"total_average_device	"+"NA");
			}
	   	
		    System.out.println("\nMEDIA VOTI RISPETTO ALLA LINGUA "+ this.getNomeGruppo());
		    if(datiAggregati.getDaily_average_language().size()!=0){ 	
		    	System.out.println("	"+"daily_average_language	"+datiAggregati.getDaily_average_language().get(0));
		    }
		    else{
				System.out.println("	"+"daily_average_language	"+"NA");
			}
		    if(datiAggregati.getTotal_average_language().size()!=0){     
		    	System.out.println("	"+"total_average_language	"+datiAggregati.getTotal_average_language().get(0));
		    }
		    else{
				System.out.println("	"+"total_average_language	"+"NA");
			}
		    
		    System.out.println("\nMEDIA VOTI RISPETTO AL OS "+ this.getNomeGruppo());
		    if(datiAggregati.getDaily_average_os_version().size()!=0){
			 	System.out.println("	"+"daily_average_os_version	"+datiAggregati.getDaily_average_os_version().get(0));
		    }
		    else{
				System.out.println("	"+"daily_average_os_version	"+"NA");
			}
		    if(datiAggregati.getTotal_average_os_version().size()!=0){
		    	System.out.println("	"+"total_average_os_version	"+datiAggregati.getTotal_average_os_version().get(0));
		    }
		    else{
				System.out.println("	"+"total_average_os_version	"+"NA");
			}
		    
    		
		    System.out.println("\nMEDIA VOTI RISPETTO AI TABLET "+ this.getNomeGruppo());
		    if(datiAggregati.getDaily_average_tablet().size()!=0){
		    	System.out.println("	"+"daily_average_tablet	"+datiAggregati.getDaily_average_tablet().get(0));
		    }
		    else{
				System.out.println("	"+"daily_average_tablet	"+"NA");
			}
		    if(datiAggregati.getTotal_average_tablet().size()!=0){    
		    	System.out.println("	"+"total_average_tablet	"+datiAggregati.getTotal_average_tablet().get(0));
		    }
		    else{
				System.out.println("	"+"total_average_tablet	"+"NA");
			}
 		
    
		    System.out.println("\nMEDIA VOTI GENERALE "+ this.getNomeGruppo());
		    if(datiAggregati.getDaily_average_overview().size()!=0){
		    	System.out.println("	"+"daily_average_overview	"+datiAggregati.getDaily_average_overview().get(0));
		    }
		    else{
				System.out.println("	"+"daily_average_overview	"+"NA");
			}
		    if(datiAggregati.getTotal_average_overview().size()!=0){
		    	System.out.println("	"+"total_average_overview	"+datiAggregati.getTotal_average_overview().get(0));
		    }
		    else{
				System.out.println("	"+"total_average_overview	"+"NA");
			}
			 
		    System.out.println("\nCONTATORI SUI NUOVI VOTI O MODIFICATI "+ this.getNomeGruppo());
		    if(datiAggregati.getCount_new()!=0){
		    		System.out.println("count new vote		"+datiAggregati.getCount_new());
		    }
		    else{
				System.out.println("	"+"Contatore nuovi voti	"+"NA");
			}
			if(datiAggregati.getCount_revised()!=0){
				System.out.println("count revised vote	"+datiAggregati.getCount_revised());
			}
			else{
				System.out.println("	"+"Contatore voti modificati	"+"NA");
			}
    		
    		
    		System.out.println("\nMEDIA VOTI NEL TEMPO "+ this.getNomeGruppo());
    		if(datiAggregati.getCount_average().size()!=0){		
    			System.out.println("	"+"count average	"+datiAggregati.getCount_average().get(0));
    		}
    		else{
				System.out.println("	"+"count average	"+"NA");
			}
		
    		System.out.println("\nMEDIA VOTI IN BASE AL MARKET "+ this.getNomeGruppo());
    		if(datiAggregati.getAverage_rating().size()!=0){			
    			System.out.println("	"+"avarage rating	"+datiAggregati.getAverage_rating().get(0));
    		}
    		else{
				System.out.println("	"+"avarage rating	"+"NA");
			}
			if(datiAggregati.getNumber_rating().size()!=0){	  
				System.out.println("	"+"number rating	"+datiAggregati.getNumber_rating().get(0));
			}
			else{
				System.out.println("	"+"number rating	"+"NA");
			}
	    	
	    	System.out.println("\nDATI SULLE INSTALLAZIONI GENERALE DELL'APP "+ this.getNomeGruppo());
	    	if(datiAggregati.getOverview_dailyUserInstalls().size()!=0){	
	    		System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getOverview_dailyUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
    		if(datiAggregati.getOverview_totUserInstalls().size()!=0){	
    			System.out.println("	"+"totUserInstalls		"+datiAggregati.getOverview_totUserInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
    		if(datiAggregati.getOverview_dailyUserUninstalls().size()!=0){		    		
    			System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getOverview_dailyUserUninstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
	   		if(datiAggregati.getOverview_activeDeviceInstalls().size()!=0){	
	   			System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getOverview_activeDeviceInstalls().get(0));
	   		}
	   		else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}
  		
	    	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLE COMPAGNIE TELEFONICHE "+ this.getNomeGruppo());
	    	if(datiAggregati.getCarrier_dailyUserInstalls().size()!=0){	
	    		System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getCarrier_dailyUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
	    	if(datiAggregati.getCarrier_totUserInstalls().size()!=0){	
	    		System.out.println("	"+"totUserInstalls		"+datiAggregati.getCarrier_totUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
	    	if(datiAggregati.getCarrier_dailyUserUninstalls().size()!=0){	
	    		System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getCarrier_dailyUserUninstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
	    	if(datiAggregati.getCarrier_activeDeviceInstalls().size()!=0){	
	    		System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getCarrier_activeDeviceInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}
			
	    	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLE NAZIONI "+ this.getNomeGruppo());
	    	if(datiAggregati.getCountry_dailyUserInstalls().size()!=0){		    	
	    		System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getCountry_dailyUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
    		if(datiAggregati.getCountry_totUserInstalls().size()!=0){
    			System.out.println("	"+"totUserInstalls		"+datiAggregati.getCountry_totUserInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
    		if(datiAggregati.getCountry_dailyUserUninstalls().size()!=0){
    			System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getCountry_dailyUserUninstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
			if(datiAggregati.getCountry_activeDeviceInstalls().size()!=0){
				System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getCountry_activeDeviceInstalls().get(0));
			}
			else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}

			System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO AI DEVICE "+ this.getNomeGruppo());
			if(datiAggregati.getDevice_dailyUserInstalls().size()!=0){
				System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getDevice_dailyUserInstalls().get(0));
			}
			else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
	    	if(datiAggregati.getDevice_totUserInstalls().size()!=0){
	    		System.out.println("	"+"totUserInstalls		"+datiAggregati.getDevice_totUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
    		if(datiAggregati.getDevice_dailyUserUninstalls().size()!=0){
    			System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getDevice_dailyUserUninstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
    		if(datiAggregati.getDevice_activeDeviceInstalls().size()!=0){
    			System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getDevice_activeDeviceInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}

    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLA LINGUA "+ this.getNomeGruppo());
    		if(datiAggregati.getLang_dailyUserInstalls().size()!=0){
    			System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getLang_dailyUserInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
    		if(datiAggregati.getLang_totUserInstalls().size()!=0){
    			System.out.println("	"+"totUserInstalls		"+datiAggregati.getLang_totUserInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
    		if(datiAggregati.getLang_dailyUserUninstalls().size()!=0){
    			System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getLang_dailyUserUninstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
    		if(datiAggregati.getLang_activeDeviceInstalls().size()!=0){
    			System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getLang_activeDeviceInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}

    		
	    	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLA VERSIONE OS "+ this.getNomeGruppo());
	    	if(datiAggregati.getOsVersion_dailyUserInstalls().size()!=0){
	    		System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getOsVersion_dailyUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
	    	if(datiAggregati.getOsVersion_totUserInstalls().size()!=0){
	    		System.out.println("	"+"totUserInstalls		"+datiAggregati.getOsVersion_totUserInstalls().get(0));
	    	}
	    	else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
    		if(datiAggregati.getOsVersion_dailyUserUninstalls().size()!=0){
    			System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getOsVersion_dailyUserUninstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
    		if(datiAggregati.getOsVersion_activeDeviceInstalls().size()!=0){
    			System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getOsVersion_activeDeviceInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}
 
    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO AI TABLET "+ this.getNomeGruppo());
    		if(datiAggregati.getTablet_dailyUserInstalls().size()!=0){   	
    			System.out.println("	"+"dailyUserInstalls	"+datiAggregati.getTablet_dailyUserInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserInstalls	"+"NA");
			}
    		if(datiAggregati.getTablet_totUserInstalls().size()!=0){
    			System.out.println("	"+"totUserInstalls		"+datiAggregati.getTablet_totUserInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"totUserInstalls	"+"NA");
			}
    		if(datiAggregati.getTablet_dailyUserUninstalls().size()!=0){
    			System.out.println("	"+"dailyUserUnistalls	"+datiAggregati.getTablet_dailyUserUninstalls().get(0));
    		}
    		else{
				System.out.println("	"+"dailyUserUnistalls	"+"NA");
			}
    		if(datiAggregati.getTablet_activeDeviceInstalls().size()!=0){
    			System.out.println("	"+"activeDeviceInstalls	"+datiAggregati.getTablet_activeDeviceInstalls().get(0));
    		}
    		else{
				System.out.println("	"+"activeDeviceInstalls	"+"NA");
			}
   		
    			
		   	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO AI FALLIMENTI "+ this.getNomeGruppo());
		   	if(datiAggregati.getFailure_count().size()!=0){   	
		   		System.out.println("	"+"failurecount	"+datiAggregati.getFailure_count().get(0));
		   	}
		   	else{
				System.out.println("	"+"failurecount	"+"NA");
			}
		    
		   	for(App ap: apps){
		   		ap.visualizzaDati();
		   	}

    	}
    	else{
    		System.out.println("Non sono state inserite app nel gruppo di cui visualizzare i dati o dati non presenti");
    	}
    	
    }
    
    /**
     * Funzione per l'estrazione dei dati di un Gruppo
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean estrazioneDatiGruppo(){
    	
        return false; 
    }
    
    /**
     * Funzione per l'aggregazione dei dati delle App contenute nel Gruppo
     *
     */
    public void aggregazioneDati(){
 
    }
    
    /**
     * Funzione per scaricare i dati di un Gruppo
     *
     * @return Il file contente i dati dell'App
     */
    public File scaricamentoDati(){

    	return null;
    }
    
    /**
     * Funzione per aggiungere un'App ad un Gruppo
     *
     *@param app (passaggio di un'app)
     */
    public void addApp(App app){
    	apps.add(app);
        	
    }
    
    /**
     * Funzione per ritornare il nome del gruppo
     *
     *@return nomeGruppo (ritorna il nome del gruppo)
     */
    public String getNomeGruppo() {
    	return nomeGruppo;
    }
    
    /**
     * Funzione d'appoggio per rimuovere un'app dal gruppo
     *
     *@param app (passaggio di un'app) 
     */
    public void delete(App app){
    	apps.remove(app);
    }
    /**
     * Funzione per ritornare la lista delle app inserite nel gruppo
     *
     *@return apps (ritorna la lista delle app associata al gruppo)
     */
    public ArrayList<App> getApps() {
		return apps;
	}
	
    /**
     * 
     * @param dati (passaggio di una classe dati)
     * @return true se i dati vengono settati, flase se i dati non vengono settati
     */
    public boolean setDati(Dati dati){
    	
    	if(dati!=null){
	    	this.datiAggregati = dati;
	    	return true;
    	}
    	else{
    		return false;
    	}
    }
}