package model

case class Person(
                 firstName: String,
                 lastName: String,
                 company: Option[String],
                 age: Int,
                 occupation: Option[String],
                 interests: List[String]
               ) {

}
