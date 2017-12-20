package com.company;

public class Teatr extends PublicZdanie{

    Teatr(int price, int ploshad, String Name, String Type) {
        super(price, ploshad, Name, Type);
    }
    public String getType(){ //устанавливает подкласс авианосца
        return Type;
    };
}
