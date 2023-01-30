import java.util.Date;

public class Dolphin extends Animal { // extends - расширять
    Food food = Food.MEAT;
    Env env = Env.WATER;

    public Dolphin(String name, Date dateB, Env env, Food food) {
        super (name, dateB, env, food);
    }

    @Override
    public void move() {
        System.out.println(this.name + " поплыл");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " поел");
    }
}
