package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado": instancia na hora
 * @author biawenzel
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() { //private garante que ninguem de fora vai mexer no projeto
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}