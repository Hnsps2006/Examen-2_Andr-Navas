/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.pkg2_andrénavas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private long id;
    private String estado;
    private int precio;

    static Producto PRODUCTO_NO_ENCONTRADO = new Producto("", 0);

    private static ArrayList<Producto> Inventario = new ArrayList<>();

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.cantidad = 0; // Inicializar cantidad a 0
        this.id = GenerarId();
        this.estado = "disponible";
        this.precio = precio;
    }

    private long GenerarId() {
        Random random = new Random();
        long idGenerado = random.nextLong();

        if (idGenerado >= 0) {
            return idGenerado;
        } else {
            return -idGenerado;
        }
    }

    public static void agregarProducto(Producto producto) {
        Inventario.add(producto);
        System.out.println("Producto ingresado al inventario.");
    }

    public static Producto buscarProducto(String nombre) {
        for (Producto producto : Inventario) {
            if (producto.nombre.equals(nombre)) {
                return producto;
            }
        }
        return PRODUCTO_NO_ENCONTRADO;
    }

    public static ArrayList<Producto> listarProductosDisponibles() {
        ArrayList<Producto> productosDisponibles = new ArrayList<>();
        for (Producto producto : Inventario) {
            if (producto.estado.equals("disponible")) {
                productosDisponibles.add(producto);
            }
        }
        return productosDisponibles;
    }

    public static Producto modificarProducto(String nombre, int nuevoPrecio) {
        Producto producto = buscarProducto(nombre);
        if (producto != PRODUCTO_NO_ENCONTRADO) {
            producto.precio = nuevoPrecio;
            System.out.println("Producto modificado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
        return producto;
    }

    public static void venderProducto(String nombre) {
        Producto producto = buscarProducto(nombre);
        if (producto != PRODUCTO_NO_ENCONTRADO) {
            producto.estado = "vendido";
            System.out.println("Producto vendido correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Producto: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Precio: " + precio);
    }
}