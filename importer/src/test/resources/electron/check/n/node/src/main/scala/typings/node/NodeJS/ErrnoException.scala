package typings.node.NodeJS

import org.scalablytyped.runtime.UndefOr
import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrnoException extends Error {
  var code: UndefOr[String] = js.undefined
  var errno: UndefOr[Double] = js.undefined
  var path: UndefOr[String] = js.undefined
  var syscall: UndefOr[String] = js.undefined
}

object ErrnoException {
  @scala.inline
  def apply(
    code: String = null,
    errno: Int | Double = null,
    path: String = null,
    stack: String = null,
    syscall: String = null
  ): ErrnoException = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (syscall != null) __obj.updateDynamic("syscall")(syscall)
    __obj.asInstanceOf[ErrnoException]
  }
}
