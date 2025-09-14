package Main.Java.factory;

import lombok.Data;

@Data

public class LogisticaLibro {

    // Metodo fabrica-factory
    public static Libro crearLibro(String tipo, String titulo) {
        return switch (tipo.toLowerCase()) {
            case "fisico" -> new LibroFisico(titulo);
            case "digital" -> new LibroDigital(titulo);
            default -> throw new IllegalArgumentException("Tipo de libro desconocido: " + tipo);
        };
    }
}