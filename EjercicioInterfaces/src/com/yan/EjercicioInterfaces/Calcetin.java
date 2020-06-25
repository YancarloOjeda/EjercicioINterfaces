package com.yan.EjercicioInterfaces;

public class Calcetin extends Ropa implements IDevolucion{

	public Calcetin(int id, double precio, String talla, String color) {
		super(id, precio, talla, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolución de Calcetin");

	}

}
