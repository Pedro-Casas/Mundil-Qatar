package vista;

import java.awt.Font;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JDialog;

import javax.swing.JLabel;

import javax.swing.JTextField;

public class DialogoDirector extends JDialog
{
    //Atributos
    private JLabel lbNombre;
    private JLabel lbFechaNacimiento;
    private JLabel lbDia;
    private JLabel lbMes;
    private JLabel lbAño;
    private JLabel lbTitulo;
    private JLabel lbExperiencia;
    private JTextField txNombre;
    private JTextField txExperiencia;
    private JTextField txDia;
    private JTextField txMes;
    private JTextField txAño;
    private JButton btAceptar;

    //Métodos
    
    //Método constructor
    public DialogoDirector()
    {

        setLayout(null);


        lbTitulo = new JLabel("Datos entrenador",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        lbTitulo.setBounds(150,10,300,20);
        add(lbTitulo);

        lbNombre= new JLabel("nombre: ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,100,20);
        add(lbNombre);
        
        lbExperiencia= new JLabel("experiencia: ",JLabel.RIGHT);
        lbExperiencia.setFont(new Font("Arial", Font.BOLD, 15));
        lbExperiencia.setBounds(18,90,120,20);
        add(lbExperiencia);

        lbFechaNacimiento= new JLabel("Nacimiento: ",JLabel.RIGHT);
        lbFechaNacimiento.setFont(new Font("Arial", Font.BOLD, 15));
        lbFechaNacimiento.setBounds(10,135,195,20);
        add(lbFechaNacimiento);

        lbDia= new JLabel("dia: ",JLabel.RIGHT);
        lbDia.setFont(new Font("Arial", Font.BOLD, 15));
        lbDia.setBounds(240,115,60,20);
        add(lbDia);

        lbMes= new JLabel("mes: ",JLabel.RIGHT);
        lbMes.setFont(new Font("Arial", Font.BOLD, 15));
        lbMes.setBounds(330,115,60,20);
        add(lbMes);

        lbAño= new JLabel("qño: ",JLabel.RIGHT);
        lbAño.setFont(new Font("Arial", Font.BOLD, 15));
        lbAño.setBounds(400,115,60,20);
        add(lbAño);

        txNombre= new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(115,45,100,25);
        add(txNombre);
        
        txExperiencia= new JTextField();
        txExperiencia.setFont(new Font("Arial", Font.BOLD, 15));
        txExperiencia.setBounds(150,85,30,25);
        add(txExperiencia);

        txDia= new JTextField();
        txDia.setFont(new Font("Arial", Font.BOLD, 15));
        txDia.setBounds(270,135,30,20);
        add(txDia);

        txMes= new JTextField();
        txMes.setFont(new Font("Arial", Font.BOLD, 15));
        txMes.setBounds(355,135,30,20);
        add(txMes);

        txAño= new JTextField();
        txAño.setFont(new Font("Arial", Font.BOLD, 15));
        txAño.setBounds(425,135,50,20);
        add(txAño);


        btAceptar = new JButton("aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(200,190,200,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);


        setTitle("Datos entrenador");
        setSize(570,350);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public String getNombre()
    {
        return txNombre.getText();
    }
    
    public String getExperiencia()
    {
        return txExperiencia.getText();
    }
    
    public String getDia()
    {
        return txDia.getText();
    }

    public String getMes()
    {
        return txMes.getText();
    }

    public String getAño()
    {
        return txAño.getText();
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }         
}
