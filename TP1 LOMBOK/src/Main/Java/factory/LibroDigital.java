package Main.Java.factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LibroDigital implements Libro {

    private String titulo;

    @Override
    public String getTipo() {
        return "Digital";
    }
}
