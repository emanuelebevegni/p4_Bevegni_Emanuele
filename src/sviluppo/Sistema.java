package sviluppo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Classe per la definizione del Sistema
 */
public class Sistema{ 
    /** Associazioni */
    private GoogleStore google;
    private WinStore win;
    private AppleStore apple;
    private ArrayList<App> apps;
    private ArrayList<Gruppo> gruppi; 

	/**
     * Costruttore di Sistema
     *
     */
    public Sistema(){
    	google = new GoogleStore();
    	win = new WinStore();
    	apple = new AppleStore();
    	apps = new ArrayList<App>();
    	gruppi = new ArrayList<Gruppo>();
    	
    }
    
    /**
     * Costruttore di Sistema (con questo costruttore si puo decidere come istanziare i vari store)
     *@param google  (istanza della classe GoogleStore)
     *@param apple   (istanza della classe AppleStore)
     *@param windows (istanza della classe WinStore)
     */
   public Sistema(GoogleStore google, AppleStore apple, WinStore windows){
		this.google = google;
    	this.win = windows;
    	this.apple = apple;
    	apps = new ArrayList<App>();
    	gruppi = new ArrayList<Gruppo>();
   }
   
   /**
    * Costruttore di Sistema (all'avvio il sistema avra gia 2 app ed un gruppo pieno al suo interno)
    *
    *@param a (passoggio di  un'app)
    *@param b (passoggio di  un'app)
    *@param c (passaggio di un gruppo)
    */
   public Sistema(App a, App b, Gruppo c){
    	google = new GoogleStore();
    	win = new WinStore();
    	apple = new AppleStore();
    	apps = new ArrayList<App>();
    	gruppi = new ArrayList<Gruppo>();
    	this.apps.add(a);
    	this.apps.add(b);
    	this.gruppi.add(c);
    	this.aggiuntaAppGruppo(a);
    	this.aggiuntaAppGruppo(b);
    }
    
    /**
    * Funzione per aggiungere le credenziali di un'AppStore tra quelli supportati
    *
    */
    public void aggiuntaCredenziali(){
         
    }
    
    /**
     * Funzione per inserire Apps nel Sistema
     * Implementazione UC2
     */
    public void inserimentoApp(){
    	
    	ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
    	
    	/*
    	* Richiamo la funzione per ottenere le liste "unificate"
    	* delle apps inserite nei vari appstore
       	*/
    	
    	listone=getListaApps();
    	if(listone == null){
    		return;
    	}
    	    	
    	String	input = new String();
    	System.out.println(" ");


       /*
    	* Ciclo condizionato per permettere all'utente di aggiungere
    	* quante applicazioni desidera
       	*/
   
       	while(true){
       		System.out.println("Digitare lo store e il numero dell'applicazione da inserire premere 0 per terminare ");
       		input = Input.readLine();

       		if(input.equals("0")){
       			break;
       		}

			String[] str = input.split(" ",2);
			String names = str[0];
			String napp = str[1];
			
			/*
	    	* Richiamo la funzione per inserire l'app selezionata 
	    	* dall'utente
	       	*/
			inserimentoApp(names,napp,listone,this.apps);
			continue;
			
       	
       	}
    } 
    /**
     * Funzione per ottenere le liste di applicazioni dai vari app store
     * Fa riferimento ad una parte dell'activity diagram nel documento sdd
     *@return listone (array list di array list che contiene tutte le app contenute nei nostri store)
     */
    public ArrayList<ArrayList<App>> getListaApps(){
    	
    	ArrayList<App> gapps = new ArrayList<App>();
    	ArrayList<App> wapps = new ArrayList<App>();
    	ArrayList<App> aapps = new ArrayList<App>();
    	ArrayList<ArrayList<App>> listone = new ArrayList<ArrayList<App>>();
   	    
    	//In questi if richiamo i vari visitor per poter ottenere la lista di app all'interno dello store
    	if(google != null){
    		System.out.println("Lista Applicazioni per  Google PlayStore");
    		gapps = (ArrayList<App>)google.accept(new ListaApp());
    		listone.add(gapps);
    	}
    	else{
    		System.out.println("Google PlayStore non presente nel sistema");
    	}
    	if(win != null){
    		System.out.println("\nLista Applicazioni per WindowsStore");
    		wapps = (ArrayList<App>)win.accept(new ListaApp());
    		listone.add(wapps);
    	}
    	else{
    		System.out.println("\nWindowsStore non presente nel sistema");
    	}
    	if(apple != null){
    		System.out.println("\nLista Applicazioni per AppleStore");
    		aapps = (ArrayList<App>)apple.accept(new ListaApp());
    		listone.add(aapps);
    		
    	}
    	else{
    		System.out.println("\nAppleStore non presente nel sistema");
    	}
    	
    	if(listone.size() == 0){
    		System.out.println("\nNon ci sono applicazioni sugli store inseriti");
    		return null;
    	}
        			
    	return listone;
    }
    
