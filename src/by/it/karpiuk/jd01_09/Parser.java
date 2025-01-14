package by.it.karpiuk.jd01_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    Var calc(String expression){
        String [] operand =expression.split(Patterns.operation);
        Var one =Var.createVar(operand[0]);
        Var two =Var.createVar(operand[1]);
        if (one == null||two==null)
            return null;
        Pattern p=Pattern.compile(Patterns.operation);
        Matcher m = p.matcher(expression);
        if (m.find()){
            String operation =m.group();
            switch (operation){
                case "+": return one.add(two);
                case "-": return one.add(two);
                case "*": return one.add(two);
                case "/": return one.add(two);
            }
        }
        return null;
    }
}
