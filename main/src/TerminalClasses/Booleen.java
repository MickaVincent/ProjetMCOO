package TerminalClasses;

import PatronComposite.Terminal;

/**
 * Created by ASUSMickael on 30/01/2017.
 */
public class Booleen extends Terminal {
    boolean m_value;
    Booleen(boolean value)
    {
        m_value = value;
    }

    public boolean getValue() {
        return m_value;
    }
}
