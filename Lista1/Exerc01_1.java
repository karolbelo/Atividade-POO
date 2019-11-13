import java.util.Scanner;
public class q1 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        
        int soma;
        
        System.out.println("Digite o primeiro numero");
        a = sc.nextInt();
        
        System.out.println("Digite o segundo numero");
        b = sc.nextInt();
        
        System.out.println("Digite o terceiro numero");
        c = sc.nextInt();
        
        soma= a+b+c;
        
        System.out.println("A soma é \n" + soma);
    }
}
