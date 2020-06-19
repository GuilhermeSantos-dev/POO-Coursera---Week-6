import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmbaralhadorTest {

	@Test
	void testPrimeiroEmbaralhador() {
		PrimeiroEmbaralhador e = new PrimeiroEmbaralhador();
		String s = "Java";
		assertEquals(e.embaralhar(s), "avaJ");
	}
	
	@Test
	void testSegundoEmbaralhador() {
		PrimeiroEmbaralhador e = new PrimeiroEmbaralhador();
		String s = "Java";
		assertNotEquals(e.embaralhar(s), s);
	}

}
