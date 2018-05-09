package com.snakegame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Layer extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.DARK_GRAY);
            for (int i = 0; i< Room.game.getWidth()*10/10; i++){
                g.drawLine(i*10, 0, i*10, Room.game.getHeight()*10);
            }
            for (int i = 0; i< Room.game.getHeight()*10/10; i++){
                g.drawLine(0, i*10, Room.game.getWidth()*10, i*10);
            }

            g.setColor(Color.BLACK);
            g.fillRect(Room.game.getMouse().getX()*10, Room.game.getMouse().getY()*10, 10, 10);
            g.setColor(Color.gray);
            g.fillRect(Room.game.getMouse().getX()*10+2, Room.game.getMouse().getY()*10+2, 10-4, 10-4);

            ArrayList<SnakeSection> getsection = Room.game.getSnake().getSections(); //Получаем секции змейки
            for (int i = 0; i < getsection.size(); i++) {
                g.setColor(Color.BLACK);
                g.fillRect(getsection.get(i).getX()*10, getsection.get(i).getY()*10, 10, 10);
                g.setColor(Color.blue);
                g.fillRect(getsection.get(i).getX()*10+2, getsection.get(i).getY()*10+2, 10-4, 10-4);
            }
        }

    }



