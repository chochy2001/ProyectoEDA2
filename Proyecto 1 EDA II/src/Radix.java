
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Clase correspondiente al algoritmo de Ordenamiento RadixSort
 *
 * ordena enteros procesando sus dígitos de forma individual. Como los enteros pueden representar
 * cadenas de caracteres y, especialmente,
 * números en punto flotante especialmente formateados,
 * radix sort no está limitado solo a los enteros. (En esta implementación se trabaja solo con enteros).
 *
 * @author Luis Aldo Gomez Bolaños, Karen Mariel Bastida Vargas y Jorge Salgado Miranda
 * @version 1.0
 */

public class Radix {
    /**
     * Clase que implementa el Algoritmo de Ordenamiento por Radix
     *
     * @param archivo
     * @throws IOException
     */
        public static void radix(File archivo) throws IOException {
            int i, j; // Variables para los ciclos for.
            short opc;
            List< Queue <Integer>> kurama = new LinkedList<>();
            // Creamos una Cola de Enteros Para aplicar el metodo Radix. y Creamos una lista de esas colas.
            // kurama es una lista de colas que almanenan enteros.
            List<Integer> lista = new ArrayList<>(); // Creamos una lista como un arreglo.

            opc = ordenar(); // Guardamos la opción obtenida por el usuario (Ordenamiento Ascendente o Descendente).


            for(int k = 0; k < 10; k++){
                Queue<Integer> colaPos = new LinkedList<>(); //Creamos 10 colas de enteros del Objeto listas ligadas para poder ejecutar el algoritmo radix.
                kurama.add(colaPos);// Agregamos las colas de enteros a la lista de Colas de Enteros (kurama).
            }

            LeerArchivo ls = new LeerArchivo(); // Creamos un nuevo Objeto de la clase leer archivo.
            String temp1 = archivo.getAbsolutePath(); // Obtenemos el path absoluto del archivo del usuario.
            System.out.println(ls.leerTXT(temp1)); // Imprimimos el archivo obtenido del path absoluto del usuario con ayuda del método leerTXT.
            String aux = ls.leerTXT(temp1); // Le asignamos el valor del archivo a una variable auxiliar.
            String [] text = aux.split(","); // Este metodo nos ayuda a dividir la cadena de la variable aux en este caso con base a una clave determinada.
            // Como nuestro texto esta separado por comas se asigno esto de clave de separacion del texto.



            for (String s : text) { // Recorremos lo asignado en la variable texto, clave por clave.
                lista.add(Integer.parseInt(s)); // parseInt convierte el string de cadena como un numero entero con signo.
            }

            int temp, unidades, decenas, centenas;
            // Variables para hacer el acomodo en las listas con base en las unidades, decenas y centenas.

            for(i = 0; i < 3; i++){
                for(j = 0; j <= lista.size() - 1; j++){
                    if(i == 0){ //Unidades
                        temp = lista.get(j);
                        unidades = temp % 10;

                        if(unidades == 0){
                            kurama.get(0).add(lista.get(j));
                        }else if(unidades == 1){
                            kurama.get(1).add(lista.get(j));
                        }else if(unidades == 2){
                            kurama.get(2).add(lista.get(j));
                        }else if(unidades == 3){
                            kurama.get(3).add(lista.get(j));
                        }else if(unidades == 4){
                            kurama.get(4).add(lista.get(j));
                        }else if(unidades == 5){
                            kurama.get(5).add(lista.get(j));
                        }else if(unidades == 6){
                            kurama.get(6).add(lista.get(j));
                        }else if(unidades == 7){
                            kurama.get(7).add(lista.get(j));
                        }else if(unidades == 8){
                            kurama.get(8).add(lista.get(j));
                        }else{
                            kurama.get(9).add(lista.get(j));
                        }
                        Imprimir(kurama);
                    }else if( i == 1){ //Decenas
                        temp = lista.get(j);
                        temp /= 10;
                        decenas = temp % 10;

                        if(decenas == 0){
                            kurama.get(0).add(lista.get(j));
                        }else if(decenas == 1){
                            kurama.get(1).add(lista.get(j));
                        }else if(decenas == 2){
                            kurama.get(2).add(lista.get(j));
                        }else if(decenas == 3){
                            kurama.get(3).add(lista.get(j));
                        }else if(decenas == 4){
                            kurama.get(4).add(lista.get(j));
                        }else if(decenas == 5){
                            kurama.get(5).add(lista.get(j));
                        }else if(decenas == 6){
                            kurama.get(6).add(lista.get(j));
                        }else if(decenas == 7){
                            kurama.get(7).add(lista.get(j));
                        }else if(decenas == 8){
                            kurama.get(8).add(lista.get(j));
                        }else{
                            kurama.get(9).add(lista.get(j));
                        }
                        Imprimir(kurama);
                    }else if(i == 2){ //Centenas
                        temp = lista.get(j);
                        temp /= 10;
                        temp /= 10;
                        centenas = temp % 10;

                        if(centenas == 0){
                            kurama.get(0).add(lista.get(j));
                        }else if(centenas == 1){
                            kurama.get(1).add(lista.get(j));
                        }else if(centenas == 2){
                            kurama.get(2).add(lista.get(j));
                        }else if(centenas == 3){
                            kurama.get(3).add(lista.get(j));
                        }else if(centenas == 4){
                            kurama.get(4).add(lista.get(j));
                        }else if(centenas == 5){
                            kurama.get(5).add(lista.get(j));
                        }else if(centenas == 6){
                            kurama.get(6).add(lista.get(j));
                        }else if(centenas == 7){
                            kurama.get(7).add(lista.get(j));
                        }else if(centenas == 8){
                            kurama.get(8).add(lista.get(j));
                        }else{
                            kurama.get(9).add(lista.get(j));
                        }
                        Imprimir(kurama);//Imprimimos el valor de kurama en cada iteración.
                    }
                }
                lisOrdenar(lista, kurama);
                System.out.println("Llamada a la función --> lista = " + lista);
            }

            if(opc == 2){
                Object[] array = new Object[lista.size()];
                for(int a = 0; a < lista.size(); a++){
                    array = lista.toArray();
                }
                lista.clear();
                for(int b = array.length - 1; b >= 0 ; b--){
                    lista.add((Integer) array[b]);
                }
            }

            StringBuilder res = new StringBuilder();
            int auxiliar;
            String auxiliar2;
            for (Integer integer : lista) {
                auxiliar = integer;
                auxiliar2 = String.valueOf(auxiliar);
                res.append(auxiliar2).append(",");
            }
            FileWriter fichero = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(res);
            pw.close();


        }

