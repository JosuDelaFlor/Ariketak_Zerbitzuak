package Model;

import java.util.Date;

import Model.Base.IMekanikariak;

public class HodeiMekanikaria implements IMekanikariak {
    @Override
    public void autoaKonpondu() throws MekanikariaException {
        throw new MekanikariaException("Konponketa huts egin du",
            "Motodda aldatu behar da",
            new Date());
    }

    @Override
    public int kobratu() {
        return 1500;
    }

    @Override
    public void biharEtorri() {
        System.out.println("Bihar etorri, auto prest egongo da");
    }
}
