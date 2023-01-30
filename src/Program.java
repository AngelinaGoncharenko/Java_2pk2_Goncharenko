import java.util.Date;

public class Program {
    public static void main(String args[]) {
        Turtle turtle = new Turtle("ЧереПавел", new Date(2023, 1, 1), Env.GROUND, Food.GRASS);
        Dolphin dolphin = new Dolphin("Brad", new Date(2023, 1, 30), Env.WATER, Food.MEAT);
        System.out.println(turtle.getName());
        System.out.println(turtle.getDateB());


        System.out.println(dolphin.getName());
        System.out.print("Обитает в " + dolphin.getEnv());
        System.out.print(" Ест "+dolphin.getFood());
    }
}
