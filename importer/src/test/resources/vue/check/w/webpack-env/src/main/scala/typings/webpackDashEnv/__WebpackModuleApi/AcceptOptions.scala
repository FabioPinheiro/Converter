package typings.webpackDashEnv.__WebpackModuleApi

import org.scalablytyped.runtime.UndefOr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptOptions extends js.Object {
  /**
    * Indicates that apply() is automatically called by check function
    */
  var autoApply: UndefOr[Boolean] = js.undefined
  /**
    * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
    */
  var ignoreUnaccepted: UndefOr[Boolean] = js.undefined
}

object AcceptOptions {
  @scala.inline
  def apply(
    autoApply: `<undefined>` | Boolean = js.undefined,
    ignoreUnaccepted: `<undefined>` | Boolean = js.undefined
  ): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply)
    if (!js.isUndefined(ignoreUnaccepted)) __obj.updateDynamic("ignoreUnaccepted")(ignoreUnaccepted)
    __obj.asInstanceOf[AcceptOptions]
  }
}
