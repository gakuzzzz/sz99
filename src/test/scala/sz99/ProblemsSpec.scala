package sz99

import org.scalatest.FlatSpec
import org.scalatest.DiagrammedAssertions

class ProblemsSpec extends FlatSpec with DiagrammedAssertions {

  val target = new Answers

  it should "check q1" in {
    assert(target.q1_hello_world.toList == List("Hello World!"))
  }



}
