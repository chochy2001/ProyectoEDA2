import java.io.*;
import java.util.*;

public class Polifase {

    public static void polifase(File archivo) throws IOException {
        Scanner sc = new Scanner(System.in);//Creamos un nuevo Objeto del tipo Scanner para poder obtener las entradas del usuario
        float opc;

        String Arch0 = "G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src\\prueba.txt"; // Se declara la ruta absoluta del fichero 0 en donde se encuentra la lista a ordenar.
        String Arch1 = "G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src\\f1.txt"; // Se declara la ruta absoluta del fichero auxiliar 1 donde se guardaran los bloques de números ordenados.
        String Arch2 = "G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src\\f2.txt";// Se declara la ruta absoluta del fichero auxiliar 2 donde se guardaran los bloques de números ordenados.

        // Se crean 3 listas de arreglos, la primera para ser la lista original y las otras 2 auxiliares para contener los bloques
        ArrayList<ArrayList<Integer>> list = new ArrayList(); // Lista de arreglos principal.
        ArrayList<ArrayList<Integer>> temporal1 = new ArrayList(); // Lista de arreglos temporal para los bloques del archivo F1.
        ArrayList<ArrayList<Integer>> temporal2 = new ArrayList();  //Lista de arreglos temporal para los bloques del archivo F2.

        LeerArchivo ls = new LeerArchivo(); //Creamos un nuevo Objeto de la clase LeerArchivo
        String temp1 = archivo.getAbsolutePath(); //Obtenemos el path absoluto del archivo y se lo asignamos a una variable de tipo string
        System.out.println(ls.leerTXT(temp1)); //Imprimimos en pantalla el retorno del metodo del nuevo objeto del tipo leer archivo
        String aux = ls.leerTXT(temp1);//Asignamos el valor del contenido del archivo a la variable String para una mejor manipulación
        String[] text = aux.split(",");//Seleccionamos el tipo de división que separa las claves.

        ArrayList<Integer> arr2 = new ArrayList<>();
        HeapSort.printArray(arr2);
        HeapSort.heap(arr2, arr2.size());

        int valor = (int) Math.ceil(text.length/opc);//Redondea la división del total de número en la lista entre los valores en los bloques, y lo redondea hacia arriba.
        for (int j = 0; j < valor; j++) { //creamos la lista con base a la cantidad de bloques que determina el usuario.
            ArrayList<Integer> arr1 = new ArrayList<>();
            list.add(arr1);
        }

        //Separamos las entradas a la lista de indices con base a la cantidad de divisiones que quiere que haga el usuario.
        int aux1 = 0;//Variable para ir iterando los indices de la lista.

        for (int i = 0; i < list.size(); i++) { // Ciclo para agregar los números en la lista principal
            for (int j = 0; j < opc; j++) { //Este ciclo for recorre los índices de los números en los índices de la lista principal.
                if(aux1 < text.length ){//Se hace esto para que el valor de aux1 no rebase el valor de la longitud de la lista y se salga del rango.
                    list.get(i).add(Integer.valueOf(text[aux1]));
                    // Se obtiene con un método get el índice de la línea principal, y se agrega el valor a otra lista determinada.
                    aux1++; //Se itera para obtener todas los números del arreglo text
                }
                //Se agregan a la lista con la clase envolvente para convertirlos de String a entero.
            }
        }

        System.out.println("Imprimimos la lista:");
        System.out.println(list);

            File f1 = new File("G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src", "f1.txt");
            //Creamos un nuevo archivo donde se van a ir poniendo las iteraciones del ordenamiento por Polifase

            File f2 = new File("G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src", "f2.txt");
            //Creamos un nuevo archivo donde se van a ir poniendo las iteraciones del ordenamiento por Polifase

        if(f1.createNewFile() && f2.createNewFile()){ //Sí no existen los archivos con esta
            System.out.println("Creando los archivos auxiliares...");
        }else{
            System.out.println("Los archivos ya existen");
        }


        System.out.println("¿Cuántos valores quieres que se tomen a leer?");
        opc = sc.nextShort();//Se le pide al usuario de cuantos digitos se van a hacer los bloques iniciales

            ArrayList<Integer> auxiliar1 = new ArrayList<>();
            ArrayList<Integer> auxiliar2 = new ArrayList<>();

            int w = 0;//Variable para contabilizar el indice del arraylist

           /* for (int i = 0; i < list.size(); i++) {

                auxiliar1.add(list.get(w).get(i));
                for (int j = 0; j < opc; j++) {
                    temporal1.add(auxiliar1);
                    temporal2.add(auxiliar2);
                }
            }*/


            //DistribucionArchivos(temporal1, Arch1, temporal2, Arch2);





        /*
        int bloques = (int) Math.ceil(text.length / opc); // En esta línea se divide la en bloques.
        int i = 1; //Esta variable es para saber cuantas listas de arreglos se van a generar

        int global = 0;//Variable para no pasarnos del rango de numeros a ingresar.
        int iterarfichero2 = 0;//Variables que nos van a ayudar para poder iterar sobre los indices de la lista.
        int iterarfichero1 = 0;//Variables que nos van a ayudar para poder iterar sobre los indices de la lista.

        while(i <= bloques){ // Condición para no iterar más bloques de los que se tiene.
            if((i % 2)== 0){
                while(global < opc && (iterarfichero1 + iterarfichero2) < list.size()){
                    temporal2.add((ArrayList)(list.get(iterarfichero2)));
                    System.out.println("list2 = " + list.get(iterarfichero2));
                    global += 1;
                    System.out.println("global2 = " + global);
                    iterarfichero2++;
                    System.out.println("iterar2 = " + iterarfichero2);
                }
                EscrituraArchivo.escribirDatos(temporal2, Arch2);
                global = 0;
            }else{
                while(global < opc && (iterarfichero1 + iterarfichero2) < list.size()){
                    temporal1.add((ArrayList)(list.get(iterarfichero1)));
                    System.out.println("arrfichero1 = " + list.get(iterarfichero1));
                    global += 1;
                    System.out.println("global2 = " + global);
                    iterarfichero1++;
                    System.out.println("iterar1 = " + iterarfichero1);
                }
                EscrituraArchivo.escribirDatos(temporal1, Arch1);
                global = 0;
            }
            i++;
        }*/

        }


   /* public static void DistribucionArchivos(ArrayList <ArrayList<Integer>> lista1,String direccionArchivo1,ArrayList <ArrayList<Integer>> lista2,String direccionArchivo2){




    }*/
    }

