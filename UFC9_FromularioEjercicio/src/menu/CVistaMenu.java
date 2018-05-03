package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import datosRellenados.VistaDatosRellenados;

public class CVistaMenu implements ActionListener{
	public final static String ENVIAR = "E";
	public final static String RESET = "R";
	private VistaMenu vm;
	
	public CVistaMenu (VistaMenu vm) {
		super();
		this.vm = vm;
	}
	public void actionPerformed(ActionEvent e) {
		
		String escucha = e.getActionCommand();
		
		switch (escucha) {
		case ENVIAR:
			
			VistaDatosRellenados v2 = new VistaDatosRellenados();
			String name = vm.getNombre().getText();
			v2.getNombre().setText(name);
			
			break;

		case RESET:
			JOptionPane.showMessageDialog(null,"Esta limpiando");
			break;
		}
	}
}
