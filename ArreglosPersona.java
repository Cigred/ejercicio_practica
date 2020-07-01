package Practica;

import java.util.Scanner;

public class ArreglosPersona {
     int tope;
    int max;
    Persona [] pers;
    Persona per = new Persona();
    static Scanner teclado = new Scanner (System.in);  
    
    public ArreglosPersona( int max){
        this.tope = 0;
        this.max = max;
        this.pers = new Persona [this.max + 1];   
        for (int i = 0; i<this.max+1; i++ ){
            pers[i] = new Persona();
        }
    }
    public ArreglosPersona (){
        this.tope = 0;
        this.max = 100;
        this.pers = new Persona[this.max + 1];      
    }
    public int getTope(){
        return tope = 0;        
    }
    public boolean DatosLlena(){
        if (this.max == this.tope){
            return true;   
        }else {
            return false;
        }
    }
    public boolean DatosVacia(){
        if(this.tope== 0) {
            return true;
        }else {
            return false ;
        }
    }
     public void InsertarDatos(int pos, String codigo, String nombre, int horas, double tarifa){
        pers[pos].registrar(codigo, nombre, horas, tarifa);
         tope++;
        }
    public void MostrarDatos() {
       if (this.DatosVacia()){
        System.out.println( "Registro esta vacia");
     }else {
          for (int i=0; i<tope; i++){
              System.out.println(pers[i].Cadena());
          }
       }
    }
    public void EliminarDatos(){    
        if (this.DatosVacia()){
        System.out.println( "Registro esta vacia");
     }else {
            this.tope--;
    System.out.println( "Eliminacion correcta");  
        }
    }
    
    
    
    public void buscar(String buscar){
        for (int i=0; i< tope ;i++){
        if (pers[i].getCodigo().equals(buscar)){
            System.out.println(pers[i].Cadena());
        }}
    }
}

