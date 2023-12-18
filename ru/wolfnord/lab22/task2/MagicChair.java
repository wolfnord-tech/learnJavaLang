package ru.wolfnord.lab22.task2;

public class MagicChair implements Chair {
    @Override
    public void sit(Chair chair) {
        System.out.println("Magic Chair Pro");
    }
    public void doMagic() {
        System.out.println("It's magic!");
    }
}
