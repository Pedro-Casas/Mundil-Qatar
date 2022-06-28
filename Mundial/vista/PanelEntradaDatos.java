package vista;

import javax.swing.JComboBox;

import javax.swing.JLabel;

import java.awt.Color;

import java.net.URL;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lx;
    private JLabel ly;
    private JLabel lp;
    private JLabel lc;
    private JTextField tfp;
    private JTextField tfc;
    private JComboBox cbEquipos;
    private JComboBox cbContinentes;
    private String[] equipos = {"costa rica","Senegal","marruecos","Polonia","Qatar","Dinamarca","Belgica","Japaon","Portugal","Argentina","arabia Saudita","Serbia","Alemania","Ecuador","Brasil","Inglaterra","Países Bajos","Estados Unidos","Gales", "Corea del Sur","Ghana", "Túnez","Croacia", "México",  "Australia","Canadá","Suiza",  "Irán","Uruguay"};
    private String[] continentes = {"América","Europa","Asia","África"};


    public PanelEntradaDatos(){

        lx = new JLabel("Equipo");
        lx.setBounds(10, 20, 150, 20);

        ly = new JLabel("Continente");
        ly.setBounds(10, 100, 130, 20);

        lp = new JLabel("Participaciones copas del mundo");
        lp.setBounds(120, 20, 200, 20);
        
        tfp = new JTextField();
        tfp.setBounds(200, 50, 40, 20);
        add(tfp);

        lc = new JLabel("Copas ganadas");
        lc.setBounds(160, 100, 130, 20);

        tfc = new JTextField();
        tfc.setBounds(170, 120, 40, 20);
        add(tfc);

        /* 
        iImagen = newImagenIcon(getClass().getResource("FIFA.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(250,30,220,176);
        add(lbImagen);
        */
        this.add(lx);
        this.add(ly);
        this.add(lp);
        this.add(lc);
        
        cbEquipos = new JComboBox();
        for(int i=0; i<equipos.length;i++)
        {
            cbEquipos.addItem(equipos[i]);
        }
        cbEquipos.setBounds(10,50,110,20);
        this.add(cbEquipos);

        cbContinentes = new JComboBox();
        for(int i=0; i<continentes.length;i++)
        {
            cbContinentes.addItem(continentes[i]);
        }
        cbContinentes.setBounds(10,120,110,20);
        this.add(cbContinentes);


        this.setLayout(null);
        this.setBackground(Color.orange);

    }

    private ImageIcon newImagenIcon(URL resource) {
        return null;
    }

    public String getEquipo()
    {
        return (String) cbEquipos.getSelectedItem();
    }

    public String getContinente()
    {
        return (String) cbContinentes.getSelectedItem();
    }

    public String getParticipaciones() {
        return tfp.getText();
    }

    public String getCopas() {
        return tfc.getText();
    }

}
