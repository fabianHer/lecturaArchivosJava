package app;
import java.io.*;

public class archivos {

    public String leerTxt(String direccion){ //direccion del archivo
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead +"\n";
            }
            texto = temp; 
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");            
        }
        return texto;
    }
    
}