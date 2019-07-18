package ex_05_generic_extends_implements.client;

import ex_01_multiType_parameter.server.Tv;
import ex_05_generic_extends_implements.server.ChildProduct;
import ex_05_generic_extends_implements.server.Storage;
import ex_05_generic_extends_implements.server.StorageImpl;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");

		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}
