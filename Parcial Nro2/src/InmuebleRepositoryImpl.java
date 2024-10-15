import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InmuebleRepositoryImpl implements InmuebleRepository {
    private static final String FILE_NAME = "inmuebles.dat";


    public void crearInmueble(Inmueble inmueble) {
        List<Inmueble> inmuebles = obtenerTodosLosInmuebles();
        inmuebles.add(inmueble);
        guardarInmuebles(inmuebles);
    }


    public Inmueble obtenerInmueblePorId(int id) {
        List<Inmueble> inmuebles = obtenerTodosLosInmuebles();
        return inmuebles.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
    }

    public List<Inmueble> obtenerTodosLosInmuebles() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Inmueble>)ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void actualizarInmueble(Inmueble inmueble) {
        List<Inmueble> inmuebles = obtenerTodosLosInmuebles();
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i).getId() == inmueble.getId()) {
                inmuebles.set(i, inmueble);
                break;
            }
        }
        guardarInmuebles(inmuebles);
    }

    public void eliminarInmueble(int id) {
        List<Inmueble> inmuebles = obtenerTodosLosInmuebles();
        inmuebles.removeIf(i -> i.getId() == id);
        guardarInmuebles(inmuebles);
    }

    private void guardarInmuebles(List<Inmueble> inmuebles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(inmuebles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

