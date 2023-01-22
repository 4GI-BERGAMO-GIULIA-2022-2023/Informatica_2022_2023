
/**
 * Aggiungi qui una descrizione della classe LavatriceText
 * 
 * @author Giulia Bergamo 
 * @version 003
 */
import java.util.*;
public class LavatriceText{
    public static void main(String args []){
       Lavatrice l= new Lavatrice();
        
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
