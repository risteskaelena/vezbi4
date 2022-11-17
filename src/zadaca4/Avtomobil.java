package zadaca4;

public class Avtomobil {
	private String marka;
	private String model;
	private double kilometri;
	private String boja;
	
	public Avtomobil(String marka, String model, double kilometri, String boja){
		this.marka = marka;
		this.model = model;
		this.kilometri = kilometri;
		this.boja = boja;
	}
	
	public double mnozenje (int pomnoziKm) {
		double rezultat = this.kilometri * pomnoziKm;
		return rezultat;
	}
	
	public String getMarka(){
		return marka;
	}
	public void setMarka(String marka){
		this.marka=marka;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}
	public double getKilometri(){
		return kilometri;
	}
	public void setKilometri(double kilometri){
		this.kilometri=kilometri;
	}
	public String getBoja(){
		return boja;
	}
	public void setBoja(String boja){
		this.boja=boja;
	}
}
