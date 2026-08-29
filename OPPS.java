
class ComplexNumber {
    int x;
    int y;

    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    ComplexNumber() { }

    void print() {
        if (y >= 0)
            System.out.println(x + " + " + y + "i");
        else
            System.out.println(x + " - " + (-y) + "i");

    }

    add
    void add(ComplexNumber z) {
        // z2.x = 8;
        x += z.x;
        y += z.y;
    }

    Multiply
    void multiply(ComplexNumber z) {
        // z2.x = 8;
        // x *= z.x;
        // y *= z.y;
        x = x * z.x - y * z.y;
        y = x * z.y + y * z.x;
    }
    void divide(ComplexNumber z) {

    }
}

// FRACTION 


class Fraction {
    int num;
    int den;

    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplify();
    }

    void print() {
        System.out.println(num + " / " + den);
    }

    void add(Fraction f) {
        num = num * f.den + den * f.num;
        den = den * num;
        simplify();

    }

    void multiplay(Fraction f) {
        num = num * f.num;
        den = den * f.den;
        simplify();
    }

    void divide(Fraction f) {
        num = num * f.den;
        den = den * f.num;
        simplify();

    }

    void simplify() {
        boolean isNegative = (num * den < 0) ? true : false;
        num = Math.abs(num); // aagr num negative hua toh positive ho jayega 
        den = Math.abs(den);

        int gcd = hcf(num, num);
        num = num / gcd;
        den = den / gcd;
        if (isNegative) num = -num;
    }

    int hcf(int a, int b) {
        if (a == 0)
            return b;
        return hcf(b % a, a);
    }
}

public class OPPS {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(3, 4);
        z1.print(); z2.print();
        z1.add(z2);
        // z2.print();
        z1.print(); z2.print();
        z1.multiply(z2);
        z2.multiply(z1);
        // z1.print();
        z2.print();
        z2.divide(z1);

        // FRACTION CODE 

        Fraction f1 = new Fraction(3, -7);
        // f1.print();
        Fraction f2 = new Fraction(7, 3);
        Fraction f3 = new Fraction(-50, -100);
        f1.print();
        f1.multiplay(f2);
        f1.print();
        f3.print();

    }
}
