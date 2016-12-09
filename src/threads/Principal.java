package threads;

import br.com.alura.threads.ImprimeString;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Thread main.");
		Thread thread = new Thread(new ImprimeString());
		thread.start();
	}
}
