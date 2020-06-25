package com.yan.EjercicioInterfaces;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera playera = new Playera(1, 3.5, "Ch", "r", "Recto");
		Jeans jeans = new Jeans(2, 799, "M", "a", "Recto", "H");
		Calcetin calcetin = new Calcetin(3, 25.5, "Gr", "b");
		PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(4, 300, "M", "Am");
		SmartPhone smartPhone = new SmartPhone(6, "Nokia", "x", 2700, "Telefonia");
		
		playera.mostrarDatos("playera");
		playera.hacerDevolucion();
		smartPhone.mostrarDatos();
		smartPhone.hacerDevolucion();
		//notar que del objeto playeraPersonalizada, no se puede implementar el método hacerDevolucion(); porque 
		//la clase PlayeraPersonalizada no implementa la interfaz IDevolucion, donde se declaró el método 
		//hacerDevolucion();
		playeraPersonalizada.mostrarDatos("playera de Yan");

	}

}
