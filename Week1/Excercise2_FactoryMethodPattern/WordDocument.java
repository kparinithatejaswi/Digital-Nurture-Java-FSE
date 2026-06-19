package Week1.Excercise2_FactoryMethodPattern;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Word Document Opened");
    }
}