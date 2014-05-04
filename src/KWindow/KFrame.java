package KWindow;


import KBody.KBody;
import KComponents.KMenuBar;
import KStyle.KStyle;

import javax.swing.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class KFrame extends JFrame implements ComponentListener {

    private KBody body = null;
    private KMenuBar menuBar = null;

    public KFrame( String title, KStyle style ) {

        body = new KBody( style );

        setTitle( title );
    }

    public void componentResized( ComponentEvent e ) {

    }

    public void componentMoved( ComponentEvent e ) {

    }

    public void componentShown( ComponentEvent e ){

    }

    public void componentHidden( ComponentEvent e ){

    }
}
