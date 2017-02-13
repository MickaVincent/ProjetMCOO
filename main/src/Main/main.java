package Main;

import NonTerminalClasses.*;
import PatronComposite.Expression;
import TerminalClasses.Entier;
import TerminalClasses.Litteral;

/**
 * Created by ASUSMickael on 30/01/2017.
 */
public class main {

    public static void main(String[] args){
            System.out.println("yolo");
    }

    Litteral x = new Litteral("x");
    Litteral X = new Litteral("X");
    Expression exemple1 = new EtLogique(
            new Egalite(X, new EnsembleEnExtension(new Entier(1), new Entier(2), new Entier(3))),
            new QuelqueSoit(x, new Appartient(x, X), new SupEq(x, new Entier(0))));
}
