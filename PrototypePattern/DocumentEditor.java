package PrototypePattern;
public class DocumentEditor implements Document {

    public String data;

    public DocumentEditor(String data) {
        this.data = data;
    }

    private DocumentEditor(DocumentEditor doc) {
        // Proper initialization in the cloning constructor
        this.data = doc.data;
    }

    @Override
    public DocumentEditor clone() {
        // Correct cloning logic
        return new DocumentEditor(this);
    }

    @Override
    public void add(String data) {
        this.data += data;
    }
}
