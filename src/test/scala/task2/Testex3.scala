package task2
import org.junit.Assert.*
import task2.ex3._
import org.junit.Test

class Testex3 :

  @Test def TestpositiveLambda() = 
    assertEquals("positive", positive(5))
    assertEquals("negative", positive(-5))

  @Test def TestpositiveMethod() = 
    assertEquals("positive", positiveMethod(5))
    assertEquals("negative", positiveMethod(-5))

  @Test def TestnegGeneric() = 
    assertFalse(negGeneric(a => true)("ciao"))

  @Test def TestCurryng() = 
    assertTrue(p1(2)(5)(5)) // true
    assertTrue(p3(2)(5)(5)) // true

  @Test def TestNonCurryng() =
    assertTrue(p2(2,5,5))
    assertTrue(p4(2,5,5)) // true