package br.com.textoreverso;

import java.util.Scanner;

public class TextoReverso {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		String texto = teclado.nextLine();
		StringBuilder textoReverso = new StringBuilder();
		for(Integer i = texto.length(); i > 0; i--) {
			textoReverso.append(String.valueOf(texto.charAt(i-1)));
		}
		System.out.println("\nReverso: " + textoReverso);
	}

}
