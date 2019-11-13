
import java.util.Scanner;

public class q6{ 
    
public static void main (String [] args){
Scanner sc = new Scanner (System.in);

  int d = 0;
  int x1 = 0;
  int x2 = 0;

    System.out.print ("Digite o valor de a");
    int a = sc.nextInt();

    System.out.print ("Digite o valor de b");
    int b = sc.nextInt();

    System.out.print ("Digite o valor de c");
    int c = sc.nextInt();

d = (b*b - 4*a*c);

    if (d<0){
    
    System.out.println ("Está equação não possui Raizes Reais ");
} else{
    
    x1 = (int) (-b + Math.sqrt(d))/(2*a);
    x2 = (int) (-b - Math.sqrt(d))/(2*a);
    
        System.out.print ("x1" + "=" + x1);
        System.out.print ("x1" + "=" + x2);

    System.out.println ("Os valores possuem valores Reais");
}

}
}