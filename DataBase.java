package atm;

import java.util.HashMap;

public class DataBase {
private HashMap<Long, Account> dataSet = new HashMap<Long, Account>();
	public HashMap<Long, Account> createDataSet() {
		dataSet.put(111111111L, new Account("Filan1", "Fisteku1", 1234, 0));
		dataSet.put(222222222L, new Account("Filan2", "Fisteku2", 1234, 0));
		dataSet.put(333333333L, new Account("Filan3", "Fisteku3", 1234, 0));
		dataSet.put(444444444L, new Account("Filan4", "Fisteku4", 1234, 0));
		dataSet.put(555555555L, new Account("Filan5", "Fisteku5", 1234, 0));
		dataSet.put(666666666L, new Account("Filan6", "Fisteku6", 1234, 0));
		dataSet.put(777777777L, new Account("Filan7", "Fisteku7", 1234, 0));
		dataSet.put(888888888L, new Account("Filan8", "Fisteku8", 1234, 0));
		dataSet.put(999999999L, new Account("Filan9", "Fisteku9", 1234, 0));
		dataSet.put(1010101010L, new Account("Filan10", "Fisteku10", 1234, 0));
		dataSet.put(1111111111L, new Account("Filan11", "Fisteku11", 1234, 0));
		dataSet.put(1212121212L, new Account("Filan12", "Fisteku12", 1234, 0));
		dataSet.put(1313131313L, new Account("Filan13", "Fisteku13", 1234, 0));
		dataSet.put(1414141414L, new Account("Filan14", "Fisteku14", 1234, 0));
		dataSet.put(1515151515L, new Account("Filan15", "Fisteku15", 1234, 0));
		dataSet.put(1616161616L, new Account("Filan16", "Fisteku16", 1234, 0));
		return dataSet;
	}
}
