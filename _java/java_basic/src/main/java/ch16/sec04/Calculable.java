
package ch16.sec04;

@FunctionalInterface
public interface Calculable {
    double calc(double x, double y);
    default double calc(int x, double y) {
        return 3.14;
    }
}