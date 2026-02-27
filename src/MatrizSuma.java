import java.util.Scanner;
public class MatrizSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] sumaFila = new int[1][3];
        int[][] sumaColumna = new int[1][3];
        int n = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Introduce el valor numero " + (n));
                matriz[i][j] = sc.nextInt();
                n++;
            }
        }

        System.out.println("Matriz:");
        mostrar(matriz);
        System.out.println();

        System.out.println("Suma de filas:");
        int sumaFilas = 0;
        n = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas += matriz[i][j];
            }
            sumaFila[0][i]=sumaFilas;
            n++;
            sumaFilas = 0;
        }
        mostrar(sumaFila);
        System.out.println();

        System.out.println("Suma de la columnas:");
        int sumaColumnas = 0;
        n = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaColumnas += matriz[j][i];
            }
            sumaColumna[0][i] = sumaColumnas;
            n++;
            sumaColumnas = 0;
        }
        mostrar(sumaColumna);
        System.out.println();

        System.out.println("Suma de la diagonal principal:");
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println(sumaDiagonal);

    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}