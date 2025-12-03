package tienda_de_mascotas;

import java.util.Scanner;

public class Mascotas {
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    private int edad;
    private double peso;
    private double precio;

    public Mascotas(String nombre, String especie, String raza, String color, int edad, double peso, double precio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Mascota{"+
                "nombre='" + nombre + '\''+
                ", especie='" + especie + '\''+
                ", raza='" + raza + '\''+
                ", color='" + color + '\''+
                ", edad=" + edad +
                ", peso=" + peso +
                ", precio=" + precio + 
                "}";
    }
    
    public void agregar(Mascotas disponibles []){
        Scanner leer = new Scanner (System.in);
        boolean espacio = false;
        byte num = 0;
        for (byte i = 0; i < disponibles.length; i++){
            if (disponibles[i] == null){
                espacio = true;
                num = i;
                break;
            }
        }
        if (espacio){
            System.out.println("Ingrese el nombre:");
            String nombre = leer.nextLine();
            System.out.println("Ingese la especie:");
            String especie = leer.nextLine();
            System.out.println("Ingese la raza:");
            String raza = leer.nextLine();
            System.out.println("Ingese el color:");
            String color = leer.nextLine();
            System.out.println("Ingese la edad:");
            int edad = leer.nextInt();
            System.out.println("Ingese el peso:");
            double peso = leer.nextDouble();
            System.out.println("Ingese el precio:");
            double precio = leer.nextDouble();
            disponibles[num] = new Mascotas (nombre, especie, raza, color, edad, peso, precio);
        }
        else{
            System.out.println("No hay espacio para otra mascota");
        }
        
    }
    
    public void renombrar(Mascotas mascota){
        Scanner leer = new Scanner(System.in);
        System.out.println("Que nombre deseas ponerle a tu nueva mascota?");
        String nombre = leer.nextLine();
        mascota.setNombre(nombre);
        System.out.println("Felicidades, ahora eres duenio de "+this.nombre);
    }
    
    public void mostrar(Mascotas mascota){
        System.out.println(nombre);
        System.out.println("-Especie: " + especie);
        System.out.println("-Raza: " + raza);
        System.out.println("-Color: " + color);
        System.out.println("-Edad: " + edad);
        System.out.println("-Peso: " + peso);
        System.out.println("-Precio: " + precio);
    }
    
    public void listar(Mascotas disponibles []){
        System.out.println("Mascotas disponibles:");
        System.out.println();
        for(int i = 0; i < disponibles.length; i++){
            if (disponibles[i]!=null){
                System.out.print((i+1)+")");
                disponibles[i].mostrar(disponibles[i]);
                System.out.println();
            }
        }
    }
}
