package task4

import scala.runtime.stdLibPatches.language.`3.2`

object ex7 extends App:
    enum Shape:
        case Rectangle(base:Double, height:Double)
        case Circle(radius:Double)
        case Square(side:Double)
    
    def perimeter(shape: Shape): Double = shape match
        case Shape.Rectangle(base, height) => (base+height)*2
        case Shape.Circle(radius) => 2*java.lang.Math.PI * radius
        case Shape.Square(side) => 4*side
    

    def scale(shape: Shape, alpha: Double): Shape = shape match
        case Shape.Rectangle(base,height) => Shape.Rectangle(base*alpha,height*alpha)
        case Shape.Circle(radius) => Shape.Circle(radius*alpha)
        case Shape.Square(side) => Shape.Square(side*alpha)
    
    println(perimeter(Shape.Rectangle(4,8))) //24
    println(perimeter(scale(Shape.Circle(2.2),4)))
    
