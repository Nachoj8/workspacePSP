package videojuego;

public class MainVideojuego {

	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Conan");
		g1.setVida(300);
		Arma arma = new Espada("Bastarda");
		arma.setDaño(300);
		g1.setArma(arma);
		g1.atacar();
		
		Guerrero g2 = new Guerrero();
		g2.setNombre("Legolas");
		g2.setVida(500);
		arma = new Arco();
		arma.setTipo("Largo");
		arma.setDaño(100);
		g2.setArma(arma);
		g2.atacar();
		
		
		
	}
	
}
