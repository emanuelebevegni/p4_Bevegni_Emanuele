package sviluppo;
import java.util.ArrayList;

/**
 * Interfaccia del pattern Visitor per implementare gli AppStore suportati
 */
public interface ElementAppStore{
    /**
     * Funzione accept del Visitor
     *
     * @param visitor Il Visitor
     * @return richiama il visitor adeguato
     */
    public Object accept(Visitor visitor);
    
}