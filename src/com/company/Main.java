package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi\n");
        Teatr Bolshoy= new Teatr(1570000, 430,"Bolshou Teatr", "classic teatr");
        String type = Bolshoy.getType();
        System.out.println("\nТип\t" + type);
    }

}
