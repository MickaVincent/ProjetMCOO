package NonTerminalClasses;

import PatronComposite.NonTerminal;
import TerminalClasses.Entier;

/**
 * Created by Mickael on 06/02/2017.
 */
public class EnsembleEnExtension extends NonTerminal{
    public  EnsembleEnExtension(Entier... args){
        for(Entier x : args){
            ajouter(x);
        }

    }
}
