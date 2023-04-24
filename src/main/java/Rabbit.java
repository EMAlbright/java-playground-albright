public class Rabbit extends Animal{
    private String name;
    private String color;

    public Rabbit(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void play(){
        System.out.println("RABBIT " + name + " is patiently sitting");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("RABBIT " + name + " is chasing toy " + toy);
    }
}
