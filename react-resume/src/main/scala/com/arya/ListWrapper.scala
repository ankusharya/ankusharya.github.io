package com.arya

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._

import com.arya.ListWrapperStructure

@react class ListWrapper extends StatelessComponent{
  case class Props(lws: ListWrapperStructure)

  override def render() = {
    div(
      h3(props.lws.header),
      ListComponent(props.lws.ls)
    )
  }
}
