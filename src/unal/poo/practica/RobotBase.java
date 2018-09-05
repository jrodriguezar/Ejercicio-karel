package unal.poo.practica;

import becker.robots.*;

public class RobotBase
{    
        public static City objetos;
        public static Robot estudiante;
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
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,10, 4, Direction.WEST,0);
            
            estudiante.setIcon(new Minion());
            
            int contador = 0;
            
            for(int i = 0; i<20; i++){
                girar(3);
                if(estudiante.frontIsClear()==false){
                    contador++;
                    girar(1);
                    if(estudiante.frontIsClear()==false){
                        contador++;
                        girar(1);
                    }else{
                        movimiento(1);
                    }
                }else{
                    movimiento(1);
                }
            }
            System.out.println("El perimetro de la figura es de: " + contador + " metros");
        }
}