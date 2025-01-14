package by.it.karpiuk.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> allmethods = Math.class;
        Method[] methods = allmethods.getDeclaredMethods();
        for (Method method : methods) {
            if((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC)
                System.out.println(method);
        }
    }
}
