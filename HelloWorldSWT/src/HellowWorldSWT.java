import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HellowWorldSWT {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello World!");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
		}
		
		// TODO Auto-generated method stub

	}


