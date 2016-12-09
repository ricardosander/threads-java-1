package br.com.alura.threads.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		
		List<String> list = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionaElemento(list, i)).start();
		}
		
		System.out.println("Vamos aguardar.");
		Thread.sleep(10000);
		System.out.println("Vamos imprimir.");
		
		list.forEach(System.out::println);
	}
}
