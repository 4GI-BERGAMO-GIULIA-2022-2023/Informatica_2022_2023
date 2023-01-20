/**
 * Aggiungi qui una descrizione della classe FrigoriferoTest
 * 
 * @author bergamo giulia 
 * @version 001
 */
public class FrigoriferoTest
{
    public static void main(String[] args){
        Frigorifero frigo = new Frigorifero();
        Frigorifero frigob = new Frigorifero("samsung", "RB29", 65, 65, 150.0, true, 35, 7, 3);
        
        System.out.println(frigo.toString());
        System.out.println(frigob.toString());
    }
}