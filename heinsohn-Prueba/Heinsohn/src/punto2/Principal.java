package punto2;

import java.util.Scanner;

public class Principal {
    //punto 2
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Digite primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Digite segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Digite tercer numero: ");
        n3 = sc.nextInt();

        Integer[] Nnumeros = { n1, n2, n3 };
        NumeroMayor nm = new NumeroMayor();
        System.out.println("el mas alto "+ nm.numeroMasAlto(Nnumeros));
    }

}
