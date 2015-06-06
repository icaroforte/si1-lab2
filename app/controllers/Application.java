package controllers;

import java.util.ArrayList;

import models.Anuncio;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	private static Anuncio anuncio = new Anuncio();
	
    public static Result index() {
    	ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
    	return ok(index.render(anuncio.getListaAnuncio()));
    }
    
    public static Result formularioAnuncio(){
    	Form<Anuncio> form = Form.form(Anuncio.class);
    	return ok(pagina.render(form));
    }
    
    public static Result novoAnuncio(){
    	Form<Anuncio> form = Form.form(Anuncio.class).bindFromRequest();
    	if(form.hasErrors()){
    		return badRequest(pagina.render(form));
    	}
    	Anuncio novoAnuncio = form.get();
    	
    	anuncio.adicionaAnuncio(novoAnuncio);
    	
    	return redirect(routes.Application.index());
    }



}
