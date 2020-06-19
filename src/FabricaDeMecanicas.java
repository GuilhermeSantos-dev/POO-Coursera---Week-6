import java.io.IOException;

public class FabricaDeMecanicas {

	public MecanicaDoJogo getMecanicaUm() throws IOException{
		
		return new mecanicaUm();
	}
	
	public MecanicaDoJogo getMecanicaDois() throws IOException{
		return new mecanicaDois();
	}
}
