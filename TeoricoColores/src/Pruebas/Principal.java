package Pruebas;

import Control.MapasControl;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Map mapaColores = new HashMap<Integer,String>();
        MapasControl mp = new MapasControl();
        mp.CargarMapa(mapaColores);
        mp.BuscarMapa(mapaColores,"Rojo");
    }
}
