package text.analyzer;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private final String[] keywords;
    private final static Label label = Label.SPAM;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
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
