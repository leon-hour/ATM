package atm;

import java.util.HashMap;

public class DataBase {
private HashMap<Long, Account> dataSet = new HashMap<Long, Account>();
	public HashMap<Long, Account> createDataSet() {
		dataSet.put(11111111111110L, new Account("Filan1", "Fisteku1", 1234, 0));
		dataSet.put(22222222222222L, new Account("Filan2", "Fisteku2", 1234, 0));
		dataSet.put(33333333333333L, new Account("Filan3", "Fisteku3", 1234, 0));
		dataSet.put(44444444444444L, new Account("Filan4", "Fisteku4", 1234, 0));
		dataSet.put(55555555555555L, new Account("Filan5", "Fisteku5", 1234, 0));
		dataSet.put(66666666666666L, new Account("Filan6", "Fisteku6", 1234, 0));
		dataSet.put(77777777777777L, new Account("Filan7", "Fisteku7", 1234, 0));
		dataSet.put(88888888888888L, new Account("Filan8", "Fisteku8", 1234, 0));
		dataSet.put(99999999999999L, new Account("Filan9", "Fisteku9", 1234, 0));
		dataSet.put(10101010101010L, new Account("Filan10", "Fisteku10", 1234, 0));
		dataSet.put(11111111111111L, new Account("Filan11", "Fisteku11", 1234, 0));
		dataSet.put(12121212121212L, new Account("Filan12", "Fisteku12", 1234, 0));
		dataSet.put(13131313131313L, new Account("Filan13", "Fisteku13", 1234, 0));
		dataSet.put(14141414141414L, new Account("Filan14", "Fisteku14", 1234, 0));
		dataSet.put(15151515151515L, new Account("Filan15", "Fisteku15", 1234, 0));
		dataSet.put(16161616161616L, new Account("Filan16", "Fisteku16", 1234, 0));
		return dataSet;
	}
}
