package Model;

public class Number {
    private String num;

    public Number(String currentTotal) {
        this.num = currentTotal;
    }

    public Number() {
        new Number("0");
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
