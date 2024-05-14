
package ej_ficherobinario_2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Julio
 */
public class AdminFichero {
    public void Grabar(){  
        
        
        
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        int n;

        try {
            fos = new FileOutputStream("d:/datos.dat");
            salida = new ObjectOutputStream(fos);

                Persona p = new Persona(19,"Juan Perez");
                salida.writeObject( p ); //se escribe el objeto
                
            
            
        } catch (Exception e) {        } 
        finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (Exception e) {            }
        }
    
    
    
    }
    
    
    public void Leer(){
    
     FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona n;
        try {
            fis = new FileInputStream("d:/datos.dat");
            entrada = new ObjectInputStream(fis);
            

                n = (Persona)entrada.readObject();  //se lee  un entero del fichero
                
                System.out.println("Los datos leidos del disco son:" );  //se muestra en pantalla
                System.out.println(n.edad);
                System.out.println(n.Nombre);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
