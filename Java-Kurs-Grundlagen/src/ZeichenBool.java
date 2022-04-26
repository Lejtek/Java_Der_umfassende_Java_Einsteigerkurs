
public class ZeichenBool {

    public static void main(String[] args) {
        
        char varZeichen = '\u00A9';
        System.out.println("Das Bild unterliegt dem " + varZeichen + "2022");
        
        // true = wahr false = unwahr
        boolean userKlick = false;
        
        if (userKlick)
            System.out.println("User hat geklickt!");
        else
            System.out.println("User hat nicht geklickt!");
        
    }
    
}
