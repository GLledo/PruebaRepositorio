package datosRellenados;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class VistaDatosRellenados extends JFrame{
	
	private JPanel panel1, panel2;
	private BorderLayout layout1;//organiza
	private BoxLayout layout2;//organiza
	private JLabel nombre, apellido, dni, edad;
	private JLabel texto1, texto2, texto3, texto4;
	
	public VistaDatosRellenados () {
		super("Formulario");
		inicializar();
		hacerVisible();
	}//constructor
	
	public void inicializar() {
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		layout1 = new BorderLayout();
		layout2 = new BoxLayout(panel2,BoxLayout.Y_AXIS);
		
		panel1.setLayout(layout1);
		panel2.setLayout(layout2);
		
		getContentPane().add(panel1);
		
		panel1.add(panel2,BorderLayout.CENTER);//colocamos el panel 2
		
		//Jlabel Son las etiquetas que quieres q salgan
		
		texto1 = new JLabel("NOMBRE");
		texto2 = new JLabel("APELLIDO");
		texto3 = new JLabel("EDAD");
		texto4 = new JLabel("DNI");
		
		nombre = new JLabel("Nombre");
		apellido = new JLabel("Vacio");
		dni = new JLabel("Vacio");
		edad = new JLabel("Vacio");
		
		//Construir panel 3 Los ordenamos por orden sgun la Y
		
		panel2.add(texto1);
		panel2.add(nombre);
		panel2.add(texto2);
		panel2.add(apellido);
		panel2.add(texto3);
		panel2.add(edad);
		panel2.add(texto4);
		panel2.add(dni);
				
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

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellido() {
		return apellido;
	}

	public void setApellido(JLabel apellido) {
		this.apellido = apellido;
	}

	public JLabel getDni() {
		return dni;
	}

	public void setDni(JLabel dni) {
		this.dni = dni;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}
}
