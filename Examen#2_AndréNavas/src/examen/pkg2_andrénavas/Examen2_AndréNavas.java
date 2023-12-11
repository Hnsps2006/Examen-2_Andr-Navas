/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg2_andrénavas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class Examen2_AndréNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 9;

        System.out.print("Bienvenido a mi programa");
        entrada.nextLine();

        while (opcion == 9) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar productos por nombre o por codigo");
            System.out.println("3. Listar todos los productos");
            System.out.println("4. Modificar");
            System.out.println("5. Vender");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int option = entrada.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Usted ha elegido la opción número 1. Agregar Productos");
                    System.out.print("Ingrese el nombre del Producto: ");
                    entrada.nextLine(); // Consumir el salto de línea pendiente
                    String nombreProducto = entrada.nextLine();
                    System.out.print("Ingrese el precio del Producto: ");
                    int precioProducto = entrada.nextInt();

                    Producto nuevoProducto = new Producto(nombreProducto, precioProducto);
                    Producto.agregarProducto(nuevoProducto);

                    nuevoProducto.mostrarInformacion();
                    opcion = 9;
                    break;

                case 2:
                    System.out.println("Usted ha elegido la opción número 2. Buscar productos por nombre o por codigo");
                    System.out.println("Ingrese el nombre del producto a buscar: ");
                    entrada.nextLine(); // Consumir el salto de línea pendiente
                    String nombreABuscar = entrada.nextLine();

                    Producto productoEncontrado = Producto.buscarProducto(nombreABuscar);

                    if (productoEncontrado != Producto.PRODUCTO_NO_ENCONTRADO) {
                        System.out.println("Producto encontrado:");
                        productoEncontrado.mostrarInformacion();
                    } else {
                        System.out.println("Producto no encontrado.");
                    }

                    opcion = 9;
                    break;

                case 3:
                    System.out.println("Usted ha elegido la opción número 3. Listar todos los productos");
                    ArrayList<Producto> productos = Producto.listarProductosDisponibles();

                    if (!productos.isEmpty()) {
                        System.out.println("Lista de productos disponibles:");
                        for (Producto producto : productos) {
                            producto.mostrarInformacion();
                        }
                    } else {
                        System.out.println("No hay productos disponibles.");
                    }

                    opcion = 9;
                    break;

                case 4:
                    System.out.println("Usted ha elegido la opción número 4. Modificar");
                    opcion = 9;
                    break;

                case 5:
                    System.out.println("Usted ha elegido la opcion de vender");
                    opcion = 9;
                    break;

                case 6:
                    System.out.println("Usted ha elegido la opcion de salir");
                    opcion = 100;
                    break;

                default:
                    System.out.println("Por favor ingrese opción válida");
                    opcion = 9;
                    break;
            }
        }
    }
}