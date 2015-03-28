package ru.vaszol.Robot;

import ru.vaszol.Robot.Robot;

// Для того, чтобы унаследоваться нужно просто написать слово
// extends и имя класса, от которого нам надо унаследоваться
public class RobotExt extends Robot
{
    // Конструктор с параметрами
    public RobotExt(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void back(int distance) {
        forward(-distance);
    }
}