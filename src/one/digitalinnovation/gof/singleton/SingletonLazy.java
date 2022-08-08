package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso": primeiro verifica pra depois instanciar
 * @author biawenzel
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() { //private garante que ninguem de fora vai mexer no projeto
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
