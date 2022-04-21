package com.crud.h2.cliente;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nombreCliente;
	private String apellidoCliente;
	private String eMail;
	
	public Cliente() {
		
	}

	public Cliente(int id, String nombreCliente, String apellidoCliente, String eMail) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente
				+ ", eMail=" + eMail + "]";
	}
	
	
}
