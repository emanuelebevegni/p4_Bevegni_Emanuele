package sviluppo;
import java.util.ArrayList;

/**
 * Classe per implementare la funzione EstrazioneDati negli AppStore supportati
 */
public class EstrazioneDati implements Visitor{
    /** Attributi */
    private App app;
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param google AppStore specifico
     */
    public Object visit(GoogleStore google){
         
    	return null;
    }
    /**
     * Funzione visit del Visitor per l'AppleStore
     *
     * @param apple AppStore specifico
     */
    public Object visit(AppleStore apple){
    	return null;
    }
    /**
     * Funzione visit del Visitor il WinStore
     *
     * @param win AppStore specifico
     */
    public Object visit(WinStore win){
    	return null;
    }
    
}