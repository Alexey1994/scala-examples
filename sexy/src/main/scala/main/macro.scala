package main

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object M {
    def m(a: Any): Any = macro impl
    def impl(c: Context)(a: c.Expr[Any]): c.Expr[Any] = {
        a
    }
}