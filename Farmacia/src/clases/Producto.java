package clases;

public class Producto {
	private int código, stock, cVenta;
	private String nom;
	private double pCosto, pVenta;
	
	public Producto(int código, String nom, int stock, int cVenta, double pCosto, double pVenta) {
		this.código = código;
		this.stock = stock;
		this.cVenta = cVenta;
		this.nom = nom;
		this.pCosto = pCosto;
		this.pVenta = pVenta;	
	}
	
	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getcVenta() {
		return cVenta;
	}

	public void setcVenta(int cVenta) {
		this.cVenta = cVenta;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getpCosto() {
		return pCosto;
	}

	public void setpCosto(double pCosto) {
		this.pCosto = pCosto;
	}

	public double getpVenta() {
		return pVenta;
	}

	public void setpVenta(double pVenta) {
		this.pVenta = pVenta;
	}

}
