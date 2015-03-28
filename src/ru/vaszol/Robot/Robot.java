package ru.vaszol.Robot;

/**
 * Created by vas on 27.03.2015.
 */
public class Robot {

    // Текущая координата X
    private double x = 0;
    // Текущая координата Y
    private double y = 0;
    // Текущий курс (в градусах)
    protected double course = 0;

    // Вот наш конструктор, который пока не очень полезен
    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Передвижение на дистанцию distance
    public void forward(int distance) {
        // Обращение к полю объекта X
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // Обращение к полю объекта Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    // Печать координат робота
    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    // Мы ррассмотрим этот метод несколько позже
    public void setCourse(double course) {
        this.course = course;
    }
}
