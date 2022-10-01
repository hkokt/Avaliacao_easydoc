package view;

import javax.swing.*;

import controller.Fila;
import controller.metodos;
import model.cliente;

public class Principal {

	public static void main(String[] args) {

		cliente client = new cliente();

		metodos m = new metodos();

		Fila f = new Fila();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("1 -  Cadastra cliente \n 2 - Consulta documentos \n 9 - Finaliza"));
			switch (opc) {
			case 1:
				client.rg = JOptionPane.showInputDialog("Digite o RG:");
				client.cnh = JOptionPane.showInputDialog("Digite a CNH:");
				client.cert = JOptionPane.showInputDialog("Digite o numero de Certidão de nascimento:");
				if (m.avalia(client)) {
					f.insert("RG " + client.rg);
					f.insert("CNH " + client.cnh);
					f.insert("Certidão de nascimento" + client.cert);
				} else {
					JOptionPane.showInputDialog("Dados incorretos, tente novamente");
				}
				break;
			case 2:
				m.consulta(f);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}
	}
}
