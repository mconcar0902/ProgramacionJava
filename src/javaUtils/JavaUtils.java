package javaUtils;

import java.util.Scanner;

public class JavaUtils {
	
	// ==========================================
    // SECCIÓN 1: ENTRADA DE DATOS (CONSOLA)
    // ==========================================

    /**
     * Pide un número entero por consola con un mensaje personalizado.
     * Basado en el uso repetitivo de Scanner en todos los ejercicios.
     */
    public static int leerEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextInt();
    }

    /**
     * Pide una cadena de texto por consola.
     */
    public static String leerCadena(Scanner sc, String mensaje) {
        System.out.print(mensaje + ": ");
        // Limpiamos el buffer si venimos de leer un int antes
        return sc.next(); 
    }

    // ==========================================
    // SECCIÓN 2: MATEMÁTICAS Y LÓGICA
    // ==========================================

    /**
     * Genera un número aleatorio entre un mínimo y un máximo (ambos incluidos).
     * Usado frecuentemente en: Ejercicio02_PideElRangoDelArray, inicializaArray, etc.
     */
    public static int generarAleatorio(int min, int max) {
        return (int) (Math.round(Math.random() * (max - min)) + min);
    }

    /**
     * Comprueba si un número es primo.
     * Recopilado de: capitulo03_bucles.ejercicios.bloque04.Ejercicio01
     * y examenes.examen20251024.Ejercicio05
     */
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        
        // Optimización: solo comprobar hasta la raíz cuadrada
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calcula el factorial de un número.
     * Recopilado de: capitulo03_bucles.ejercicios.bloque04.Ejercicio05
     */
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // ==========================================
    // SECCIÓN 3: ARRAYS (VECTORES)
    // ==========================================

    /**
     * Inicializa un array con números aleatorios.
     * Patrón muy común en todo el capitulo04 (bloques 01, 02, 03, 09).
     */
    public static void inicializarArrayAleatorio(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(min, max);
        }
    }

    /**
     * Muestra el contenido de un array en una sola línea.
     * Presente en casi todos los ejercicios de arrays.
     */
    public static void mostrarArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Intercambia dos valores en un array dado sus índices.
     * Esencial para los algoritmos de ordenación (Burbuja, Selección, Inserción)
     * vistos en capitulo04.ejercicios.bloque03.
     */
    public static void intercambiar(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    // ==========================================
    // SECCIÓN 4: MATRICES (ARRAYS BIDIMENSIONALES)
    // ==========================================

    /**
     * Inicializa una matriz con números aleatorios.
     * Recopilado de: capitulo04_array.ejercicios.bloque07 y bloque11
     */
    public static void inicializarMatrizAleatoria(int[][] matriz, int min, int max) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarAleatorio(min, max);
            }
        }
    }

    /**
     * Imprime una matriz de forma visual.
     * Usado en ejercicios de matrices y Juego del 3 en raya.
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println();
        }
    }
    
    /**
     * Devuelve el valor máximo de un array.
     */
    public static int obtenerMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Devuelve el valor mínimo de un array.
     */
    public static int obtenerMinimo(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calcula la media de los valores de un array.
     */
    public static double obtenerMedia(int[] array) {
        long suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }
    
    /**
     * Invierte una cadena de texto.
     * Útil para ejercicios de palíndromos o cifrados.
     */
    public static String invertirCadena(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
        // Versión Pro (opcional): return new StringBuilder(str).reverse().toString();
    }
    
    /**
     * Elimina los espacios de una cadena.
     */
    public static String quitarEspacios(String str) {
        String sinEspacios = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sinEspacios += str.charAt(i);
            }
        }
        return sinEspacios;
         // Versión Pro (opcional): return str.replace(" ", "");
    }
    
 // ==========================================
    // SECCIÓN 5: GESTIÓN DE ARRAYS (BLOQUE 10)
    // ==========================================

    /**
     * Cuenta cuántas veces aparece un número en un array.
     * (Usado en Ejercicio04_CuentaCuantasVecesApareceUnNumeroEnUnArray)
     */
    public static int contarOcurrencias(int[] array, int valor) {
        int contador = 0;
        for (int num : array) {
            if (num == valor) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Añade un elemento al final de un array (creando uno nuevo).
     * (Usado en Ejercicio03_AñadeUnNumeroEnteroAUnArray)
     */
    public static int[] agregarElemento(int[] array, int elemento) {
        int[] nuevoArray = new int[array.length + 1];
        // Copiamos el array original
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        // Añadimos el nuevo al final
        nuevoArray[nuevoArray.length - 1] = elemento;
        return nuevoArray;
    }

    /**
     * Elimina todas las apariciones de un valor en un array.
     * (Usado en Ejercicio05_PideUnNumeroEliminaloSiEstaEnElArray)
     */
    public static int[] eliminarElemento(int[] array, int elemento) {
        int ocurrencias = contarOcurrencias(array, elemento);
        if (ocurrencias == 0) {
            return array; // Si no está, devolvemos el mismo
        }

        int[] nuevoArray = new int[array.length - ocurrencias];
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elemento) {
                nuevoArray[indice] = array[i];
                indice++;
            }
        }
        return nuevoArray;
    }
    
    
    // ==========================================
    // SECCIÓN 6: VALIDACIONES DE UNICIDAD (BLOQUE 9 y 11)
    // ==========================================

    /**
     * Comprueba si un valor ya existe dentro de un array.
     * Esencial para ejercicios de lotería o números únicos.
     */
    public static boolean contiene(int[] array, int valor) {
        for (int num : array) {
            if (num == valor) {
                return true;
            }
        }
        return false;
    }

    /**
     * Llena un array con números aleatorios SIN repetir ninguno.
     * (Generalización del Ejercicio01_LoteriaPrimitiva...)
     */
    public static void inicializarArraySinRepetidos(int[] array, int min, int max) {
        // Validación básica para evitar bucles infinitos
        if ((max - min + 1) < array.length) {
            System.out.println("Error: Rango insuficiente para llenar el array sin repetir.");
            return;
        }

        int i = 0;
        while (i < array.length) {
            int num = generarAleatorio(min, max);
            if (!contiene(array, num)) { // Si no está (usando el método anterior), lo guardamos.
                // Ojo: 'contiene' revisará todo el array, incluidos los 0 iniciales. 
                // Para ser precisos habría que revisar solo hasta 'i', pero para int[] simple esto suele valer.
                // Una versión más estricta revisaría solo la parte llena.
                boolean repetidoEnParteLlena = false;
                for(int j=0; j<i; j++) {
                    if(array[j] == num) repetidoEnParteLlena = true;
                }
                
                if(!repetidoEnParteLlena) {
                    array[i] = num;
                    i++;
                }
            }
        }
    }
    
    /**
     * Rellena toda la matriz con un mismo valor.
     * Útil para limpiar tableros (poner todo a 0 o a 'vacío').
     */
    public static void inicializarMatrizValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
            }
        }
    }
    
    /**
     * Busca un valor en un array y devuelve su índice (posición).
     * Devuelve -1 si no lo encuentra.
     * Esencial para: Eliminar elementos, buscar números, comprobar existencia...
     */
    public static int buscarIndice(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Encontrado
            }
        }
        return -1; // No encontrado
    }
}
