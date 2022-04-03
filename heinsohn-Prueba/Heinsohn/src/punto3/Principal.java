package punto3;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = { 15, 7, 2, 1, 5, 9, 8, 7, 24, 50 };
        OrdenarLista or = new OrdenarLista();
        System.out.println("ordenado "+or.ObtenerOrden(numeros));
    }


}
