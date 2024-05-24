package u02tree
import org.junit.*
import org.junit.Assert.*
import u02tree.BTree._

class BTreeTest :
    //val tree = ??? //alias:not implemented
    val tree = Branch(
        Branch(Empty(),10,Empty()),
        20,
        Branch(Empty(),30,Empty())
    )

    @Test def testSomething() =
        assertEquals(60,sum(tree))

    @Test def TestCount()=
        assertEquals(3,count(tree))
        assertEquals(0,count(Empty()))
  

