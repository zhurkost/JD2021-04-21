package by.it.voronko.jd01_01;

public class Args {
public String [] args;

    public Args() {
    }

    public void setArgs(String[] args) {
        this.args = args;
    }
    void printArgs(){
        int i=1;
        for (String arg : args) {
            i=i+1;
            System.out.println("Аргумент " + i + "=" + arg);
        }
    }
}
