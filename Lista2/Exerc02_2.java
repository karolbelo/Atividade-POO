import java.util.Scanner;

public class Exerc02_2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número");
        double num = in.nextDouble();
        
        System.out.println("Digite o segundo número");
        double num1 = in.nextDouble();
        
        System.out.println("Digite o terceiro número");
        double num2 = in.nextDouble();
        
        System.out.println("Digite o quarto número");
        double num3 = in.nextDouble();
        
        double media = (num*2+num1*3+num2*4+num3*5)/14;
        
        System.out.println("A média ponderadoé: " +  media);
        
              
        
    }
    
}