package Week1.Excercise2_FactoryMethodPattern;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("PDF Document Opened");
    }
}