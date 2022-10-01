package controller;

import model.cliente;
import javax.swing.*;

public class metodos {

	public boolean avalia(cliente client) {

		int rgSize = client.rg.length();
		int cnhSize = client.cnh.length();
		int certSize = client.cert.length();

		if ((rgSize == 9) && (cnhSize == 11) && (certSize == 32)) {
			JOptionPane.showMessageDialog(null, "Documentos válidos");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Documentos inválidos"); 
			return false;
		}
	}

	public void consulta(Fila fila) {
		try {
			fila.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
