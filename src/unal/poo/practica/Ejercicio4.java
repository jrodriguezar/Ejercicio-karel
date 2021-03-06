package unal.poo.practica;

import becker.robots.*;
import becker.robots.icons.Icon;
import java.awt.Color;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio4
{    
        public static void ordenarpilas(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
                
        }
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Nueva ciudad.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 1, Direction.SOUTH,0);
            
            estudiante.setIcon(new Minion());
            Thing a = new Thing(objetos, 2,2);
            Icon ti = a.getIcon();
            ti.setColor(Color.GREEN);
            a.setIcon(ti);

	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

