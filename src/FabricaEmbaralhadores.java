

public class FabricaEmbaralhadores {

	//M�todo para retornar aleat�riamente um embaralhador
	
	public Embaralhador getEmbaralhadorAleatorio() {
		
		int random = (int) (Math.random()*10);
		if (random >= 0 && random <= 5) {
			return new PrimeiroEmbaralhador();
		}else {
			return new SegundoEmbaralhador();
		}
	}
}