package edu.retazce;

public class TesterHesiel {

	public static void main(String[] args) {

		boolean hodnota = testHesla("MojeMocneHeslo123");//true

	}

	/**
	 * Metoda testuje silu hesla
	 * Heslo je silne ak:
	 *  - ma dlzku min. 10 znakov
	 *  - obsahuje iba cisla a znaky
	 *  - obsahuje aspon 2 cisla
	 * MojeMocneHeslo123 -> true
	 * sdhf -> false
	 * asdfretrertrersdf1 -> false
	 * ljhalshdliihsodihi4563+++ -> false
	 * @param string
	 * @return
	 */
	static boolean testHesla(String string) {
		// TODO 
		return false;
	}

}
