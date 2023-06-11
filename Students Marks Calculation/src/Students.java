import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Students {
    private JTextField txtSname;
    private JTextField textSection;
    private JTextField textROllno;
    private JTextField textM1;
    private JTextField textM2;
    private JTextField textM3;
    private JTextField textTotal;
    private JTextField textAVG;
    private JTextField textRES;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Students");
        frame.setContentPane(new Students().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Students() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int m1,m2,m3,tot;
            double avg;


                m1 = Integer.parseInt(textM1.getText());
                m2 = Integer.parseInt(textM2.getText());
                m3 = Integer.parseInt(textM3.getText());

                tot = m1+m2+m3;

                textTotal.setText(String.valueOf(tot));


                avg = tot/3;

                textAVG.setText(String.valueOf(avg));

                if(avg>50)
                {
                    textRES.setText("PASS");
                }
                else
                    textRES.setText("FAIL");

            }
        });
    }
}
