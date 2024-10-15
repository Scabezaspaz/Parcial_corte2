import java.util.List;

public interface InmuebleService {
    void agregarInmueble(Inmueble inmueble);
    Inmueble buscarInmueblePorId(int id);
    List<Inmueble> listarInmuebles();
    void modificarInmueble(Inmueble inmueble);
    void borrarInmueble(int id);
}
