package NonTerminalClasses;

import PatronComposite.NonTerminal;
import PatronComposite.Terminal;
import TerminalClasses.Litteral;

/**
 * Created by ASUSMickael on 30/01/2017.
 */
public class Appartient extends NonTerminal {
    public Appartient(Terminal t1, Terminal t2) {
        ajouter(t1);
        ajouter(t2);
    }
}
