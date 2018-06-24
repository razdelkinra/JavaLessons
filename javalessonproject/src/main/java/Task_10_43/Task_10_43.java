package Task_10_43;
//вычисления суммы цифр натурального числа;
public class Task_10_43 {
    public int getsumdigitsofnumber(int n) { // название должно отражать поведение

        return (n < 10)? n: n % 10 + getsumdigitsofnumber(n / 10);
    }
}
