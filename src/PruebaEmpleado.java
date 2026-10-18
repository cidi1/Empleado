void main(String[] args) {
    Empleado empl1 = new Empleado("Juan", "Perez", 487.65);
    System.out.println("El nombre del empleado es: " + empl1.getNombre());
    System.out.println("El apellido del empleado es: " + empl1.getApellido());
    System.out.println("EL salario mensual del empleado es de: " + empl1.getSalarioMensual());
    System.out.println("El salario final del empleado es de: " + empl1.salarioAnual());
    System.out.println("El salrio con el aumento es de: " + empl1.salarioFinal());

    System.out.println("----------------------------");
    Empleado empl2 = new Empleado("Vasquez", "Marco", 67.67);
    empl2.setNombre("Marco");
    empl2.setApellido("Vasquez");
    empl2.setSalarioMensual(0.0);

    System.out.println("El nombre del empleado es: " + empl2.getNombre());
    System.out.println("El apellido del empleado es: " + empl2.getApellido());
    System.out.println("EL salario mensual del empleado es de: " + empl2.getSalarioMensual());
    System.out.println("El salario final del empleado es de: " + empl2.salarioAnual());
    System.out.println("El salrio con el aumento es de: " + empl2.salarioFinal());
}