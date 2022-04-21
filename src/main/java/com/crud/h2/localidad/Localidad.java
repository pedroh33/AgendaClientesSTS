package com.crud.h2.localidad;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Localidad {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String localidad;
	private int cp;
	private String provincia;
	private String pais;
	
	
	public Localidad() {
		
	}


	public Localidad(int id, String localidad, int cp, String provincia, String pais) {
		super();
		this.id = id;
		this.localidad = localidad;
		this.cp = cp;
		this.provincia = provincia;
		this.pais = pais;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
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
		Localidad other = (Localidad) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "Localidad [id=" + id + ", localidad=" + localidad + ", cp=" + cp + ", provincia=" + provincia
				+ ", pais=" + pais + "]";
	}
	
}