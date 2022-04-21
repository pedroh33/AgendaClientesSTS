package com.crud.h2.ubicacion;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Ubicacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	private String calle;
	private int altura;
	private String localidad;
	
	public Ubicacion () {
		
	}

	public Ubicacion(int id, String calle, int altura, String localidad) {
		super();
		Id = id;
		this.calle = calle;
		this.altura = altura;
		this.localidad = localidad;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ubicacion other = (Ubicacion) obj;
		return Id == other.Id;
	}

	@Override
	public String toString() {
		return "Ubicacion [Id=" + Id + ", calle=" + calle + ", altura=" + altura + ", localidad=" + localidad + "]";
	}
	
	
}