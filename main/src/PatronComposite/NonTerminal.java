package PatronComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUSMickael on 30/01/2017.
 */
public abstract class NonTerminal implements Expression {
    private List<Expression> listExpressions = new ArrayList<>();

    public void ajouter(Expression e){
        listExpressions.add(e);
    }
    public Expression supprimer(int i){
        return listExpressions.remove(i);
    }
}
