package zadaca3;

public class Proizvod {
	private String ime;
	private int cena;
	private String proizvoditel;
	private int tezina;
	
	public Proizvod() {
		this.ime = "mastiki";
		this.cena = 30;
		this.proizvoditel = "Orbit";
		this.tezina = 22;
		}
	public String getIme(){
		return ime;
	}
	public void setIme(String ime){
		this.ime=ime;
	}
	public int getCena(){
		return cena;
	}
	public void setCena(int cena){
		this.cena=cena;
	}
	public String getProizvoditel(){
		return proizvoditel;
	}
	public void setProizvoditel(String proizvoditel){
		this.proizvoditel=proizvoditel;
	}
	public int getTezina(){
		return tezina;
	}
	public void setTezina(int tezina){
		this.tezina=tezina;
	}
}
