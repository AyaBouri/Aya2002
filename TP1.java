import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MaFenetre extends JFrame implements ActionListener{
    private JButton button;
    private JTextField textField1,textField2;
    public MaFenetre(){
        super("Factoreil");
        setSize(300, 200);
        button=new JButton("Factoreil");
        add(button);
        textField1=new JTextField();
        add(textField1);
        textField2=new JTextField();
        add(textField2);
        setLayout(new FlowLayout());
        button.addActionListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public void actionPerformed(ActionEvent event){
        int a=Integer.parseInt(textField1.getText().trim());
        textField2.setText(Integer.toString(fact(a)));
    }
}