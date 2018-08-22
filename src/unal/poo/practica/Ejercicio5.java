package unal.poo.practica;

import becker.robots.*;
import becker.robots.icons.Icon;
import java.awt.Color;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio5
{    
        public static void movimiento(int Numpasos){
            for (int i = 0; i < Numpasos; i++) 
                estudiante.move();
        }
        
        public static void girar(int giro){
            for(int i=0; i<giro; i++){
                estudiante.turnLeft();
            }
        }
        
        public static void revisaryrecoger(){
            if(estudiante.canPickThing()==true){
                estudiante.pickThing();
            }
        }
        
        public static void barrerlinea(int distancia){
            for(int i=0; i<distancia; i++){
                revisaryrecoger();
                estudiante.move();
            }
        }
        
        public static void barrercuadro(int x, int y){
            barrerlinea(x);
            
            revisaryrecoger();
            
            girar(3);
            
            barrerlinea(y);
            
            revisaryrecoger();
            
            girar(3);
            
            barrerlinea(x);
            
            revisaryrecoger();
            
            girar(3);
            
            barrerlinea(y-1);
            
            revisaryrecoger();
            
            girar(3);
        }
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            
            objetos = new City("citycita.txt");
	    objetos.showThingCounts(true);
            
            estudiante = new Robot(objetos,6, 1, Direction.NORTH,0);
            
            estudiante.setIcon(new Minion());
            
            barrercuadro(6,8);
            
	}
}

