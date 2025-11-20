//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] ventas = new double[7];
        double sumaTotal = 0;
        int indiceMayor = 0;
        int indiceMenor = 0;

        // Se ingresan los datos y se calculan totales y extremos en un solo bucle
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta del día " + (i + 1) + ": ");
            ventas[i] = Double.parseDouble(System.console().readLine());
            sumaTotal += ventas[i];

            // Compara la venta actual con la mayor y menor registrada hasta el momento
            if (ventas[i] > ventas[indiceMayor]) {
                indiceMayor = i;
            }
            if (ventas[i] < ventas[indiceMenor]) {
                indiceMenor = i;
            }
        }

        // a) Mostrar todas las ventas registradas
        System.out.println("\n--- Ventas Registradas ---");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Día " + (i + 1) + ": $" + ventas[i]);
        }

        // b) Calcular y mostrar el total y el promedio semanal de ventas
        double promedio = sumaTotal / ventas.length;
        System.out.println("\n--- Resumen Semanal ---");
        System.out.println("Total de ventas: $" + sumaTotal);
        System.out.println("Promedio de ventas: $" + promedio);

        // c) Indicar el día con la mayor y menor venta
        System.out.println("\n--- Día con Mejor y Peor Venta ---");
        System.out.println("El día con la mayor venta fue el día " + (indiceMayor + 1) + " con $" + ventas[indiceMayor]);
        System.out.println("El día con la menor venta fue el día " + (indiceMenor + 1) + " con $" + ventas[indiceMenor]);
    }
}