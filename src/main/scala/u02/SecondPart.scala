package u02

import scala.language.postfixOps

case object SecondPart extends App:

    def checkPositivity = (value: Int) => value match
        case p if p >= 0 => "pos"
        case _ => "neg"

    def negFunction = (predicate: String => Boolean) => (s: String) => !predicate(s)

    def genericNegFunction[A] = (predicate: A => Boolean) => (value: A) => !predicate(value)

    def tempNegFunction(predicate: String => Boolean): (String => Boolean) = (s: String) => !predicate(s)

    val curriedPredicateVal = (x: Int) => (y: Int) => (z: Int) => (x <= y && y == z)

    val nonCurriedPredicateVal = (x: Int, y: Int, z: Int) => x <= y && y == z

    def curriedPredicateDef(x: Int)(y: Int)(z: Int): Boolean = (x <= y && y == z)

    def nonCurriedPredicateDef(x: Int, y: Int, z: Int): Boolean = (x <= y && y == z)

    def compose(f: Int => Int, g: Int => Int): Int => Int = (value: Int) => f(g(value))

    // depending
    def genericCompose[A](f: A => A, g: A => A): A => A = (value: A) => f(g(value))

    def composeTree[A, B, C, D](f: C => D, g: B => C, h: A => B): A => D = (value: A) => f(g(h(value)))

