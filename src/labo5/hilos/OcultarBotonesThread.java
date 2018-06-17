package labo5.hilos;

import javax.swing.JButton;

/**
 *
 * @author Cesar Rosales <00060917@uca.edu.sv>
 */
public class OcultarBotonesThread extends Thread {

    private static OcultarBotonesThread instance;
    private boolean llegoC = false;
    private boolean llegoT = false;
    private boolean llegoD = false;
//    private int limite;
//    private int locC;
//    private int locT;
//    private int locD;
    private JButton boton;
    private boolean estadoBoton;

    public OcultarBotonesThread() {
    }

    public OcultarBotonesThread(JButton boton, boolean estadoBoton) {
        this.boton = boton;
        this.estadoBoton = estadoBoton;
    }

//    public synchronized static OcultarBotonesThread getInstance() {
//        if (instance == null) {
//            instance = new OcultarBotonesThread();
//        }
//        return instance;
//    }

    @Override
    public void run() {
//        while (true) {
        if (llegoC == true && llegoT == true && llegoD == true) {
            boton.setVisible(true);
        }
//            break;
//        }
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cambiarEstado(boolean estado, String nombre) {
        if (nombre.equals("canguro")) {
            llegoC = estado;
        }
        if (nombre.equals("tortuga")) {
            llegoT = estado;
        }
        if (nombre.equals("dragon")) {
            llegoD = estado;
        }

    }
}
