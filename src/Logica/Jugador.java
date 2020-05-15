package Logica;

public class Jugador extends Actores {
	public Jugador () {
		super.puntosVida = 100;
		super.ataque = 5;
		super.defensa = 0;
		super.potencialHabilidad = 5;
		super.puntos = 1;
	}
	public String getVida() {
 		return ""+puntosVida;
 	}
	public String getAtaque() {
 		return ""+ataque;
 	}
	public String getDefensa() {
 		return ""+defensa;
 	}
	public String getPotencial() {
 		return ""+potencialHabilidad;
 	}
	public String getPuntos() {
 		return ""+puntos;
 	}
	
}
