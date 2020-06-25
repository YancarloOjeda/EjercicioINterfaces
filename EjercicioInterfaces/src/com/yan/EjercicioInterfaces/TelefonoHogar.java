package com.yan.EjercicioInterfaces;

public class TelefonoHogar extends Telefono implements IDevolucion {
	private boolean telefonia;

	public TelefonoHogar(int id, String marca, String modelo, double precio, boolean telefonia) {
		super(id, marca, modelo, precio);
		// TODO Auto-generated constructor stub
		this.telefonia = telefonia;
	}

	public boolean isTelefonia() {
		return telefonia;
	}

	public void setTelefonia(boolean telefonia) {
		this.telefonia = telefonia;
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolución de Telefono de casa");

	}

}
