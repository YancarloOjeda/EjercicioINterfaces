package com.yan.EjercicioInterfaces;

public class SmartPhone extends Telefono implements IDevolucion{
	private String SIM;
	
	public SmartPhone(int id, String marca, String modelo, double precio, String SIM) {
		super(id, marca, modelo, precio);
		// TODO Auto-generated constructor stub
		this.SIM = SIM; 
	}

	public String getSIM() {
		return SIM;
	}

	public void setSIM(String SIM) {
		this.SIM = SIM;
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolución de SmartPhone");
		
	}

}
