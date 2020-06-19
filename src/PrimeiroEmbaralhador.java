
public class PrimeiroEmbaralhador implements Embaralhador {

	//Metodo embaralhador que troca a ordem das letras da palavra
	
	@Override
	public String embaralhar(String palavra) {
		
		StringBuffer buffer = new StringBuffer(palavra);
		buffer.reverse();
		String novaPalavra = buffer.toString();
		
		return novaPalavra;

	}
}