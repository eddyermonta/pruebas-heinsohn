package punto4;

public class principal {
    public static void main(String[] args) {
        String nombre = "Heinsohn";
        String extraer = "soh";

        Comparar compa = new Comparar();
        String resultado = compa.comparar(nombre,extraer);
        if(resultado.contentEquals(extraer)) System.out.println(true);
        else System.out.println(false);

    }
    }

