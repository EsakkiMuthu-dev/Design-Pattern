package MementoPattern;

import java.util.ArrayList;

public class History {
    private ArrayList<TextMemento> list = new ArrayList<>();
    private int pointer;  // for undo and redo operations
    private static History history;
    
    //adding private constructor
    private History(){
        
    }
    public static History getHistorObj(){
        if(history == null){
            synchronized(History.class){
                if(history==null) history = new History();        
            }
        }
        return history;
    }
    public TextMemento undo(){
        pointer--;
        if(!list.isEmpty() && pointer >0){
            return list.get(pointer);
        }
        return null;     
    }
    public TextMemento redo()
    {
        pointer++;
        if(!list.isEmpty() && pointer >0){
            return list.get(pointer);
        }
        return null;  
    }


    public void saveHistory(TextMemento m){
        list.add(m);
        pointer = list.size();             
    }
}
