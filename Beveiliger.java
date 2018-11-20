package toegang;

public class Beveiliger extends Mens{
	Beveiliger(){
		System.out.println("Have no fear, de beveiliger is hier!");
	}
	
	void updaten(Pasje pasje){
		System.out.println("Uw pas wordt geüpdatet door het systeem. Een moment geduld alstublieft.");
	}
	Pasje pasjeUitgeven() {
		System.out.println("U krijgt een nieuwe pas. Hij zou het meteen moeten doen! Excuses voor het ongemak.");
		return new Pasje(false);
	}

}
