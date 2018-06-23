package Task_10_43;
//вычисления суммы цифр натурального числа;
public class Task_10_43 {
    public int sum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sum(n / 10);
        }
    }


}
