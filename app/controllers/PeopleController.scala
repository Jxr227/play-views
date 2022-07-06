package controllers


import data.Data
import play.api.mvc._

import javax.inject._
import scala.concurrent.Future

@Singleton
class PeopleController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * Displaying data passed in the url (firstName & lastName)
   */
  def people(): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok(views.html.people(Data.people)))
  }
}
