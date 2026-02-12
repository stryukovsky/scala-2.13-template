import zio._
import zio.Console._

object MyApp extends ZIOAppDefault {

  def run = myAppLogic

  val myAppLogic =
    for {
      _    <- printLine("Hello! What is your name?")
    } yield ()
}
