package NonTerminalClasses;

import PatronComposite.Expression;
import PatronComposite.NonTerminal;

/**
 * Created by Mickael on 06/02/2017.
 */
public class Egalite extends NonTerminal {
    public Egalite(Expression e1, Expression e2){
        ajouter(e1);
        ajouter(e2);
    }
}
