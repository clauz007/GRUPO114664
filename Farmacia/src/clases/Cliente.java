package clases;

import java.time.LocalDateTime;

public class Cliente {
	private int documento, celular;
	private String nombreCliente, dirección, correo;
	private LocalDateTime fechaRegistro;
	public Cliente(int documento, String nombreCliente, String dirección, String correo, int celular) {
		this.documento = documento;
		this.celular = celular;
		this.nombreCliente = nombreCliente;
		this.dirección = dirección;
		this.correo = correo;
		this.fechaRegistro = LocalDateTime.now();
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}

