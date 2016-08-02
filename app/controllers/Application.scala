package controllers

import models.File
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def login = Action {
    Ok(views.html.login("Try to login"))
  }

  def files = Action {
    val files = File.getAll
    Ok(views.html.file(files))
  }
}