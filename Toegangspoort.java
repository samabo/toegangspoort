package toegang;


public class Toegangspoort {

	public static void main(String[] args) {
		Mens mens = new Mens();
		mens.naam = "Piet";
		mens.pasje = new Pasje(false);
		Mens mens2 = new Mens();
		mens2.naam = "Henk";
		mens2.pasje = new Pasje (true);
		
		Toegangspoort tp = new Toegangspoort();
		
		
		tp.toegangGeven(mens);
		tp.toegangGeven(mens2);
		
		
			
	}
	
	void toegangGeven(Mens mens) {
		if (pasje.geblokkeerd == true) {
			System.out.println("Uw pas is geblokkeerd. De beveiliger komt eraan.");
			Beveiliger beveiliger = new Beveiliger();
			beveiliger.pasjeUitgeven();			
		}else {
			System.out.println("Welkom, "+ mens.naam + ". Het poortje gaat voor u open.");
		}
	}

}
