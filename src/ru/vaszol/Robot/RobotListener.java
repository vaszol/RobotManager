package ru.vaszol.Robot;

/**
 * Created by vas on 29.03.15.
 */
/**
 * Интерфейс слушателя событий от робота
 */
public interface RobotListener
{
    // Метод будет вызываться в момент начала движения
    public void startMove(double x, double y);
    // Метод будет вызываться в момент окончания движения
    public void endMove(double x, double y);
}