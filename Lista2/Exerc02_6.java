import java.util.Scanner;

public class Exerc02_6 {
    
    public static void main (String []args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor total das suas vendas esse mês.");
        double vt = sc.nextDouble();
        
        if(vt<=2000){
            System.out.println("Sua comissão é de: "+(0.05*vt)+" R$.");
        }else{
            
            if((vt>2000) && (vt<=8000)){
                System.out.println("Sua comissão é de: "+(0.06*vt)+" R$.");
            }else{
                
                System.out.println("Sua comissão é de: "+(0.08*vt)+" R$.");
            }
        }
    }
}
