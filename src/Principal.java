import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static Scanner input = new Scanner(System.in);
	public static int scoreTotal = 0;
	
	public static void main(String[] args) throws IOException{
		
		// inicializa o jogo
		
		FabricaDeMecanicas f = new FabricaDeMecanicas();
		boolean loopMenu = true;
		boolean teste = false;
		int chances;
		
		
		while(loopMenu) {
			System.out.println("\n---------MENU---------");
			System.out.println("\n-   1. Modo Fácil    -");
			System.out.println("\n-   2. Modo Difícil  -");
			System.out.println("\n-   3. Pontuação     -");
			System.out.println("\n-   4. Sair          -");
			System.out.println("\n----------------------");
			String menu = input.nextLine();

		switch (menu) {
				case "1":
					
					MecanicaDoJogo mFacil = f.getMecanicaUm();
					String palavraEscAleatoria = mFacil.getPalavraAleatoria();
					String palavraEscEmbaralhada = mFacil.getPalavraEscEmbaralhada();
					
					System.out.println("________________________________________________________");
					System.out.println("\nModo de Jogo: Fácil \n6 chances ao total!");
					System.out.println("\nDigite da forma correta a palavra a seguir: "+palavraEscEmbaralhada);
					teste = mFacil.testeDaPalavra(input.nextLine());
					chances = 1;
					int score1 = 6;
					
					if(teste) {
						System.out.println("Resposta Correta, acerto na "+chances+"ª chance!");
						System.out.println("________________________________________________________");
						scoreTotal = scoreTotal + score1;
						break;
					}	
				
					while(!mFacil.fimDeJogo(chances)) {
						
							System.out.println("Errado!! Tente Novamente!");
							System.out.println("Tentativa n°: "+chances);
							System.out.println("Digite a palavra a seguir da forma correta: "+palavraEscEmbaralhada);
							teste = mFacil.testeDaPalavra(input.nextLine());
							chances++;
							score1--;
							
							if(teste) {
								System.out.println("Resposta Correta, acerto na "+chances+"ª chance!");
								System.out.println("________________________________________________________");
								scoreTotal = scoreTotal + score1;
								break;
							}		
							if(chances == 7) {
								System.out.println("Fim de Jogo. A resposta era: "+palavraEscAleatoria);
								score1 = 0;
								System.out.println("________________________________________________________");
								scoreTotal = scoreTotal + score1;
								break;
							}
					}
					
					break;
				
				case "2":
				
					MecanicaDoJogo mDificil = f.getMecanicaDois();
					String palavraEscAleatoriaD = mDificil.getPalavraAleatoria();
					String palavraEscEmbaralhadaD = mDificil.getPalavraEscEmbaralhada();
				
					System.out.println("\nModo de Jogo: Difícil \n3 chances ao total!");
					System.out.println("\nDigite da forma correta a palavra a seguir: "+palavraEscEmbaralhadaD);
					teste = mDificil.testeDaPalavra(input.nextLine());
					chances = 1;
					int score2 = 3;
				
					if(teste) {
						System.out.println("Resposta Correta, acerto na "+chances+"ª chance!");
						score2--;
						scoreTotal = scoreTotal + score2;
						break;
					}
					
					while(!mDificil.fimDeJogo(chances)) {
						
						System.out.println("Errado!! Tente Novamente!");
						System.out.println("Tentativa n°: "+chances);
						System.out.println("Digite a palavra a seguir da forma correta: "+palavraEscEmbaralhadaD);
						teste = mDificil.testeDaPalavra(input.nextLine());
						chances++;
						score2--;
						
						if(teste) {
							System.out.println("Resposta Correta, acerto na "+chances+"ª chance!");
							score2--;
							System.out.println("________________________________________________________");
							scoreTotal = scoreTotal + score2;
							break;
							
						}
						if(chances == 4) {
							System.out.println("Fim de Jogo. A resposta era: "+palavraEscAleatoriaD);
							score2 = 0;
							System.out.println("________________________________________________________");
							break;
						}	
					}
					
				
				case "3":
					System.out.println("\nA sua pontuação atual é: "+scoreTotal);
					break;
				
				case "4":
					loopMenu = false;
				}
			}
	
		System.out.println("\n----------FIM---------");;
		
	}
}
