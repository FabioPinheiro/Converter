package typings.reactBootstrap

import typings.react.mod.Component
import typings.reactBootstrap.bootstrapUtilsMod.BSProps
import typings.reactBootstrap.buttonGroupMod.ButtonGroupProps
import typings.reactBootstrap.toggleButtonGroupMod.ToggleButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-bootstrap/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class ButtonGroup ()
    extends Component[ButtonGroupProps, js.Object, js.Any]
  
  @js.native
  class ToggleButtonGroup ()
    extends Component[ToggleButtonGroupProps, js.Object, js.Any]
  
  @js.native
  object utils extends js.Object {
    def createChainedFunction(funcs: js.Function*): js.Function = js.native
    @js.native
    object bootstrapUtils extends js.Object {
      def getBsProps(props: js.Any): BSProps = js.native
    }
    
  }
  
}

