package Model;

@SuppressWarnings("unused")
public class Doraemon implements IHegalaria {
	
	// Propietate pribatuak
	private int dorajakiak;
	private String oparizerrenda;
	
	// Metodo publikoak
	// Konstruktorea / Sortzailea
	public Doraemon()
	{
		this.dorajakiak = 999;
		this.oparizerrenda = "Bla bla bla... superinventos... bla bla bla... Erraldoi... Nobita..."
;	}

	@Override
	public void heganEgin() {
		System.out.println("Doraemon naiz eta " + this.dorajakiak + " dorajaki ditut eta HEGAZ hari naiz.");
	}

	@Override
	public void lurreratu(long longitud, long latitud) {
		System.out.println("Doraemon naiz eta LONGITUD: " + longitud + ", LATITUD: " + latitud + " koordenatuetan LURRERATU naiz.");
		
	}

}
