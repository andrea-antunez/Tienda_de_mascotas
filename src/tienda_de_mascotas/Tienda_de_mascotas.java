package tienda_de_mascotas;

import java.util.Scanner;


public class Tienda_de_mascotas {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Bienvenido!");
        int num_clientes = 0;
        Clientes clientes [] = new Clientes[num_clientes];
        Clientes cliente_actual = new Clientes ("nombre", "numero", "correo");
        Mascotas [] mascotas_disponibles = new Mascotas[15];
        mascotas_disponibles [0] = new Mascotas ("Max","Perro","Labrador","dorado",3,30,14200);
        mascotas_disponibles [1] = new Mascotas ("Bonnie","Perro","Pomeranian","blanca",1,3,20000);
        mascotas_disponibles [2] = new Mascotas ("Luna","Gato","Bombay","negro",2,4,6000);
        mascotas_disponibles [3] = new Mascotas ("Paquito","Perico","Australiano","Verde",2,0.03,500);
        mascotas_disponibles [4] = new Mascotas ("Pelusa","Hamster","Sirio","dorado",1,0.01,350);
        
        int ingresos = 0;
        boolean loop = true;
        do{
            System.out.println("Menu de opciones");
            System.out.println("1) Clientes");
            System.out.println("2) Mascotas");
            System.out.println("3) Ingresos");
            System.out.println("4) Cerrar tienda");
            System.out.print("Opcion: ");
            byte opcion = leer.nextByte();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    do{
                        System.out.println("Menu de opciones: Clientes");
                        System.out.println("1) Registrar nuevo cliente");
                        System.out.println("2) Lista de clientes");
                        System.out.println("3) Seleccionar cliente");
                        System.out.print("Opcion: ");
                        opcion = leer.nextByte();
                        System.out.println("");

                        switch (opcion){
                            case 1:
                                System.out.println("Registro de cliente:");
                                clientes = cliente_actual.registro(clientes, num_clientes);
                                num_clientes++;
                                System.out.println("");
                                break;

                            case 2:
                                System.out.println("Clientes:");
                                for(int i = 0; i < clientes.length; i++){
                                    System.out.println(i+1+") "+clientes[i]);
                                }
                                System.out.println("");
                                break;

                            case 3:
                                System.out.println("Que numero de cliente desea comprar en el momento?");
                                int num = leer.nextInt();
                                cliente_actual = clientes[num-1];
                                System.out.println("");
                                break;

                            default:
                                System.out.println("Tiene que seleccionar una de las opciones disponibles.");
                                System.out.println("");
                                break;   
                        }
                    } while(opcion > 3 || opcion <= 0);
                    break;
                    
                case 2:
                    do{
                        System.out.println("Menu de opciones: Mascotas");
                        System.out.println("1) Lista de mascotas");
                        System.out.println("2) Agregar mascota");
                        System.out.println("3) Vender mascota");
                        System.out.print("Opcion: ");
                        opcion = leer.nextByte();
                        System.out.println("");

                        switch (opcion){
                            case 1:
                                mascotas_disponibles[0].listar(mascotas_disponibles);
                                break;

                            case 2:
                                mascotas_disponibles[0].agregar(mascotas_disponibles);
                                System.out.println("");
                                break;

                            case 3:
                                char opcion2 = ' ';
                                System.out.println("Que numero de mascota desea comprar?");
                                System.out.print("Numero: ");
                                int num = leer.nextInt();
                                System.out.println("");
                                System.out.println("Confirma comprar la siguiente mascota:");
                                mascotas_disponibles[num-1].mostrar(mascotas_disponibles[num-1]);
                                System.out.print("(S/N): ");
                                opcion2 = leer.next().charAt(0);
                                System.out.println("");
                                if (opcion2 == 's' || opcion2 == 'S'){
                                    ingresos += mascotas_disponibles[num-1].getPrecio();
                                    cliente_actual.comprarMascota(mascotas_disponibles, num-1);
                                }
                                System.out.println("");
                                break;

                            default:
                                System.out.println("Tiene que seleccionar una de las opciones disponibles.");
                                System.out.println("");
                                break;   
                        }
                    } while(opcion > 3 || opcion <= 0);
                    break;
                    
                case 3:
                    System.out.println("Ingresos: L."+ingresos);
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("La tienda ha cerrado.");
                    System.out.println("El ingreso total fue de: L."+ingresos);
                    System.out.println("");
                    loop = false;
                    break;
                    
                default:
                    System.out.println("Por favor seleccione una de las opciones disponibles.");
                    System.out.println("");
                    break;
            }
        }while(loop);
        
        /*Prueba
        mascotas_disponibles[0].mostrar(mascotas_disponibles[0]);
        clientes[0].comprarMascota(mascotas_disponibles,1);
        System.out.println(clientes[0].toString());
        mascotas_disponibles[0].renombrar(mascotas_disponibles[0]);
        mascotas_disponibles[0].listar(mascotas_disponibles);*/
    }
    
}
