package FactoryMethod;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, what u want ? ");
        String choice = input.nextLine().toLowerCase();

        if(choice.contains("dosa")) {
            DosaFactory dosaFactory = new DosaFactory();
            Dish dosa = dosaFactory.prepareDish();
            dosa.prepare();
        }else if(choice.contains("idly"))
        {
            IdliFactory idliFactory = new IdliFactory();
            Dish idli = idliFactory.prepareDish();
            idli.prepare();
        }else if(choice.contains("chappathi"))
        {
            ChappathiFactory chappathiFactory = new ChappathiFactory();
            Dish chappathi = chappathiFactory.prepareDish();
            chappathi.prepare();
        }
        else{
            System.out.println("May be we try the dish tomorrow");
        }
        
    }
}
