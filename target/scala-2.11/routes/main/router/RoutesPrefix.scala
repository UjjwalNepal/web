
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ujjwal/csrdc-master/conf/routes
// @DATE:Mon Jul 04 13:55:44 NPT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
