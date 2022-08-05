package Lection_11.Exceptions;

public class ExceptionPrinter {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) {
        ExceptionPrinter printer = new ExceptionPrinter();
        printer.print();
    }
}