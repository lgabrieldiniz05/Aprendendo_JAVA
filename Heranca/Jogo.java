package heranca;

public class Jogo {
	
	public static void main(String[] args) {
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;


		
		
		System.out.println(monstro.vida);
		System.out.println(monstro.vida);

		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		System.out.printf("Vida do monstro %d\n", monstro.vida);
		System.out.printf("Vida do Heroi %d",  heroi.vida);
	}

}