package ru.vaszol.Robot;

/**
 * Created by vas on 28.03.15.
 */
public class RobotTotal extends Robot
{
    // Вводим поле дляхранения пройденной дистанции
    private double totalDistance = 0;

    // Конструктор тоже надо переопределить
    public RobotTotal(double x, double y) {
        super(x, y);
    }

    @Override
    public void forward(int distance) {
        // Вызов нашего метода у класса предка.
        // Нужно указать зарезервированное слово super
        super.forward(distance);
        totalDistance += distance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}