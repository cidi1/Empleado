public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    // Constructor que inicializa las variables usando el método set para validar
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        setSalarioMensual(salarioMensual);
    }

    // Métodos Getters y Setters
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
        // Validación: Si el salario mensual no es positivo, no se establece su valor
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // Método para calcular el salario anual
    public double calcularSalarioAnual() {
        return getSalarioMensual() * 12;
    }

    // Método para calcular el salario anual con un aumento del 10%
    public double calcularSalarioConAumento() {
        double salarioAnualActual = calcularSalarioAnual();
        return salarioAnualActual * 1.10;
    }
}
