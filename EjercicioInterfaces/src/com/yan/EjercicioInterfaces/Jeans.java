package com.yan.EjercicioInterfaces;

public class Jeans extends Ropa implements IDevolucion {
	private String corte;
	private String genero;
	
	
	public Jeans(int id, double precio, String talla, String color, String corte, String genero) {
		super(id, precio, talla, color);//super clase o clase padre (Ropa)
		// TODO Auto-generated constructor stub
		this.corte = corte;
		this.genero = genero;
	}
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("corte = " + corte);
		System.out.println("genero = " + genero);
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolución de Jeans");
		
	}
	

}
