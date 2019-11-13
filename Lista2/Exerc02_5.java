import java.util.Scanner;

public class Exerc02_5 {
    
    public static void main (String []args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um lado do tirângulo.");
        int l1 = sc.nextInt();
        
        System.out.println("Digite o outro lado do triângulo.");
        int l2 = sc.nextInt();
        
        System.out.println("Digite o último lado do triângulo.");
        int l3 = sc.nextInt();
        
        if((l1+l2)>l3 && (l2+l3)>l1 && (l1+l3)>l2){
            
        System.out.println("Os números inseridos podem ser lados de um triângulo.");
        }else{
            
            System.out.println("Os números inseridos não podem ser lados de triângulo.");
        }
    }
}
