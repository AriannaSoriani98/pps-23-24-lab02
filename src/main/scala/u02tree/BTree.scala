package u02tree


object BTree :

  sealed trait Tree[A]

  case class Branch[A](left:Tree[A],elem:A,right:Tree[A]) extends Tree[A]
  case class Empty[A]() extends Tree[A]

  def sum(tree:Tree[Int]):Int = tree match
    case Branch(left, elem, right) => sum(left) + elem + sum(right)
    case Empty() => 0
    
  def count[A](tree:Tree[A]):Int = tree match 
    case Branch(left,elem,right) => count(left) + 1 + count(right)
    case Empty()=>0



