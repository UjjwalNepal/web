package controllers

import javax.inject._

import play.api.Play.current
import play.api.data.Forms._
import play.api.data._
import play.api.db._
import play.api.i18n.Messages.Implicits._
import play.api.mvc._
import models.Contact


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class Application @Inject()(db: Database) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index(loginForm))
  }



  def blog = Action {
    Ok(views.html.blog())
  }

  def add(contact: Contact){
    val conn = db.getConnection()
    val query = "INSERT INTO contactTable(name, email, subject, message) " +
      "VALUES(?,?,?,?)"
    try {
      val stmt = conn.prepareStatement(query)
      stmt.setString(1, contact.name)
      stmt.setString(2, contact.email)
      stmt.setString(3, contact.subject)
      stmt.setString(4, contact.message)
      stmt.execute()
    }finally {
      conn.close()
    }
  }

  val loginForm = Form(
    mapping(
      "Name" -> nonEmptyText,
      "Email" -> email,
      "Subject" -> nonEmptyText,
      "Message" ->nonEmptyText
    )(Contact.apply)(Contact.unapply)
  )

  def handleForm = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.index(formWithErrors)),
      contact => {
        Application.this.add(contact)
        Ok(views.html.index(loginForm)).flashing("success" -> "Message recorded !")
      })

  }



}
