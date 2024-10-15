import java.util.List;

public interface InmuebleRepository {
    void crearInmueble(Inmueble inmueble);
    Inmueble obtenerInmueblePorId(int id);
    List<Inmueble> obtenerTodosLosInmuebles();
    void actualizarInmueble(Inmueble inmueble);
    void eliminarInmueble(int id);
}
