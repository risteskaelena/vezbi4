package vezbi4;

public class Main {

	public static void main(String[] args) {
		Covek covek = new Covek();
		
		covek.setIme("Stefan");
		covek.setPrezime("Stefanovski");
		covek.setMaticen("0503998455128");
		
		System.out.println("Ime: " + covek.getIme());
		System.out.println("Prezime: " + covek.getPrezime());
		System.out.println("Maticen broj: " + covek.getMaticen());
	}

}
