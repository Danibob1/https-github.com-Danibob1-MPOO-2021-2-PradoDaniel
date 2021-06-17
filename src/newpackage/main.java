
package newpackage;

/**
*
* @author Daniel Prado
* @version 1.2 15.6.2021
* 
* */ 
public class main {
    
    public static void main (String[] args){
    
    Punto punto = new Punto();
    punto.imprimePunto();
    punto.x=5;
    punto.y=6;
    punto.imprimePunto();
    
    Punto punto2= new Punto (8,15);
    punto2.imprimePunto();
    
        System.out.println("\n");
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        System.out.println("\n");
        miCoche.color= "rojo";
        miCoche.marca= "vw";
        miCoche.modelo= "Jetta";
        miCoche.nPuertas= 5;
        System.out.println(miCoche.toString());
        
        Coche tuCoche= new Coche("negro", "fiesto", "ford", 5);
        System.out.println(tuCoche.toString());
        System.out.println("\n");
        
        Perro miPerro= new Perro("Milo", "Chihuahua", "Miel");
        System.out.println(miPerro);
        Perro miPerroDos= new Perro("Pinto", "Chihuahua", "Manchado");
        System.out.println(miPerroDos);
        
        /* Practica 4 -cxaafdspdag+*/
        
        System.out.println("\nPractica 5\n");
        
        Circulo circ1= new Circulo();
        System.out.println(circ1);
        circ1.setRadio(5);
        System.out.println(circ1);
        System.out.println(circ1.perimetro());
        System.out.println(circ1.area());
        
        Circulo circ2= new Circulo();
        circ2.setRadio(-10);
        System.out.println(circ2);
        System.out.println(circ2.perimetro());
        
        
        System.out.println("\n");
        
        
        
        Persona persona1= new Persona();
        persona1.setNombre("Daniel");
        persona1.setApellido("Prado");
        
        Fecha nac= new Fecha();
        nac.setDia(16);
        nac.setMes(11);
        nac.setAnio(2000);
        persona1.setFnacimiento(nac);
        System.out.println(persona1);
        
    }
}
