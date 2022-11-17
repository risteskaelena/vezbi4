package zadaca3;

public class Main {

	public static void main(String[] args) {
		Proizvod proizvod = new Proizvod();
		
		System.out.println("Ime: " + proizvod.getIme());
		System.out.println("Cena: " + proizvod.getCena() + " denari");
		System.out.println("Proizvoditel: " + proizvod.getProizvoditel());
		System.out.println("Tezina: " + proizvod.getTezina() + "g.");
	}
}
