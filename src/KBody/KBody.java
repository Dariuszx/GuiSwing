package KBody;

import KBody.KContainer.KContainer;
import KStyle.KStyle;

import javax.swing.*;
import java.util.HashMap;

public class KBody extends JPanel {

    private KStyle style;
    private HashMap< String, KContainer > containers;

    public KBody( KStyle s ) {

        setLayout( null );
        style = s;
        containers = new HashMap<String, KContainer>();
    }

}
