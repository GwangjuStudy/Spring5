package chap02;

public class Greeter {
    private String format;
    private String a;

    public String greet(String guest) {
        return String.format(format, guest);
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}