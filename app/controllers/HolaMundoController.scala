package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class HolaMundoController @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def hola() = Action{
    Ok(views.html.hola())
  }
  def holaConParam(name:String) = Action{
    Ok(views.html.holaParam(name))
  }
  def otroHola(n:String)= Action{
    Ok(views.html.otroHola(n))
  }
}
