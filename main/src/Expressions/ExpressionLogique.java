package Expressions;

import PatronComposite.Expression;
import PatronComposite.NonTerminal;

/**
 * Created by Mickael on 06/02/2017.
 */
public abstract class ExpressionLogique extends NonTerminal {
    public ExpressionLogique(Expression e1, Expression e2){
        ajouter(e1);
        ajouter(e2);
    }
}
