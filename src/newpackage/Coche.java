
package newpackage;


public class Coche {
    String color;
    String modelo;
    String marca;
    int nPuertas;

    public Coche() {
    }//Constructor vacio

    public Coche(String color, String modelo, String marca, int nPuertas) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.nPuertas = nPuertas;
    }//Constructor con parametros
    
    public void encender(){
        System.out.println("PRENDIDO");
    }
    
    public void apagar(){
        System.out.println("APAGADO");
    }
    
    public void avanzar(){
        System.out.println("EN MOVIMIENTO");
    }
    
    public void frenar(){
        System.out.println("APRENDE A CONDUCIR ");
    }

    @Override //Sobreescribe un metodo exitente
    public String toString() {
        return "Coche{" + "color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", nPuertas=" + nPuertas + '}';
    }
    
    
}
