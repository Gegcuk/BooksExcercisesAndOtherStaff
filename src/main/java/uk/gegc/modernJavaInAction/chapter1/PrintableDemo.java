package uk.gegc.modernJavaInAction.chapter1;

public class PrintableDemo implements Printable{
    private String string;

    public PrintableDemo(String message){
        this.string = message;
    }

    @Override
    public void print() {
        System.out.println(string);
    }

    public static void main(String[] args) {
        PrintableDemo pd = new PrintableDemo("Hello default method!");
        pd.print10times();
    }
}
