import androidx.compose.ui.window.ComposeUIViewController
import br.com.uware.numbergenerator.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
