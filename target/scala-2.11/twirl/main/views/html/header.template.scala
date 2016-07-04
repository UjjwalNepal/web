
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <div id="front">
      <div class="site-header">
        <div class="container">
          <div class="row">
            <div class="col-md-4 col-sm-6 col-xs-6">
              <div id="logo">
                <a href=""""),_display_(/*14.27*/routes/*14.33*/.Application.index),format.raw/*14.51*/("""#front">
                <img src="assets/images/services/test.png"></a>
              </div> <!-- /.logo -->
            </div> <!-- /.col-md-4 -->
            <div class="col-md-8 col-sm-6 col-xs-6">
              <a href="#" class="toggle-menu"><i class="fa fa-bars"></i></a>
              <div class="main-menu">
                <ul>
                  <li><a href=""""),_display_(/*22.33*/routes/*22.39*/.Application.index),format.raw/*22.57*/("""#front">Home</a></li>
                  <li><a href=""""),_display_(/*23.33*/routes/*23.39*/.Application.index),format.raw/*23.57*/("""#services">Services</a></li>
                  <li><a href=""""),_display_(/*24.33*/routes/*24.39*/.Application.index),format.raw/*24.57*/("""#career">Careers</a></li>
                  <!--<li><a href=""""),_display_(/*25.37*/routes/*25.43*/.Application.blog),format.raw/*25.60*/("""">Blog</a></li>-->
                  <li><a href=""""),_display_(/*26.33*/routes/*26.39*/.Application.index),format.raw/*26.57*/("""#about">About</a></li>
                  <li><a href=""""),_display_(/*27.33*/routes/*27.39*/.Application.index),format.raw/*27.57*/("""#contact">Contact</a></li>
                </ul>
              </div><!-- /.main-menu -->
            </div> <!-- /.col-md-8 -->
          </div> <!-- /.row -->
          <div class="row">
            <div class="col-md-12">
              <div class="responsive">
                <div class="main-menu">
                  <ul>
                    <li><a href=""""),_display_(/*37.35*/routes/*37.41*/.Application.index),format.raw/*37.59*/("""#front">Home</a></li>
                    <li><a href=""""),_display_(/*38.35*/routes/*38.41*/.Application.index),format.raw/*38.59*/("""#services">Services</a></li>
                    <li><a href=""""),_display_(/*39.35*/routes/*39.41*/.Application.index),format.raw/*39.59*/("""#career">Careers</a></li>
                    <!--<li><a href=""""),_display_(/*40.39*/routes/*40.45*/.Application.blog),format.raw/*40.62*/("""">Blog</a></li>-->
                    <li><a href=""""),_display_(/*41.35*/routes/*41.41*/.Application.index),format.raw/*41.59*/("""#about">About</a></li>
                    <li><a href=""""),_display_(/*42.35*/routes/*42.41*/.Application.index),format.raw/*42.59*/("""#contact">Contact</a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div> <!-- /.container -->
      </div> <!-- /.site-header -->
    </div>
      <div class="site-slider">
          <ul class="bxslider">
              <img src="assets/images/services/slider.gif">
          </ul>
      </div>
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
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 23:12:33 NPT 2016
                  SOURCE: /home/ujjwal/csrdc-master/app/views/header.scala.html
                  HASH: 3e670d516cb031bd2541198ef6d8cc62e8958a52
                  MATRIX: 611->0|968->330|983->336|1022->354|1419->724|1434->730|1473->748|1554->802|1569->808|1608->826|1696->887|1711->893|1750->911|1839->973|1854->979|1892->996|1970->1047|1985->1053|2024->1071|2106->1126|2121->1132|2160->1150|2548->1511|2563->1517|2602->1535|2685->1591|2700->1597|2739->1615|2829->1678|2844->1684|2883->1702|2974->1766|2989->1772|3027->1789|3107->1842|3122->1848|3161->1866|3245->1923|3260->1929|3299->1947
                  LINES: 25->1|38->14|38->14|38->14|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42
                  -- GENERATED --
              */
          