    /**
     * Método que extrae el valor de la Cola y lo agrega a la lista original,
     * para obtener los datos y ver si estan ordenados
     *
     * @param lis Lista de Enteros
     * @param lis1 Lista de Colas de Enteros
     */

    public static void lisOrdenar(List<Integer> lis, List<Queue<Integer>> lis1){
        lis.clear();
        for(Queue<Integer> princi:lis1){
            Object[] arreglo = princi.toArray();
            for (Object o : arreglo) {
                lis.add((Integer) o);
            }
            princi.clear();
        }

    }

    /**
     * Método que sirve para imprimir la Lista
     *
     * @param lis Lista de Colas de Enteros
     */

    public static void Imprimir(List<Queue<Integer>> lis){//Método que sirve para imprimir la lista
        System.out.println("Kurama = " + lis);
    }

    /**
     * Método que consiste en saber que tipo de Ordenamiento desea implementar el usuario.
     * @return Tipo de Ordenamiento Ascendente o Descendente.
     */
    public static short ordenar(){
            Scanner sc = new Scanner(System.in);//Creamos un nuevo objeto de tipo Scanner
            short opc;
            System.out.println("¿Como desea ordenar su archivo? \n1.Ascendente\n2.Descendente");
            opc = sc.nextShort();
            return opc;//Con base en lo ingresado por el usuario seleccionamos si se hace de manera ascendente o Descendente
    }
}
