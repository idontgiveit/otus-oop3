package ru.otus.oop.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setLocation(400, 400);
        frame.setVisible(true);

        for (int i = 0; i < 10; i ++ ){
            Button button = new Button(String.valueOf(i));
            final int j = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(j);
                }
            });

            frame.add(button);


        }


    }
}
