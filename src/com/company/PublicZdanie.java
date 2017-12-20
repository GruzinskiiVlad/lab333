package com.company;

public abstract class PublicZdanie implements Zdanie {
    protected int price;
    protected int ploshad;
    protected String Name;
    protected String Type;
    PublicZdanie(int price, int ploshad, String Name, String Type) { //конструктор с параметрами
        this.price = price;
        this.ploshad = ploshad;
        this.Name = Name;
        this.Type = Type;
    }
    public void showCharacter(){
        System.out.println("Цена:\t" + price + "\nПлощадь\t" + ploshad + "\nТип :\t" + Type +"\nНазвание :\t" + Name);
    }
    public void Ploshad(){
        System.out.println("\nПлощадь\t" + ploshad);
    }
    public int getPrice(){
      return price;
    }

}
