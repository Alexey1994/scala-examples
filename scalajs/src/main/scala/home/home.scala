package home

import scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

case class T() {
    def t() = 1
}

@JSExport
object Home extends JSApp {
    val window = js.Dynamic.global

    @JSExport
    def main() {
        window.alert("hitt")
        val a = T() t;
        println(a)
    }
}
