import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,v=1;
        System.out.println("Escriba un numero entero positivo");
        num=entrada.nextInt();
        if(num<1)
            System.out.println("La paras kagando csm");
        else if(num==1)
            System.out.println("Su numero es "+num);
        else
        {
            System.out.println("Lista de numeros");
            while (v<=num){
                System.out.println(v);
                v++;
            }
        }
    }
}
