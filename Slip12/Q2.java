package Slip12;

import java.awt.*;
import java.awt.event.*;

public class Q2 extends Frame implements MouseListener, MouseMotionListener {
  
  public Q2() {
    addMouseListener(this);
    addMouseMotionListener(this);
    setSize(400, 400);
    setVisible(true);
  }
  
  public void mouseClicked(MouseEvent e) {
    System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public void mouseEntered(MouseEvent e) {
    System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public void mouseExited(MouseEvent e) {
    System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public void mousePressed(MouseEvent e) {
    System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public void mouseReleased(MouseEvent e) {
    System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public void mouseDragged(MouseEvent e) {
    System.out.println("Mouse dragged at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public void mouseMoved(MouseEvent e) {
    System.out.println("Mouse moved at (" + e.getX() + ", " + e.getY() + ")");
  }
  
  public static void main(String[] args) {
    new Q2();
  }
}
