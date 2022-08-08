package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * @author biawenzel
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() { //private garante que ninguem de fora vai mexer no projeto
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}