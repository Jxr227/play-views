package controllers


import play.api.mvc._

import javax.inject._
import scala.concurrent.Future

@Singleton
class NameController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * Displaying data passed in the url (firstName & lastName)
   */
  def name(firstName: String, lastName: String): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok(views.html.name(firstName, lastName)))
  }
}
