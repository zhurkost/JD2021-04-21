package by.it.vencerev.jd01_03;

class Helper {
    void sort(double[] a) {
        for (int last = a.length - 1; last > 1; last--) {
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i + 1]) {
                    double buf = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buf;
                }
            }
        }
    }
}
