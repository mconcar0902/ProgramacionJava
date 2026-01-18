package capitulo04_array.ejercicios.bloquePrueba;

public class Ejermplo {

	public static void main(String[] args) {
        int m[][] = new int[][] {
            {1, 2, 3, 4},
            {3, 1, 2, 5},
            {2, 4, 3, 6},
            {1, 9, 8, 7}
        };

        System.out.println("Matriz original:");
        muestraMatriz(m);
        System.out.println();

        int rep = m.length / 2;

        for (int contador = 0; contador < rep; contador++) {
            int limite = m.length - contador - 1;
            rotaUnNumeroHorario(m, contador, limite);
        }

        System.out.println("Matriz tras rotar 1 posición horario:");
        muestraMatriz(m);
    }

    public static void rotaUnNumeroHorario(int m[][], int contador, int limite) {
        int aux = m[contador][contador]; // guardamos la esquina superior izquierda

        // mover columna izquierda hacia arriba
        for (int i = contador; i < limite; i++) {
            m[i][contador] = m[i + 1][contador];
        }

        // mover fila inferior hacia la izquierda
        for (int j = contador; j < limite; j++) {
            m[limite][j] = m[limite][j + 1];
        }

        // mover columna derecha hacia abajo
        for (int i = limite; i > contador; i--) {
            m[i][limite] = m[i - 1][limite];
        }

        // mover fila superior hacia la derecha
        for (int j = limite; j > contador + 1; j--) {
            m[contador][j] = m[contador][j - 1];
        }

        // colocar la esquina guardada
        m[contador][contador + 1] = aux;
    }

    public static void muestraMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
