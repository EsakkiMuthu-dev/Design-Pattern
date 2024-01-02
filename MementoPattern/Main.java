package MementoPattern;

public class Main {
    public static void main(String[] args) {
        History history = History.getHistorObj();
        // adding text
        TextEditor textEditor = new TextEditor("Hello World");
        textEditor.writeText("Hello");

        //we are saving the state
        TextMemento m1= new TextMemento(textEditor.getTextArea());
        history.saveHistory(m1);

        //we are changing the state
        textEditor.writeText("World");

        //again Saving the state
        TextMemento m2= new TextMemento(textEditor.getTextArea());
        history.saveHistory(m2);

        //Printing textArea
        System.out.println(textEditor.getTextArea());
        history.undo();
        

    }
}
