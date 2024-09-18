package Model;

import java.util.Date;

@SuppressWarnings("unused")
public class SalbuespenaException extends Exception {
	
	// Propietate pribatuak
	private String erroreLaburra;
	private String erroreGaratua;
	private Date erroreData;
	
	// Sortzaileak
	public SalbuespenaException()
	{
		super("SalbuespenaException");
		this.erroreLaburra = "Salbuespen Laburra";
		this.erroreGaratua = "Salbuespen Garatua";
		this.erroreData = new Date();	
	}
	
	public SalbuespenaException(String erroreLaburra, String erroreGaratua)
	{
		super(erroreLaburra);
		this.erroreLaburra = erroreLaburra;
		this.erroreGaratua = erroreGaratua;
		this.erroreData = new Date();	
	}
	
	
	public void setErroreLaburra(String erroreLaburra)
	{
		this.erroreLaburra = erroreLaburra;
	}
	
	public void setErroreGaratua(String erroreGaratua)
	{
		this.erroreGaratua = erroreGaratua;
	}
	
	@Override
	public String toString()
	{
		return erroreGaratua; // Erakutsi errore laburra + gaurko data		
	}
	

}
