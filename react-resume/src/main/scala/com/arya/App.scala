package com.arya

import slinky.core._
import slinky.core.annotations.react
import slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("resources/App.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

@react class App extends Component {
  type Props = Unit
  case class State(data: ActualComponentData)

  override def initialState =
    State(
      ActualComponentData(
        Map(
          "Introduction" ->
            List(
              ProfileWrapperStructure(
                "Ankush Singh",
                List(
                  ProfileStructure(
                    "https://scontent.fbom19-1.fna.fbcdn.net/v/t1.0-9/71515453_203833747310004_5285722350317207552_o.jpg?_nc_cat=105&_nc_sid=85a577&_nc_ohc=VlzPdvywcaQAX8k3epI&_nc_ht=scontent.fbom19-1.fna&oh=3aafe019b718d6a4337f33a9ebd437b8&oe=5F430885",
                    List("Contact Me","ankush.singh.2250@gmail.com")
                  )
                )
              )
            )
        ),
        Map(
          "Experience" ->
            List(
              ListWrapperStructure(
                "Senior Data Engineer at Star India",
                List(
                  ListStructure(1, "Oct 2018 - Present"),
                  ListStructure(
                    2,
                    "Developed Automated pipeline for Ingesting Data into our Datalake. Used Apache Spark and Apache Airflow to form a full-stack solution"
                  ),
                  ListStructure(
                    3,
                    "Automated ETL process, making it easier for Data Extraction Team for ingest the data"
                  ),
                  ListStructure(
                    4,
                    "Converted python script to Spark Job, improving the Data Ingestion Time"
                  ),
                  ListStructure(
                    5,
                    "Enabled automated pipeline to be triggered by Slack, giving flexibility to start the progress even from Mobile"
                  ),
                  ListStructure(
                    6,
                    "Wrote Dockerfile for the application developed"
                  ),
                  ListStructure(
                    7,
                    "Wrote HELM Chart for the application developed and deployed on EKS Cluster"
                  ),
                  ListStructure(
                    8,
                    "Worked on ANTLR Grammer for JSON to SQL generator for Druid Apache Druid"
                  )
                )
              ),
              ListWrapperStructure(
                "Big Data Engineer at Happiest Minds",
                List(
                  ListStructure(1, "Oct 2016 - Dec 2018"),
                  ListStructure(
                    2,
                    "Developed Spark Job to perform the following tasks"
                  ),
                  ListStructure(
                    3,
                    "Developed algorithm to find Object Dimension in Image"
                  ),
                  ListStructure(
                    4,
                    "Worked on finding Conflicting Data from set of numerical and categorical data of products"
                  ),
                  ListStructure(
                    5,
                    "Developed algorithms to find Objects in Image which required disclaimers or they had incorrect disclaimer"
                  ),
                  ListStructure(
                    6,
                    "Implemented spell checker for description of product"
                  )
                )
              )
            ),
          "Skill" ->
            List(
              ListWrapperStructure(
                "",
                List(
                  ListStructure(1, "Scala"),
                  ListStructure(2, "Apache Spark"),
                  ListStructure(3, "Airflow"),
                  ListStructure(4, "Python"),
                  ListStructure(5, "Amazon Web Services"),
                  ListStructure(6, "HELM"),
                  ListStructure(7, "Docker"),
                  ListStructure(8, "JenkinsX"),
                  ListStructure(9, "Linux")
                )
              )
            ),
          "Education" ->
            List(
              ListWrapperStructure(
                "Centurion University of Technology and Management",
                List(
                  ListStructure(1, "Sep 2012 - Jun 2016"),
                  ListStructure(2, "Bachelor Computer Science"),
                  ListStructure(3, "Gold Medalist")
                )
              )
            )
        )
      )
    )

  private val css = AppCSS

  def render() = {

    div(className := "App")(
      ActualComponent(state.data)
    )
  }
}
