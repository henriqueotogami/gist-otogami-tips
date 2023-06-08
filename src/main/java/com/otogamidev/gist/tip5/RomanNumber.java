package tip5;

public enum RomanNumber {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int decimalNumber;
    RomanNumber(final int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public int getDecimalNumber() {
        return this.decimalNumber;
    }
}
