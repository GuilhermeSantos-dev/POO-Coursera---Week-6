import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileReader;

public class BancoDePalavras {

	private ArrayList<String> palavras = new ArrayList<String>();

	//Método que le as palavras de um arquivo, linha por linha
	private void escolhePalavra() throws IOException{
		
		try {
			palavras.clear();
			BufferedReader lerArquivo = new BufferedReader (new FileReader("Arquivo.txt"));
			String linha = lerArquivo.readLine();
		
			while(linha != null) {
				palavras.add(linha.toLowerCase());
				linha = lerArquivo.readLine();
			}
			lerArquivo.close();
		}
		
		catch(FileNotFoundException e){
			System.out.println("Arquivo de palavras não encontrado");
		}
	}
	
	//Retorna o array com a lista de palavras
	private ArrayList <String> getListaDePalavras () throws IOException{
		this.escolhePalavra();
		return palavras;
	}

	//Escolhe uma palavra aleatória da lista obtida.
	public String getPalavraEscAleatoria() {
	
	try {	
		@SuppressWarnings("unchecked")
		ArrayList<String> palavrasCopia = (ArrayList<String>) getListaDePalavras().clone(); 
	
		Collections.shuffle(palavrasCopia);

		String palavra = palavrasCopia.get(0);
	
		return palavra; 
		}
	catch(Exception e){
		return null;
		}
	}
}
