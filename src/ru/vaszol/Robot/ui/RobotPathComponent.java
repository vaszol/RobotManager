package ru.vaszol.Robot.ui;


import ru.vaszol.Robot.Robot;
import ru.vaszol.Robot.RobotLine;
import javax.swing.JComponent;
import java.awt.Graphics;

/**
 * Created by vas on 29.03.15.
 */
public class RobotPathComponent extends JComponent {
    private Robot robot;

    public RobotPathComponent(ru.vaszol.Robot.Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Перебираем все линии, которые сохранились у робота
        // Несколько позже мы разберем эту конструкицю подробно
        for (RobotLine rl : robot.getLines()) {
            // Для каждой линии получаем координаты
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());
            // И рисуем линию с координатами
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
