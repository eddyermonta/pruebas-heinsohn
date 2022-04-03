package punto3;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {
    public  String ObtenerOrden(int[] numbers) {

        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        ArrayList<Integer> resulto = new ArrayList<Integer>();

        for (int i : numbers) {
            if (i % 2 == 0)  pares.add(i);
             else impares.add(i);
        }

        Collections.sort(pares);
        Collections.sort(impares);
        resulto.addAll(pares);
        resulto.addAll(impares);

        return resulto.toString();
    }
}
