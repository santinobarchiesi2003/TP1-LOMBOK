package Main.Java.abstractfactory;

// Fabrica para Admin
import lombok.Data;

@Data

public class AdminFactory extends AbstractFactory {

    @Override
    public InterfazUI crearUI() {
        return new AdminUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioExpress(); // Admin usa envío express
    }
}