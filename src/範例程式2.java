import java.awt.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Event Handling Example");
        Button button = new Button("Click Me");
        Label label = new Label("Button not clicked yet.");

        // Set layout and add components
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);

        // Add ActionListener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button was clicked!");
            }
        });

        // Frame settings
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Add window closing functionality
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
