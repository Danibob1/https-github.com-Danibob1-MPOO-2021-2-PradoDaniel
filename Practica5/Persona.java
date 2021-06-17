
package newpackage;

public class Persona {
    private String nombre;
    private String apellido;
    private Fecha  fnacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fnacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnacimiento = fnacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Fecha fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fnacimiento=" + fnacimiento + '}';
    }
}
