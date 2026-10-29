package edu.rollins.cms270;

import edu.rollins.cms270.gui.MainWindow;

import javax.swing.SwingUtilities;

/**
 * Starts the program. Keep this class small: create your objects and open the window.
 */
public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();
        SwingUtilities.invokeLater(() -> new MainWindow(counter).setVisible(true));
    }
}
