
/**
 * Aggiungi qui una descrizione della classe Lavatrice
 * 
 * @author giulia bergamo
 * @version 001
 */
public class Lavatrice{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private int kg;
    private boolean acceso;
    private double tempo;
    public Lavatrice(){
      this.marca="anonimo";
      this.modello= "anonimo";
      this.prezzo= 0.0;
      this.programma= 0;
      this.temperatura= 0;
      this.giriCentrifuga= 0;
      this.kg= 0;
      this.acceso= false;
      this.tempo= 0.0;
    }
    public Lavatrice(String marc, String mod, double prez, int prog, int t, int g, int k, boolean a, double temp){
       if(marc!=null){
        this.marca= marc;
       }else{
        this.marca= null;
       } 
       if(mod!=null){
           this.modello=mod;
       }else{
           this.modello= null;
       } 
       if(prez<0){
           this.prezzo= prez;
       }else{
           this.prezzo=0.0;
       }
       if(prog>0){
           this.programma= prog;
       }else{
           this.programma=0;
       } 
       if(t>0){
           this.temperatura= t;
       }else{
           this.temperatura= 0;
       }
       if(g>0){
           this.giriCentrifuga= g;
       }else{
           this.giriCentrifuga=0;
       }
       if(k>0){
           this.kg= k;
       }else{
           this.kg= 0;
       }
       if(a){
           this.acceso= a;
       }else{
           this.acceso= false;  
       }
       if(temp<0){
           this.tempo= temp;
       }else{
           this.tempo= 0.0;
       }
    }
    public String toString(){
        String out= "la lavatrice: ";
        out+=" di marca" +this.marca+ "/n";
        out+=" modello" +this.modello+ "/n";
        out+=" prezzo" +this.prezzo+ "/n";
        if(this.acceso){
            out+="è accesa";
        }else{
            out+="è spenta";
        }
        out+=" il programma impostato è:"+this.programma+"/n";
        out+=" la temperatura scelta è:"+this.temperatura+"/n";
        out+=" i giri della centrifuga sono:"+this.giriCentrifuga+"/n";
        out+=" i kg dei panni sono:"+this.kg+"/n";
        out+=" il programma impiegherà"+this.tempo+"ore";
        return out;
    }
}

