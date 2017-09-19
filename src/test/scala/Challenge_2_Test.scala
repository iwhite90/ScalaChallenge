import org.scalatest.FunSuite
import org.scalatest.Matchers._

class Challenge_2_Test extends FunSuite {

  /**
  *   A GiveItAGo represents an operation that may throw an exception.
  *   •	If the operation is successful, the GiveItAGo should be a Great containing the result of the operation.
  *   •	If the operation throws an exception, the GiveItAGo should be an Oops containing the exception.
  *
  *   In a similar way to other Scala collections, the GiveItAGo allows chaining of operations.
  *   •	map and flatMap operate on Great instances, and do nothing for Oops
  *   •	recover and recoverWith are the equivalents of map and flatMap on Oops instances, and do nothing for Great.
  *
  *   GiveItAGo should have the following API:
  *   •	isGreat: Boolean
  *   •	isOops: Boolean
  *   •	get - returns the value from a Great, or throws the exception from an Oops
  *   •	getOrElse(default) - returns the value from a Great, or the default value from an Oops
  *   •	map(f: A => B): GiveItAGo[B] - returns a new GiveItAGo with the result of the function when applied to a Great. Does nothing for Oops.
  *   •	flatMap(f: A => GiveItAGo[B]): GiveItAGo[B] - returns a new GiveItAGo with the unwrapped result of the function when applied to a Great. Does nothing for Oops.
  *   •	recover(pf: PartialFunction[Throwable, A]): GiveItAGo[A] - the equivalent of map for Oops. Does nothing for Great. Note this is a partial function.
  *   •	recoverWith(pf: PartialFunction[Throwable, GiveItAGo[A]]): GiveItAGo[A] - the equivalent of flatMap for Oops. Does nothing for Great.
  *
  *   Use Test Driven Development. Don't look at the Scala implementation of Try.
  *
  *   Once complete, the provided tests should pass.
  */

/*
  test("For comprehension over a chain of GiveItAGos") {
    val x: GiveItAGo[Seq[String]] = for {
      a <- GiveItAGo { 1 + 2 }
      b <- GiveItAGo { "hello" }
    } yield (1 to a).map(_ => b)

    val result = x match {
      case Great(xs) => xs mkString ","
      case _: Oops[_] => fail
    }

    result shouldBe "hello,hello,hello"
  }


  test("Recovering from Oops") {
    val x = GiveItAGo { throw new IllegalStateException("Illegal state") }

    val y = x recoverWith {
      case _: IllegalStateException => GiveItAGo { throw new UnsupportedOperationException("Something bad") }
    }

    val result = y recover {
      case e: UnsupportedOperationException => e.getMessage
    }

    result.get shouldBe "Something bad"
  }
  */
}
