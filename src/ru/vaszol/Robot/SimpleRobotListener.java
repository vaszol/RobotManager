package ru.vaszol.Robot;

/**
 * Created by vas on 29.03.15.
 */
// Наш класс реализует интерфейс robotListener
public class SimpleRobotListener implements RobotListener
{
    @Override
    public void startMove(double x, double y)
    {
        System.out.println("Робот начал движение, координаты:" + x + "," + y);
    }

    @Override
    public void endMove(double x, double y)
    {
        System.out.println("Робот закончил движение, координаты:" + x + "," + y);
    }
}