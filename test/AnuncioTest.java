import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import models.Anuncio;

import org.junit.Before;
import org.junit.Test;


public class AnuncioTest {

	private Anuncio anuncio;
	private ArrayList<String> instrumentos = new ArrayList<>();
	private ArrayList<String> contato = new ArrayList<>();
	private	ArrayList<String> listaEstiloGosta = new ArrayList<String>();
	private ArrayList<String> listaEstiloNaoGosta = new ArrayList<String>();
	
	
	@Before
	public void setup() {
		
		instrumentos.add("Violão");
		instrumentos.add("Bateria");
		
		listaEstiloGosta.add("MPB");
		listaEstiloGosta.add("Sertanejo");
		listaEstiloGosta.add("Forró");
		
		listaEstiloNaoGosta.add("Funk");
		
		contato.add("email@email.com.br");
		contato.add("emailtest@email.com.br");
		
		
		try {
			anuncio = new Anuncio("Entusiasta", "Me chamo Luís e procuro uma galera a fim de tocar nos fds", "Campina Grande - PB",
					"Jardim Quarenta", instrumentos , listaEstiloGosta, listaEstiloNaoGosta, contato);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void deveCriarAnuncio(){
		
		
		try {
			Anuncio anuncioTeste = new Anuncio("Tocar no fim de semana!", "Quero juntar uma galera pra tocar umas músicas no fim de semana", "Campina Grande - PB",
					"Jardim Quarenta", instrumentos , listaEstiloGosta, listaEstiloNaoGosta, contato);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	@Test
	public void deveModificarTitulo(){
		
		assertNotEquals("Guitarrista", anuncio.getTitulo());
		assertEquals("Entusiasta", anuncio.getTitulo());
		anuncio.setTitulo("Guitarrista");
		assertEquals(anuncio.getTitulo(),"Guitarrista");
		
	}
	
	@Test
	public void deveModificarDescricao(){
		
		assertNotEquals("Meu nome é Carlos e quero formar uma banda de Rock!", anuncio.getDescricao());
		assertEquals("Me chamo Luís e procuro uma galera a fim de tocar nos fds",anuncio.getDescricao());
		anuncio.setDescricao("Recrutando galera pra tocar pagode às terças");
		assertEquals("Recrutando galera pra tocar pagode às terças", anuncio.getDescricao());
		
	}
	
	@Test
	public void deveModificarCidade(){
		
		assertNotEquals("João Pessoa - PB", anuncio.getCidade());
		assertEquals("Campina Grande - PB",anuncio.getCidade());
		anuncio.setCidade("Cuité - PB");
		assertEquals("Cuité - PB", anuncio.getCidade());
		
	}
	
	@Test
	public void deveModificarBairro(){
		
		assertNotEquals("Centro", anuncio.getBairro());
		assertEquals("Jardim Quarenta",anuncio.getBairro());
		anuncio.setBairro("Malvinas");
		assertEquals("Malvinas", anuncio.getBairro());
		
	}
	
	@Test
	public void deveModificarInstrumentos(){
		
		ArrayList<String> instrumentosOutros = new ArrayList<String>();
		instrumentosOutros.add("Piano");
		instrumentosOutros.add("Teclado");
		instrumentosOutros.add("Bateria");
		
		assertNotNull(anuncio.getInstrumentos());
		
		assertEquals(2,anuncio.getInstrumentos().size());
		assertNotEquals("[Piano, Teclado, Bateria]", anuncio.getInstrumentos().toString());
		assertEquals("[Violão, Bateria]", anuncio.getInstrumentos().toString());
		
		anuncio.setInstrumentos(instrumentosOutros);
		assertEquals("[Piano, Teclado, Bateria]", anuncio.getInstrumentos().toString());
		assertEquals(3, anuncio.getInstrumentos().size());
		
	}
	
	@Test
	public void deveModificarListaEstiloGosta(){
		
		ArrayList<String> novaListaEstiloGosta = new ArrayList<String>();
		novaListaEstiloGosta.add("Samba");
		novaListaEstiloGosta.add("Blues");
		novaListaEstiloGosta.add("Country");
		
		assertNotNull(anuncio.getListaEstiloGosta());
		
		assertEquals(3,anuncio.getListaEstiloGosta().size());
		assertNotEquals("[Samba, Blues, Country]", anuncio.getListaEstiloGosta().toString());
		assertEquals("[MPB, Sertanejo, Forró]", anuncio.getListaEstiloGosta().toString());
		
		anuncio.setListaEstiloGosta(novaListaEstiloGosta);
		assertEquals("[Samba, Blues, Country]", anuncio.getListaEstiloGosta().toString());
		assertEquals(3, anuncio.getListaEstiloGosta().size());
		
	}
	
	@Test
	public void deveModificarListaEstiloNaoGosta(){
		
		ArrayList<String> novaListaEstiloNaoGosta = new ArrayList<String>();
		novaListaEstiloNaoGosta.add("Gospel");
		novaListaEstiloNaoGosta.add("Eletronica");
		novaListaEstiloNaoGosta.add("Brega");
		
		assertNotNull(anuncio.getListaEstiloNaoGosta());
		
		assertEquals(1,anuncio.getListaEstiloNaoGosta().size());
		assertNotEquals("[Gospel, Eletronica, Brega]", anuncio.getListaEstiloNaoGosta().toString());
		assertEquals("[Funk]", anuncio.getListaEstiloNaoGosta().toString());
		
		anuncio.setListaEstiloNaoGosta(novaListaEstiloNaoGosta);
		assertEquals("[Gospel, Eletronica, Brega]", anuncio.getListaEstiloNaoGosta().toString());
		assertEquals(3, anuncio.getListaEstiloNaoGosta().size());
		
	}
	
	@Test
	public void deveModificarContato(){
		
		ArrayList<String> contatoOutros = new ArrayList<String>();
		contatoOutros.add("musica@gmail.com");
		contatoOutros.add("sounds@hotmail.com");
		contatoOutros.add("party@yahoo.com");
		
		assertNotNull(anuncio.getContato());
		
		assertEquals(2,anuncio.getContato().size());
		assertNotEquals("[musica@gmail.com, sounds@hotmail.com, party@yahoo.com]", anuncio.getContato().toString());
		assertEquals("[email@email.com.br, emailtest@email.com.br]", anuncio.getContato().toString());
		
		anuncio.setContato(contatoOutros);
		assertEquals("[musica@gmail.com, sounds@hotmail.com, party@yahoo.com]", anuncio.getContato().toString());
		assertEquals(3, anuncio.getContato().size());
		
	}
	
	
	
}
