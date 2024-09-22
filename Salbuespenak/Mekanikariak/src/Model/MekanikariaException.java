package Model;

import java.util.Date;

public class MekanikariaException extends Exception {
    private String erroreLaburra, erroreGaratua;
    private Date erroreData;

    public MekanikariaException(String erroreLaburra, String erroreGaratua) {
        super(erroreLaburra);
        this.erroreLaburra = erroreLaburra;
        this.erroreGaratua = erroreGaratua;
        this.erroreData = new Date();
    }

    public String getErroreLaburra() {
        return erroreLaburra;
    }

    public String getErroreGaratua() {
        return erroreGaratua;
    }

    public Date getErroreData() {
        return erroreData;
    }

    @Override
    public String toString() {
        return "MekanikariaException [erroreLaburra=" + erroreLaburra + ", erroreGaratua=" + erroreGaratua
                + ", erroreData=" + erroreData + "]";
    }
}


