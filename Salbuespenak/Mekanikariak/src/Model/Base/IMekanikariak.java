package Model.Base;

import Model.MekanikariaException;

public interface IMekanikariak {
    public void autoaKonpondu() throws MekanikariaException;
    public int kobratu();
    public void biharEtorri();
} 
