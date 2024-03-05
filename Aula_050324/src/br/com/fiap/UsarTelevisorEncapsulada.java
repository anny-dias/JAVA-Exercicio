package br.com.fiap;

public class UsarTelevisorEncapsulada {

	public static void main(String[] args) {
		
		TelevisorEncapsulada televisor1 = new TelevisorEncapsulada();
		
		televisor1.setCanal(150);
		televisor1.setVolume(99);
		televisor1.mostrar();
		
		televisor1.setCanal(278);
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.mostrar();
		

	}

}
