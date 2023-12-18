package ru.wolfnord.lab4.task2;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Brown", "Blue");
        Leg leftLeg = new Leg(100, "Left");
        Leg rightLeg = new Leg(100, "Right");
        Hand leftHand = new Hand(120, "Left");
        Hand rightHand = new Hand(120, "Right");

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        human.introduce();
    }
}
