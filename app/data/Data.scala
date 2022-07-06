package data

import model.Person

object Data {
  val people = List(
    Person(
      "Jane",
      "Doe",
      Some("HMRC"),
      23,
      Some("Business Analyst"),
      List(
        "Cats", "Running", "Food"
      )
    ),
    Person(
      "John",
      "Doe",
      Some("Mercator"),
      28,
      Some("Recruiter"),
      List(
        "Dogs", "Walking", "Drinks"
      )
    ),
    Person(
      "Fiona",
      "Gallagher",
      None,
      21,
      None,
      List(
        "Money"
      )
    ),
    Person(
      "Harold",
      "Finch",
      Some("IFT Inc"),
      44,
      Some("Software engineer"),
      List(
        "Machines",
        "Safety",
        "Birds"
      )
    ),
    Person(
      "Mr",
      "E",
      None,
      44,
      Some("Agent"),
      List(
        "Secrecy"
      )
    )
  )
}
