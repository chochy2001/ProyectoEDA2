import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);// Creamos un nuevo objeto de la clase Scanner para realizar entrada por el teclado.
        short opc;// Variable para poder seleccionar el tipo de ordenamiento.
        String nombreArchivo;
        System.out.println("Bienvenido escriba el nombre del archivo ( seguido de extensión .txt)");
        nombreArchivo = sc.nextLine();// Recibimos el nombre del archivo, dado por el usuario.

        File carpeta = new File("G:\\Proyecto 1 EDA II\\Proyecto 1 EDA II\\src"); //Se pasa la dirección de la carpeta
        File archivo = null; // Se crea la referencia al archivo si es que existe
        File[] list = carpeta.listFiles(); // Se crea una lista de los archivos que se encuentren en la carpeta

        if(list != null){ // Si la carpeta contiene archivos entra en el if
            for(File recorrerCarpeta: list){
                if(nombreArchivo.equalsIgnoreCase(recorrerCarpeta.getName())){//Evaluamos si el nombre del archivo
                    // (Ignorando sus mayusculas o minusculas es igual a alguno que se encuentre en la lista previamente creada).

                    System.out.println(recorrerCarpeta.getAbsoluteFile()); //Devuelve la forma absoluta del pathname asignado.
                    archivo = new File(String.valueOf(recorrerCarpeta.getAbsoluteFile())); //Se crea la referencia al archivo4
                }
            }
        }
        if(archivo == null){//El archivo no se encuentra en la ruta que especifico el usuario.
            System.out.println("No se encontró el archivo");
            System.exit(0);
        }


        System.out.println("¿Que algoritmo de ordenamiento desea utilizar?");

        //Creamos bucle do-while para que no se detenga la ejecución del programa hasta que el usuario lo requiera.
        do{
            System.out.println("1.Ordenamiento Polifase\n2.Ordenamiento Mezcla Equilibrada\n3.Ordenamiento Radix\n4.Salir");
            opc = sc.nextShort();//Entramos en las clases respectivas pasando siempre el archivo segun la seleccion del usuario.
            switch (opc){
                case 1:
                    Polifase.polifase(archivo);//Entramos a la clase correspondiente al Ordenamiento por Polifase
                    break;
                case 2:
                    //Entramos a la clase correspondiente al Ordenamiento por Polifase
                    break;
                case 3:
                    Radix.radix(archivo);//Entramos a la clase correspondiente al Ordenamiento por Polifase
                    break;
                case 4:
                    System.out.println("Vuelva pronto");//Entramos en el case de Salir del usuario.
                    break;
                default:
                    System.out.println("Digite un número válido");//En caso de no poner un numero valido se entra en este caso
            }
        }while(opc > 0 && opc < 4);//El bucle de la seleccion continua mientras el valor ingresado por el usuario sea mayor a 0 y menor a 4
    }
    //se tiene que ver cada una de las iteraciones en el archivo de las listas. o al fina
}
