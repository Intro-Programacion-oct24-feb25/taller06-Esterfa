/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        // Leer datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el tipo de empleado (1-5): ");
        int tipoEmpleado = scanner.nextInt();

        System.out.print("Ingrese el sueldo inicial: ");
        double sueldoInicial = scanner.nextDouble();

        // Calcular el incremento según el tipo de empleado
        double incremento = 0;
        switch (tipoEmpleado) {
            case 1:
                incremento = 0.05; // 5%
                break;
            case 2:
                incremento = 0.07; // 7%
                break;
            case 3:
                incremento = 0.09; // 9%
                break;
            case 4:
                incremento = 0.12; // 12%
                break;
            default:
                incremento = 0.15; // 15%
        }

        // Calcular el nuevo sueldo
        double aumento = sueldoInicial * incremento;
        double nuevoSueldo = sueldoInicial + aumento;

        // Imprimir los resultados
        System.out.println("\n--- Detalles del empleado ---");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo inicial: $" + String.format("%.2f", sueldoInicial));
        System.out.println("Incremento aplicado: " + (int) (incremento * 100) + "%");
        System.out.println("Aumento en sueldo: $" + String.format("%.2f", aumento));
        System.out.println("Nuevo sueldo: $" + String.format("%.2f", nuevoSueldo));
        
        scanner.close();
    }
}






