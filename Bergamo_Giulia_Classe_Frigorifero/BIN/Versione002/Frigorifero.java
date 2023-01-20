
/**
 * Aggiungi qui una descrizione della classe Frigorifero
 * 
 * @author bergamo giulia 
 * @version 002
 */
public class Frigorifero{
    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFrizer;
    private double prezzo;
    private boolean acceso;
    private int consumokwat;
    private int temperaturaFrigo;
    private int temperaturaFrizer;
    public String out;
    public Frigorifero(){
            marca = "indefinito";
            modello = "indefinito";
            litriFrigo = 0;
            litriFrizer = 0;
            prezzo = 0.0;
            acceso = false;
            consumokwat = 0;
            temperaturaFrigo = 0;
            temperaturaFrizer = 0;
    }
    public Frigorifero(String mar, String mod, int lFrig, int lFriz, double pz, boolean a, int cw, int tempFrig, int tempFriz){
            if(mar != null){
                marca = mar;
            }else{
                marca = "indefinito";
            }
            if(mod != null){
                modello = mod;
            }else{
                modello = "indefinito";
            }
            if(lFrig >= 0){
                litriFrigo = lFrig;
            }else{
                litriFrigo = 0;
            }
            if(lFriz >= 0){
                litriFrizer = lFriz;
            }else{
                litriFrizer = 0;
            }
            if(pz >= 0.0){
                prezzo = pz;
            }else{
                prezzo = 0.0;
            }
            if(a == true){
                acceso = true;
            }else{
                acceso = false;
            }
            if(cw >= 0){
                consumokwat = cw;
            }else{
                consumokwat = 0;
            }
            if(tempFrig >= 0){
                temperaturaFrigo = tempFrig;
            }else{
                temperaturaFrigo = 0;
            }
            if(tempFriz >= 0){
                temperaturaFrizer = tempFriz;
            }else{
                temperaturaFrizer = 0;
            }
    }public void setMarca(String mar){
        if(mar != null){
                marca = mar;
            }else{
                marca = "indefinito";
            }
    }
    public void setModello(String mod){
        if(mod != null){
                modello = mod;
            }else{
                modello = "indefinito";
            }
    }
    public void setLitriFrigo(int lFrig){
        if(lFrig >= 0){
                litriFrigo = lFrig;
            }else{
                litriFrigo = 0;
            }
    }
    public void setLitriFrizer(int lFriz){
        if(lFriz >= 0){
                litriFrizer = lFriz;
            }else{
                litriFrizer = 0;
            }
    }
    public void setPrezzo(double pz){
        if(pz >= 0.0){
                prezzo = pz;
            }else{
                prezzo = 0.0;
            }
    }
    public void setConsumoKWat(int cw){
        if(cw >= 0){
                consumokwat = cw;
            }else{
                consumokwat = 0;
            }
    }
    public void setTemperaturaFrigo(int tempFrig){
        if(tempFrig >= 0){
                temperaturaFrigo = tempFrig;
            }else{
                temperaturaFrigo = 0;
            }
    }
    public void setTemperaturaFrizer(int tempFriz){
        if(tempFriz >= 0){
                temperaturaFrizer = tempFriz;
            }else{
                temperaturaFrizer = 0;
            }
    }
    public String toString(){
        if(acceso){
            out = "";
            out += "la marca é: " + this.marca + ", il modello é: " + this.modello + ", i litri del Frigo sono: " + litriFrigo + ", i litri del Frizer sono: " + litriFrizer + ", il prezzo è: " + this.prezzo + ", il consumo in KW è: " + this.consumokwat + ", la temperatura del frigo è: " + temperaturaFrigo + ", la temperatura del Frizer è: " + temperaturaFrizer;
        }else{
            out = "";
            out += "la marca è: " + this.marca + ", il modello è" + this.modello + ", i litri del Frigo sono: " + litriFrigo + ", i litri del Frizer sono: " + litriFrizer + ", il prezzo: " + this.prezzo;
        }
        return out;
    }
}
