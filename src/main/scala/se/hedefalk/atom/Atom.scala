package se.hedefalk.atom

import scala.scalajs.js

trait Atom extends js.Object {
  val commands: CommandRegistry = js.native
  val config: Config = js.native
}


trait CommandRegistry extends js.Object {

}

trait Config extends js.Object {

}
