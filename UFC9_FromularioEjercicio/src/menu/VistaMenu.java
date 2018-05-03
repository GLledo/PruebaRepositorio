package menu;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class VistaMenu extends JFrame {
	
	private Button boton1,boton2;
	private JTextField nombre, apellido, dni, edad;
	private JPanel panel1, panel2, panel3;//paneles
	private JLabel texto1, texto2, texto3, texto4;
	
	private BorderLayout layout1;//organiza
	private BoxLayout layout2;//organiza
	private BoxLayout layout3;//organiza 
	
	public VistaMenu() { 
		super("Formulario");
		inicializar();
		hacerVisible();
	}//constructor
	
	public void inicializar() {
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		layout1 = new BorderLayout();
		layout2 = new BoxLayout(panel2,BoxLayout.X_AXIS);
		layout3 = new BoxLayout(panel3,BoxLayout.Y_AXIS);
		
		panel1.setLayout(layout1);
		panel2.setLayout(layout2);
		panel3.setLayout(layout3);
		
		getContentPane().add(panel1);
		
		panel1.add(panel2,BorderLayout.SOUTH);//Colocamos el panel 2
		panel1.add(panel3,BorderLayout.CENTER);//Colocamos el panel 3
		
		//Botones
		
		boton1 = new Button("Enviar");
		boton2 = new Button("Limpiar");
		
		//falta añadir la funciones del controlador para el switch
		
		boton1.setActionCommand(CVistaMenu.ENVIAR);
		boton2.setActionCommand(CVistaMenu.RESET);
		
		//Añadimos botones al panel2
		
		panel2.add(boton1);
		panel2.add(boton2);
		
		//Jlabel Son las etiquetas que quieres q salgan
		
		texto1 = new JLabel("NOMBRE");
		texto2 = new JLabel("APELLIDO");
		texto3 = new JLabel("EDAD");
		texto4 = new JLabel("DNI");
		
		//texto Para que el usuario escriba
		
		nombre = new JTextField();
		apellido = new JTextField();
		edad = new JTextField();
		dni = new JTextField();
		
		//Construir panel 3 Los ordenamos por orden segun la Y
		
		panel3.add(texto1);
		panel3.add(nombre);
		panel3.add(texto2);
		panel3.add(apellido);
		panel3.add(texto3);
		panel3.add(edad);
		panel3.add(texto4);
		panel3.add(dni);
		
	}//inicializar
	
	public void hacerVisible() {
		//posicion de pantalla 
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension tpantalla = resolucion.getScreenSize();
		int altoPantalla = tpantalla.height;
		int anchoPantalla = tpantalla.width;
		
		setSize(anchoPantalla / 2, altoPantalla / 2);
		setLocation(anchoPantalla/4,altoPantalla/4);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// le dice lo que tiene que hacer al presionar la foto
		// setLocationRelativeTo(null); //aparece la ventana en el medio
		// pack();
		setVisible(true);// hace que la ventana sea visible
	}//hacerVisible
	
	public void addActionListener(CVistaMenu cv1) {
		boton1.addActionListener(cv1);
		boton2.addActionListener(cv1);
	}//EscuchaBotones

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JTextField getApellido() {
		return apellido;
	}

	public void setApellido(JTextField apellido) {
		this.apellido = apellido;
	}

	public JTextField getDni() {
		return dni;
	}

	public void setDni(JTextField dni) {
		this.dni = dni;
	}

	public JTextField getEdad() {
		return edad;
	}

	public void setEdad(JTextField edad) {
		this.edad = edad;
	}
}//class
