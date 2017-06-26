package sviluppo;
import java.io.File;
import java.util.ArrayList;
/**
 * Classe per la definizione di App
 */
public class App{
  
	/** Attributi */
    private int id;
    private String nomeApp;
    private String provenienza;

	/** Associazioni */
    private Dati dati;
   
    /**
     * Costruttori della classe
     *
     *@param id (numero intero che rappresenta l'id dell'app)
     *@param nome (nome dell'app)
     */
    public App(int id, String nome) {
    	this.id = id;
    	this.nomeApp = nome;
    	
    }
    
    /**
     * Costruttori della classe
     *
     *@param id (numero intero che rappresenta l'id dell'app)
     *@param nome (nome dell'app)
     *@param prov (stringa che rappresenta la provenienza dell'app)
     */
    public App(int id, String nome, String prov) {
    	this.id = id;
    	this.nomeApp = nome;
    	this.provenienza = prov;
    	
    }
    
    /**
     * Costruttori della classe (serve per copiare un'app)
     *
     *@param app (passaggio di un'app)
     */
    public App(App app){
    	this.nomeApp = app.getNomeApp();
    	this.provenienza = app.getProvenienza();
    	
    }
    
    /**
     * Funzione per restituire il nome dell'App
     * 
     * @return nomeApp (ritorna il nome dell'app)
     */
    public String getNomeApp() {
    	return nomeApp;
    }
    
    /**
     * Funzione per settare il nome dell'App
     *
     *	@param nomeApp (stringa che rappresenta il nome dell'app)
     */
    public void setNomeApp(String nomeApp) {
    	this.nomeApp = nomeApp;
    }
    
