public class Cat extends Animal{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void play(){
        System.out.println("CAT " + name + " JUMPS ON THE TABLE");
    }

    @Override
    public void play(Toy toy){
        System.out.println("CAT " + name + " is playing with toy " + toy);
    }

}
