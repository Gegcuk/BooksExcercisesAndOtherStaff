package uk.gegc.effectiveJava.part3;

/*Task: Implement a Money value class (with currency and amount fields) that implements Comparable.
Comparison is performed first by currency (string value), then by amount.*/
public class Money implements Comparable<Money>{

    private final String currency;
    private final Double amount;

    public Money(String currency, Double amount){
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(amount);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Money m)) return false;
        if(!m.currency.equals(this.currency)){
            return false;
        } else return Double.compare(this.amount, m.amount) == 0;
    }

    @Override
    public String toString() {
        return currency + " " + amount;
    }

    @Override
    public int compareTo(Money o) {
        int result = currency.compareTo(o.currency);
        if(result == 0) {
            result = Double.compare(amount, o.amount);
        }
        return result;
    }
}
