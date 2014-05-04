package KComponents;

import KExceptions.KException;

import javax.swing.*;
import java.util.HashMap;

public class KMenuBar extends JMenuBar {

    private HashMap< String, JMenu > KMenu;
    private HashMap< String, JMenuItem > KMenuItem;

    public KMenuBar() {

        KMenu = new HashMap<String, JMenu>();
        KMenuItem = new HashMap<String, JMenuItem>();
    }

    public void addKMenuBar( JFrame parent ) {

        parent.add( this );
    }

    public void putKMenu( String key, String title ) throws KException {

        if( KMenu.containsKey( key ) ) throw new KException( "Próba dodania menu o istniejącym już kluczu" );
        else {
            KMenu.put( key, new JMenu( title ) );
        }
    }

    public void putKItem( String parentKey, String key, String title) throws KException {

        if( KMenuItem.containsKey( key ) ) throw new KException( "Próba odania menuItem do istniejącego już menu" );
        else if( !KMenu.containsKey( parentKey ) ) throw new KException( "Próba dodania menuItem do nieistniejącego menu" );
        else {
            JMenu menuItem = new JMenu( title );
            KMenu.get( parentKey ).add( menuItem ); //Dodaję menuitem do wybranego menu
            KMenuItem.put( key, menuItem );
        }
    }

    public void putKSubmenu( String parent_key, String key, String title ) throws KException {

        if( !KMenu.containsKey( parent_key ) ) throw new KException( "Próba dodania submenu do nieistniejącego menu" );
        else if( KMenu.containsKey( key ) ) throw new KException( "Próba dodania submenu o kluczu, która już istnieje" );
        else {
            JMenu subMenu = new JMenu( title );
            KMenu.get( parent_key ).add( subMenu ); //Dodaję submenu do istniejacego menu
            KMenu.put( key, subMenu );
        }
    }

    public JMenuItem getKItem( String key ) throws KException {

        if( !KMenuItem.containsKey( key ) ) throw new KException( "MenuItem o podanym kluczu nie istnieje" );
        else {
            return KMenuItem.get( key );
        }
    }

    public JMenu getKMenu( String key ) throws KException {

        if( !KMenu.containsKey( key ) ) throw new KException( "Menu o podanym kluczu nie istnieje" );
        else {
            return KMenu.get( key );
        }
    }
}
