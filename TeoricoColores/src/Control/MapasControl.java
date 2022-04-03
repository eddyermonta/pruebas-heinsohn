package Control;

import java.util.Map;

public class MapasControl {

    /**
     * Llenar los datos del mapa
     * @param mapaColores
     * @return
     */
    public Map CargarMapa(Map<Integer,String> mapaColores ){
            if(mapaColores.isEmpty()){
                mapaColores.put(5,"Verde");
                mapaColores.put(8,"Rojo");
                mapaColores.put(3,"Amarillo");
                mapaColores.put(4,"Gris");
                mapaColores.put(1,"Blanco");
            }
        return  mapaColores;
    }

    /**
     * Buscar color en el mapa
     * @param mapa
     * @param codigoBuscado
     */
    public void BuscarMapa(Map<Integer,String> mapa,String codigoBuscado){

        mapa.forEach((indice,color) -> {
            String mensaje = "no existe";
            if(color.equals(codigoBuscado)){
                mensaje = "encontrado "+ indice+ " "+ color;
                System.out.print(mensaje);
            }
        });

    }
}
