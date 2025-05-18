package text.analyzer;

public class Main {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String[] spamKeywords = {"spam", "word"};
        TextAnalyzer[] textAnalyzers = new TextAnalyzer[] {new SpamAnalyzer(spamKeywords), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(10)};
        String text = "wood and  spa";
        Label resultLabel = checkLabels(textAnalyzers, text);
        switch (resultLabel) {
            case SPAM:
                System.out.println("Text is spam");
                break;
            case NEGATIVE_TEXT:
                System.out.println("Negative text");
                break;
            case TOO_LONG:
                System.out.println("Text is too long");
                break;
            case OK:
                System.out.println("Text is good");
                break;
        }
    }

}
