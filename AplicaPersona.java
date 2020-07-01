package Practica;

import java.util.Scanner;

public class AplicaPersona {
    
static Scanner teclado = new Scanner(System.in);
    public static ArreglosPersona perso;
    static ArreglosPersona pers = new ArreglosPersona();
    
public static void main (String [] args )   {
    Menu();
}

static void creaRegistro() {
    int tam;
   
    System.out.print("Ingrese tamaño deL Registro :");
    tam = teclado.nextInt();
    perso = new ArreglosPersona(tam);
    System.out.println("Registro creada .... \n");
}

public static void Menu() {
    int opcion;
    
    do{
     System.out.println("\n Menu de Opciones");
            System.out.println("=====================");
            System.out.println("[1] Crea Registro"); 
            System.out.println("======================");
            System.out.println("[2] Ingresar Datos ");
            System.out.println("[3] Mostrar Datos ");
            System.out.println("[4] Eliminar Datos");
            System.out.println("[5] Buscar Datos");
            System.out.println("=======================");        
            System.out.println("0<- Salir");    
  System.out.print("\nIngrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            switch (opcion) {
                case 0:
                System.out.println("Saliendo del Sistema.....");
                 System.exit(0);
                break;
                
                case 1: 
                    creaRegistro();
                    break;
                case 2:
                    insertarDatos();
                    break;
                
                case 3:
                   perso.MostrarDatos();
                    break;
                case 4: 
                    perso.EliminarDatos();
                    break;
                case 5:
                    String buscar;
                    System.out.print("Ingrese codigo que desea buscar ");
                    teclado.nextLine();
                    buscar=teclado.nextLine();
                    perso.buscar(buscar);
                    break;
                default:
                 System.out.println("Ingrese Opcion Correcta.....");
                 System.out.println("\n");
            }
        }while (opcion!=0);
        }
    static int pos = 0;
   static void insertarDatos(){
         String codigo ;
         String nombre ;
         int horas;
         double tarifa;
        if (pers.DatosLlena()) {
            System.out.println("El registro esta lleno");      
     }else {
            System.out.print("Ingrese codigo: ");
            teclado.nextLine();
            codigo = teclado.nextLine();
            System.out.print("Ingrese nombre :");
            nombre=teclado.nextLine();
            System.out.print("Ingrese hora de trabajo:");
            horas=teclado.nextInt();
            System.out.print("Ingrese tarifa:");
            tarifa=teclado.nextInt();
        
        perso.InsertarDatos(pos, codigo, nombre, horas, tarifa);
        pos++;
        }
    
   }}
           

