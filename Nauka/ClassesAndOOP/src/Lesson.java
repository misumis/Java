public class Lesson {

    public static void main(String args[])
    {
        Monster Frank = new Monster();

        Frank.name = "Frank";

        System.out.print(Frank.name + " has attack of "+ Frank.getAttack());
    }
}
