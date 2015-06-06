
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object pagina extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Anuncio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(formAnuncio: Form[Anuncio]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*5.1*/("""



"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Cadastro</title>

    <!-- Bootstrap -->
    <link href=""""),_display_(/*19.18*/routes/*19.24*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*19.67*/("""" rel="stylesheet">
	<link href=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("stylesheets/cadastro.css")),format.raw/*20.59*/("""" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>


<body>


"""),_display_(/*33.2*/main("Cadastrar Anuncio")/*33.27*/{_display_(Seq[Any](format.raw/*33.28*/("""
	
	 """),_display_(/*35.4*/helper/*35.10*/.form(routes.Application.novoAnuncio)/*35.47*/{_display_(Seq[Any](format.raw/*35.48*/("""
	"""),format.raw/*36.2*/("""<form action="/anuncio/novo" method="POST">
		
		
		<h3>Crie seu anúncio</h3>
    <p>Por favor, preencha os campos abaixo:</p>
    <div class="container">
    <div class="row">
        <form role="form">
            <div class="col-lg-6">
                <div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span> Campo obrigatório</strong></div>
                <div class="form-group">
					<label for="Titulo"> Titulo do anúncio:</label>
                    <div class="input-group">
						
						
						<input type="text" class="form-control" name="titulo" placeHolder="Titulo do anuncio" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                       <!-- """),_display_(/*53.30*/inputText(formAnuncio("titulo"), args = 'size -> 100, 'placeholder -> "Título do Anuncio", '_label -> "Titulo (*)",'class -> "form-control")),format.raw/*53.170*/(""" """),format.raw/*53.171*/("""-->
                     
                    </div>
                </div>
                <div class="form-group">
					<label for="Cidade"> Cidade:</label>
                    <div class="input-group">
						
						
						<input type="text" class="form-control" name="cidade" placeHolder="Sua cidade" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        <!--"""),_display_(/*64.30*/inputText(formAnuncio("cidade"),'placeholder -> "Sua cidade", '_label -> "Cidade (*)",'class -> "form-control")),format.raw/*64.141*/(""" """),format.raw/*64.142*/("""-->
                        
                    </div>
                </div>
                <div class="form-group">
					 <label for="Bairro"> Bairro:</label>
                    <div class="input-group">
                        
                       
						<input type="text" class="form-control" name="bairro" placeHolder="Seu bairro" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        <!--"""),_display_(/*75.30*/inputText(formAnuncio("bairro"),'placeholder -> "Seu bairro", '_label -> "Bairro (*)",'class -> "form-control")),format.raw/*75.141*/(""" """),format.raw/*75.142*/("""-->
                        
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <label>Selecione ao menos 1 instrumento que você toca abaixo: (*)</label><br>
                        
                        <div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Bateria"> Bateria <br>
							<input type="checkbox" name="instrumentos[]" value="Cavaquinho"> Cavaquinho <br>
							<input type="checkbox" name="instrumentos[]" value="Contrabaixo"> Contrabaixo<br>
							<input type="checkbox" name="instrumentos[]" value="Flauta"> Flauta <br> 
                        </div>
                        <div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Gaita"> Gaita <br>
							<input type="checkbox" name="instrumentos[]" value="Guitarra"> Guitarra <br>
							<input type="checkbox" name="instrumentos[]" value="Percussao"> Percussão <br>
							<input type="checkbox" name="instrumentos[]" value="Piano"> Piano <br>
						</div>
						<div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Sanfona"> Sanfona <br>
							<input type="checkbox" name="instrumentos[]" value="Saxofone"> Saxofone <br>	
							<input type="checkbox" name="instrumentos[]" value="Teclado"> Teclado <br>
							<input type="checkbox" name="instrumentos[]" value="Trompete"> Trompete <br>
						</div>
						<div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Viola"> Viola <br>
							<input type="checkbox" name="instrumentos[]" value="Violão"> Violão <br>	
							<input type="checkbox" name="instrumentos[]" value="Violino"> Violino <br>
							<input type="checkbox" name="instrumentos[]" value="Outros"> Outros <br>
						</div>
						
						<label>Você gosta de tocar qual(is) estilo(s)?</label><br>
						
						<div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Alternativo"> Alternativo <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Axé"> Axé <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Blues"> Blues<br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Brega"> Brega <br> 
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Clássico"> Clássico <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Country"> Country <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Eletrônico"> Eletrônico <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Forró"> Forró <br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Funk"> Funk <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Gospel"> Gospel <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Hip-hop"> Hip-hop <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Indie"> Indie<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="MPB"> MPB <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Pagode"> Pagode <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Pop"> Pop <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Reggae"> Reggae<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Rock"> Rock <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Romântico"> Romântico <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Samba"> Samba <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Sertanejo"> Sertanejo <br>  
                        </div>
                        
                        <label>... E de quais não gosta?</label><br>
						<div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Alternativo"> Alternativo <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Axé"> Axé <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Blues"> Blues<br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Brega"> Brega <br> 
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Clássico"> Clássico <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Country"> Country <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Eletrônico"> Eletrônico <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Forró"> Forró <br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Funk"> Funk <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Gospel"> Gospel <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Hip-hop"> Hip-hop <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Indie"> Indie<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="MPB"> MPB <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Pagode"> Pagode <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Pop"> Pop <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Reggae"> Reggae<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Rock"> Rock <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Romântico"> Romântico <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Samba"> Samba <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Sertanejo"> Sertanejo <br>  
                        </div>
                       
						<br>
						
						<input type="checkbox" name="finalizado" value="true"> Finalizado <br>
						
                    </div>
                </div>
                
                <div class="form-group">
					<label for="Contatos"> Contatos:</label> 
                    <div class="input-group">
                      
                       <input type="text" class="form-control" name="contato[]" placeHolder="Seu e-mail" value="" required>
                       <input type="text" class="form-control" name="contato[]" placeHolder="Facebook" value="">
                       <!-- criar um botão que cria outros forms!!! :D -->
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
  
                
                 <div class="form-group">
                    <div class="input-group"> 
						                    
						<label class="radio-inline"><input type="radio" name="finalidadeAnuncio" value="Banda"required>Banda</label>

						<label class="radio-inline"><input type="radio" name="finalidadeAnuncio" value="Tocar Ocasionalmente">Tocar Casualmente</label>              
						
		
                    </div>
                </div>
                
               
                <div class="form-group">
                    <label for="Contatos"> Descreva seu anúncio:</label> 
                    <div class="input-group">
                       <!-- """),_display_(/*207.30*/textarea(field = formAnuncio("Descricao"), args = 'rows -> 3, 'cols -> 100,'placeholder -> "Descreva seu anúncio aqui", '_label -> "Descrição (*)",'class -> "form-control")),format.raw/*207.202*/(""" """),format.raw/*207.203*/("""-->
                        <textarea class="form-control" name="descricao" rows="5" id="descricao"></textarea>
                        <span class="input-group-addon"></span>
                    </div>
                </div>
                <input type="submit" class="btn btn-info" value="Novo Anúncio">
            </div>
        </form>
        <div class="col-lg-5 col-md-push-1">
            <div class="col-md-12">
                <div class="alert alert-success">
                    <strong><span class="glyphicon glyphicon-ok"></span> Successo! Anúncio criado.</strong>
                </div>
                <div class="alert alert-danger">
                    <span class="glyphicon glyphicon-remove"></span><strong> Erro! Por favor, verifique novamente os campos.</strong>
                </div>
            </div>
        </div>
    </div>
</div>

	</form>
""")))}),format.raw/*229.2*/("""

	

""")))}),format.raw/*233.2*/("""

	"""),format.raw/*235.2*/("""<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src=""""),_display_(/*238.19*/routes/*238.25*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*238.67*/(""""></script>
    <script src=""""),_display_(/*239.19*/routes/*239.25*/.Assets.at("javascripts/script.js")),format.raw/*239.60*/(""""> </script>
</body>
</html>

"""))}
  }

  def render(formAnuncio:Form[Anuncio]): play.twirl.api.HtmlFormat.Appendable = apply(formAnuncio)

  def f:((Form[Anuncio]) => play.twirl.api.HtmlFormat.Appendable) = (formAnuncio) => apply(formAnuncio)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 04 21:34:32 BRT 2015
                  SOURCE: /home/icaro/Documentos/Playapp/app1/app/views/pagina.scala.html
                  HASH: 0c21884ddddcaf9e5fcaf0cb8521c3bb2c4f07e0
                  MATRIX: 731->2|895->30|922->82|952->86|1366->473|1381->479|1445->522|1506->556|1521->562|1580->600|2025->1019|2059->1044|2098->1045|2130->1051|2145->1057|2191->1094|2230->1095|2259->1097|3049->1860|3211->2000|3241->2001|3716->2449|3849->2560|3879->2561|4393->3048|4526->3159|4556->3160|12265->10841|12460->11013|12491->11014|13394->11886|13431->11892|13462->11895|13754->12159|13770->12165|13834->12207|13892->12237|13908->12243|13965->12278
                  LINES: 26->2|30->2|31->5|35->9|45->19|45->19|45->19|46->20|46->20|46->20|59->33|59->33|59->33|61->35|61->35|61->35|61->35|62->36|79->53|79->53|79->53|90->64|90->64|90->64|101->75|101->75|101->75|233->207|233->207|233->207|255->229|259->233|261->235|264->238|264->238|264->238|265->239|265->239|265->239
                  -- GENERATED --
              */
          