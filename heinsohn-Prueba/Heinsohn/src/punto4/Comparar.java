package punto4;

public class Comparar {

    public String comparar (String nombre, String extraer) {
        int inicio = nombre.indexOf("s");
        int fin = nombre.indexOf("h");
        return nombre.substring(inicio, fin + 1);
    }
}
