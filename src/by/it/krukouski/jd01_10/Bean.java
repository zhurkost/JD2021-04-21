package by.it.krukouski.jd01_10;

public class Bean {
    @Param(a=3,b=4)
    static double sum(int a, int b){
        return a+b;
    }
    @Param(a=5,b=8)
    double max(int a, int b){
        return Math.max(a, b);
    }

    @Param(a=1,b=7)
    double min(int a, int b){
        return Math.min(a, b);
    }
    static double avg(int a, int b){
        return (double)(a+b)/2;
    }
}
