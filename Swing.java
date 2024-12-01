import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
    SwingDemo() {
        // Create JFrame container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(300, 200);
        jfrm.setLayout(new GridLayout(5, 1, 5, 5)); // GridLayout with spacing
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels and text fields
        JLabel jlab = new JLabel("Enter the divisor and dividend:");
        JTextField ajtf = new JTextField(10);
        JTextField bjtf = new JTextField(10);

        JButton button = new JButton("Calculate");
        JLabel err = new JLabel("", SwingConstants.CENTER);
        err.setForeground(Color.RED); // Highlight error messages in red

        JLabel anslab = new JLabel("", SwingConstants.CENTER);

        // Add components to the frame
        jfrm.add(jlab);
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(ajtf);
        inputPanel.add(bjtf);
        jfrm.add(inputPanel);
        jfrm.add(button);
        jfrm.add(err);
        jfrm.add(anslab);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    err.setText(""); // Clear previous errors
                    anslab.setText(""); // Clear previous results

                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());

                    if (b == 0) {
                        throw new ArithmeticException("Divisor cannot be zero");
                    }

                    int ans = a / b;
                    anslab.setText("Result: " + ans);
                } catch (NumberFormatException e) {
                    err.setText("Enter valid integers!");
                } catch (ArithmeticException e) {
                    err.setText("Divisor cannot be zero!");
                }
            }
        });

        // Display frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Create frame on event dispatching thread
        SwingUtilities.invokeLater(() -> new SwingDemo());
    }
}
