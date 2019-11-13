
import java.util.Scanner;

public class q5 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Digite um valor que contenha 5 digitos");
        
        String valor = sc.next();
        
        for(int i = 0; i<5; i++){
            
        System.out.print( valor.charAt(i) + " ");
    }
    
}
}
