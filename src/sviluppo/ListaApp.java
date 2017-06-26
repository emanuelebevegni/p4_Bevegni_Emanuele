package sviluppo;
import java.util.ArrayList;

/**
 * Classe per implementare la funzione ListaApp delle App negli AppStore supportati
 */
public class ListaApp implements Visitor{ 
	/**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param google AppStore specifico
     */
    public Object visit(GoogleStore google){
  
    	ArrayList<App> apps;
    	apps = google.getListaApp();
   		int i=1;
    	for(App app : apps){
    			System.out.println(i+") "+app.getNomeApp());
    			i++;
    
    	}
        return apps;
    }
    /**
     * Funzione visit del Visitor per l'AppleStore
     *
     * @param apple AppStore specifico
     */
    public Object visit(AppleStore apple){
    	
    	ArrayList<App> apps;
    	apps = apple.getListaApp();
    	int i=1;
    	for(App app : apps){
    		System.out.println(i+") "+app.getNomeApp());
    		i++;
    	}
    	return apps;
    }
    /**
     * Funzione visit del Visitor il WinStore
     *
     * @param win AppStore specifico
     */
    public Object visit(WinStore win){
    	
    	ArrayList<App> apps;
    	apps = win.getListaApp();
    	int i=1;
    	for(App app : apps){
    		System.out.println(i+") "+app.getNomeApp());
    		i++;
    	}
    	return apps;
    }

}