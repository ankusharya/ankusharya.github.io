package com.arya

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._


case class ListStructure(id: Int, text: String)

@react class ListComponent extends StatelessComponent {
case class Props(items: Seq[ListStructure])

  override def render() = {
    ul(
      props.items.map { item =>
        li(key := item.id.toString)(item.text)
      }
    )
  }
}
