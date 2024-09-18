package Model;

public class Saguzaharra extends Ugaztuna implements IHegalaria {

	@Override
	public void mugitu()
	{
		System.out.println("Saguzaharra naiz eta odola aterako dizut!");
	}
	
	@Override
	public void heganEgin()
	{
		System.out.println(this.getIzena() + " SAGUZAHARRA naiz eta HEGAZ ari naiz.");
	}
	
	@Override
	public void lurreratu(long longitud, long latitud)
	{
		System.out.println(this.getIzena() + " SAGUZAHARRA naiz eta LONGTITUDEA:" + longitud + ", LATITUDEA: " + latitud + " koordenatuetan lurreratu naiz");
	}
}
