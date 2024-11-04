package hilos;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


/*
 * @message Los hilos que se instancian a partir de esta clase escribiran
 * en un fichero llamado libro.txt
 *
 * Cada vez que se ejecute un hilo escribirá una linea con el siguiente formato
 * [yyyy/mm/dd HH:mm:ss] Soy el hilo  { nombre del hilo}
 * @author JuanJo
 * */
public class Escritor implements Runnable {

    private final String file = "C:\\Users\\ALUMNO CCC - TARDE\\Desktop\\AD\\hilos.txt";
    LocalDateTime date = LocalDateTime.now();
    private String dateF;
    private String title;

    public void setName(String title) {
        this.title = title;
    }

    @Override
    public void run() {

        dateF = date.toLocalDate() + " " + date.toLocalTime();
        System.out.println(dateF);
        System.out.println("Soy el hilo: " + title);
        writeTxt();
    }


    public void writeTxt() {
        try {
            FileWriter fW = new FileWriter(file, true);


            fW.append(dateF + " Soy el hilo" + title);
            fW.append(";");


            fW.append("\n");
            fW.close();
            System.out.println("El hilo se agregó correctamente!!");
        } catch (IOException e) {
            System.out.println("EL hilo no se agregó correctamente!!");
            throw new RuntimeException(e);
        }
    }
}
