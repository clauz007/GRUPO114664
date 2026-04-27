package clases;

import java.time.LocalDate;

public class Distribuidor {
	private int codigo;
	private String nombre, razonSoc, ruc, tipoProdc, correo, nomContc, telf; 
	private LocalDate fechaRegis;
	
	public Distribuidor(int codigo, String nombre, String razonSoc, String ruc, String tipoProdc,
			LocalDate fechaRegis) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.razonSoc = razonSoc;
		this.ruc = ruc;
		this.tipoProdc = tipoProdc;
		this.fechaRegis = fechaRegis;
	}
	public Distribuidor(int codigo, String nombre, String correo, String nomContc, String telf) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.correo = correo;
		this.nomContc = nomContc;
		this.telf = telf;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRazonSoc() {
		return razonSoc;
	}
	public void setRazonSoc(String razonSoc) {
		this.razonSoc = razonSoc;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTipoProdc() {
		return tipoProdc;
	}
	public void setTipoProdc(String tipoProdc) {
		this.tipoProdc = tipoProdc;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNomContc() {
		return nomContc;
	}
	public void setNomContc(String nomContc) {
		this.nomContc = nomContc;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	public LocalDate getFechaRegis() {
		return fechaRegis;
	}
	public void setFechaRegis(LocalDate fechaRegis) {
		this.fechaRegis = fechaRegis;
	}

}
