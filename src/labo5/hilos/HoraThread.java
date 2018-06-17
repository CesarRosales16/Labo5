package labo5.hilos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTextField;

/**
 *
 * @author Cesar Rosales <00060917@uca.edu.sv>
 */
public class HoraThread extends Thread {

    private int hora, minutos, segundos;
    private JTextField reloj;
    
    

    @Override
    public void run() {

        while(true){
        Calendar reloj = new GregorianCalendar();
        hora = reloj.get(Calendar.HOUR_OF_DAY);
        minutos = reloj.get(Calendar.MINUTE);
        segundos = reloj.get(Calendar.SECOND);
        //System.out.println(hora + ":" + minutos + ":" + segundos);
        }

    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

}
