package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio3
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
            
            int contador=0;
            
            int Numdefilas=4;
            
            for(int a=0; a<Numdefilas; a++){
            
                estudiante.move();
            
                for(int i=0; i<contador+1; i++){
                    if(estudiante.canPickThing()==true){
                        contador++;
                        estudiante.pickThing();
                    }
                }
            
                estudiante.turnLeft();
            
                for(int i=0; i<contador; i++){
                    if(estudiante.canPickThing()==false){
                        estudiante.putThing();
                        estudiante.move();
                    }
                }
            
                for(int i=0; i<2; i++){
                    estudiante.turnLeft();
                }
            
                for(int i=0; i<contador; i++){
                    estudiante.move();
                }
            
                estudiante.turnLeft();
            
                contador=0;
            }
            
            estudiante.move();
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

