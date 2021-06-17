
package newpackage;

public class Punto {
    int x,y;

    public Punto() {
    }
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimePunto(){
        System.out.println("X= "+x+" Y="+y);
    }
}
