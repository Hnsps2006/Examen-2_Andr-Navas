/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg2_andrénavas;
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
        int opcion=9;
        System.out.print("Bienvenido a mi programa");
        entrada.nextLine();
        // esto obliga al usuario a hacer enter para que el programa pueda seguir
        while(opcion==9){  
            System.out.println("\n--- Menú ---");
            System.out.println("1.Agregar Producto");
            System.out.println("2. Buscar productos por nombre o por codigo");
            System.out.println("3. Listar todos los productos");
            System.out.println("4. Modifica");
            System.out.println("5. Vender");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
        int option = entrada.nextInt();
        // sirve para leer un entero y darle la option al usuario
        //de ingresar un numero
        
            switch (option) {
                case 1:
                    System.out.println("Usted ha elegido la opción número 1.Agregar Productos"); 
                    System.out.print("Ingrese el nombre del Producto: ");
                    String nombreProducto = entrada.nextLine();

                    Producto nuevoProducto = new Producto(nombreProducto);
                    Producto.ingresarProducto(nuevoProducto);

                    nuevoProducto.mostrarInformacion();
                    opcion=9;
                    break;
                case 2:
                    System.out.println("Usted ha elegido la opción número 2. Buscar productos por nombre o por codigo"); 
                    System.out.println("");
                    opcion=9;
                    break;
                case 3:
                    System.out.println("Usted ha elegido la opción número 3. opcion 3.Listar todos los productos");
                    opcion=9;
                    break;
                case 4:
                    System.out.println("Usted ha elegido la opción número 4. Modificar");
                    opcion=9;
                    break;
                case 5:
                    System.out.println("Usted ha elegido la opcion de vender");
                    opcion=9;
                    break;
                case 6:
                    System.out.println("Usted ha elegido la opcion de salir");
                    opcion=100;
                    break;
                default:
                    System.out.println("Porfavor ingrese opción válida");
                    opcion=9;
                    break;
            }
        }
//* Esto es como un ciclo donde uno tiene diferentes caminos a tomar,
//que son los case, la funcion del swicth es poner la condición como si
//fuera un if, el break sirve para terminar el ciclo (en otras palabras 
//terminar con el caso y no seguir adelante.La condición se pone adentro
// de los parentesis. //*
    }      
}
