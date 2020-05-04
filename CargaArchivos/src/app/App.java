package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo Puerco");
        archivos a = new archivos();
        String leer=a.leerTxt("C:\\Users\\LIMPIAEXPRESS\\Documents\\documento.txt");
        System.out.println(leer);
    }
}