  /**
   * Funzione per inserire una singola app nel sistema
   * Fa riferimento ad una parte dell'activity diagram nel documento sdd
   * @param names (nome dello store scritto dall'utente)
   * @param napp  (indice dell'app che l'utente vuole inserire)
   * @param listone (array list di array list che contiene tutte le app contenute nei nostri store)
   * @param apps	(lista di apps)
   * @return true se va tutto bene, false errori vari
   */
    public boolean inserimentoApp(String names, String napp, ArrayList<ArrayList<App>> listone, ArrayList<App> apps ){
    	
    	//Controllo che l'indice inserito dall'utente sia corretto
    	int indice=0;
    	try{
    		indice = Integer.parseInt(napp);
    	}catch(NumberFormatException e){
    		System.out.println("L'applicazione che vuoi inserire non è valida (indice)");
    		return false;
    	}
    	
    	
    	App app = null;
    	
    	/*
    	 * Ciclo switch che recupera un'applicazione singola dalla lista di liste 
    	 * di app dei vari appstore (servira da confronto per l'inserimento)
    	 * inoltre viene controllata ulteriormente la bonta dell'indice 
    	 * inserito dall'utente	
    	 */
    	switch(names){
    	
    	case "Google":
    		if ( indice -1 < listone.get(0).size() && indice -1 >=0){
    			app = listone.get(0).get(Integer.parseInt(napp)-1);
    		}
    		else{
    			System.out.println("L'applicazione che vuoi inserire non è valida");
    			return false;
    		}
    		break;
    		
    	case "Windows":
    		if ( indice -1 < listone.get(1).size() && indice -1 >=0){
    			app = listone.get(1).get(Integer.parseInt(napp)-1);
    		}
    		else{
    			System.out.println("L'applicazione che vuoi inserire non è valida");
    			return false;
    		}
    		break;
    		
    	case "Apple":
    		if ( indice -1 < listone.get(2).size() && indice -1 >=0){
    			app = listone.get(2).get(Integer.parseInt(napp)-1);
    		}
    		else{
    			System.out.println("L'applicazione che vuoi inserire non è valida");
    			return false;
    		}
    		break;
    		
    	default:
    		System.out.println("Digitazione App Store errata");
    		return false;
    	}
    	
    	
    	/*
    	 *	Controllo se l'app digitata dall'utente esiste gia come app inserita
    	 */
    	
    	if(apps.size() == 0){
    		apps.add(app);
    		System.out.println("Applicazione Aggiunta con successo");
    		return true;
    	}
    	else{
    		boolean temp = false;
    		for(App ap : apps){
    			
    			if(app.getNomeApp().equals(ap.getNomeApp())  &&  app.getProvenienza().equals(ap.getProvenienza())){
    				System.out.println("\nApplicazione gia inserita");
    				temp=true;
    				
    			}
    			
    		}
    		
    		if(temp == false){
    			apps.add(app);
    			System.out.println("\nApplicazione Aggiunta con successo");
    			return true;
    			
    		}
    		else{
    			return false;
    		}
    	}
			
    }
    	
         
    /**
     * Funzione per cancellare App dal Sistema
     * Implementazione UC3
     */
    public void cancellazioneApp(){
    	
    	System.out.println(" ");
    	
       	while(true){
       		/*
       		 * Richiamo la funzione per visualizzare le app presenti nel sistema
       		 */
       		if(!visualizzaApps(this.apps)){
       			return;
       		}
       		/*
       		 * Prendo l'input da utente
       		 */
       		System.out.println("Digitare il numero dell'applicazione da cancellare premere 0 per terminare ");
       		String input = Input.readLine();

       		if(input.equals("0")){
       			break;
       		}
       		
       		System.out.println("Sicuro di voler cancellare l'app? (si o no)");
       		String scelta = Input.readLine();
       		
       	    /*
    		 * Richiamo la funzione per cancellare l'app inserita dal sistema
    		 */
    		
    		cancellaApp(scelta,input, this.apps, this.gruppi);
    		continue;
         	 
    	}
   }
    /**
     * Funzione per visualizzare la lista delle apps nel sistema
     * Fa riferimento ad una parte dell'activity diagram nel documento sdd
     *@param apps (Lista di apps)
     *@return True se ci sono app nel sistema da stampare, False se non sono presenti app nel sistema
     */
    public boolean visualizzaApps(ArrayList<App> apps){
    	/*
    	 * Controllo per verificare la presenza di app salvate nel sistema
    	 */
    	if(apps.size()== 0){
    		System.out.println("Non sono presenti app nel sistema");
    		return false;
    	}
    	else{
    		System.out.println("Lista Apps inserite nel sistema ");
    		int k=1;
    		for(App ap : apps){
    			System.out.println(k+")"+ap.getNomeApp()+ " (" + ap.getProvenienza()+ ")");
    			k++;
    		}
    		return true;
    	}
    
    }
    
