package br.com.fiap;

public class TelevisorEncapsulada {
	//atributos
	private int volume;
	private int canal;
	
	//getters & setters
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;
			} else {
				throw new Exception("Volume máximo "
						+ " permitido (0 a 100)");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		try {
			if (canal >= 0 && canal <= 300) {
				this.canal = canal;
			} else {
				throw new Exception("Canal inválido"
						+ " (0 a 300)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//métodos
	public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public void mostrar() {
		System.out.println("Volume: " + volume
				+ "\nCanal: " + canal);
	}
}