    /**
     * Funzione per la visualizzazione dei dati dell'App
     *
     */
    public void visualizzaDati(){
    	
    	/*
    	 * La funzione visualizzaDati in base allo store di provenienza dell'app
    	 * andra a visualizzare dei dati ben precisi ( legati a quell'app )
    	 * Essendo che l'estrazione e la normalizzazione, non erano di mia competenza
    	 * io ipotizzo che:
    	 * 1) se l'estrazione non andra a buon fine i dati associati all'app
    	 * rimarranno nulli
    	 * 2)L'estrazione puo "scaricare" dall'app store i file relativi ai dati
    	 * statistici dell'app ma questi sono ancora vuoti ( es app inserita da poco tempo )
    	 * allora la normalizzazione associera all'app una classe dati vuota, cioe'
    	 * con tutti i suoi attributi a dimensione 0 ( visto che si usano quasi per la totalita arraylist )
    	 * 3)Essendo che non siamo riusciti ad ottenere nessuna informazione sulle app store Apple,
    	 * personalmente le ho trattate come fossero app di google quindi fare il testing per un'app
    	 * di google o di apple e' assolutamente identico
    	 */
    	
    	if(this.dati != null){
	    	if(this.provenienza.equals("Google") || this.provenienza.equals("Apple")){
	    		System.out.println("MEDIA VOTI RISPETTO ALLA VERSIONE "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getApp_version().size()!=0){
			    	for(int i=0; i<dati.getApp_version().size(); i++){
			    		
				    	System.out.println(dati.getApp_version().get(i));
				    	
			    		System.out.println("	"+"daily_average_version	"+dati.getDaily_average_app_version().get(i));
				    
			    		System.out.println("	"+"total_average_version	"+dati.getTotal_average_app_version().get(i));
				    			    		
			    	}
		    	}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	   	
	    	
	    		System.out.println("\nMEDIA VOTI RISPETTO AL CARRIER "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getCarrier().size()!=0){
			    	for(int i=0; i<dati.getCarrier().size(); i++){
			    		
				    	System.out.println(dati.getCarrier().get(i));
				    	
				    	System.out.println(dati.getData_carrier().get(i));
				    	
				    	System.out.println("	"+"daily_average_carrier	"+dati.getDaily_average_carrier().get(i));
				    	
			    		System.out.println("	"+"total_average_carrier	"+dati.getTotal_average_carrier().get(i));
				    
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	
	    		System.out.println("\nMEDIA VOTI RISPETTO AL PAESE "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getCountry().size()!=0){
			    	for(int i=0; i<dati.getCountry().size(); i++){
			    		
				    	System.out.println(dati.getCountry().get(i));
				    	
				    	System.out.println(dati.getData_country().get(i));
				    	
			    		System.out.println("	"+"daily_average_country	"+dati.getDaily_average_country().get(i));
				    	
			    		System.out.println("	"+"total_average_country	"+dati.getTotal_average_country().get(i));
				    	
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nMEDIA VOTI RISPETTO AL DEVICE "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getDevice().size()!=0){
			    	for(int i=0; i<dati.getDevice().size(); i++){
			    		
				    	System.out.println(dati.getDevice().get(i));
				    	
				    	System.out.println(dati.getData_device().get(i));
				    	
			    		System.out.println("	"+"daily_average_device	"+dati.getDaily_average_device().get(i));
				    	
			    		System.out.println("	"+"total_average_device	"+dati.getTotal_average_device().get(i));
				    	
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nMEDIA VOTI RISPETTO ALLA LINGUA "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getLanguage().size()!=0){
			    	for(int i=0; i<dati.getLanguage().size(); i++){
			    		
				    	System.out.println(dati.getLanguage().get(i));
				    	
				    	System.out.println(dati.getData_language().get(i));
				    	
			    		System.out.println("	"+"daily_average_language	"+dati.getDaily_average_language().get(i));
				    
			    		System.out.println("	"+"total_average_language	"+dati.getTotal_average_language().get(i));
				    
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nMEDIA VOTI RISPETTO AL OS "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getOs_version().size()!=0){
			    	for(int i=0; i<dati.getOs_version().size(); i++){
			    		
				    	System.out.println(dati.getOs_version().get(i));
				    	
				    	System.out.println(dati.getData_os_version().get(i));
				    	
			    		System.out.println("	"+"daily_average_os_version	"+dati.getDaily_average_os_version().get(i));
				    	
			    		System.out.println("	"+"total_average_os_version	"+dati.getTotal_average_os_version().get(i));
				    	
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nMEDIA VOTI RISPETTO AI TABLET "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getTablet().size()!=0){
			    	for(int i=0; i<dati.getTablet().size(); i++){
			    		
				    	System.out.println(dati.getTablet().get(i));
				    	
				    	System.out.println(dati.getData_tablet().get(i));
				    	
			    		System.out.println("	"+"daily_average_tablet	"+dati.getDaily_average_tablet().get(i));
				    
				    	System.out.println("	"+"total_average_tablet	"+dati.getTotal_average_tablet().get(i));
				    	
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nMEDIA VOTI GENERALE "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getData_overview().size()!=0){
			    	for(int i=0; i<dati.getData_overview().size(); i++){
			    		
				    	System.out.println(dati.getData_overview().get(i));
				    				    	
		    			System.out.println("	"+"daily_average_overview	"+dati.getDaily_average_overview().get(i));
		    	
			    		System.out.println("	"+"total_average_overview	"+dati.getTotal_average_overview().get(i));
				    
			    	}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    	
	    		System.out.println("\nDATI SULLE INSTALLAZIONI GENERALE DELL'APP "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
		    	if(dati.getOverview_data().size()!=0){
			    	for(int i=0; i<dati.getOverview_data().size(); i++){
				    	
				    	System.out.println(dati.getOverview_data().get(i));
				    	
				    	
			    		System.out.println("	"+"dailyUserInstalls	"+dati.getOverview_dailyUserInstalls().get(i));
			    		
			    		System.out.println("	"+"totUserInstalls		"+dati.getOverview_totUserInstalls().get(i));
			    			    		
		    	   		System.out.println("	"+"dailyUserUnistalls	"+dati.getOverview_dailyUserUninstalls().get(i));
			    	
			    		System.out.println("	"+"activeDeviceInstalls	"+dati.getOverview_activeDeviceInstalls().get(i));
				    	
			    	}
		    	}
		    	else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    	
	    	
		    	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLE COMPAGNIE TELEFONICHE "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getCarrier_data().size()!=0){
			    	for(int i=0; i<dati.getCarrier_data().size(); i++){
				    	
				    	System.out.println(dati.getCarrier_data().get(i));
				    	
				    	System.out.println("	"+"dailyUserInstalls	"+dati.getCarrier_dailyUserInstalls().get(i));
				  
				    	System.out.println("	"+"totUserInstalls		"+dati.getCarrier_totUserInstalls().get(i));
				    
				    	System.out.println("	"+"dailyUserUnistalls	"+dati.getCarrier_dailyUserUninstalls().get(i));
				    	
				    	System.out.println("	"+"activeDeviceInstalls	"+dati.getCarrier_activeDeviceInstalls().get(i));
				    	
			    	}
	    		}
	    	
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    	
	    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLE NAZIONI "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
		    	if(dati.getCountry_data().size()!=0){
			    	for(int i=0; i<dati.getCountry_data().size(); i++){
				    	
				    	System.out.println(dati.getCountry_data().get(i));
				    				    	
			    		System.out.println("	"+"dailyUserInstalls	"+dati.getCountry_dailyUserInstalls().get(i));
			    
			    		System.out.println("	"+"totUserInstalls		"+dati.getCountry_totUserInstalls().get(i));
			    	
		    		
			    		System.out.println("	"+"dailyUserUnistalls	"+dati.getCountry_dailyUserUninstalls().get(i));
			    	
			    		System.out.println("	"+"activeDeviceInstalls	"+dati.getCountry_activeDeviceInstalls().get(i));
				    	
			    	}
		    	}
		    	else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    	
	    	
		    	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO AI DEVICE "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getDevice_data().size()!=0){
			    	for(int i=0; i<dati.getDevice_data().size(); i++){
				    	System.out.println(dati.getDevice_data().get(i));
				    	
				    	System.out.println("	"+"dailyUserInstalls	"+dati.getDevice_dailyUserInstalls().get(i));
			   
			    		System.out.println("	"+"totUserInstalls		"+dati.getDevice_totUserInstalls().get(i));
			    
			    		System.out.println("	"+"dailyUserUnistalls	"+dati.getDevice_dailyUserUninstalls().get(i));
			    
			    		System.out.println("	"+"activeDeviceInstalls	"+dati.getDevice_activeDeviceInstalls().get(i));
				    	
			    	}
	    		}
	    	    else{
	    	    	System.out.println("Dati attualmente non disponibili");
	    	    }
	    	
	    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLA LINGUA "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	       		if(dati.getLang_data().size()!=0){
			    	for(int i=0; i<dati.getLang_data().size(); i++){
				    	System.out.println(dati.getLang_data().get(i));
				    	
			    		System.out.println("	"+"dailyUserInstalls	"+dati.getLang_dailyUserInstalls().get(i));
			  
			    		System.out.println("	"+"totUserInstalls		"+dati.getLang_totUserInstalls().get(i));
			    	
			    		System.out.println("	"+"dailyUserUnistalls	"+dati.getLang_dailyUserUninstalls().get(i));
			
			    		System.out.println("	"+"activeDeviceInstalls	"+dati.getLang_activeDeviceInstalls().get(i));
				    	
			    	}
	    		}
	    	
	       		else{
	       			System.out.println("Dati attualmente non disponibili");
	       		}
	    	
	       		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLA VERSIONE OS "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
		    	if(dati.getOsVersion_data().size()!=0){
			    	for(int i=0; i<dati.getOsVersion_data().size(); i++){
				    	System.out.println(dati.getOsVersion_data().get(i));
				    	
			       		System.out.println("	"+"dailyUserInstalls	"+dati.getOsVersion_dailyUserInstalls().get(i));
			 
			    		System.out.println("	"+"totUserInstalls		"+dati.getOsVersion_totUserInstalls().get(i));
			    	
			    		System.out.println("	"+"dailyUserUnistalls	"+dati.getOsVersion_dailyUserUninstalls().get(i));
			    
			    		System.out.println("	"+"activeDeviceInstalls	"+dati.getOsVersion_activeDeviceInstalls().get(i));
				    	
			    	}
		    	}
		    	else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    	
	    	
		    	System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO AI TABLET "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getTablet_data().size()!=0){
			    	for(int i=0; i<dati.getTablet_data().size(); i++){
				    	
				    	System.out.println(dati.getTablet_data().get(i));
				    	
			    		System.out.println("	"+"dailyUserInstalls	"+dati.getTablet_dailyUserInstalls().get(i));
			    
			    		System.out.println("	"+"totUserInstalls		"+dati.getTablet_totUserInstalls().get(i));
			    	
			    		System.out.println("	"+"dailyUserUnistalls	"+dati.getTablet_dailyUserUninstalls().get(i));
			    
			    		System.out.println("	"+"activeDeviceInstalls	"+dati.getTablet_activeDeviceInstalls().get(i));
				    	
			    	}
	    		}
	    	
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    	}
	    	
	    	if(this.provenienza.equals("Windows")){
	    		
	    		System.out.println("\nCONTATORI SUI NUOVI VOTI O MODIFICATI "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		
    			System.out.println("Contatore nuovi voti		"+dati.getCount_new());
    		
    			System.out.println("Contatore voti modificati	"+dati.getCount_revised());
	    		
    			System.out.println("\nMEDIA VOTI NEL TEMPO "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getDate_win().size()!=0){
	    			for(int i=0; i<dati.getDate_win().size(); i++){
	    				System.out.println(dati.getDate_win().get(i));
	    				
				    	System.out.println("	"+"count average	"+dati.getCount_average().get(i));
				    	
	    			}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nMEDIA VOTI IN BASE AL MARKET "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getMarket().size()!=0){
	    			for(int i=0; i<dati.getMarket().size(); i++){
	    				System.out.println(dati.getMarket().get(i));
	    				
				    	System.out.println("	"+"avarage rating	"+dati.getAverage_rating().get(i));
				   
				    	System.out.println("	"+"number rating	"+dati.getNumber_rating().get(i));
				    	
	    			}
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nDATI SULLE INSTALLAZIONI GENERALE DELL'APP "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getOverview_data().size()!=0){
			    	for(int i=0; i<dati.getOverview_data().size(); i++){
				    	
				    	System.out.println(dati.getOverview_data().get(i));
				    	
				    	
			    		System.out.println("	"+"dailyUserInstalls	"+dati.getOverview_dailyUserInstalls().get(i));
			    					    						    	
			    	}
		    	}
	    		
	    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLE NAZIONI "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getCountry_data().size()!=0){
			    	for(int i=0; i<dati.getCountry_data().size(); i++){
				    	
				    	System.out.println(dati.getCountry_data().get(i));
				    				    	
			    		System.out.println("	"+"dailyUserInstalls	"+dati.getCountry_dailyUserInstalls().get(i));
			    	}
		    	}
		    	else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO ALLA VERSIONE OS "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getOsVersion_data().size()!=0){
			    	for(int i=0; i<dati.getOsVersion_data().size(); i++){
				    	System.out.println(dati.getOsVersion_data().get(i));
				    	
			       		System.out.println("	"+"dailyUserInstalls	"+dati.getOsVersion_dailyUserInstalls().get(i));
			    	}
		    	}
		    	else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    		
	    		System.out.println("\nDATI SULLE INSTALLAZIONI RISPETTO AI FALLIMENTI "+ this.getNomeApp()+" ("+this.getProvenienza()+")");
	    		if(dati.getFailure_data().size()!=0){
			    	for(int i=0; i<dati.getFailure_data().size(); i++){
				    	System.out.println(dati.getFailure_data().get(i));
				    	
				    	System.out.println("	"+"failurecount	"+dati.getFailure_count().get(i));
				    	
			    	}
		    	
	    		}
	    		else{
	    			System.out.println("Dati attualmente non disponibili");
	    		}
	    		
	    	}
    	}
    	else{
    		System.out.println("Nessun dati presente per l'applicazione selezionata");
    	}
    }
    
    /**
     * Funzione per recuperare la provenienza dell'App
     *
     * @return provenienza dell'app (inteso come app store)
     */
    public String getProvenienza() {
    	return provenienza;
    }
    
    /**
     * Funzione per impostare la provenienza dell'App
     *
     *@param provenienza (stringa che rappresenta la provenienza dell'app)
     */
    public void setProvenienza(String provenienza) {
    	this.provenienza = provenienza;
    }
    
    /**
     * Funzione per l'estrazione dei dati di un'App dal suo AppStore
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean estrazioneDatiApp(){
    	
    	return false;
    }
    /**
     * Funzione per la normalizzazione dei dati di un App
     *
     */
    public void normalizzazioneDati(){
    	
    }
    /**
     * Funzione per scaricare i dati di un'App
     *
     * @return Il file contente i dati dell'App
     */
    public File scaricamentoDati(){
        
    	return null;
    }
    /**
     * Metodo d'appoggio con cui creo dei dati
     *
     *@param dati (passaggio di una classe Dati)
     *@return true in caso di settaggio positivo, false in caso i passati sono null
     */
    public boolean setDati(Dati dati){
    	
    	if(dati!= null){
	    	this.dati = dati;
	    	return true;
    	}
    	else{
    		return false;
    	}
    }
    /**
     * Override del metodo equals
     *
     */
    @Override
    public boolean equals(Object obj) {
    	if (this == obj)
    		return true;
    	if (obj == null)
    		return false;
    	if (getClass() != obj.getClass())
    		return false;
    	App other = (App) obj;
    	if (id != other.id)
    		return false;
    	if (nomeApp == null) {
    		if (other.nomeApp != null)
    			return false;
    	} else if (!nomeApp.equals(other.nomeApp))
    		return false;
    	if (provenienza == null) {
    		if (other.provenienza != null)
    			return false;
    	} else if (!provenienza.equals(other.provenienza))
    		return false;
    	return true;
    }
}