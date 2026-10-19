Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // --- Registro del Empleado 1 ---
    System.out.println("=== REGISTRO DE EMPLEADO 1 ===");
    System.out.print("Ingrese el primer nombre: ");
    String nombre1 = scanner.nextLine();

    System.out.print("Ingrese el apellido paterno: ");
    String apellido1 = scanner.nextLine();

    System.out.print("Ingrese el salario mensual: ");
    double salario1 = scanner.nextDouble();
    scanner.nextLine(); // Limpiar el buffer de entrada

    Empleado empl1 = new Empleado(nombre1, apellido1, salario1);

    // --- Registro del Empleado 2 ---
    System.out.println("\n=== REGISTRO DE EMPLEADO 2 ===");
    System.out.print("Ingrese el primer nombre: ");
    String nombre2 = scanner.nextLine();

    System.out.print("Ingrese el apellido paterno: ");
    String apellido2 = scanner.nextLine();

    System.out.print("Ingrese el salario mensual: ");
    double salario2 = scanner.nextDouble();

    Empleado empl2 = new Empleado(nombre2, apellido2, salario2);

    // --- Mostrar salarios anuales iniciales ---
    System.out.println("\n========================================");
    System.out.println("       SALARIOS ANUALES INICIALES       ");
    System.out.println("========================================");
    System.out.println("Empleado 1: " + empl1.getNombre() + " " + empl1.getApellido());
    System.out.println("Salario anual: $" + empl1.calcularSalarioAnual());

    System.out.println("\nEmpleado 2: " + empl2.getNombre() + " " + empl2.getApellido());
    System.out.println("Salario anual: $" + empl2.calcularSalarioAnual());

    // --- Aplicar aumento del 10% y mostrar resultados nuevamente ---
    System.out.println("\n========================================");
    System.out.println("   SALARIOS ANUALES CON AUMENTO DEL 10% ");
    System.out.println("========================================");
    System.out.println("Empleado 1 (" + empl1.getNombre() + "): $" + empl1.calcularSalarioConAumento());
    System.out.println("Empleado 2 (" + empl2.getNombre() + "): $" + empl2.calcularSalarioConAumento());

    scanner.close();
}