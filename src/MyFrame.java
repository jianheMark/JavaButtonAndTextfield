import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    public MyFrame() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");
        pizzaIcon = new ImageIcon("pizza.png");
        hotdogIcon = new ImageIcon("hotdog.png");
        hamburgerIcon = new ImageIcon("hamburger.png");

        //pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        //hotdogButton.setIcon(hotdogIcon);

///https://docs.oracle.com/javase/tutorial/uiswing/components/buttongroup.html
        //The ButtonGroup component manages the selected/unselected state for a set of buttons.
        // For the group,
        // the ButtonGroup instance guarantees that only one button can be selected at a time.
        //Initially, all buttons managed by a ButtonGroup instance are unselected.
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.setSize(750,750);

//        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {System.out.println("You have choose pizza.");}
        else if (e.getSource() == hamburgerButton) {System.out.println("You have choose Hamburger.");}
        else {System.out.println("You have choose hotdog. Good for you.");}


    }
}
