package task5

object ex8 extends App:
  import task5.Optionals.*
  import Optional.* 
  def map[A, B](opt: Optional[A])(f: A => B): Optional[B] = opt match
    case Maybe(value) => Maybe(f(value))
    case _ => Empty()
  
  println(map(Maybe(5))(_ > 2)) // Maybe(true)
  println(map(Empty())((_: Int) > 2)) // Empty()

  // filter
  def filter[A](opt: Optional[A])(pred: A => Boolean): Optional[A] = opt match
    case Maybe(value) if pred(value) => Maybe(value)
    case _ => Empty()
  
  println(filter(Maybe(5))(_ > 2)) // Maybe(5)
  println(filter(Maybe(5))(_ > 8)) // Empty()
  println(filter(Empty())((_: Int) > 2)) // Empty()


