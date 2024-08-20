import javax.swing.*;

public class ButtonExample2 {
    ButtonExample2() {
        JFrame f = new JFrame("Button Example");
        f.getContentPane().setLayout(null);
        
        // Load image icon (adjust path as needed)
        JButton b = new JButton(new ImageIcon("C:/Users/jamri/Desktop/organized/index-imgs/page2-index/page2content.JPG"));
              
        // Create button with image icon
        b.setBounds(100, 100, 200, 100); // Set button bounds
        f.getContentPane().add(b); // Add button to the frame
        
        f.setSize(500, 400); // Set frame size
        f.setVisible(true); // Make frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
    }

    public static void main(String[] args) {
        new ButtonExample2(); // Create an instance of ButtonExample2
    }
}