    /**
     * Funzione per visualizzare la lista delle apps nel sistema
     * Fa riferimento ad una parte dell'activity diagram nel documento sdd
     *@param scelta (possibile conferma dell'utente)
     *@param input	(indice dell'app da cancellare)
     *@param apps	(lista di apps)
     *@param gruppi	(lista di gruppi)
     *@return True se la cancellazione e' stata effettuata, False se e' avvenuto qualche errore
     */
    public boolean cancellaApp(String scelta,String input, ArrayList<App> apps, ArrayList<Gruppo> gruppi){
    	
    	if(scelta.equals("no")){
    		System.out.println("Scelta non confermata");
    		return false;
    	}
    	else{
	    	/*
	    	 * Converto e controllo l'input dell'utente da stringa ad intero per poterlo utilizzare
	    	 * come indice dell'array
	    	 */
	    	int indice=0;
	    	try{
	    		indice = Integer.parseInt(input)-1;
	    	}catch(NumberFormatException e){
	    		System.out.println("L'applicazione che vuoi selezionare non è valida");
	    		return false;
	    		
	    	}
	    	/*
	    	 * Ulteriore controllo sulla bonta dell'indice inserito
	    	 * ed eventuale cancellazione dell'app dal sistema
	    	 */
	    	
	    	if(indice < apps.size() && indice >=0){
	    		App app = apps.get(indice);
	    		
	    		for(Gruppo gp : gruppi){
	    			gp.getApps().remove(app);
	    		}
	    		
	    		apps.remove(app);
	    		System.out.println("Applicazione rimossa con successo");
	    		return true;
	    	}
	    	else{
	    		System.out.println("Inserimento indice errato");
	    		return false;
	    	}
    
    	}
    }
    
    /**
     * Funzione per ritornare la lista di applicazioni inserite dall'utente
     *
     *@return apps (Lista delle apps)
     */
    public ArrayList<App> getApps() {
    	return apps;
    }
    
    /**
     * Funzione base per creare un nuovo Gruppo e inserirlo nel sistema
     *
     *@param gruppo (Passo un gruppo da aggiungere al sistema )
     */
    public void creazioneGruppo(Gruppo gruppo){
    	Gruppo g1 = gruppo;
    	gruppi.add(g1);
    }
    /**
     * Funzione per aggiungere un'App ad un Gruppo
     *
     *@param app (Passo come parametro un'app)
     */
    public void aggiuntaAppGruppo(App app){
    	
    	gruppi.get(0).addApp(app);
    	    	    
    }
    /**
     * Funzione per cancellare un Gruppo
     *
     */
    public void cancellazioneGruppo(){
 
    }
    /**
     * Funzione per cancellare le credenziali di un'AppStore 
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean cancellazioneCredenziali(){
 
    	return false;
    }
    /**
     * Funzione per modificare le credenziali di un'AppStore
     *
     */
    public void modificaCredenziali(){

    }
    /**
     * Funzione per cancellare un'App da un Gruppo
     *
     */
    public void cancellazioneAppGruppo(){
    	
    }
    
    /**
     * Funzione per ritornare la lista dei gruppo nel sistema
     *
     *@return gruppi ( lista dei gruppi )
     */
    public ArrayList<Gruppo> getGruppi() {
    	return gruppi;
    }
}