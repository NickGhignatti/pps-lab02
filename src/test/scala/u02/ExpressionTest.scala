package u02

import org.junit.*
import org.junit.Assert.*
import u02.Expr.{Expr, evaluate, show}

case class ExpressionTest():
    final val sum: Expr = Expr.Add(Expr.Literal(10), Expr.Literal(20))

    @Test def testEvaluateExpression(): Unit =
        assertTrue(evaluate(sum) == 30)

    @Test def testShowExpression(): Unit =
        assertTrue(show(sum) == ("(10+20)"))

