// @SOURCE:/home/icaro/Documentos/Playapp/app1/conf/routes
// @HASH:968b09dc1612c163112df70d38ae148fa128151c
// @DATE:Thu May 28 14:18:26 BRT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_formularioAnuncio1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/novo"))))
private[this] lazy val controllers_Application_formularioAnuncio1_invoker = createInvoker(
controllers.Application.formularioAnuncio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "formularioAnuncio", Nil,"GET", """""", Routes.prefix + """anuncio/novo"""))
        

// @LINE:8
private[this] lazy val controllers_Application_novoAnuncio2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/novo"))))
private[this] lazy val controllers_Application_novoAnuncio2_invoker = createInvoker(
controllers.Application.novoAnuncio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "novoAnuncio", Nil,"POST", """""", Routes.prefix + """anuncio/novo"""))
        

// @LINE:12
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/novo""","""controllers.Application.formularioAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/novo""","""controllers.Application.novoAnuncio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_formularioAnuncio1_route(params) => {
   call { 
        controllers_Application_formularioAnuncio1_invoker.call(controllers.Application.formularioAnuncio())
   }
}
        

// @LINE:8
case controllers_Application_novoAnuncio2_route(params) => {
   call { 
        controllers_Application_novoAnuncio2_invoker.call(controllers.Application.novoAnuncio())
   }
}
        

// @LINE:12
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     