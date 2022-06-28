package vista;

import java.awt.Color;

import javax.swing.JButton;

import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    // Atributos

    public JButton btEntrenador;
    public JButton btJugador;
    public JButton btInformacion;
    public JButton btSalir;


    // Metodos


    /*Metodo constructor */
    public PanelOperaciones()
    {

        this.setLayout(null);
        this.setBackground(Color.cyan);

        btEntrenador = new JButton("Director");
        btEntrenador.setBounds(20,40,90,30);
        this.add(btEntrenador);
        btEntrenador.setActionCommand("director");
        btEntrenador.setEnabled(false);

        btJugador = new JButton("Jugador");
        btJugador.setBounds(115,40,90,30);
        this.add(btJugador);
        btJugador.setActionCommand("jugador");
        btJugador.setEnabled(false);

        btInformacion = new JButton("Informacion");
        btInformacion.setBounds(210,40,100,30);
        this.add(btInformacion);
        btInformacion.setActionCommand("informacion");

    }

    public void activarBotones()
    {
        btEntrenador.setEnabled(true);
        btJugador.setEnabled(true);
    }
}