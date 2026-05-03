import java.awt.*;
import java.awt.event.*;

class But extends Frame {
    But() {
        Button b = new Button("OK");
        add(b);
       
        b.addActionListener(new MyClass());
    }
    public static void main(String[] args) {
        But obj = new But();
        obj.setSize(400,300);
        obj.setVisible(true); 
    }
}
class MyClass implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
}
