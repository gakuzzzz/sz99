package sz99

import scalaz.stream._
import scalaz.concurrent.Task

object Main extends App {

  def fahrenheitToCelsius(f: Double): Double = (f - 32.0) * (5.0/9.0) 

  val converter: Task[Unit] =
    io.linesR("testdata/fahrenheit.txt")
      .filter(s => !s.trim.isEmpty && !s.startsWith("//"))
      .map(line => fahrenheitToCelsius(line.toDouble).toString)
      .intersperse("\n")
      .pipe(text.utf8Encode)
      .to(io.fileChunkW("testdata/celsius.txt"))
      .run

  converter.run

}
