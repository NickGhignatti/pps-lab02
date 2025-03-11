package u02

import u02.Expr.Expr.{Add, Literal, Multiply}

case object Expr extends App:

    enum Expr:
        case Literal(constant: Int)
        case Add(firstOperator: Expr, secondOperator: Expr)
        case Multiply(firstOperator: Expr, secondOperator: Expr)

    def evaluate(expression: Expr): Int = expression match
        case Literal(value) => value
        case Add(expr1, expr2) => evaluate(expr1) + evaluate(expr2)
        case Multiply(expr1, expr2) => evaluate(expr1) * evaluate(expr2)

    def show(expression: Expr): String = expression match
        case Literal(value) => value.toString
        case Add(expr1, expr2) => "(" + show(expr1) + "+" + show(expr2) + ")"
        case Multiply(expr1, expr2) => "(" + show(expr1) + "*" + show(expr2) + ")"

