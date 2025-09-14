package Main.Java.builder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import java.time.LocalDate;

@Data
@Getter
@Builder
public class Usuario {

    // Atributos opcionales
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;

    // funcion para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("---------------------------");
    }
}