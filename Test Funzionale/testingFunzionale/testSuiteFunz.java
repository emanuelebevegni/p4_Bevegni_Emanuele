package testingFunzionale;

import org.junit.runners.Suite;

import testingFunzionale.testingCancFunzionale;
import testingFunzionale.testingInsAppFunzionale;

import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({testingCancFunzionale.class, testingInsAppFunzionale.class
					,testingVisualFunzionale.class})

public class testSuiteFunz {

}

/*
 * I miei test funzionali raggiungono uno statement coverage del 81.8%
 * mentre il branch coverage e' del 57.6%
 * Queste percentuali sono basse in parte per gli stessi motivi descritti per 
 * i test strutturali ( vedi commento nel file testSuiteStrutt)
 */
