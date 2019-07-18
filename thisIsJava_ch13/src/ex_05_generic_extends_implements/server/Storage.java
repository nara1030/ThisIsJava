package ex_05_generic_extends_implements.server;

public interface Storage<T> {
	public void add(T item, int index);

	public T get(int index);
}
