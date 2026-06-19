package Week1.Excercise2_FactoryMethodPattern;

public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}