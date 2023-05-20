//package Experiments;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class temp{
//    String name;
//    int ID;
//    temp(String name, int ID){
//        this.name = name;
//        this.ID = ID;
//    }
//}
//
//public class test01 extends JFrame{
//    public static int x=31;
//    public int y;
//    private JButton cdfButton = new JButton(){
//        public void paintComponent(Graphics g){
//            super.paintComponent(g);
//            ImageIcon icon = new ImageIcon("./Calculator/cdf_img.png");
//            Image img = icon.getImage();
//            g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
//        }
//    };
//    private String[] distribution_type = { "Normal", "Student-t", "Chi-squared" };
//    private JComboBox<String> distribution = new JComboBox<>(distribution_type);
//
//    private JTextArea jta;
//    private JTextArea jta1 = new JTextArea("hello");
//    private JTextArea jta2 = new JTextArea("asdf");
//
//    test01(){
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("뭘봐");
//        Container c = getContentPane();
//        c.setLayout(null);
//        // c.setBackground(Color.RED);
//
//        // Integer[] n = {31234,25432,56547,1844563,345636,36753,43522345,6343453,1234132,45254};
//        // JList list = new JList(n);
//        // JComboBox combo = new JComboBox(n);
//
//        // cdfButton.setOpaque(true);
//        // cdfButton.setBorderPainted(false);
//        distribution.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                // JButton newButton = new JButton("asdf");
//                // newButton.setSize(10,10);
//                // newButton.setLocation(400,400);
//                // c.add(new JButton("asdf"));
//                JComboBox ob = (JComboBox)e.getSource();
//                JFrame frame = (JFrame)ob.getParent();
//                if(frame.getSize().getWidth()==50)
//                    frame.setSize(500,500);
//                else
//                    frame.setSize(50,50);
//            }
//        });
//        jta = jta1;
//        distribution.setSize(100,100);
//        distribution.setLocation(5,5);
//        jta.setSize(300,300);
//        jta.setLocation(110, 5);
//
//        c.add(jta);
//        c.add(distribution);
//        // c.add(new JScrollPane(list));
//        // c.add(new JScrollPane(combo));
//
//        setSize(500,500);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new test01();
//    }
//}
//
//class A{
//    public static int getx(int x){
//        return x;
//    }
//}