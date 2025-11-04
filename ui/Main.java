import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    // Constructor to set up the UI
    public Main(String[] args) {
        // Set window title
        super("Basic Swing UI");

        // // Set layout manager (FlowLayout is simplest)
        // setLayout(new FlowLayout());

        // // Create some components
        // JLabel label = new JLabel("Enter your name:");
        // JTextField textField = new JTextField(15);
        // JButton button = new JButton("Greet");
        // JLabel resultLabel = new JLabel("");

        // // Add components to the frame
        // add(label);
        // add(textField);
        // add(button);
        // add(resultLabel);

        // // Add a simple button listener
        // button.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String name = textField.getText().trim();
        //         if (name.isEmpty()) {
        //             resultLabel.setText("Please enter a name!");
        //         } else {
        //             resultLabel.setText("Hello, " + name + "!");
        //         }
        //     }
        // });

        add(new UI(args));

        // Set window size and behavior
        setSize(1200, 675);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen
        setVisible(true);
    }

    // Main method to launch the UI
    public static void main(String[] args) {
        // Use the event dispatch thread (best practice for Swing)
        SwingUtilities.invokeLater(() -> new Main(args));
    }
}
