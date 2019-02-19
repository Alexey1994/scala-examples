package main
/*
import scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
*/


object Main {
    def main(args: Array[String]) {
        println(M m 1)
    }
}

/*
@JSExport
case class Component(structure: js.Array[Any], onInit: () => Any) {
    val window = js.Dynamic.global
    val document = window.document
    val body = document.body

    structure.foreach(value => {
        val node = document createElement "div"
        val textNode = document createTextNode value.toString()
        node appendChild textNode
        body appendChild node
    })

    onInit()

    override def toString(): String = structure toString
}

@JSExport
object Main extends JSApp {
    @JSExport
    def main() {
        Component(js.Array(0, 1), () => 1)
    }
}*/