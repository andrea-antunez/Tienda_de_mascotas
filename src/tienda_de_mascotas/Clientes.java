package tienda_de_mascotas;

public class Clientes {
    private String nombre;
    private String telefono;
    private String correo;
    private int numero_mascotas;
    private Mascotas [] mascotas;
    private boolean cliente_regular;

    public Clientes(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cliente_regular = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero_mascotas() {
        return numero_mascotas;
    }

    public void setNumero_mascotas(int numero_mascotas) {
        this.numero_mascotas = numero_mascotas;
    }

    public Mascotas[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascotas[] mascotas) {
        this.mascotas = mascotas;
    }

    public boolean isCliente_regular() {
        return cliente_regular;
    }

    public void setCliente_regular(boolean cliente_regular) {
        this.cliente_regular = cliente_regular;
    }
    
    
}
