import java.io.IOException;

public class mecanicaUm implements MecanicaDoJogo {

	private FabricaEmbaralhadores embaralhador = new FabricaEmbaralhadores();
	private BancoDePalavras bancoDePalavras = new BancoDePalavras();
	private boolean acertou;
	private String palavraEscAleatoria = bancoDePalavras.getPalavraEscAleatoria();
	private String PalavraEscEmbaralhada = embaralhador.getEmbaralhadorAleatorio().embaralhar(palavraEscAleatoria);
	
	@Override
	public boolean testeDaPalavra(String chance) throws IOException {
			if(chance.equals(getPalavraAleatoria())) {
				acertou = true;
				return true;
			}else {
				acertou = false;
				return false;
			}
	}

	@Override
	public boolean fimDeJogo(int chances) {
		while (chances <= 7 || acertou == false) {
			return false;
		}
		return true;
	}


	@Override
	public String getPalavraEscEmbaralhada() throws IOException {
		return PalavraEscEmbaralhada;
	}

	@Override
	public String getPalavraAleatoria() throws IOException {
		return palavraEscAleatoria;
	}

}
