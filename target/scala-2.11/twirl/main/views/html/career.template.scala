
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object career_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class career extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
</head>
<body>
  <div id="career" class="content-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center">
          <h1 class="section-title">Careers</h1>
        </div> <!-- /.col-md-12 -->
      </div> <!-- /.row -->
      <div class="row">
        <div class="col-md-offset-2 col-md-8 text-center bigger-text">
          <p style = "text-align : center"> No Vacancy available at the moment </>
        </div>
      </div> <!-- /.row -->
    </div> <!-- /.container -->
  </div> <!-- /#career -->
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object career extends career_Scope0.career
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 13:55:45 NPT 2016
                  SOURCE: /home/ujjwal/csrdc-master/app/views/career.scala.html
                  HASH: aae059b60748ffca310d63c0a7f42da6e87d2cd9
                  MATRIX: 611->0
                  LINES: 25->1
                  -- GENERATED --
              */
          