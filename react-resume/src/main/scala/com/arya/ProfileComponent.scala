package com.arya

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._

case class ProfileStructure(src: String, description: List[String])
@react class ProfileComponent extends StatelessComponent {

  case class Props(items: Seq[ProfileStructure])

  override def render() = {

    props.items.map(item =>
      div(className := "description-wrapper")(
        div(className := "description-img")(
          img(src := item.src, width := "200", height := "200")
        ),
        div(className := "description-item")(
          item.description.map { desc =>
            div(className := "description")(desc)

          }
        )
      )
    )
  }

}
