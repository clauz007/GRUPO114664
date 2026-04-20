package clases;
import java.time.LocalDate;

public class Proveedores {

	private int codigo;
	private String nom, raznSocl, ruc, telf, correo, contacto, tipoProdc;
	private boolean frecuente, activo; 
	private LocalDate fechaRegis;
	
	public Proveedores(int codigo, String nom, String raznSocl, String ruc, String telf, String correo, String contacto,
			String tipoProdc, boolean frecuente, boolean activo, LocalDate fechaRegis) {
		this.codigo = codigo;
		this.nom = nom;
		this.raznSocl = raznSocl;
		this.ruc = ruc;
		this.telf = telf;
		this.correo = correo;
		this.contacto = contacto;
		this.tipoProdc = tipoProdc;
		this.frecuente = frecuente;
		this.activo = activo;
		this.fechaRegis = fechaRegis;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRaznSocl() {
		return raznSocl;
	}

	public void setRaznSocl(String raznSocl) {
		this.raznSocl = raznSocl;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getTipoProdc() {
		return tipoProdc;
	}

	public void setTipoProdc(String tipoProdc) {
		this.tipoProdc = tipoProdc;
	}


	public boolean isFrecuente() {
		return frecuente;
	}

	public void setFrecuente(boolean frecuente) {
		this.frecuente = frecuente;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public LocalDate getFechaRegis() {
		return fechaRegis;
	}

	public void setFechaRegis(LocalDate fechaRegis) {
		this.fechaRegis = fechaRegis;
	}

}
