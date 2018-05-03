package main;

import datosRellenados.VistaDatosRellenados;
import menu.CVistaMenu;
import menu.VistaMenu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaMenu v1 = new VistaMenu();
        CVistaMenu cvm = new CVistaMenu(v1);
		
		v1.addActionListener(cvm);
		
		
	}

}
