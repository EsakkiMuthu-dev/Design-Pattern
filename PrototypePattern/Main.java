package PrototypePattern;

public class Main {
    public static void main(String[] args) {
        DocumentEditor editor1 = new DocumentEditor("");
        editor1.add(" Hello i am  editor");
        DocumentEditor editor2 = editor1.clone();
        editor2.add(" I am editor2");
        System.out.println(editor1.data);
        System.out.println(editor2.data);
         System.out.println(editor1.data);
    }
}
