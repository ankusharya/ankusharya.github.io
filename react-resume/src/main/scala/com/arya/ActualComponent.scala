package com.arya

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import com.arya.ProfileWrapperStructure
import com.arya.ListWrapperStructure

@JSImport("resources/ActualComponent.css", JSImport.Default)
@js.native
object ActualComponentCSS extends js.Object

case class ActualComponentData(
    pw: Map[String, List[ProfileWrapperStructure]],
    lw: Map[String, List[ListWrapperStructure]]
)
@react class ActualComponent extends StatelessComponent {
  case class Props(ac: ActualComponentData)

  private val css = ActualComponentCSS

  override def render() = {
    div(
      props.ac.pw.map {
        case (key: String, item: List[ProfileWrapperStructure]) =>
          div(className := "ActualComponent-wrapper")(
            div(className := "ActualComponent-header")(
              div(className := "dot-wrapper")(
                div(className := "dot", id := "dot-1"),
                div(className := "dot", id := "dot-2"),
                div(className := "dot", id := "dot-3")
              ),
              div(key),
              div("")
            ),
            div(className := "ActualComponent-content")(
              item.map {
                case inneritem: ProfileWrapperStructure =>
                  ProfileWrapperComponent(inneritem)
              }
            )
          )

      },
      props.ac.lw.map {
        case (key: String, item: List[ListWrapperStructure]) =>
          div(className := "ActualComponent-wrapper")(
            div(className := "ActualComponent-header")(
              div(className := "dot-wrapper")(
                div(className := "dot", id := "dot-1"),
                div(className := "dot", id := "dot-2"),
                div(className := "dot", id := "dot-3")
              ),
              div(key),
              div("")
            ),
            div(className := "ActualComponent-content")(
              item.map {
                case inneritem: ListWrapperStructure =>
                  ListWrapper(inneritem)
              }
            )
          )
      }
    )
  }

}
