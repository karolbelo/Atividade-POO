import java.util.Scanner;

public class Exerc02_1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o primeiro número");
        double num = in.nextDouble();
        
        System.out.println("Digite o segundo  número");
        double num1 = in.nextDouble();
        
        System.out.println("Digite o terceiro número");
        double num2 = in.nextDouble();
        
        System.out.println("Digite o quarto número");
        double num3 = in.nextDouble();
        
        System.out.println("Digite o quinto número");
        double num4 = in.nextDouble();
        
        double media = (num+num1+num2+num3+num4)/5;
        
        System.out.println("A média aritmética dos valores é: " + media );
                }
}