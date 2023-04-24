public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog devil = new Dog("Halo", "E", 3);
        Rabbit curb = new Rabbit("White", "Brexit");
        Toy legoCar = new Toy("Robot");


        Action[] animals = new Action[]{coco, devil, curb, legoCar};
        for(Action animal: animals){
            animal.play(legoCar);
        }

    }
}