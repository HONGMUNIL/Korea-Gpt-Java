package chapter10.Practice;

//추상클래스(Item) -일반클래스 (Book) 관계 이해
//Manageable(인터페이스) - LibraryManager(인터페이스상속)
abstract class Item {
    private String id;
    private String name;


    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void display();



}
