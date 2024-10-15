import java.util.List;

public class InmuebleServiceImpl implements InmuebleService {
    private InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    @Override
    public void agregarInmueble(Inmueble inmueble) {
        inmuebleRepository.crearInmueble(inmueble);
    }

    @Override
    public Inmueble buscarInmueblePorId(int id) {
        return inmuebleRepository.obtenerInmueblePorId(id);
    }

    @Override
    public List<Inmueble> listarInmuebles() {
        return inmuebleRepository.obtenerTodosLosInmuebles();
    }

    @Override
    public void modificarInmueble(Inmueble inmueble) {
        inmuebleRepository.actualizarInmueble(inmueble);
    }

    @Override
    public void borrarInmueble(int id) {
        inmuebleRepository.eliminarInmueble(id);
    }
}
