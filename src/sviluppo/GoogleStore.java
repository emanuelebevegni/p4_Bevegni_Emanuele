package sviluppo;
import java.io.File;
import java.util.ArrayList;
/**
 * Classe per l'implementazione del GoogleStore
 */
public class GoogleStore implements ElementAppStore{
    /** Attributi */
    private Credenziali credenziali; 
    
    /**
     * Funzione accept del pattern Visitor
     *
     * @param visitor Il Visitor
     */
    public Object accept(Visitor visitor ){
    	
        ArrayList<App> apps = (ArrayList<App>)visitor.visit(this);
        return apps;
    }
    /**
     * Funzione per l'estrazione dei dati dal GoogleStore
     *
     * @param app L'App di cui estrarre i dati
     * @return Il file contenente i dati estratti 
     */
    public File estrazioneDati(App app){
 
    	return null;
    }
    /**
     * Funzione per effettuare l'accesso sul GoogleStore
     *
     * @param credenziali Le credenziali per accedere
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean accesso(Credenziali credenziali){
    	
    	return false;
    }
    /**
     * Funzione per ottenere la lista delle App dell'utente presenti sul GoogleStore
     *
     * @return La lista delle App dell'utente presenti sul GoogleStore
     */
    public ArrayList<App> getListaApp(){
    	
    	//Non potendo stabile la connessione istanzio io la lista a mano
    	
       	ArrayList<App> apps = new ArrayList<>();
       	apps.add(new App(1,"Calcio","Google"));
    	apps.add(new App(2,"Basket","Google"));
    	apps.add(new App(3,"Golf","Google"));
    	
    	
    	return apps;
    }
}