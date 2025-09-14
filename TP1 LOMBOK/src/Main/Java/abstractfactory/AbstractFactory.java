package Main.Java.abstractfactory;

public abstract class AbstractFactory {

    // Metodos para crear la familia de objetos
    public abstract InterfazUI crearUI();
    public abstract MetodoEnvio crearEnvio();
}