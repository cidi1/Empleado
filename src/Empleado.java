public class Empleado {
    String nombre;
    String apellido;
    double salarioMensual;


    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (salarioMensual > 0){
            this.salarioMensual = salarioMensual;
        }
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

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0){
            this.salarioMensual = salarioMensual;
        }
    }

    double salarioAnual(){
        return getSalarioMensual() * 12;
    }

    double salarioFinal(){
        return getSalarioMensual() * 1.10;
    }
}
