import Model.HodeiMekanikaria;
import Model.MekanikariaException;
import Model.Base.IMekanikariak;

public class Main {
    public static void main(String[] args) throws Exception {
        IMekanikariak mekanikaria = new HodeiMekanikaria();

        try {
            mekanikaria.autoaKonpondu();
        } catch (MekanikariaException e) {
            System.out.println("Arazo bat egon da: "+e.getMessage());
        }

        System.out.println("Prezioa:" + mekanikaria.kobratu());
        mekanikaria.biharEtorri();
    }
}
