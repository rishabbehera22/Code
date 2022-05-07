

public class abstract2 {
    public static void main(String[] args) {
        human h=new human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
        basicaniamls bs=new human();
        bs.eat();
    }
}

    abstract class monkey{
        abstract public void jump();
        abstract public void bite();
    }
    interface basicaniamls{
        void eat();
        void sleep();
    }

class human extends monkey implements basicaniamls{
    public void jump()
    {
        System.out.println("Human knows how to jump");
    }
    public void bite()
    {
        System.out.println("Human knows how to bite");
    }
    public void eat()
    {
        System.out.println("Human know how to eat");
    }
    public void sleep()
    {
        System.out.println("Human know how to take rest");
    }
}