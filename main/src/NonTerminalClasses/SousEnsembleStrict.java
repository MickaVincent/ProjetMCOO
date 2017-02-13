package NonTerminalClasses;

import PatronComposite.Expression;
import PatronComposite.NonTerminal;

/**
 * Created by Mickael on 13/02/2017.
 */
public class SousEnsembleStrict extends NonTerminal{
    public SousEnsembleStrict(Expression... exprs){
        for(Expression expr : exprs){
            ajouter(expr);
        }
    }
}
