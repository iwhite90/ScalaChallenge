import org.scalatest.FunSuite
import org.scalatest.Matchers._

class Challenge_1_Test extends FunSuite {

  /**
  *   Write an implementation of a Box, with the following properties:
  *
  *   •	A Box can either contain a value, in which case it is Full, or else it is Empty.
  *   •	A Box should be able to contain a value of any type, but the type should be explicitly declared.
  *   •	A Box should be immutable.
  *
  *
  *   A Box should have the following methods or properties:
  *
  *   •	isEmpty – returns true if the Box is Empty, otherwise false.
  *   •	get – returns the value from a Full, or throws a NoSuchElementException if called on an Empty.
  *   •	map – takes a function that transforms a value.
  *     •	If called on a Full, returns a new Box containing the transformed value.
  *     •	If called on an Empty, returns a new Empty.
  *   •	flatMap - takes a function that transforms a value and places it in a Box.
  *     •	If called on a Full, returns a new Box containing the transformed value removed from the nested Box.
  *     •	If called on an Empty, returns a new Empty.
  *   •	getOrElse – takes a default value.
  *     •	If called on a Full, returns the value from the Full.
  *     •	If called on an Empty, returns the default value.
  *
  *
  *   Use Test Driven Development. Once complete, the following tests of for comprehensions should pass:
  */

  /*
  test("A for comprehension over a chain of Fulls gives access to all the Fulls' values and returns a Full") {
    val result: Box[Int] = for {
      a <- Full(1)
      b <- Full(2)
    } yield a + b

    result shouldBe Full(3)
  }

  test("A for comprehension over a chain of Boxes that contains an Empty returns an Empty") {
    val result: Box[Int] = for {
      a <- Full(1)
      _ <- Empty
      b <- Full(2)
    } yield a + b

    result shouldBe Empty
  }
  */
}
