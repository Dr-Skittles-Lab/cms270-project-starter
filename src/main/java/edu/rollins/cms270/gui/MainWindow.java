package edu.rollins.cms270.gui;

import edu.rollins.cms270.Counter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;

/**
 * Sample Swing window. In Codespaces, open the "GUI Desktop" port (6080) to see it.
 */
public class MainWindow extends JFrame {

    public MainWindow(Counter counter) {
        super("CMS 270 Project");

        JLabel label = new JLabel("Count: 0", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 28f));

        JButton addButton = new JButton("Add 1");
        addButton.addActionListener(e -> counter.increment());

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> counter.reset());

        // The window listens to the logic, not the other way around.
        counter.addCountListener(newCount -> label.setText("Count: " + newCount));

        JPanel buttons = new JPanel();
        buttons.add(addButton);
        buttons.add(resetButton);

        add(label, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        setSize(320, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
