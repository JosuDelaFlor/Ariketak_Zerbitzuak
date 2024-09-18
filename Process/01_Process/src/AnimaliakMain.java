import Model.*;
import java.util.ArrayList;

public class AnimaliakMain {

	public static void main(String[] args) {
		System.out.println("AnimaliakMain martxan.");
		
		Animalia animalia1 = new Animalia();
		animalia1.setIzena("Karramarroa");
		animalia1.setAltuera(1);
		animalia1.setPisua(2);
		animalia1.setZabalera(1);
		
		animalia1.mugitu();
		animalia1.zarataAtera();
		
		System.out.println("---------------------------");
		Animalia animalia2 = new Hegaztia();
		animalia2.setIzena("Txantxangorria");
		animalia2.setAltuera(1);
		animalia2.setPisua(2);
		animalia2.setZabalera(1);
		
		animalia2.mugitu(); 		// Hegaztian deklaratutako metodoari deitzen dio
		animalia2.zarataAtera();	// Hegaztian deklaratutako metodoari deitzen dio
		
		//animalia2.heganEgin(); 	// Ez dit uzten, Animalia moduan DEKLARATU dudalako
		((Hegaztia)animalia2).heganEgin();
		
		System.out.println("---------------------------");
		Hegaztia txoria1 = new Hegaztia();
		txoria1.setIzena("Usoa");
		txoria1.setAltuera(1);
		txoria1.setPisua(2);
		txoria1.setZabalera(1);
		
		txoria1.mugitu();			// Hegaztian deklaratutako metodoari deitzen dio
		txoria1.zarataAtera();		// Hegaztian deklaratutako metodoari deitzen dio
		txoria1.heganEgin();		// Uzten dit, Hegaztia moduan DEKLARATU dugulako
		//Animalia animalia4 = txoria1;
	
		
		System.out.println("---------------------------");
		Animalia animalia3 = new Ugaztuna();
		animalia3.setIzena("Txakurra");
		animalia3.setAltuera(1);
		animalia3.setPisua(2);
		animalia3.setZabalera(1);
		
		animalia3.mugitu(); 		// Ugaztuna-n deklaratutako metodoari deitzen dio
		animalia3.zarataAtera();
		//((Ugaztuna)animalia3).korrikaEgin();
		
		System.out.println("---------------------------");
		Saguzaharra saguzaharra1 = new Saguzaharra();
		saguzaharra1.setIzena("Manolo");
		IHegalaria ihegalaria1 = saguzaharra1;
		ihegalaria1.heganEgin();
		ihegalaria1.lurreratu(22, 8);
		
		System.out.println("---------------------------");
		Doraemon d1 = new Doraemon();
		ihegalaria1 = d1;
		ihegalaria1.heganEgin();
		ihegalaria1.lurreratu(22, 8);
		
		// Salbuespenak
		System.out.println("---------------------------");
		Saguzaharra saguzaharra2 = new Saguzaharra();
		saguzaharra2.setIzena("Rodolfo");
		try {
			saguzaharra2.puzkarraBota(20);
		} catch (SalbuespenaException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			saguzaharra2.heganEgin();
		}
		
		
		// Kolekzioak / Zerrendak
		System.out.println("---------------------------");
		ArrayList<Animalia> az = new ArrayList<Animalia>(); // az = animalia_zerrenda
		//Animalia[] az2 = new Animalia[10];
		//az2[0] = animalia1;
		
		
		az.add(animalia1);
		az.add(animalia2);
		az.add(txoria1);
		az.add(animalia3);
		az.add(saguzaharra1);
		az.add(saguzaharra2);
		az.add(animalia1);
		
		for (int i=0; i<az.size(); i++)
		{
			az.get(i).mugitu();
		}
	}
}
