package com.heinsohn.punto1;

import java.util.ArrayList;

public class lista {
    public lista(){

    }
    public int getRandom() {
        return (Math.random() < 0.5) ? 1:0;
    }

    public ArrayList<Integer> Agregarlista(){
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            lista.add(getRandom());
        }
        return lista;
    }
}
