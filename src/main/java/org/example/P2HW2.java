package org.example;

public class P2HW2 {
    private String Brand;
    private String Screen_size;
    private String Number_of_cores;
    private String Type;
    public P2HW2 (String Brand, String Screen_size, String Number_of_cores, String Type){
        this.Brand = Brand;
        this.Screen_size = Screen_size;
        this.Number_of_cores = Number_of_cores;
        this.Type = Type;
    }
    public static void main(String[] args) {
        P2HW2 classes = new P2HW2("HP", "17.9","5", "Laptop");
    }
}
