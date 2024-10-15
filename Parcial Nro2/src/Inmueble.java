import java.io.Serializable;

public class Inmueble implements Serializable {
    private int id;
    private String direccion;
    private double precio;

    public Inmueble(int id, String direccion, double precio) {
        this.id = id;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

