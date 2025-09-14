package Main.Java.abstractfactory;

// UI para usuarios comunes
import lombok.Data;

@Data

public class UsuarioUI implements InterfazUI {
    @Override
    public void mostrar() {
        System.out.println("Mostrando interfaz de Usuario");
    }
}