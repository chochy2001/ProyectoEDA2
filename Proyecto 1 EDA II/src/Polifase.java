import java.io.*;
import java.util.Scanner;

public class Polifase {

    public static void polifase(File archivo) throws IOException {
        Scanner sc = new Scanner(System.in);//Creamos un nuevo Objeto del tipo Scanner para poder obtener las entradas del usuario
        float opc;

        LeerArchivo ls = new LeerArchivo(); //Creamos un nuevo Objeto de la clase LeerArchivo
        String temp1 = archivo.getAbsolutePath(); //Obtenemos el path absoluto del archivo y se lo asignamos a una variable de tipo string
        System.out.println(ls.leerTXT(temp1)); //Imprimimos en pantalla el retorno del metodo del nuevo objeto del tipo leer archivo
        String aux = ls.leerTXT(temp1);//Asignamos el valor del contenido del archivo a la variable String para una mejor manipulación
        String [] text = aux.split(",");//Seleccionamos el tipo de división que separa las claves.

        //int[] numeros = new int[text.length];
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(90);
        arr2.add(11);
        arr2.add(65);
        arr2.add(32);
        arr2.add(14);
        arr2.add(23);
        HeapSort.printArray(arr2);
        HeapSort.heap(arr2, arr2.size());



        for(int j = 0; j < 5; j++){
            ArrayList <Integer> arr1 = new ArrayList<>();
            list.add(arr1);
        }
        /*
        for(int i = 0; i < text.length; i++){ // Ciclo para agregar los números en la lista principal.
            //list.get(0).add(Integer.valueOf(text[i]));
            System.out.println(list.get(0).add(Integer.valueOf(text[i])));
            // Se agregan a la lista con la clase envolvente para convertirlos de String a entero.
        }


       for(int j = 0; j < numeros.length; j++){
            System.out.println(numeros[j]);
        }


        File f1 = new File("G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src", "f1.txt");
        //Creamos un nuevo archivo donde se van a ir poniendo las iteraciones del ordenamiento por Polifase

        File f2 = new File("G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src", "f2.txt");
        //Creamos un nuevo archivo donde se van a ir poniendo las iteraciones del ordenamiento por Polifase

        if(f1.createNewFile() && f2.createNewFile()){ //Sí no existen los archivos con esta
            System.out.println("Creando los archivos auxiliares...");
        }else{
            System.out.println("Valio verga no estas viendo");
        }


        String file1 = f1.getAbsolutePath();
        String file2 = f2.getAbsolutePath();

        FileWriter fichero1 = new FileWriter(f1);
        PrintWriter pw1 = new PrintWriter(fichero1);
        FileWriter fichero2 = new FileWriter(f1);
        PrintWriter pw2 = new PrintWriter(fichero1);

        pw1.close();*/
        //MergeSort.heap(numeros, numeros.length);

        System.out.println("¿Cuántos valores quieres que se tomen a leer?");
        opc = sc.nextShort();
        int[] arrfichero1 = new int[numeros.length];
        int[] arrfichero2 = new int[numeros.length];


        //float numeros1 = numeros.length;


        int bloques = (int) Math.ceil(text.length / opc); // En esta línea se divide la en bloques.
        int i = 1; //Esta variable es para saber cuantas listas de arreglos se van a generar

        int global = 0;//Variable para no pasarnos del rango de numeros a ingresar.
        int iterarfichero2 = 0;//Variables que nos van a ayudar para poder iterar sobre los indices de la lista.
        int iterarfichero1 = 0;//Variables que nos van a ayudar para poder iterar sobre los indices de la lista.

        while(i <= bloques){ // Condición para no iterar más bloques de los que se tiene.
            if((i % 2)== 0){
                while(global < opc && iterar < numeros.length){
                    arrfichero2[iterar] = numeros[iterar];
                    System.out.println("arrfichero2 = " + arrfichero2[iterar]);
                    global += 1;
                    System.out.println("global2 = " + global);
                    iterarfichero2++;
                    System.out.println("iterar2 = " + iterarfichero2);
                }
                global = 0;
            }else{
                while(global < opc && (iterarfichero1 + iterarfichero2) < list.size()){
                    temporal1 = (ArrayList<ArrayList<Integer>>) Collections.singletonList(list.get(iterarfichero1));
                    System.out.println("arrfichero1 = " + list.get(iterarfichero1));
                    global += 1;
                    System.out.println("global2 = " + global);
                    iterarfichero1++;
                    System.out.println("iterar1 = " + iterarfichero1);
                }
                global = 0;
            }
            i++;
        }








    }
}
