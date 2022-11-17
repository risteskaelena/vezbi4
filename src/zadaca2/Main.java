package zadaca2;

public class Main {

	public static void main(String[] args) {
		Restoran restoran = new Restoran();
		
		restoran.setIme("Aura");
		restoran.setLokacija("Ilindenska");
		restoran.setTelefon("078456321");
		restoran.setSedista(80);
		
		System.out.println("Ime: " + restoran.getIme());
		System.out.println("Lokacija: " + restoran.getLokacija());
		System.out.println("Telefon: " + restoran.getTelefon());
		System.out.println("Sedista: " + restoran.getSedista());
	}

}
