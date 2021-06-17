package ejercicio2;

public class Coche {
    
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    private String color;
    private String modelo;
    private String marca;
    private int nPuertas;
    
    public Coche(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2, String color, String modelo, String marca, int nPuertas) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.nPuertas = nPuertas;
    }

    //PASAJERO
    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    
    
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

    @Override
    public String toString() {
        return "Dentro del Camion Especial de Noche de Brujas IV \n " + " \n Chofer = " + chofer + 
                ",\n Copiloto = " + copiloto + 
                ",\n Pasajero 1 = " + pasajero1 + 
                ",\n Pasajero 2 = " + pasajero2 + 
                ",\n Color = " + color +
                ",\n Modelo = " + modelo + 
                ",\n Marca = " + marca + 
                ",\n Puertas = " + nPuertas ;
    }
}
