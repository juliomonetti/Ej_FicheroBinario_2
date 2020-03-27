package ej_ficherobinario_2;

import java.io.Serializable;


public class Persona implements Serializable{
   public int edad;
   String Nombre;
   
   public Persona(int edad, String nombre) {
       this.edad = edad;
       this.Nombre = nombre;
   }
}
