import java.util.Scanner;

public class q2 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int v1 = sc.nextInt();
        
         System.out.println("Digite o segundo valor");
        int v2 = sc.nextInt();
        
         System.out.println("Digite o terceiro valor");
        int v3 = sc.nextInt();
        
        int soma = v1 +v2;
        
        int soma1 = v2 +v3;
        
        int somageral = soma + soma1;
        
        System.out.println(somageral);
        
                
    }
}