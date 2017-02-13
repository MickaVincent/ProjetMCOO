package NonTerminalClasses;

import PatronComposite.Expression;
import PatronComposite.NonTerminal;
import PatronComposite.Terminal;
import TerminalClasses.Litteral;

/**
 * Created by Mickael on 13/02/2017.
 */
public class QuelqueSoit extends NonTerminal{
    public QuelqueSoit(Terminal t1, NonTerminal nt1, NonTerminal nt2) {
        ajouter(nt1);
        ajouter(nt2);
    }
}
