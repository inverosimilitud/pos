package Functions;

import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;

public class Dates{
     public static void fechaYhora(JLabel labelFecha, JLabel labelHora){
        // Inicia un hilo para actualizar la hora y fecha cada segundo
        Thread hilo = new Thread(){
            public void run(){
                while(true){
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String time = "Hora: " + now.format(timeFormat);
                    labelHora.setText(time);
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String date = "Fecha: " + now.format(dateFormat);
                    labelFecha.setText(date);
                    try {
                        sleep(1000); // Espera un segundo antes de actualizar los labels
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        hilo.start();
    }
}