package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.tryRoll(hare);
        wolf.tryEat(ball);
        ball.tryRoll(wolf);
        fox.tryEat(ball);
        ball.tryRoll(fox);
    }
}
