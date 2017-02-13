package NonTerminalClasses;

import PatronComposite.Expression;
import PatronComposite.NonTerminal;

/**
 * Created by Mickael on 06/02/2017.
 */
public class SousEnsemble extends NonTerminal {
    public SousEnsemble(Expression... exprs){
        for(Expression expr : exprs){
            ajouter(expr);
        }

    }
}
