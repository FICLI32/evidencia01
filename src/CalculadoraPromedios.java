import java.util.Scanner;

public class CalculadoraPromedios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = scanner.nextInt();

        double[] notas = new double[cantidadNotas];

        for (int n = 0; n < cantidadNotas; n++) {
            System.out.print("Ingrese la nota " + (n + 1) + ": ");
            notas[n] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(notas);
        mostrarResultado(promedio);
        scanner.close();
    }
    public static double calcularPromedio(double[] notas) {
        int cantidadNotas = notas.length;
        double sumaNotas = 0;

        for (double nota : notas) {
            sumaNotas += nota;
        }

        return sumaNotas / cantidadNotas;
    }

    public static void mostrarResultado(double promedio) {
        if (promedio >= 4.0) {
            System.out.println("¡felicitaciones, aprobaste!");
        } else if (promedio < 3.6) {
            System.out.println("Lo siento, reprobaste.");
        } else {
            System.out.println("Vas a examen.");
        }
    }

}

