package tienda_de_mascotas;

import java.util.Scanner;

public class Clientes {
    private String nombre;
    private String telefono;
    private String correo;
    private int numero_mascotas;
    private Mascotas [] mascotas;
    private double gastos;

    public Clientes(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
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

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
    @Override
    public String toString(){
        String infoMascotas = "";
        for (int i = 0; i < numero_mascotas; i++){
            infoMascotas += (i+1)+". ";
            infoMascotas += mascotas[i];
            if (i!=numero_mascotas-1){
                infoMascotas += ", ";
            }
        }
        
        return "Cliente{"+
                "nombre='" + nombre + '\''+
                ", telefono='" + telefono + '\''+
                ", correo='" + correo + '\''+
                ", numero de mascotas=" + numero_mascotas +
                ", mascotas=[" + infoMascotas + "]" +
                ", gastos=" + gastos + 
                "}";
    }
    
    public Clientes[] registro(Clientes clientes[], int num_clientes){
        Scanner leer = new Scanner (System.in);
        Clientes nuevo_clientes [] = new Clientes [num_clientes + 1];
        for(int i = 0; i < num_clientes; i++){
            nuevo_clientes[i] = clientes[i];
        }
        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingese su numero de telefono:");
        String telefono = leer.nextLine();
        System.out.println("Ingese su correo electronico:");
        String correo = leer.nextLine();
        nuevo_clientes [num_clientes] = new Clientes (nombre, telefono, correo);
        return nuevo_clientes;
    }
    
    public void comprarMascota(Mascotas [] disponibles, int mascota){
        Mascotas[] nuevoMascotas = new Mascotas [numero_mascotas+1];
        for (int i = 0; i < numero_mascotas; i++){
            nuevoMascotas [i] = mascotas [i];
        }
        nuevoMascotas[numero_mascotas] = disponibles[mascota];
        this.numero_mascotas = numero_mascotas + 1;
        this.mascotas = nuevoMascotas;
        System.out.println(nombre+" ha comprado a "+disponibles[mascota].getNombre()+" por L."+disponibles[mascota].getPrecio());
        gastos += disponibles[mascota].getPrecio();
        for (int i = mascota; i < disponibles.length; i++){
            if (i!= disponibles.length-1){
                disponibles[i] = disponibles[i+1];
            }
            else{
                disponibles[i-1] = null;
            }
        }
    }
    
    
}
