public class Toy implements Action{
    private String name;

    public Toy(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("TOY " + name + " is making some weird sound.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("TOY " + name + " is happy to see toy " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}

