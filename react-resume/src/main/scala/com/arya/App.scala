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
                    "https://media-exp1.licdn.com/dms/image/C5103AQHA72PagfaEUw/profile-displayphoto-shrink_400_400/0/1553801208705?e=1617840000&v=beta&t=dR2hdPRNUT9BAw5PCygxNQrXzMEPVkdV1pNxnqAOUck",
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
