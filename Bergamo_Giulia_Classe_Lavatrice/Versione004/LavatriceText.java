
/**
 * Aggiungi qui una descrizione della classe LavatriceText
 * 
 * @author Giulia Bergamo 
 * @version 004
 */
import java.util.*;
public class LavatriceText{
    public static void main(String args []){
       Lavatrice l= new Lavatrice();
       Lavatrice l1= new Lavatrice("bosch","0841",230.3,2,4,9,7,true,28.7); // non mi fa fare il costruttore di copia  
       l.setKg(3);
       l.setTemperatura(40);
       l.setAcceso(true);
       l.setTempo(1.30);
       l.getModello();
       l.getProgramma();
       l.getPrezzo();
       l.toString();
       
    }
}
