package Model;

public class Hegaztia extends Animalia {
	// Hegaztien propietateak
	private int bizi_latitudea;
	private String kolorea;
	
	// Metodo publikoak
	public int getBizi_latitudea() {
		return bizi_latitudea;
	}
	public void setBizi_latitudea(int bizi_latitudea) {
		this.bizi_latitudea = bizi_latitudea;
	}
	public String getKolorea() {
		return kolorea;
	}
	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}
	
	public void heganEgin()
	{
		System.out.println(this.getIzena() + " HEGAZTIA naiz eta HEGAZ ari naiz.");
	}
	
	@Override
	public void zarataAtera()
	{
		// Animalia bakoitzak bere zarata egingo du.
		System.out.println(this.getIzena() + ": PIO PIO!!");
	}
	
	@Override
	public void mugitu()
	{
		super.mugitu();
		System.out.println("Hegaz ari naiz!");
	}
	

}
