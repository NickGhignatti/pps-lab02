package u02

import org.junit.*
import org.junit.Assert.*

class SecondPartTest:
    private final val EXAMPLE_UNIT = 10

    @Test def testPositivity(): Unit =
        assertEquals("pos", SecondPart.checkPositivity(EXAMPLE_UNIT))

    @Test def testNegativity(): Unit =
        assertEquals("neg", SecondPart.checkPositivity(-1))

    @Test def testNegLengthFunction(): Unit =
        def testFunction = (s: String) => s.isEmpty
        assertFalse(SecondPart.negFunction(testFunction)(""))

    @Test def testGenericNegFunction(): Unit =
        def testFunction = (value: Int) => value > 0
        assertFalse(SecondPart.genericNegFunction(testFunction)(EXAMPLE_UNIT))

    @Test def testCurriedVal(): Unit =
        assertTrue(SecondPart.curriedPredicateVal(EXAMPLE_UNIT)(EXAMPLE_UNIT)(EXAMPLE_UNIT))

    @Test def testNonCurriedVal(): Unit =
        assertTrue(SecondPart.nonCurriedPredicateVal(EXAMPLE_UNIT, EXAMPLE_UNIT, EXAMPLE_UNIT))

    @Test def testCurriedDef(): Unit =
        assertTrue(SecondPart.curriedPredicateDef(EXAMPLE_UNIT)(EXAMPLE_UNIT)(EXAMPLE_UNIT))

    @Test def testNonCurriedDef(): Unit =
        assertTrue(SecondPart.nonCurriedPredicateDef(EXAMPLE_UNIT, EXAMPLE_UNIT, EXAMPLE_UNIT))

    @Test def testComposition(): Unit =
        assertEquals(9, SecondPart.compose(_ - 1, _ * 2)(5))

    @Test def testComposeTree(): Unit =
        assertEquals("6!", SecondPart.composeTree[Int, Int, String, String](_ + "!", _.toString, _ * 2)(3))

    @Test def testRecursivePower(): Unit =
        assertTrue(8.0 == SecondPart.power(2.0, 3))

    @Test def testReverseDigits(): Unit =
        assertEquals(54321, SecondPart.reverseDigits(12345));
