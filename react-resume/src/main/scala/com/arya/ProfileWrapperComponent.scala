package com.arya

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._

import com.arya.ProfileWrapperStructure

@react class ProfileWrapperComponent extends StatelessComponent {
    case class Props(pws: ProfileWrapperStructure)

  override def render() = {
    div(
      h3(props.pws.header),
      ProfileComponent(props.pws.ps)
    )
  }
  
}
