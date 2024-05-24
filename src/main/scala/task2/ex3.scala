package task2

object ex3 extends App: 
  //3a
  //LAMBDA -> VAL
  val positive : Int => String = _ match
    case n if n >=0 => "positive"
    case _ => "negative"

  //METHOD -> DEF
  def positiveMethod(n:Int): String = n match
    case n if n >=0 => "positive"
    case _ => "negative"

  //3b
  //LAMBDA neg
  val neg: (String => Boolean) => (String => Boolean) = 
    predicate => (a => !predicate(a))
  //METHOD neg
  def negMethod(predicate: String => Boolean) : String => Boolean = 
    a => !predicate(a)

  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = neg(empty) // which type of notEmpty?
  notEmpty("foo") // true
  notEmpty("") // false
  notEmpty("foo") && !notEmpty("") // true.. a comprehensive test

  println(neg(a => true)("ciao")) // false

  println(negMethod(a => true)("ciao")) //false

  def negGeneric[A](predicate: A => Boolean) : A => Boolean =
    a => !predicate(a)

  println(negGeneric(a => true)("ciao")) //false

  //4
  //lambda
  //curryed
  val p1: Double => Double => Double => Boolean = x => y => z => (x <= y && y == z)
  //non curryed
  val p2: (Double,Double,Double) => Boolean = (x,y,z) => (x <= y && y == z)
  
  //method
  //curryed
  def p3(x:Double)(y:Double)(z:Double): Boolean = (x <= y && y == z)
  //non curryed
  def p4(x:Double,y:Double,z:Double): Boolean = (x <= y && y == z)

  //5
  def compose(f: Int => Int, g: Int => Int): Int => Int = x=> f(g(x))
  println(compose(_ - 1, _ * 2)(5)) // 9

  //constraint: tipo di ritorno di g, deve essere uguale al tipo di input di f
  def composeGen[X,Y,Z](f: Y => Z, g: X => Y): X => Z = x => (f(g(x)))

  println(composeGen((_:Double) / 3, (_:Double) * 2)(5.5)) // 3.666