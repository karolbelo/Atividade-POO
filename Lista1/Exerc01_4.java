
import java.util.Scanner;

public class q4{
    public static void main (String [] args){   
        
Scanner sc = new Scanner (System.in);

System.out.println ("Digite um número"); 

  int valor = 0;

   valor = sc.nextInt();
   
   System.out.println("Tabuada de soma");
for (int i =1; i<=10; i++){
    
    System.out.println (valor + "+" + i + "=" + (valor+i));
}
    System.out.println("Tabuada de subtração");    
    for (int i =1; i<=10; i++){
    System.out.println (valor + "-" + i + "=" + (valor-i));
    }
    System.out.println("Tabuada de multiplicação");   

    for (int i =1; i<=10; i++){
    System.out.println (valor + "x" + i + "=" + (valor*i));
    }
    System.out.println("Tabuada de Divisão");  

    for (int i =1; i<=10; i++){
    System.out.println (valor + "/" + i + "=" + (valor/i));
    
}
    }
}