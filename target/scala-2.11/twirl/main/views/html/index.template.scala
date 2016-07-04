
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Contact],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm : Form[Contact])(implicit messages : Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.bootstrap3._

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
        <!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
        <!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"> <![endif]-->
        <!--[if IE 8]><html class="no-js lt-ie9"> <![endif]-->
        <!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">

        <title>Computer Science Research and Development Center Nepal.</title>
        <meta name="description" content="CSRDC Nepal">
        <meta name="viewport" content="width=device-width">

    </head>
    <body>


        """),_display_(/*21.10*/imports()),format.raw/*21.19*/("""
        """),_display_(/*22.10*/header()),format.raw/*22.18*/("""
        """),format.raw/*23.9*/("""<script>
                var myCenter=new google.maps.LatLng(27.6844899,85.3353435);
                function initialize()"""),format.raw/*25.38*/("""{"""),format.raw/*25.39*/("""
                    """),format.raw/*26.21*/("""var mapProp = """),format.raw/*26.35*/("""{"""),format.raw/*26.36*/("""
                        """),format.raw/*27.25*/("""center:myCenter,
                        zoom:18,
                        mapTypeId:google.maps.MapTypeId.ROADMAP
                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/(""";

                    var map=new google.maps.Map(document.getElementById("map"),mapProp);

                    var marker=new google.maps.Marker("""),format.raw/*34.55*/("""{"""),format.raw/*34.56*/("""
                        """),format.raw/*35.25*/("""position:myCenter,
                        animation:google.maps.Animation.BOUNCE
                    """),format.raw/*37.21*/("""}"""),format.raw/*37.22*/(""");

                    marker.setMap(map);
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/("""
                """),format.raw/*41.17*/("""google.maps.event.addDomListener(window, 'load', initialize);

        </script>


        """),_display_(/*46.10*/services()),format.raw/*46.20*/("""

        """),_display_(/*48.10*/career()),format.raw/*48.18*/("""

        """),_display_(/*50.10*/about()),format.raw/*50.17*/("""

        """),format.raw/*52.9*/("""<div id="contact" class="content-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <h1 class="section-title">Contact Us</h1>
                    </div> <!-- /.col-md-12 -->
                </div> <!-- /.row -->
                <div class="row">
                    <div class="col-md-offset-2 col-md-8 text-center bigger-text">
                        <p>Computer Science Research and Development Center is located at Sankhamool - 34, Kathmandu, Nepal. </p>
                        <br>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <div id="map">
                            <span class="glyphicon glyphicon-map-marker"></span> Sankhamool, Kathmandu &nbsp;&nbsp;
                        </div>
                    </div> <!-- /.col-md-6 -->
                    <div class="col-md-6 col-sm-6">

                    """),_display_(/*71.22*/helper/*71.28*/.form(action=routes.Application.handleForm())/*71.73*/{_display_(Seq[Any](format.raw/*71.74*/("""

                        """),format.raw/*73.25*/("""<fieldset>
                                <!-- Name -->
                            """),_display_(/*75.30*/text(loginForm("name"),
                                label = "Name",
                                placeholder = "Name",
                                help = "Please enter your name. (required)")),format.raw/*78.77*/("""

                                """),format.raw/*80.33*/("""<!-- Email -->
                            """),_display_(/*81.30*/text(loginForm("email"),
                                label = "Email",
                                placeholder = "Email",
                                help = "Enter a valid email address. (required)")),format.raw/*84.82*/("""

                                """),format.raw/*86.33*/("""<!-- Subject -->
                            """),_display_(/*87.30*/text(loginForm("subject"),
                                label = "Subject",
                                placeholder = "Subject",
                                help = "Enter the subject. (required)")),format.raw/*90.72*/("""

                                """),format.raw/*92.33*/("""<!-- Message -->
                            """),_display_(/*93.30*/textarea(loginForm("message"),
                                rows = "4",
                                label = "Message",
                                placeholder = "Message",
                                help = "Enter the message. (required)")),format.raw/*97.72*/("""


                            """),format.raw/*100.29*/("""<div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
                                </div>
                            </div>
                        </fieldset>
                    """)))}),format.raw/*106.22*/("""



                    """),format.raw/*110.21*/("""</div> <!-- /.col-md-6 -->
                </div> <!-- /.row -->
            </div> <!-- /.container -->
        </div> <!-- /#contact us -->

        """),_display_(/*115.10*/footer()),format.raw/*115.18*/("""

    """),format.raw/*117.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(loginForm:Form[Contact],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(messages)

  def f:((Form[Contact]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (messages) => apply(loginForm)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jul 04 21:47:22 NPT 2016
                  SOURCE: /home/ujjwal/csrdc-master/app/views/index.scala.html
                  HASH: 0acfaa6e0ed7343abc7eb41268476b4553e40920
                  MATRIX: 543->1|725->58|752->91|779->92|1384->670|1414->679|1451->689|1480->697|1516->706|1666->828|1695->829|1744->850|1786->864|1815->865|1868->890|2030->1024|2059->1025|2234->1172|2263->1173|2316->1198|2446->1300|2475->1301|2563->1361|2592->1362|2637->1379|2756->1471|2787->1481|2825->1492|2854->1500|2892->1511|2920->1518|2957->1528|3967->2511|3982->2517|4036->2562|4075->2563|4129->2589|4242->2675|4465->2877|4527->2911|4598->2955|4829->3165|4891->3199|4964->3245|5191->3451|5253->3485|5326->3531|5601->3785|5661->3816|6046->4169|6099->4193|6279->4345|6309->4353|6343->4359
                  LINES: 20->1|25->1|26->3|27->4|44->21|44->21|45->22|45->22|46->23|48->25|48->25|49->26|49->26|49->26|50->27|53->30|53->30|57->34|57->34|58->35|60->37|60->37|63->40|63->40|64->41|69->46|69->46|71->48|71->48|73->50|73->50|75->52|94->71|94->71|94->71|94->71|96->73|98->75|101->78|103->80|104->81|107->84|109->86|110->87|113->90|115->92|116->93|120->97|123->100|129->106|133->110|138->115|138->115|140->117
                  -- GENERATED --
              */
          