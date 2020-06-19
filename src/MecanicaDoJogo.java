import java.io.IOException;

public interface MecanicaDoJogo {

	public boolean testeDaPalavra(String chance) throws IOException;
	public boolean fimDeJogo(int chances);
	public String getPalavraAleatoria() throws IOException;
	public String getPalavraEscEmbaralhada() throws IOException;
	
}
