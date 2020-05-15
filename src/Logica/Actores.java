package Logica;

public class Actores {
	public int puntosVida;
	public int ataque;
	public int defensa;
	public int potencialHabilidad;
	public int puntos;
 	
 	
 	
 	
 	
	public void perdervida(int daño) {
		puntosVida -= daño;
	}
	public void curar(int cura) {
		puntosVida += (int) (Math.sqrt(cura*potencialHabilidad));
	}
	public void aumentarDaño (int cambio) {
		ataque += cambio;
	}
	public void amentarDefensa(int cambio) {
		defensa += cambio;
	}
}