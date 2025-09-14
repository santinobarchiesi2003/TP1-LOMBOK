package Main.Java.abstractfactory;

// factory o fabrica para Usuario comun
import lombok.Data;

@Data

public class UsuarioFactory extends AbstractFactory {

    @Override
    public InterfazUI crearUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioNormal();
    }
}