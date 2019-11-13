import java.util.Scanner;
public class Exerc02_4 {
    
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite sua altura.");
        double alt = sc.nextDouble();
        
        System.out.println("Digite seu peso.");
        double peso = sc.nextDouble();
        
        System.out.println("Se você for homem digite -1- e se for mulher digite -2-");
        int h = sc.nextInt();
        double imc = (peso/(alt*alt));
            if (h == 1){
                if ((imc < 20.7)){
                    System.out.println("Você está abaixo do peso ideal.");
            }else{
                    if((imc >= 20.7)&&(imc <=26.4)){
                        System.out.println("Você está com o peso ideal (Blindão)");
                }else{
                    if((imc >26.4)&& (imc <=27.8)){
                        System.out.println("Você está acima do peso ideal.");
                    }else{
                        if((imc>27.8)&&(imc<31.1)){
                            System.out.println("Você está acima do peso.");
                        }else{
                        System.out.println("Você está obeso.");
                        }
                }
            }
        }
        }else{
            if ((imc < 19.1)){
                    System.out.println("Você está abaixo do peso ideal.");
            }else{
                    if((imc >= 19.1)&&(imc <=25.8)){
                        System.out.println("Você está com o peso ideal (Blindão)");
                }else{
                    if((imc >25.8)&& (imc <=27.3)){
                        System.out.println("Você está acima do peso ideal.");
                    }else{
                        if((imc>27.3)&&(imc<32.3)){
                            System.out.println("Você está acima do peso.");
                        }else{
                        System.out.println("Você está obeso.");
                        }
                }
            }
        }
        }
    }
}
