package ejercicio2;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Persona chofer= new Persona("Otto","Mann");
        Persona copiloto= new Persona("Skinner","Seymour");
        Persona pasajero1= new Persona("Bart","Simpson");
        Persona pasajero2= new Persona("Lisa","Simpson");
        
        Coche coche1= new Coche(chofer,copiloto,pasajero1,pasajero2, "Amarillo", "Escolar", "Herb's Car Company", 2);
        System.out.println(coche1);
        
    }
}
