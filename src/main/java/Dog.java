public class Dog extends Animal{
    private String name;
    private int age;
    private String owner;

    public Dog(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public void play(){
        System.out.println("DOG " + name + " CHASIN THE CATS TAILL!!!");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("DOG " + name + " is trying to eat toy " + toy);
    }
}

