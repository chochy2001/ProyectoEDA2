import java.io.*;
import java.util.Scanner;

public class Polifase {

    public static void polifase(File archivo) throws IOException {
        Scanner sc = new Scanner(System.in);
        float opc;

        LeerArchivo ls = new LeerArchivo();
        String temp1 = archivo.getAbsolutePath();
        System.out.println(ls.leerTXT(temp1));
        String aux = ls.leerTXT(temp1);
        String [] text = aux.split(",");
        int[] numeros = new int[text.length];

        for(int i = 0; i < text.length; i++){
            numeros[i] = Integer.parseInt(text[i]);
        }

       /* for(int j = 0; j < numeros.length; j++){
            System.out.println(numeros[j]);
        }*/

        File f1 = new File("/Users/luisaldogb/Downloads/Proyecto 1 EDA II/src", "f1.txt");
        File f2 = new File("/Users/luisaldogb/Downloads/Proyecto 1 EDA II/src", "f2.txt");
        if(f1.createNewFile() && f2.createNewFile()){
            System.out.println("Creando los archivos auxiliares...");
        }else{
            System.out.println("Valio verga no estas viendo");
        }
        /*String file1 = f1.getAbsolutePath();
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


        int bloques = (int) Math.ceil(numeros.length / opc);
        int i = 1;

         int global = 0;
         int iterar = 0;
        while(i <= bloques){
            if((i % 2)== 0){
                while(global < opc && iterar < numeros.length){
                    arrfichero2[iterar] = numeros[iterar];
                    System.out.println("arrfichero2 = " + arrfichero2[iterar]);
                    global += 1;
                    System.out.println("global2 = " + global);
                    iterar++;
                    System.out.println("iterar2 = " + iterar);
                }
                global = 0;
            }else{
                while(global < opc && iterar < numeros.length){
                    arrfichero1[iterar] = numeros[iterar];
                    System.out.println("arrfichero1 = " + arrfichero1[iterar]);
                    global += 1;
                    System.out.println("global2 = " + global);
                    iterar++;
                    System.out.println("iterar1 = " + iterar);
                }
                global = 0;
            }
            i++;
        }








    }
}
