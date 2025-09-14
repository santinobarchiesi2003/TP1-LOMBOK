package Main.Java.abstractfactory;

// Envio normal
import lombok.Data;

@Data

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar() {
        System.out.println("Envío Normal activado");
    }
}