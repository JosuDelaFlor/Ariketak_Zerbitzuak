public class Batuketa {
    public static void main(String[] args) throws Exception {
        int a = 0, b = 0;
	
		try {
		   a = Integer.parseInt(args[0]);
		   b = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException e)
		{
		   e.printStackTrace();
		}	
		int batura = a + b;	
		System.out.println("Batura: " + a + " + " + b + " = " + batura);
	
		throw new Exception("Hau nahita botatako errore bat da");
	}
}
