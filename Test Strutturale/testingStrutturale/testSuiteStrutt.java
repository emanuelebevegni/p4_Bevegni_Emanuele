package testingStrutturale;

import org.junit.runners.Suite;

import testingFunzionale.testingCancFunzionale;
import testingFunzionale.testingInsAppFunzionale;

import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({testingCancStrutturale.class, testingInsAppStrutturale.class, 
					testingVisualStrutturale.class})

public class testSuiteStrutt {

}

/*
 * I miei test Strutturali non raggiungono il 100% di statement coverage come richiesto nella consegna
 * per i seguenti motivi
 * 1)Molti metodi e classi non vengono utilizzati in quanto non era rischiesto nella mia parte di consegna
 * 	 ma nonostante tutto ho deciso di lasciarli per dare un'idea generale del sistema e del progetto
 * 2)Nello sviluppo dei miei use case e' mischiata parte logica e grafica(interazione con l'utente
 * 	 come input da tastiera) quindi non riesco a testare la funzione generale, come per esempio
 * 	 cancellazioneApp ma testero solo la parte logica.
 * 
 * La parte logica del mio progetto raggiunge il 100% di statement coverage.
 */
