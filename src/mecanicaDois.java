import java.io.IOException;

public class mecanicaDois implements MecanicaDoJogo {

	private FabricaEmbaralhadores embaralhador = new FabricaEmbaralhadores();
	private BancoDePalavras bancoDePalavras = new BancoDePalavras();
	private boolean acertou;
	private String palavraEscAleatoria = bancoDePalavras.getPalavraEscAleatoria();
	private String PalavraEscEmbaralhada = embaralhador.getEmbaralhadorAleatorio().embaralhar(palavraEscAleatoria);
	
	@Override
	public boolean testeDaPalavra(String chance) throws IOException {
		if (chance.equals(getPalavraAleatoria())){
			acertou = true;
			return true;
	}else 
		{
		acertou = false;
		return false;
		}
	}

	@Override
	public boolean fimDeJogo(int chances) {
		while (chances <= 3 || acertou != true) {
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
