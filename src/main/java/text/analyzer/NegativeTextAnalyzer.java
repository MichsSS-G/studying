package text.analyzer;

public final class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private static final String[] negativeWords = {":(", "=(", ":|"};
    private static final Label label = Label.NEGATIVE_TEXT;
    public NegativeTextAnalyzer() {}

    @Override
    protected String[] getKeywords() {
        return negativeWords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}
