public class Main {
    public static void main(String[] args) {
        InmuebleRepository inmuebleRepository = new InmuebleRepositoryImpl();
        InmuebleService inmuebleService = new InmuebleServiceImpl(inmuebleRepository);

        // Crear algunos inmuebles
        inmuebleService.agregarInmueble(new Inmueble(1, "Calle Falsa 123", 100000));
        inmuebleService.agregarInmueble(new Inmueble(2, "Avenida Siempre Viva 742", 200000));

        // Listar inmuebles
        System.out.println("Lista de inmuebles:");
        inmuebleService.listarInmuebles().forEach(System.out::println);

        // Buscar inmueble por ID
        System.out.println("\nBuscar inmueble con ID 1:");
        System.out.println(inmuebleService.buscarInmueblePorId(1));

        // Modificar inmueble
        Inmueble modificado = new Inmueble(1, "Calle Falsa 123", 110000);
        inmuebleService.modificarInmueble(modificado);

        // Eliminar inmueble
        inmuebleService.borrarInmueble(2);

        // Listar nuevamente
        System.out.println("\nLista de inmuebles después de modificaciones:");
        inmuebleService.listarInmuebles().forEach(System.out::println);
    }
}
