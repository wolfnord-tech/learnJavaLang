package ru.wolfnord.lab4.task2;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void introduce() {
        System.out.println("Характеристики героя:");
        System.out.println("Голова: " + head);
        System.out.println("Левая нога: " + leftLeg);
        System.out.println("Правая нога: " + rightLeg);
        System.out.println("Левая рука: " + leftHand);
        System.out.println("Правая рука: " + rightHand);
    }
}
