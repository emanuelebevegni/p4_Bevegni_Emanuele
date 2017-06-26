package sviluppo;
import java.util.ArrayList;

/**
 * Interfaccia del pattern Visitor per implementare il Visitor
 */
public interface Visitor{ 
    
	/**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param google GoogleStore specifico
     * @return richiama il visitor del googlestore
     */
    public Object visit(GoogleStore google);
    
    /**
     * Funzione visit del Visitor per l'AppleStore
     *
     * @param apple AppStore specifico
     * @return richiama il visitor dell'applestore
     */
    public Object visit(AppleStore apple);
   
    /**
     * Funzione visit del Visitor per il WinStore
     *
     * @param win WinStore specifico
     * @return richiama il visitor del winstore
     */
    public Object visit(WinStore win);
}