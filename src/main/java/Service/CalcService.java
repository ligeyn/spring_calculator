package Service;

import Model.Number;
import org.springframework.stereotype.Service;


@Service
public class CalcService {

    private double total;

    public void add(Number num){
        total += Double.parseDouble(num.getNum());
    }
    public void substrict(Number num){
        total -= Double.parseDouble(num.getNum());
    }
    public void divide(Number num){
        total /= Double.parseDouble(num.getNum());
    }
    public void multiplicate(Number num){
        total *= Double.parseDouble(num.getNum());
    }
    public Number getTotal() {
        return new Number(Double.toString(total));
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
