package Main.Java.prototype;

import Main.Java.factory.Libro;
import Main.Java.builder.Usuario;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Prestamo implements Cloneable {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // implementacion de clone
    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // funcion para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Libro: " + libro.getTipo());
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Fin: " + fechaFin);
        System.out.println("--------------------------");
    }
}