package Main.Java.abstractfactory;

// Envio express
import lombok.Data;

@Data

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar() {
        System.out.println("Envío Express activado");
    }
}