import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame{

    //Font
    Font fnt1 = new Font("Arial", Font.BOLD, 30);

    //Frame
    JFrame frame1 = new JFrame();

    //Panels
    JPanel panel1 = new JPanel();

    //Items in Panel 1
    JTextArea jta1 = new JTextArea();
    Border brd = BorderFactory.createLineBorder(Color.black);
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton sum = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton ent = new JButton("=");
    JButton dot = new JButton(".");

    public void calculator(){

        //Frame

        frame1.setTitle("Calculator");
        frame1.setSize(500,600);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(null);

        frame1.add(panel1);

        //Panel 1

        panel1.setSize(420,600);
        panel1.setLayout(null);
        panel1.setVisible(true);

        panel1.add(jta1);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);
        panel1.add(btn9);
        panel1.add(btn0);
        panel1.add(sum);
        panel1.add(sub);
        panel1.add(mul);
        panel1.add(div);
        panel1.add(ent);
        panel1.add(dot);

        //Items in Panel 1

        jta1.setSize(380,100);
        jta1.setLocation(40,20);
        jta1.setBorder(brd);
        jta1.setFont(fnt1);

        ///Buttons

        btn0.setSize(80,80);
        btn0.setLocation(240,440);
        btn0.setFont(fnt1);
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("0");
            }
        });

        btn1.setSize(80,80);
        btn1.setLocation(40,340);
        btn1.setFont(fnt1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("1");
            }
        });

        btn2.setSize(80,80);
        btn2.setLocation(140,340);
        btn2.setFont(fnt1);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("2");
            }
        });

        btn3.setSize(80,80);
        btn3.setLocation(240,340);
        btn3.setFont(fnt1);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("3");
            }
        });

        btn4.setSize(80,80);
        btn4.setLocation(40,240);
        btn4.setFont(fnt1);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("4");
            }
        });

        btn5.setSize(80,80);
        btn5.setLocation(140,240);
        btn5.setFont(fnt1);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("5");
            }
        });

        btn6.setSize(80,80);
        btn6.setLocation(240,240);
        btn6.setFont(fnt1);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("6");
            }
        });

        btn7.setSize(80,80);
        btn7.setLocation(40,140);
        btn7.setFont(fnt1);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("7");
            }
        });

        btn8.setSize(80,80);
        btn8.setLocation(140,140);
        btn8.setFont(fnt1);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("8");
            }
        });

        btn9.setSize(80,80);
        btn9.setLocation(240,140);
        btn9.setFont(fnt1);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("9");
            }
        });

        dot.setSize(80,80);
        dot.setLocation(140,440);
        dot.setFont(fnt1);
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append(".");
            }
        });

        sum.setSize(80,80);
        sum.setLocation(340,140);
        sum.setFont(fnt1);
        sum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("+");
            }
        });

        sub.setSize(80,80);
        sub.setLocation(340,240);
        sub.setFont(fnt1);
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("-");
            }
        });

        mul.setSize(80,80);
        mul.setLocation(340,340);
        mul.setFont(fnt1);
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("*");
            }
        });

        div.setSize(80,80);
        div.setLocation(340,440);
        div.setFont(fnt1);
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jta1.append("/");
            }
        });

        ent.setSize(80,80);
        ent.setLocation(40,440);
        ent.setFont(fnt1);
        ent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(jta1.getText().contains("+")){

                    String strnum1 = "";
                    String strnum2 = "";
                    String strtotal = "";

                    float num1 = 0;
                    float num2 = 0;
                    float total = 0;

                    String [] statement;

                    statement = jta1.getText().split("\\+");

                    strnum1 = statement[0];
                    strnum2 = statement[1];

                    num1 = Float.parseFloat(strnum1);
                    num2 = Float.parseFloat(strnum2);

                    total = num1 + num2;
                    
                    strtotal = Float.toString(total);
                    jta1.setText(strtotal);

                }
                if(jta1.getText().contains("-")){

                    String strnum1 = "";
                    String strnum2 = "";
                    String strtotal = "";

                    float num1 = 0;
                    float num2 = 0;
                    float total = 0;

                    String [] statement;

                    statement = jta1.getText().split("\\-");

                    strnum1 = statement[0];
                    strnum2 = statement[1];

                    num1 = Float.parseFloat(strnum1);
                    num2 = Float.parseFloat(strnum2);

                    total = num1 - num2;

                    strtotal = Float.toString(total);
                    jta1.setText(strtotal);

                }
                if(jta1.getText().contains("*")){

                    String strnum1 = "";
                    String strnum2 = "";
                    String strtotal = "";

                    float num1 = 0;
                    float num2 = 0;
                    float total = 0;

                    String [] statement;

                    statement = jta1.getText().split("\\*");

                    strnum1 = statement[0];
                    strnum2 = statement[1];

                    num1 = Float.parseFloat(strnum1);
                    num2 = Float.parseFloat(strnum2);

                    total = num1 * num2;

                    strtotal = Float.toString(total);
                    jta1.setText(strtotal);

                }
                if(jta1.getText().contains("/")){

                    String strnum1 = "";
                    String strnum2 = "";
                    String strtotal = "";

                    float num1 = 0;
                    float num2 = 0;
                    float total = 0;

                    String [] statement;

                    statement = jta1.getText().split("\\/");

                    strnum1 = statement[0];
                    strnum2 = statement[1];

                    num1 = Float.parseFloat(strnum1);
                    num2 = Float.parseFloat(strnum2);

                    total = num1 / num2;

                    strtotal = Float.toString(total);
                    jta1.setText(strtotal);

                }
            }
        });
    }
}