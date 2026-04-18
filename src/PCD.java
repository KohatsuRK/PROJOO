import java.util.Observable;
//usei a que já existe no Java util

public class PCD extends Observable {
    private Double temp;
    private Double pH;
    private String PR;
    private Double ura;



    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
        setChanged();
        notifyObservers();
    }

    public Double getpH() {
        return pH;
    }

    public void setpH(Double pH) {
        this.pH = pH;
        setChanged();
        notifyObservers();
    }

    public String getPR() {
        return PR;
    }

    public void setPR(String PR) {
        this.PR = PR;
        setChanged();
        notifyObservers();
    }

    public Double getUra() {
        return ura;
    }

    public void setUra(Double ura) {
        this.ura = ura;
        setChanged();
        notifyObservers();
    }
}
