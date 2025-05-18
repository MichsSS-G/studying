package text.analyzer;

abstract public class KeywordAnalyzer implements TextAnalyzer {

    abstract protected String[] getKeywords();

     abstract protected Label getLabel();

    @Override
    public Label processText(String text) {
        if (text == null) {
            return Label.OK;
        }
        boolean findLabel = false;
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                findLabel = true;
                break;
            }
        }
        if (findLabel) {
            return getLabel();
        }
        else {
            return Label.OK;
        }
    }
}
