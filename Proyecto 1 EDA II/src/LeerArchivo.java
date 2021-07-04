import java.io.BufferedReader;
import java.io.FileReader;

public class LeerArchivo {
    public String leerTXT(String direccion){//este metodo va a recibir la direccion del archivo TXT
        String text = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                    temp = temp + bfRead;
            }
            text = temp;
        }catch (Exception e){
            System.out.println("No se encontro el archivo");
        }
        return text;
    }
}
