
package newpackage;


public class Perro {
    
    String nombre;
    String raza;
    String color;

    public Perro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
    
    
    public void comer(){
        System.out.println("Esta comiendo");
    }
    
    public void dormir(){
        System.out.println("Esta dormiendo");
    }
    
    public void ladrar(){
        System.out.println("Esta ladrando");
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
    
    
}
