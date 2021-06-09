package by.it.krukouski.jd01_12;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TaskC2 {
    private static final Integer[] i = {1, 2, 3, 4, 5};
    private static final Double[] d = {10.0, 20.0, 30.0, 40.0, 50.0, 60.0};
    private static final Long[] l = {1L, 2L, 3L, 4L, 5L};


    public static void main(String[] args) {
        Set<Integer> hashSetInteger = new HashSet<>(Arrays.asList(i));
        Set<Double> hashSetDouble = new HashSet<>(Arrays.asList(d));
        Set<Long> hashSetLong = new HashSet<>(Arrays.asList(l));
        System.out.println(getUnion(hashSetInteger, hashSetDouble, hashSetLong));
        System.out.println(getCross(hashSetInteger, hashSetDouble, hashSetLong));


    }

    private static Set<Number> getUnion(Set<?>... hashSet) {
        Set<Number> resultSet = new HashSet<>();
        for (Set<?> collection : hashSet) {
            resultSet.addAll((Collection<? extends Number>) collection);
        }
        return resultSet;
    }

    private static Set<Number> getCross(Set<?>... hashSet) {
        Set<Number> resultSet = new HashSet<>();
        for (Set<?> collection : hashSet) {
            resultSet.retainAll(collection);
        }
        return resultSet;
    }

}