package ru.otus.oop.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LIstener1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("1");
    }
}
