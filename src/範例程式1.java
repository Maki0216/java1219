import java.awt.*;

public class AwtExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");
        Label label = new Label("Welcome to AWT Example");
        TextField textField = new TextField(20);

        // Set layout and add components
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(textField);
        frame.add(button);

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