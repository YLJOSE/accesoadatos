package ApisNew;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsumoApi {
    public static void main(String[] args) {
        // solicitar una peticion

        // https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m
        try {
            URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("Ocurrio un error" + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());

                while (sc.hasNext()) {
                    informationString.append(sc.nextLine());
                }

                sc.close();
                System.out.println(informationString);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // comprobar la peticion

        // abrir un Scanner para la lectura de flujo de datos

        // Imprimir la informacion por consola
    }
}
