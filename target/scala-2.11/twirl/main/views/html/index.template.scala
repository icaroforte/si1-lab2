
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Anuncio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(anuncios: List[Anuncio]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.27*/("""


"""),_display_(/*5.2*/main("Lista de anuncios")/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""

	
  
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Bootstrap Google Plus Theme</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href=""""),_display_(/*17.16*/routes/*17.22*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*17.65*/("""" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link href=""""),_display_(/*21.16*/routes/*21.22*/.Assets.at("stylesheets/styles.css")),format.raw/*21.58*/("""" rel="stylesheet">
	</head>
	<body>
<nav class="navbar navbar-fixed-top header">
 	<div class="col-md-12">
        <div class="navbar-header">
          
          <a href="#" class="navbar-brand">Our Sound</a>
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse1">
          <i class="glyphicon glyphicon-search"></i>
          </button>
      
        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse1">
          <form class="navbar-form pull-left">
              <div class="input-group" style="max-width:470px;">
                <input type="text" class="form-control" placeholder="Pesquisar" name="srch-term" id="srch-term">
                <div class="input-group-btn">
                  <button class="btn btn-default btn-primary" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                </div>
              </div>
          </form>
          <ul class="nav navbar-nav navbar-right">
             <li><a href="https://github.com/icaroforte" target="_ext">Ícaro Forte</a></li>
             
             
             
           </ul>
        </div>	
     </div>	
</nav>
<div class="navbar navbar-default" id="subnav">
    <div class="col-md-12">
        <div class="navbar-header">
          
          <a href=""""),_display_(/*56.21*/routes/*56.27*/.Application.formularioAnuncio),format.raw/*56.57*/("""" style="margin-left:15px;" class="navbar-btn btn btn-default btn-plus dropdown-toggle">Crie um anúncio agora! </a>
   
        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse2">
          <ul class="nav navbar-nav navbar-right">
             <li class="active"><a href="#">Anúncios</a></li>
             <li><a href="#loginModal" role="button" data-toggle="modal">Login</a></li>
             <li><a href="#aboutModal" role="button" data-toggle="modal">Sobre</a></li>
           </ul>
        </div>	
     </div>	
</div>



<!--main-->
<div class="container" id="main">
   <div class="row">
       
        """),_display_(/*75.10*/if(anuncios.isEmpty)/*75.30*/{_display_(Seq[Any](format.raw/*75.31*/("""
		"""),format.raw/*76.3*/("""<h3>Não há anúncios cadastrados</h3>
	""")))}/*77.3*/else/*77.7*/{_display_(Seq[Any](format.raw/*77.8*/("""
	"""),format.raw/*78.2*/("""<h3>Anúncios cadastrados</h3>
	
	"""),_display_(/*80.3*/for(anuncio <- anuncios) yield /*80.27*/{_display_(Seq[Any](format.raw/*80.28*/("""
	
   """),format.raw/*82.4*/("""<div class="col-md-4 col-sm-6">
    
        <div class="panel panel-default">
           <div class="panel-heading"> <h4>"""),_display_(/*85.45*/anuncio/*85.52*/.getTitulo),format.raw/*85.62*/("""</h4></div>
   			<div class="panel-body">
              <div class="clearfix"></div>
				"""),_display_(/*88.6*/anuncio/*88.13*/.getDescricao),format.raw/*88.26*/("""              
              """),format.raw/*89.15*/("""<hr>        
					<ul class="list-group">
					<li class="list-group-item"><b>Cidade:</b> """),_display_(/*91.50*/anuncio/*91.57*/.getCidade),format.raw/*91.67*/("""</li>
					<li class="list-group-item"><b>Bairro:</b> """),_display_(/*92.50*/anuncio/*92.57*/.getBairro),format.raw/*92.67*/("""</li>
					</ul>
					<ul class="list-group">
					<li class="list-group-item"><b>Instrumentos:</b></li>
					"""),_display_(/*96.7*/for(anuncio <- anuncio.getInstrumentos) yield /*96.46*/{_display_(Seq[Any](format.raw/*96.47*/("""
					"""),format.raw/*97.6*/("""<li class="list-group-item">"""),_display_(/*97.35*/anuncio),format.raw/*97.42*/("""</li>
		
					""")))}),format.raw/*99.7*/("""
					"""),format.raw/*100.6*/("""</ul>			 
					<ul class="list-group">
					<li class="list-group-item"><b>Estilo preferidos:</b></li>
					"""),_display_(/*103.7*/for(anuncio <- anuncio.getListaEstiloGosta) yield /*103.50*/{_display_(Seq[Any](format.raw/*103.51*/("""
					"""),format.raw/*104.6*/("""<li class="list-group-item">"""),_display_(/*104.35*/anuncio),format.raw/*104.42*/("""</li>
					
					""")))}),format.raw/*106.7*/("""
					"""),format.raw/*107.6*/("""</ul>
					
					<ul class="list-group">
					<li class="list-group-item"><b>Estilo que não gosto:</b></li>
					"""),_display_(/*111.7*/for(anuncio <- anuncio.getListaEstiloNaoGosta) yield /*111.53*/{_display_(Seq[Any](format.raw/*111.54*/("""
					"""),format.raw/*112.6*/("""<li class="list-group-item">"""),_display_(/*112.35*/anuncio),format.raw/*112.42*/("""</li>
					
					""")))}),format.raw/*114.7*/("""
					"""),format.raw/*115.6*/("""</ul>
					<ul class="list-group">
					<li class="list-group-item"><b>O que busco:</b> """),_display_(/*117.55*/anuncio/*117.62*/.getFinalidadeAnuncio),format.raw/*117.83*/("""</li>
					</ul>
					<ul class="list-group">
					<li class="list-group-item"><b>Meus contatos:</b></li>
					"""),_display_(/*121.7*/for(anuncio <- anuncio.getContato) yield /*121.41*/{_display_(Seq[Any](format.raw/*121.42*/("""
					"""),format.raw/*122.6*/("""<li class="list-group-item">"""),_display_(/*122.35*/anuncio),format.raw/*122.42*/("""</li>
					
					""")))}),format.raw/*124.7*/("""
					"""),format.raw/*125.6*/("""</ul>
					
					
					<!--Finalizado: """),_display_(/*128.23*/anuncio/*128.30*/.isFinalizado),format.raw/*128.43*/("""<br> -->
               </div>
         </div> 
	
	
	

	</div>
	
	""")))}),format.raw/*137.3*/("""
	
	""")))}),format.raw/*139.3*/("""
  	
  
	

  """),format.raw/*144.3*/("""</div><!--/row-->
      	

    
    <br>
    
    <div class="clearfix"></div>
      
    <hr>
    <div class="col-md-12 text-center"><p><a href="http://www.cifraclub.com.br/" target="_ext">Visite o CifraClub</a><br><a href="http://letras.mus.br/" target="_ext">Visite o Letras.mus</a></p></div>
    <hr>
    
  </div>
</div><!--/main-->

<!--login modal-->
<div id="loginModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h2 class="text-center"><img src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100" class="img-circle"><br>Login</h2>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block">
            <div class="form-group">
              <input type="text" class="form-control input-lg" placeholder="Email">
            </div>
            <div class="form-group">
              <input type="password" class="form-control input-lg" placeholder="Password">
            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block">Sign In</button>
              <span class="pull-right"><a href="#">Register</a></span><span><a href="#">Need help?</a></span>
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
		  </div>	
      </div>
  </div>
  </div>
</div>


<!--about modal-->
<div id="aboutModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h2 class="text-center">About</h2>
      </div>
      <div class="modal-body">
          <div class="col-md-12 text-center">
            <a href="http://www.bootply.com/DwnjTNuvVt">This Bootstrap Template</a><br>was made with <i class="glyphicon glyphicon-heart"></i> by <a href="http://bootply.com/templates">Bootply</a>
            <br><br>
            <a href="https://github.com/iatek/bootstrap-google-plus">GitHub Fork</a>
          </div>
      </div>
      <div class="modal-footer">
          <button class="btn" data-dismiss="modal" aria-hidden="true">OK</button>
      </div>
  </div>
  </div>
</div>
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src=""""),_display_(/*214.17*/routes/*214.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*214.65*/(""""></script>
		<script src=""""),_display_(/*215.17*/routes/*215.23*/.Assets.at("javascripts/scripts.js")),format.raw/*215.59*/(""""> </script>
	</body>
</html>

""")))}),format.raw/*219.2*/("""

"""))}
  }

  def render(anuncios:List[Anuncio]): play.twirl.api.HtmlFormat.Appendable = apply(anuncios)

  def f:((List[Anuncio]) => play.twirl.api.HtmlFormat.Appendable) = (anuncios) => apply(anuncios)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 03 22:07:43 BRT 2015
                  SOURCE: /home/icaro/Documentos/Playapp/app1/app/views/index.scala.html
                  HASH: 502026cae453b0c702b695a1f299925b9a5a4011
                  MATRIX: 730->2|843->27|872->31|905->56|944->58|977->65|1334->395|1349->401|1413->444|1583->587|1598->593|1655->629|3010->1957|3025->1963|3076->1993|3736->2626|3765->2646|3804->2647|3834->2650|3891->2689|3903->2693|3941->2694|3970->2696|4030->2730|4070->2754|4109->2755|4142->2761|4292->2884|4308->2891|4339->2901|4456->2992|4472->2999|4506->3012|4563->3041|4681->3132|4697->3139|4728->3149|4810->3204|4826->3211|4857->3221|4994->3332|5049->3371|5088->3372|5121->3378|5177->3407|5205->3414|5250->3429|5284->3435|5420->3544|5480->3587|5520->3588|5554->3594|5611->3623|5640->3630|5689->3648|5723->3654|5864->3768|5927->3814|5967->3815|6001->3821|6058->3850|6087->3857|6136->3875|6170->3881|6287->3970|6304->3977|6347->3998|6486->4110|6537->4144|6577->4145|6611->4151|6668->4180|6697->4187|6746->4205|6780->4211|6848->4251|6865->4258|6900->4271|6998->4338|7034->4343|7075->4356|9829->7082|9845->7088|9909->7130|9965->7158|9981->7164|10039->7200|10102->7232
                  LINES: 26->2|29->2|32->5|32->5|32->5|36->9|44->17|44->17|44->17|48->21|48->21|48->21|83->56|83->56|83->56|102->75|102->75|102->75|103->76|104->77|104->77|104->77|105->78|107->80|107->80|107->80|109->82|112->85|112->85|112->85|115->88|115->88|115->88|116->89|118->91|118->91|118->91|119->92|119->92|119->92|123->96|123->96|123->96|124->97|124->97|124->97|126->99|127->100|130->103|130->103|130->103|131->104|131->104|131->104|133->106|134->107|138->111|138->111|138->111|139->112|139->112|139->112|141->114|142->115|144->117|144->117|144->117|148->121|148->121|148->121|149->122|149->122|149->122|151->124|152->125|155->128|155->128|155->128|164->137|166->139|171->144|241->214|241->214|241->214|242->215|242->215|242->215|246->219
                  -- GENERATED --
              */
          