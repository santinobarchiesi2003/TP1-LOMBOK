import Main.Java.factory.Libro;
import Main.Java.factory.LogisticaLibro;
import Main.Java.abstractfactory.*;
import Main.Java.builder.Usuario;
import Main.Java.prototype.Prestamo;
import Main.Java.singleton.Database;

import java.time.LocalDate;

import lombok.Data;

@Data


public class Main {
    public static void main(String[] args) {

        //--------------------------  Parte 1: Singleton Database   ----------------------
        //creacion de libro, requiere de factory method
        Libro libro1 = LogisticaLibro.crearLibro("fisico", "El Principito");
        Libro libro2 = LogisticaLibro.crearLibro("digital", "1984");

        //instanciamos libros en singleton
        Database db = Database.getInstance();
        db.agregarLibro(libro1);
        db.agregarLibro(libro2);

        System.out.println("Libros en la base de datos:");
        //listamos la base de datos de los libros
        for (Libro libro : db.listarLibros()) {
            System.out.println(libro.getTipo());
        }

        //------------------------  Parte 2: Factory Method  ----------------

        System.out.println(libro1.getTipo());
        System.out.println(libro2.getTipo());

        System.out.println("------");

        //------------------------  Parte 3: Abstract Factory   ---------------------

        //creacion de admin con su respectiva interfaz y respetivo tipo de envio
        AbstractFactory adminFactory = new AdminFactory();
        InterfazUI adminUI = adminFactory.crearUI();
        MetodoEnvio adminEnvio = adminFactory.crearEnvio();

        adminUI.mostrar();
        adminEnvio.enviar();

        System.out.println("------");

        //creacion de usuario con su respectiva interfaz y respectivo tipo de envio
        AbstractFactory usuarioFactory = new UsuarioFactory();
        InterfazUI usuarioUI = usuarioFactory.crearUI();
        MetodoEnvio usuarioEnvio = usuarioFactory.crearEnvio();

        usuarioUI.mostrar();
        usuarioEnvio.enviar();

        System.out.println("------");

        //--------------------------  Parte 4: Builder Usuario   ----------------------
        //creacion de usuario1
        Usuario usuario1 = Usuario.builder()
                .nombre("Franco")
                .email("franco@gmail.com")
                .telefono("123456789")
                .build();
        //creacion de usuario2
        Usuario usuario2 = Usuario.builder()
                .nombre("Ana")
                .email("ana@gmail.com")
                .direccion("Las Praderas 123")
                .fechaNacimiento(LocalDate.of(1990, 5, 20))
                .build();

        usuario1.mostrarInfo();
        usuario2.mostrarInfo();

        System.out.println("------");

        //--------------------------  Parte 5: Prototype Prestamo   ----------------------
        // Usamos las variables usuario1 que corresponde a franco y libro1 que corresponde al principito ya creadas
        Prestamo prestamoOriginal = new Prestamo(libro1, usuario1, LocalDate.now(), LocalDate.now().plusDays(7));

        // clon1 fecha de entrega
        Prestamo prestamoClone1 = prestamoOriginal.clone();
        prestamoClone1.setFechaFin(LocalDate.now().plusDays(10));

        //clon 2 modificando fecha de inicio y fin
        Prestamo prestamoClone2 = prestamoOriginal.clone();
        prestamoClone2.setFechaInicio(LocalDate.now().plusDays(12));
        prestamoClone2.setFechaFin(LocalDate.now().plusDays(14));

        // Mostrar información de los préstamos
        prestamoOriginal.mostrarInfo();
        prestamoClone1.mostrarInfo();
        prestamoClone2.mostrarInfo();

        System.out.println("------");


    }
}
