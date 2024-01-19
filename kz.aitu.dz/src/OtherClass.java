import kz.aitu.dz.Cat;

public class OtherClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meow();

        // Используем геттеры и сеттеры
        myCat.setName("Новое имя");
        String catName = myCat.getName();
        System.out.println("Новое имя кота:" + catName);

        myCat.setWeight(7);
        int catWeight = myCat.getWeight();
        System.out.println("Вес кота:" + catWeight);

        myCat.setColor("Белый");
        String catColor = myCat.getColor();
        System.out.println("Цвет кошары:" + catColor);
    }
}