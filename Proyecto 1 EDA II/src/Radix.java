import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Radix {
        public static void radix(File archivo) throws IOException {
            int i, j;
            short opc;
            List< Queue <Integer> > kurama = new LinkedList<>();
            List<Integer> lista = new ArrayList<>(); //Creamos una lista como un arreglo

            opc = ordenar();


            for(int k = 0; k < 10; k++){
                Queue<Integer> colaPos = new LinkedList<>();
                kurama.add(colaPos);
            }

            LeerArchivo ls = new LeerArchivo();
            String temp1 = archivo.getAbsolutePath();
            System.out.println(ls.leerTXT(temp1));
            String aux = ls.leerTXT(temp1);
            String [] text = aux.split(",");


            for (String s : text) {
                lista.add(Integer.parseInt(s));
            }

            int temp, unidades, decenas, centenas;

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
                        Imprimir(kurama);
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
    public static void Imprimir(List<Queue<Integer>> lis){
        System.out.println("Kurama = " + lis);
    }

    public static short ordenar(){
            Scanner sc = new Scanner(System.in);
            short opc;
            System.out.println("¿Como desea ordenar su archivo? \n1.Ascendente\n2.Descendente");
            opc = sc.nextShort();
            return opc;
    }
}
