package estudo_testezin;

import java.util.Scanner;

public class primo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int primo=0, i, n, i3;
        
        System.out.println("Digite um numero");
        n = ler.nextInt();
        for(i=1;i<=n;i++) {
            if(n%i==0) {
                primo++;
            }
        }
        if(primo==2) {
            System.out.println("Esse numero e primo");
        }else {
            System.out.println("Esse numero nao e primo");
        }
    }

}
