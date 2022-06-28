package vista;

import java.awt.Color;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;


public class PanelResultados extends JPanel
{

    // Atributos
    private JTextArea taResultado;
    private JScrollPane spResultado;
   

    // Metodos

    /*Metodo constructor */
    public PanelResultados()
    {

        this.setLayout(null);
        this.setBackground(Color.darkGray);


        taResultado= new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,430,260);
        this.add(spResultado);

    }

    public void mostrarResultado(String msg)
    {
        taResultado.append(msg + "\n");
    }

    
    public void borrar()
    {
        taResultado.setText("");
    }  
    
}
