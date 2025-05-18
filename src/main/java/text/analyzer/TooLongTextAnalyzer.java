package text.analyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private final int maxLength;
    private final static Label label = Label.TOO_LONG;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text == null) {
            return Label.OK;
        }
        if (text.length() > maxLength) {
            return label;
        }
        return Label.OK;
    }
}
