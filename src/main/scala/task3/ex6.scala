package task3

object ex6 extends App:
    // greatest common divisor (GCD)
    def gcd(a: Int, b: Int): Int = 
        @annotation.tailrec
        def _gcd(a: Int, b: Int): Int = a match
            case 0 => b
            case a if b == 0 => a
            case _ => _gcd(b, a % b)
        _gcd(Math.abs(a), Math.abs(b))
        
    println(gcd(12, 8)) // 4
    println(gcd(5, 20)) // 5