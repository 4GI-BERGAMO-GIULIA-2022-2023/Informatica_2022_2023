
/**
 * Aggiungi qui una descrizione della classe Televisore
 * 
 * @author Giulia Bergamo 
 * @version 001
 */
public class Televisore{
   private int pollici;
   private String schermo;
   private String colore;
   private int canale;
   private int volume;
   private int luminos;
   private boolean acceso;
   public Televisore(){
       this.pollici=0;
       this.schermo="anonimo";
       this.colore="anonimo";
       this.canale=0;
       this.volume=0;
       this.luminos=0;
       this.acceso=false;
  }public Televisore(int p, String s, String col, int can, int v, int lum, boolean a){
           if(p>0){
               this.pollici=p;
           }else{
               this.pollici=0;
           }
           if(s!=null){
              this.schermo=s; 
           }else{
              this.schermo="anonimo";
           }
           if(col!=null){
               this.colore=col;
           }else{
               this.colore="anonimo";
           }
           if(can>0){
               this.canale=can;
           }else{
               this.canale=0;
           }
           if(v>0){
               this.volume=v;
           }else{
               this.volume=0;
           }
           if(lum>0){
               this.luminos=lum;
           }else{
               this.luminos=0;
           }
  }
  public String toString(){
        String out="";
        out+=" i pollici sono : '"+this.pollici;
        out+="lo schermo è : "+this.schermo;
        out+=", il colore è : "+this.colore;
        System.out.println();
        out+=", il canale è : "+this.canale;  
        out+=", il volume impostato : "+this.volume;
        out+=", la luminosità   : "+this.luminos;
        return out;
    }
}