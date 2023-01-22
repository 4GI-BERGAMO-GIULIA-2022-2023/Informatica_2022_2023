
/**
 * Aggiungi qui una descrizione della classe TelevisoreText
 * 
 * @author Giulia Bergamo 
 * @version 002
 */

import java.util.*;
public class TelevisoreText
{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Televisore t1= new Televisore();
        t1.setPollici(50);
        t1.setCanale(2);
        System.out.println(t1.toString());
    } 
}
