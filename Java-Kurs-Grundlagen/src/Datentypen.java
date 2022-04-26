/**
 * 
 * @author marco
 *
 */
public class Datentypen {

    public static void main(String[] args) {
        
        // 8 primitive Datentypen
        byte byteVar = 127;	            // 1 Byte:  -          128    ...           127
        short shortVar = 32767;	        // 2 Bytes: -       32.768    ...        32.767
        
        int intVar = 2;	                // 4 Bytes: -2.147.483.648    ... 2.147.483.647 
        long longVar = 20000;           // 8 Bytes: -9,223.372.038E18 ... 9,223.372.038E18 (18 Trillionen)   
        
        float floatVar = 3.1415f;       // 4 Bytes
        double doubleVar = 9.81;        // 8 Bytes
        
        boolean boolVar = true;         // 1 Byte:  mit 2 Zuständen 1/0 (true/false)
        char charVar = 'A';             // 1 Byte:  -          128    ...           127
        
        System.out.println("Byte:  : " + byteVar);
        System.out.println("Short  : " + shortVar);
        
        System.out.println("Integer: " + intVar);
        System.out.println("Long   : " + longVar);
        
        System.out.println("Float  : " + floatVar);
        System.out.println("Double : " + doubleVar);
        
        System.out.println("Bool   : " + boolVar);
        System.out.println("Char   : " + charVar);
        
    }

}
