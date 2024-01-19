package kz.aitu.dz;

public class Cat {
    private String name;
    private Integer weight;
    private String color;
    private static int instanceCount;

    public Cat() {
        this.name = "barsik";
        instanceCount++;
    }

    public Cat(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        instanceCount++;
    }

    public Cat(String name, Integer weight, String color) {
        this(name, weight);
        this.color = color;
    }

    public String getName() {
        System.out.println("Геттер done");
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
    }

    public Integer getWeight() {
        System.out.println("Геттер для имени done");
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        System.out.println("Геттер для веса done");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " Сказал мяв");
    }

    static {
        instanceCount = 0;
        System.out.println("Инициализация класса кота");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.meow();

        Cat fluffy = new Cat("Aboba", 5);
        fluffy.meow();

        Cat ginger = new Cat("Pushok", 4, "Black");
        ginger.meow();

        int minValue = Math.min(10, 5);
        System.out.println("Минимальный вес: " + minValue);

        System.out.println("Сколько котов: " + instanceCount);
    }
}