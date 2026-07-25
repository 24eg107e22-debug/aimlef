package jar.dto;

public class SumDto {

    private int a;
    private int b;
    private int sum;
    private String message;

    public SumDto(int a, int b) {
        this.a = a;
        this.b = b;
        this.sum = a + b;
        this.message = "Sum calculated successfully";
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getSum() {
        return sum;
    }

    public String getMessage() {
        return message;
    }
}