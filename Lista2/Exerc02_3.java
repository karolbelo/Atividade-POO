import java.util.Scanner;

public class Exerc02_3 {
    
    
    public static void main (String [] args) {
        
        
    Scanner in = new Scanner (System.in);
    
        System.out.println("Digite o número do seu peso:");
        double peso = in.nextDouble();
        
        System.out.println("Digite sua altura em metros (ex. 1,70):");
        double altura = in.nextDouble();
        
        double imc = peso/(altura*altura);
        System.out.println("Seu IMC :");
        
        System.out.println(imc);
        if (imc < 18.5) {
        System.out.println("Você está abaixo do peso ideal.");
        }
        if ((imc >= 18.5 ) && (imc < 25)) {
        System.out.println("Você está no peso ideal.");
        }
        if ((imc >= 25 ) && (imc <= 30)) {
        System.out.println("Você está acima do peso.");
        if (imc > 30) {
            
        System.out.println("Você está obeso.");
        }
       
         }
    }    
}