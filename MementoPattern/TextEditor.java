package MementoPattern;

public class TextEditor {
    private String textArea;
    History history;
    public TextEditor(String text){
        textArea+=text;
        history=History.getHistorObj();
    }

    public void writeText(String text)
    {
        textArea+=text;
    }

    public String getTextArea()
    {
        return textArea;
    }
    
}
