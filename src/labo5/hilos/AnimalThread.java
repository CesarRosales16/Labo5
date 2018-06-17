package labo5.hilos;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author UCA
 */
public class AnimalThread extends Thread {

    private String nombre;
    private int x;
    private int y;
    private int limite;
    private JLabel animal;
    private JButton boton;

    public AnimalThread() {
    }

    public AnimalThread(String nombre, int x, int y, int limite, JLabel animal) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.limite = limite;
        this.animal = animal;
    }

    @Override
    public void run() {
//        boolean llegoC = false, llegoT = false, llegoD = false;
        for (int i = x; i <= this.limite; i += 10) {
            System.out.println(this.nombre + " avanza");
            this.animal.setLocation(i,y);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        OcultarBotonesThread verificador = new OcultarBotonesThread(boton,true);
        verificador.cambiarEstado(true,this.nombre);
        System.out.println(this.nombre + " a llegado a la meta");

        yield();
    }

}
