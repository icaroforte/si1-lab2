package models;

import java.util.ArrayList;

import play.data.validation.Constraints.Required;


public class Anuncio {

	
	//solucao temporária para os anuncios
	private ArrayList<Anuncio> listaAnuncio = new ArrayList<Anuncio>();
	
	@Required(message = "my.required.message")
	private String titulo;
	@Required(message = "my.required.message")
	private String descricao;
	@Required(message = "my.required.message")
	private String cidade;
	@Required(message = "my.required.message")
	private String bairro;
	@Required(message = "my.required.message")
	private ArrayList<String> instrumentos;
	private ArrayList<String> listaEstiloGosta;
	private ArrayList<String> listaEstiloNaoGosta;
	@Required(message = "my.required.message")
	private ArrayList<String> contato;
	private String finalidadeAnuncio;
	private boolean finalizado = false;
	
	
	//construtor default
	public Anuncio() {
	
	}
	
	
	//construtor
	public Anuncio(String titulo, String descricao, String cidade,
			String bairro, ArrayList<String> instrumentos,
			ArrayList<String> listaEstiloGosta,
			ArrayList<String> listaEstiloNaoGosta,ArrayList<String> contato) throws Exception {
		
		// titulo eh nulo ou vazio
		if(!(titulo == null || titulo.equals(""))){
			this.titulo = titulo;	
		}else{
			throw new NullPointerException("Título nulo ou inválido");
		}
		
		// descricao eh nulo ou vazio
		if(!(descricao == null || descricao.equals(""))){
			this.descricao = descricao;	
		}else{
			throw new NullPointerException("descricao nulo ou inválido");
		}
		
		// cidade eh nulo ou vazio
		if(!(cidade == null || cidade.equals(""))){
			this.cidade = cidade;	
		}else{
			throw new NullPointerException("cidade nulo ou inválido");
		}
		
		// bairro eh nulo ou vazio
		if(!(bairro == null || bairro.equals(""))){
			this.bairro = bairro;	
		}else{
			throw new NullPointerException("bairro nulo ou inválido");
		}
		
		// instrumentos eh nulo ou vazio
		if(!(instrumentos == null || instrumentos.isEmpty())){
			this.instrumentos = instrumentos;	
		}else{
			throw new NullPointerException("instrumentos nulo ou inválido");
			}
		
		// contato eh nulo ou vazio
		if(!(contato == null || contato.isEmpty())){
			this.contato = contato;	
		}else{
			throw new NullPointerException("contato nulo ou inválido");
			}
		
		//verifica se a lista foi preenchida, caso negativo, inicializa o parametro
		if(listaEstiloGosta == null || listaEstiloGosta.isEmpty()){
			listaEstiloGosta = new ArrayList<String>();
		}else{
			this.listaEstiloGosta = listaEstiloGosta;	
		}
		
		//verifica se a lista foi preenchida, caso negativo, inicializa o parametro
		if(listaEstiloNaoGosta == null || listaEstiloNaoGosta.isEmpty()){
			listaEstiloNaoGosta = new ArrayList<String>();
		}else{
			this.listaEstiloNaoGosta = listaEstiloNaoGosta;	
		}
		
		
			
	}

	
	
	
	
	// =============================================== sets and gets ===================================================//

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public ArrayList<String> getInstrumentos() {
		return instrumentos;
	}


	public void setInstrumentos(ArrayList<String> instrumentos) {
		this.instrumentos = instrumentos;
	}


	public ArrayList<String> getListaEstiloGosta() {
		return listaEstiloGosta;
	}


	public void setListaEstiloGosta(ArrayList<String> listaEstiloGosta) {
		this.listaEstiloGosta = listaEstiloGosta;
	}


	public ArrayList<String> getListaEstiloNaoGosta() {
		return listaEstiloNaoGosta;
	}


	public void setListaEstiloNaoGosta(ArrayList<String> listaEstiloNaoGosta) {
		this.listaEstiloNaoGosta = listaEstiloNaoGosta;
	}


	public ArrayList<String> getContato() {
		return contato;
	}


	public void setContato(ArrayList<String> contato) {
		this.contato = contato;
	}


	public boolean isFinalizado() {
		return finalizado;
	}


	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}


	public ArrayList<Anuncio> getListaAnuncio() {
		return listaAnuncio;
	}


	public void setListaAnuncio(ArrayList<Anuncio> listaAnuncio) {
		this.listaAnuncio = listaAnuncio;
	}
	
	public void adicionaAnuncio(Anuncio anuncio){
		listaAnuncio.add(anuncio);
	}


	public String getFinalidadeAnuncio() {
		return finalidadeAnuncio;
	}


	public void setFinalidadeAnuncio(String finalidadeAnuncio) {
		this.finalidadeAnuncio = finalidadeAnuncio;
	}
	


	
}
