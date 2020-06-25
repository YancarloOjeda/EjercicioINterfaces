package com.yan.EjercicioInterfaces;

public class Playera extends Ropa implements IDevolucion{
	
	private String corte;
	
	public Playera(int id, double precio, String talla, String color, String corte) {
		super(id, precio, talla, color);
		// TODO Auto-generated constructor stub
		this.corte = corte;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("corte = " + corte);
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolución de Playera");

	}
}
