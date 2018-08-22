package unal.poo.practica;

import becker.robots.*;
import becker.robots.icons.Icon;
import java.awt.Color;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio5
{    
        public static void ordenarpilas(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
                
        }
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("citycita.txt");
	    objetos.showThingCounts(true);
            
            estudiante = new Robot(objetos,6, 1, Direction.NORTH,0);
            
            estudiante.setIcon(new Minion());
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

