package NonTerminalClasses;

import PatronComposite.NonTerminal;
import PatronComposite.Terminal;

/**
 * Created by Mickael on 06/02/2017.
 */
public class SupEq extends NonTerminal{
    public SupEq(Terminal t1, Terminal t2) {
        ajouter(t1);
        ajouter(t2);
    }
}
