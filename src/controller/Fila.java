package controller;

import javax.swing.JOptionPane;

public class Fila {

	No inicio;
	No fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(Object valor) {
		No elemento = new No();
		elemento.dado = valor;

		if (inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else {
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
	}

	public Object remove() throws Exception {
		No auxiliar = inicio;
		if (isEmpty()) {
			throw new Exception("fila vazia");
		}
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		return auxiliar.dado;
	}

	public void list() throws Exception {
		No auxiliar = inicio;
		if (isEmpty()) {
			throw new Exception("fila fazia");
		}
		while (auxiliar != null) {
			JOptionPane.showMessageDialog(null,auxiliar);
			auxiliar = auxiliar.proximo;
		}
	}

	public int size() {
		int i = 0;
		if (isEmpty()) {
			No auxiliar = inicio;
			while (auxiliar != null) {
				i++;
				auxiliar = auxiliar.proximo;
			}
		}
		return i;
	}
}
