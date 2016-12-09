package br.com.alura.threads.lista;

import java.util.List;

public class TarefaAdicionaElemento implements Runnable {

	private List<String> list;
	private int numeroThread;

	public TarefaAdicionaElemento(List<String> list, int numeroThread) {
		this.list = list;
		this.numeroThread = numeroThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			list.add("Thread " + numeroThread + " - " + i);
		}
	}

}
