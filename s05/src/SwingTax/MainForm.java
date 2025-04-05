package SwingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
  private JTextPane pricePane;
  private JTextPane taxPane;
  private JTextPane totalPane;
  private JButton buttonCalculate;
  private JPanel taxPanel;

  public ActionListener botonPulsado() {
    System.out.println("hola perro");
    return null;
  }
  public MainForm() {
    buttonCalculate.addActionListener(botonPulsado());
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("SwingTax");
    frame.setContentPane(new MainForm().taxPane);
    frame.setVisible(true);
  }
}
