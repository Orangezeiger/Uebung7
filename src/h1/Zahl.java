package h1;

public class Zahl {
    public boolean even = false, small = true, positive = true;
    public int num = 12;

    public void setEven() {
        if(num % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    public void setSmall() {
        if(num < 100) {
            small = true;
        } else {
            small = false;
        }
    }

    public void setPositive() {
        if(num > 0) {
            positive = true;
        } else {
            positive = false;
        }
    }
}
