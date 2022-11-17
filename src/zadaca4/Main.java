package zadaca4;

public class Main {

	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Opel", "Corsa", 100000, "Crna");
		
		System.out.println(avtomobil.getMarka());
		System.out.println(avtomobil.getModel());
		System.out.println("Kilometri: " + avtomobil.getKilometri());
		System.out.println("Pomnozeni kilometri: " + avtomobil.mnozenje(2));
		System.out.println(avtomobil.getBoja());
	}

}
