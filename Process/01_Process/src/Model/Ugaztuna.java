package Model;

public class Ugaztuna extends Animalia {

	// Propietate privatuak
	private int titikopurua;
	private int tenperatura;
	
	// Metodo publikoak
	public int getTitikopurua() {
		return titikopurua;
	}
	public void setTitikopurua(int titikopurua) {
		this.titikopurua = titikopurua;
	}
	public int getTenperatura() {
		return tenperatura;
	}
	public void setTenperatura(int tenperatura) {
		this.tenperatura = tenperatura;
	}
	
	public void korrikaEgin()
	{
		System.out.println(this.getIzena() + " UGAZTUNA naiz eta KORRIKA ari naiz.");
	}
	
	@Override
	public void zarataAtera()
	{
		// Animalia bakoitzak bere zarata egingo du.
		System.out.println(this.getIzena() + ": ZAUNK MUU BEEE!!");
	}
	
	@Override
	public void mugitu()
	{
		super.mugitu();
		korrikaEgin();
	}
	
	public void puzkarraBota(int zkia) throws SalbuespenaException
	{
		if (zkia >= 10)
		{
			throw new SalbuespenaException(this.getIzena() +": 10 puzker gehienez!", this.getIzena() + " naiz baina ezin ditut 10 puzker baino gehiago bota");
		}
		else
		{
			for (int i=0; i<zkia; i++)
			{
				System.out.println(this.getIzena() + ": PRUT PRUT TUET!");
			}
		}	
	}
	
	
}
