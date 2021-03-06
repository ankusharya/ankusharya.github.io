package resume

import better.files._
import java.awt.Desktop
import org.rogach.scallop._
import scalatags.Text.all._
import scalatags.Text.tags2

object Main extends App {

  object Conf extends ScallopConf(args) {
    val browser = opt[Boolean]()
    verify()
  }

//  File("site").createIfNotExists(true)

  def at(url: String, content: String) = a(href := url, target := "_blank", content)

  val content = "<!DOCTYPE html>" + html(
    head(
      tags2.title("Ankush Singh"),
      meta(charset := "UTF-8"),
      meta(name := "viewport", scalatags.Text.all.content := "width=device-width, initial-scale=1"),
      link(rel := "stylesheet", href := "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"),
      raw(
        """
        <style>
          .container {
            max-width: 900px;
          }

          a:link,a:visited,a:hover,a:active {
            color: #333;
            text-decoration: underline;
          }

          h3 {
            font-size: 20px;
          }

          hr {
            margin-bottom: 0px;
          }

          ul {
            padding-left: 0px;
            list-style-type: square;
          }

          .label {
            color: #333;
            font-size: 15px;
            margin-right: 5px;
            margin-bottom: 5px;
            display: inline-block;
          }

          .label-default {
            background-color: #eee;
          }
        </style>
        """
      )
    ),
    body(
      div(
        cls := "container",
        marginTop := "30px",
        marginBottom := "30px",
        div(
          cls := "row",
          div(
            cls := "col-sm-9",
            fontSize := "40px",
            "Ankush Singh"
          ),
          div(
            cls := "col-sm-3",
            div(height := "10px", cls := "hidden-xs"),
            at("https://github.com/ankusharya", "github.com/ankusharya"),
            br,
            a(href := "mailto:diehardankush@gmail.com", "diehardankush@gmail.com")
          )
        ),
        hr,
        div(
          cls := "row",
          div(cls := "col-sm-2", h3(i("Experience"))),
          div(
            cls := "col-sm-10",
            h3("Senior Data Engineer at ", at("https://www.startv.com/about-us/", "Star India"), br, small("Oct 2018 - Present")),
            ul(
              li("Developed Automated pipeline for Ingesting Data into our Datalake. Used Apache Spark and ", at("https://airflow.apache.org/", "Apache Airflow"), " to form a full-stack solution."),
              li(ul(
                li(
                  "Automated ETL process, making it easier for Data Extraction Team for ingest the data."
                ),
                li(
                  "Converted python script to Spark Job, improving the Data Ingestion Time."
                ),
                li(
                  "Enabled automated pipeline to be triggered by Slack, giving flexibility to start the progress even from Mobile."
                ),
                li(
                  "Wrote Dockerfile for the application developed."
                ),
                li(
                  "Wrote HELM Chart for the application developed and deployed on EKS Cluster"
                )
              )),
              li("Worked on ", at("https://www.antlr.org/", "ANTLR") , " Grammer for JSON to SQL generator for Druid ", at("https://druid.apache.org/", "Apache Druid"))
            ),
            h3("Big Data Engineer at ", at("https://www.happiestminds.com/", "Happiest Minds"), br, small("Oct 2016 - Dec 2018")),
            ul(
              li("Developed Spark Job to perform the following tasks"),
              li("Developed algorithm to find Object Dimension in Image"),
              li("Worked on finding Conflicting Data from set of numerical and categorical data of products."),
              li("Developed algorithms to find Objects in Image which required disclaimers or they had incorrect disclaimer."),
              li("Implemented spell checker for description of product")
            )
          )
        ),
        hr,
        div(
          cls := "row",
          div(cls := "col-sm-2", h3(i("Skills"))),
          div(
            cls := "col-sm-10",
            marginTop := "20px",
            Seq("Scala", "Apache Spark", "Airflow", "Python", "Amazon Web Service", "HELM", "Docker", "JenkinsX", "Linux")
              .map(skill => span(cls := "label label-default", skill))
          )
        ),
        hr,
        div(
          cls := "row",
          div(cls := "col-sm-2", h3(i("Education"))),
          div(
            cls := "col-sm-10",
            h3("Centurion University of Technology and Management", br, small("Sep 2012 - Jun 2016")),
            p("Bachelor Computer Science. Gold Medalist. CGPA 9.1")
          )
        ),
        hr,
        div(style := "margin: 20px 0;text-align:right", "This page is ", at("https://github.com/ankusharya/ankusharya.github.io", "generated by Scala"))
      ),
      raw(
        """
        <script>


        </script>
      """)
    )
  )

  val indexFile = File("index.html").overwrite(content)
  if (Conf.browser()) {
    Desktop.getDesktop.browse(indexFile.uri)
  }
}
