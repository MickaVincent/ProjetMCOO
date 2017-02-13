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
    Litteral Y = new Litteral("Y");
    Litteral Z = new Litteral("Z");
    Expression exemple2 = new EtLogique(
            new Egalite(Y, new EnsembleEnExtension(new Entier(4), new Entier(5), new Entier(6))),
            new IlExiste(Z, new SousEnsembleStrict(Z, Y), new Egalite(new Cardinalite(Z), new Entier(3))
            ));
    Litteral x2 = new Litteral("x");
    Litteral X2 = new Litteral("X");
    Expression exemple3 = new EtLogique(
            new Egalite(X2, new EnsembleEnExtension(new Entier(1), new Entier(2), new Entier(3))),
            new IlExiste(x2, new Appartient(x2, X2), new Egalite(new Cardinalite(x2), new Entier(1))
            ));
}
