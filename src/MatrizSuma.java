import java.util.Scanner;
public class MatrizSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int n = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce el valor numero " + (n));
                matriz[i][j] = sc.nextInt();
                n++;
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Suma de filas:");
        int sumaFilas = 0;
        n = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("Suma de la fila numero " + n + ": " + sumaFilas);
            n++;
            sumaFilas = 0;
        }
        System.out.println();

        System.out.println("Suma de la columnas:");
        int sumaColumnas = 0;
        n = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaColumnas += matriz[j][i];
            }
            System.out.println("Suma de la columna numero " + n + ": " + sumaColumnas);
            n++;
            sumaColumnas = 0;
        }
        System.out.println();

        System.out.println("Suma de la diagonal principal:");
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println(sumaDiagonal);

    }
}