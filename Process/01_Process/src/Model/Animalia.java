package Model;

public class Animalia {
	
	// Propietate pribatuak
	private String izena; // Animaliaren izena
	private int pisua;	// Pisua Kg-tan
	private int altuera;	// Altuera metrotan
	private int zabalera;	// Zabalera metrotan
	
	// Metodo publikoak
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getPisua() {
		return pisua;
	}
	public void setPisua(int pisua) {
		this.pisua = pisua;
	}
	public int getAltuera() {
		return altuera;
	}
	public void setAltuera(int altuera) {
		this.altuera = altuera;
	}
	public int getZabalera() {
		return zabalera;
	}
	public void setZabalera(int zabalera) {
		this.zabalera = zabalera;
	}
	
	public void zarataAtera()
	{
		// Animalia bakoitzak bere zarata egingo du.
		System.out.println(this.izena + ": Waka waka!");
	}
	
	public void mugitu()
	{
		// Bakoitza bere erara
		System.out.println(this.izena + " animalia naiz eta mugitzen ari naiz.");
	}

}
