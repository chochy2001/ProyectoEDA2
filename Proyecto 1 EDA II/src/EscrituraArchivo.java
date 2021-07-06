import java.io.*;
import java.util.ArrayList;

public class EscrituraArchivo {

        public static void escribirDatos(ArrayList <ArrayList<Integer>> listArrayList,String ubicacionArchivo){
            FileWriter fichero = null;
            listArrayList.toString();

            try {
                fichero = new FileWriter(ubicacionArchivo);
                PrintWriter pw = new PrintWriter(new FileOutputStream(ubicacionArchivo,true));

                for (int i = 0; i < 10; i++){
                    pw.append("[ "+listArrayList+ "]\n").append(String.valueOf(i));
                }
                pw.close();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally para
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
}