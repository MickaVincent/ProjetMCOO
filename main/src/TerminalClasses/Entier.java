package TerminalClasses;

import PatronComposite.Terminal;

/**
 * Created by ASUSMickael on 30/01/2017.
 */
public class Entier extends Terminal {
    private int m_number;
    public Entier(int number)
    {
        m_number = number;
    }

    public int getNumber()
    {
        return m_number;
    }
}
