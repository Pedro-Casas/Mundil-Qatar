package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{

    // Atributos

    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoDirector miDialogoDirector;
    public DialogoJugador miDialogoJugador;

    // Metodos

    /*Método constructor*/
    public VentanaPrincipal()
    {

        this.setLayout(null);


        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,450,240);
        this.add(miPanelEntradaDatos);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,255,450,100);
        this.add(miPanelOperaciones);


        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,360,450,290);
        this.add(miPanelResultados);
        
        miDialogoDirector = null;
        
        
        this.setTitle("FIFA");
        this.setSize(490,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void crearDialogoDirector()
    {
        miDialogoDirector = new DialogoDirector();
    }
    
    public void crearDialogoJugador()
    {
        miDialogoJugador = new DialogoJugador();
    }
    
}
