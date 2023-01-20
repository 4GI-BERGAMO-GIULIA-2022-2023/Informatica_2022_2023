
/**
 * Aggiungi qui una descrizione della classe FrigoriferoTest
 * 
 * @author bergamo giulia
 * @version 004
 */
public class FrigoriferoTest
{
    public static void main(String[] args){
        Frigorifero frigo = new Frigorifero();
        Frigorifero frigob = new Frigorifero("samsung", "RB29", 65, 65, 150.0, true, 35, 7, 3);
        
        frigo.setPrezzo(150.7);
        frigob.setConsumoKWat(35);
        
        System.out.println(frigo.getPrezzo());
        System.out.println(frigob.getModello());
        
        frigo.spegni();
        frigob.accendi();
        
        System.out.println(frigo.toString());
        System.out.println(frigob.toString());
    }
}
