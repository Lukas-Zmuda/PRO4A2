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
		String specialCharacters=" !#$€%&'()*+,-./:;<=>?@[]^_`{|}~";
		String numericCharacters="0123456789";
		String characters[]=string.split("");
		int numbers=0;
		boolean special=false;
		for (int i=0;i<characters.length;i++)
		{
			if (numericCharacters.contains(characters[i]))
			{
				numbers++;	
			}
			if (specialCharacters.contains(characters[i]))
			{
				special=true;
		    }
		}
		return string.length() >= 10 && numbers>=2 && special==false;
	}

}
