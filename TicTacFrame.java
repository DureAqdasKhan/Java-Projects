
import java.awt.Color;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dure Khan
 */
public class TicTacFrame extends javax.swing.JFrame {
private String Player_Turn;
private String Computer_Turn;
int turn=1;
List<JButton> buttons=new ArrayList<>();
Random rand=new Random();
JButton button = new javax.swing.JButton();
    /**
     * Creates new form TicTacFrame
     */
    public TicTacFrame() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        buttons.add(jButton1);
        buttons.add(jButton2);
        buttons.add(jButton3);
        buttons.add(jButton4);
        buttons.add(jButton5);
        buttons.add(jButton6);
        buttons.add(jButton7);
        buttons.add(jButton8);
        buttons.add(jButton9);
        buttons.add(jButton10);
        buttons.add(jButton11);
        buttons.add(jButton12);
        buttons.add(jButton13);
        buttons.add(jButton14);
        buttons.add(jButton15);
        buttons.add(jButton16);
    }
    private void Winner()
    {
        if((jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton2.getText().equalsIgnoreCase(Computer_Turn)&&jButton3.getText().equalsIgnoreCase(Computer_Turn)&&jButton4.getText().equalsIgnoreCase(Computer_Turn))||(jButton5.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn)&&jButton8.getText().equalsIgnoreCase(Computer_Turn))||(jButton9.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn)&&jButton12.getText().equalsIgnoreCase(Computer_Turn))||(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton14.getText().equalsIgnoreCase(Computer_Turn)&&jButton15.getText().equalsIgnoreCase(Computer_Turn)&&jButton16.getText().equalsIgnoreCase(Computer_Turn)))
        {
            JOptionPane.showMessageDialog(this,"Computer Won!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if((jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton5.getText().equalsIgnoreCase(Computer_Turn)&&jButton9.getText().equalsIgnoreCase(Computer_Turn)&&jButton13.getText().equalsIgnoreCase(Computer_Turn))||(jButton2.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn)&&jButton14.getText().equalsIgnoreCase(Computer_Turn))||(jButton3.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn)&&jButton15.getText().equalsIgnoreCase(Computer_Turn))||(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton8.getText().equalsIgnoreCase(Computer_Turn)&&jButton12.getText().equalsIgnoreCase(Computer_Turn)&&jButton16.getText().equalsIgnoreCase(Computer_Turn)))
        {
            JOptionPane.showMessageDialog(this,"Computer Won!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if((jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn)&&jButton16.getText().equalsIgnoreCase(Computer_Turn))||(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn)&&jButton13.getText().equalsIgnoreCase(Computer_Turn)))
        {
            JOptionPane.showMessageDialog(this,"Computer Won!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if((jButton1.getText().equalsIgnoreCase(Player_Turn)&&jButton2.getText().equalsIgnoreCase(Player_Turn)&&jButton3.getText().equalsIgnoreCase(Player_Turn)&&jButton4.getText().equalsIgnoreCase(Player_Turn))||(jButton5.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn)&&jButton8.getText().equalsIgnoreCase(Player_Turn))||(jButton9.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn)&&jButton12.getText().equalsIgnoreCase(Player_Turn))||(jButton13.getText().equalsIgnoreCase(Player_Turn)&&jButton14.getText().equalsIgnoreCase(Player_Turn)&&jButton15.getText().equalsIgnoreCase(Player_Turn)&&jButton16.getText().equalsIgnoreCase(Player_Turn)))
        {
            JOptionPane.showMessageDialog(this,"Player Won!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if((jButton1.getText().equalsIgnoreCase(Player_Turn)&&jButton5.getText().equalsIgnoreCase(Player_Turn)&&jButton9.getText().equalsIgnoreCase(Player_Turn)&&jButton13.getText().equalsIgnoreCase(Player_Turn))||(jButton2.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn)&&jButton14.getText().equalsIgnoreCase(Player_Turn))||(jButton3.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn)&&jButton15.getText().equalsIgnoreCase(Player_Turn))||(jButton4.getText().equalsIgnoreCase(Player_Turn)&&jButton8.getText().equalsIgnoreCase(Player_Turn)&&jButton12.getText().equalsIgnoreCase(Player_Turn)&&jButton16.getText().equalsIgnoreCase(Player_Turn)))
        {
            JOptionPane.showMessageDialog(this,"Player Won!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if((jButton1.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn)&&jButton16.getText().equalsIgnoreCase(Player_Turn))||(jButton4.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn)&&jButton13.getText().equalsIgnoreCase(Player_Turn)))
        {
            JOptionPane.showMessageDialog(this,"Player Won!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(turn==16)
            JOptionPane.showMessageDialog(this,"Draw!","",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void ComputerPlayer()
    {

            if(jButton1.getText().equalsIgnoreCase(Player_Turn)&&jButton2.getText().equalsIgnoreCase(Player_Turn)&&jButton3.getText().equalsIgnoreCase(Player_Turn))
            {
                if(jButton4.getText().equalsIgnoreCase("-"))
                {
                jButton4.setForeground(Color.red);
                jButton4.setText(Computer_Turn);
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Player_Turn)&&jButton3.getText().equalsIgnoreCase(Player_Turn)&&jButton2.getText().equalsIgnoreCase(Player_Turn))
            {
                
                 if(jButton1.getText().equalsIgnoreCase("-"))
                {
                jButton1.setForeground(Color.red);
                jButton1.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton1.getText().equalsIgnoreCase(Player_Turn)&&jButton5.getText().equalsIgnoreCase(Player_Turn)&&jButton9.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton13.getText().equalsIgnoreCase("-"))
                {
                jButton13.setForeground(Color.red);
                jButton13.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Player_Turn)&&jButton9.getText().equalsIgnoreCase(Player_Turn)&&jButton5.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton1.getText().equalsIgnoreCase("-"))
                {
                jButton1.setForeground(Color.red);
                jButton1.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton5.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton8.getText().equalsIgnoreCase("-"))
                {
                jButton8.setForeground(Color.red);
                jButton8.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton8.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton5.getText().equalsIgnoreCase("-"))
                {
                jButton5.setForeground(Color.red);
                jButton5.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton9.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton12.getText().equalsIgnoreCase("-"))
                {
                jButton12.setForeground(Color.red);
                jButton12.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton12.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton9.getText().equalsIgnoreCase("-"))
                {
                jButton9.setForeground(Color.red);
                jButton9.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Player_Turn)&&jButton14.getText().equalsIgnoreCase(Player_Turn)&&jButton15.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton16.getText().equalsIgnoreCase("-"))
                {
                jButton16.setForeground(Color.red);
                jButton16.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Player_Turn)&&jButton15.getText().equalsIgnoreCase(Player_Turn)&&jButton14.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton13.getText().equalsIgnoreCase("-"))
                {
                jButton13.setForeground(Color.red);
                jButton13.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton2.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton14.getText().equalsIgnoreCase("-"))
                {
                jButton14.setForeground(Color.red);
                jButton14.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton14.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton2.getText().equalsIgnoreCase("-"))
                {
                jButton2.setForeground(Color.red);
                jButton2.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton3.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton15.getText().equalsIgnoreCase("-"))
                {
                jButton15.setForeground(Color.red);
                jButton15.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton15.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton3.getText().equalsIgnoreCase("-"))
                {
                jButton3.setForeground(Color.red);
                jButton3.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Player_Turn)&&jButton8.getText().equalsIgnoreCase(Player_Turn)&&jButton12.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton16.getText().equalsIgnoreCase("-"))
                {
                jButton16.setForeground(Color.red);
                jButton16.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Player_Turn)&&jButton12.getText().equalsIgnoreCase(Player_Turn)&&jButton8.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton4.getText().equalsIgnoreCase("-"))
                {
                jButton4.setForeground(Color.red);
                jButton4.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton1.getText().equalsIgnoreCase(Player_Turn)&&jButton6.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton16.getText().equalsIgnoreCase("-"))
                {
                jButton16.setForeground(Color.red);
                jButton16.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Player_Turn)&&jButton11.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton1.getText().equalsIgnoreCase("-"))
                {
                jButton1.setForeground(Color.red);
                jButton1.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton13.getText().equalsIgnoreCase("-"))
                {
                jButton13.setForeground(Color.red);
                jButton13.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Player_Turn)&&jButton10.getText().equalsIgnoreCase(Player_Turn)&&jButton7.getText().equalsIgnoreCase(Player_Turn))
            {
                 if(jButton4.getText().equalsIgnoreCase("-"))
                {
                jButton4.setForeground(Color.red);
                jButton4.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            //checks for computer to win
            else if(jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton2.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton3.getText().equalsIgnoreCase("-"))
                {
                jButton3.setForeground(Color.red);
                jButton3.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton5.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton7.getText().equalsIgnoreCase("-"))
                {
                jButton7.setForeground(Color.red);
                jButton7.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton9.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton11.getText().equalsIgnoreCase("-"))
                {
                jButton11.setForeground(Color.red);
                jButton11.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton14.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton15.getText().equalsIgnoreCase("-"))
                {
                jButton15.setForeground(Color.red);
                jButton15.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton3.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton2.getText().equalsIgnoreCase("-"))
                {
                    jButton2.setForeground(Color.red);
                    jButton2.setText(Computer_Turn);
                }
            }
            else if(jButton8.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton6.getText().equalsIgnoreCase("-"))
                {
                    jButton6.setForeground(Color.red);
                    jButton6.setText(Computer_Turn);
                }
            }
            else if(jButton12.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton10.getText().equalsIgnoreCase("-"))
                {
                    jButton10.setForeground(Color.red);
                    jButton10.setText(Computer_Turn);
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Computer_Turn)&&jButton15.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton14.getText().equalsIgnoreCase("-"))
                {
                    jButton14.setForeground(Color.red);
                    jButton14.setText(Computer_Turn);
                }
            }
            //vertical2 checks
            else if(jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton5.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton9.getText().equalsIgnoreCase("-"))
                {
                    jButton9.setForeground(Color.red);
                    jButton9.setText(Computer_Turn);
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton9.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton5.getText().equalsIgnoreCase("-"))
                {
                    jButton5.setForeground(Color.red);
                    jButton5.setText(Computer_Turn);
                }
            }
            else if(jButton2.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton10.getText().equalsIgnoreCase("-"))
                {
                    jButton10.setForeground(Color.red);
                    jButton10.setText(Computer_Turn);
                }
            }
            else if(jButton14.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton6.getText().equalsIgnoreCase("-"))
                {
                    jButton6.setForeground(Color.red);
                    jButton6.setText(Computer_Turn);
                }
            }
            else if(jButton3.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton11.getText().equalsIgnoreCase("-"))
                {
                    jButton11.setForeground(Color.red);
                    jButton11.setText(Computer_Turn);
                }
            }
            else if(jButton15.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton7.getText().equalsIgnoreCase("-"))
                {
                    jButton7.setForeground(Color.red);
                    jButton7.setText(Computer_Turn);
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton8.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton12.getText().equalsIgnoreCase("-"))
                {
                    jButton12.setForeground(Color.red);
                    jButton12.setText(Computer_Turn);
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Computer_Turn)&&jButton12.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton8.getText().equalsIgnoreCase("-"))
                {
                    jButton8.setForeground(Color.red);
                    jButton8.setText(Computer_Turn);
                }
            }
            //diagnoal checkss 2
            else if(jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton11.getText().equalsIgnoreCase("-"))
                {
                    jButton11.setForeground(Color.red);
                    jButton11.setText(Computer_Turn);
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton6.getText().equalsIgnoreCase("-"))
                {
                    jButton6.setForeground(Color.red);
                    jButton6.setText(Computer_Turn);
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton10.getText().equalsIgnoreCase("-"))
                {
                    jButton10.setForeground(Color.red);
                    jButton10.setText(Computer_Turn);
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton7.getText().equalsIgnoreCase("-"))
                {
                    jButton7.setForeground(Color.red);
                    jButton7.setText(Computer_Turn);
                }
            }
            //3 checks
            else if(jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton2.getText().equalsIgnoreCase(Computer_Turn)&&jButton3.getText().equalsIgnoreCase(Computer_Turn))
            {
                if(jButton4.getText().equalsIgnoreCase("-"))
                {
                jButton4.setForeground(Color.red);
                jButton4.setText(Computer_Turn);
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton3.getText().equalsIgnoreCase(Computer_Turn)&&jButton2.getText().equalsIgnoreCase(Computer_Turn))
            {
                
                 if(jButton1.getText().equalsIgnoreCase("-"))
                {
                jButton1.setForeground(Color.red);
                jButton1.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton5.getText().equalsIgnoreCase(Computer_Turn)&&jButton9.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton13.getText().equalsIgnoreCase("-"))
                {
                jButton13.setForeground(Color.red);
                jButton13.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton9.getText().equalsIgnoreCase(Computer_Turn)&&jButton5.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton1.getText().equalsIgnoreCase("-"))
                {
                jButton1.setForeground(Color.red);
                jButton1.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton5.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton8.getText().equalsIgnoreCase("-"))
                {
                jButton8.setForeground(Color.red);
                jButton8.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            ////////////////////////////////////23efkedkfweps
            else if(jButton8.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton5.getText().equalsIgnoreCase("-"))
                {
                jButton5.setForeground(Color.red);
                jButton5.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton9.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton12.getText().equalsIgnoreCase("-"))
                {
                jButton12.setForeground(Color.red);
                jButton12.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton12.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton9.getText().equalsIgnoreCase("-"))
                {
                jButton9.setForeground(Color.red);
                jButton9.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton14.getText().equalsIgnoreCase(Computer_Turn)&&jButton15.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton16.getText().equalsIgnoreCase("-"))
                {
                jButton16.setForeground(Color.red);
                jButton16.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Computer_Turn)&&jButton15.getText().equalsIgnoreCase(Computer_Turn)&&jButton14.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton13.getText().equalsIgnoreCase("-"))
                {
                jButton13.setForeground(Color.red);
                jButton13.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton2.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton14.getText().equalsIgnoreCase("-"))
                {
                jButton14.setForeground(Color.red);
                jButton14.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton14.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton2.getText().equalsIgnoreCase("-"))
                {
                jButton2.setForeground(Color.red);
                jButton2.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton3.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton15.getText().equalsIgnoreCase("-"))
                {
                jButton15.setForeground(Color.red);
                jButton15.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton15.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton3.getText().equalsIgnoreCase("-"))
                {
                jButton3.setForeground(Color.red);
                jButton3.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton8.getText().equalsIgnoreCase(Computer_Turn)&&jButton12.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton16.getText().equalsIgnoreCase("-"))
                {
                jButton16.setForeground(Color.red);
                jButton16.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Computer_Turn)&&jButton12.getText().equalsIgnoreCase(Computer_Turn)&&jButton8.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton4.getText().equalsIgnoreCase("-"))
                {
                jButton4.setForeground(Color.red);
                jButton4.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton1.getText().equalsIgnoreCase(Computer_Turn)&&jButton6.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton16.getText().equalsIgnoreCase("-"))
                {
                jButton16.setForeground(Color.red);
                jButton16.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton16.getText().equalsIgnoreCase(Computer_Turn)&&jButton11.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton1.getText().equalsIgnoreCase("-"))
                {
                jButton1.setForeground(Color.red);
                jButton1.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton4.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton13.getText().equalsIgnoreCase("-"))
                {
                jButton13.setForeground(Color.red);
                jButton13.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else if(jButton13.getText().equalsIgnoreCase(Computer_Turn)&&jButton10.getText().equalsIgnoreCase(Computer_Turn)&&jButton7.getText().equalsIgnoreCase(Computer_Turn))
            {
                 if(jButton4.getText().equalsIgnoreCase("-"))
                {
                jButton4.setForeground(Color.red);
                jButton4.setText(Computer_Turn);
                System.out.println("done");
                }
            }
            else
            {
                if(turn<8)
                {
                boolean flag=true;
                while(flag==true)
                {
                    int num=rand.nextInt((15-0)+1)+0;
                    button=buttons.get(num);
                    if(button.getText().equalsIgnoreCase("-"))
                    { 
                        button.setForeground(Color.red);
                        button.setText(Computer_Turn);
                        flag=false;
                    }
                }
                }
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanelGrid = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel_10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel_11 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel_12 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel_13 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel_14 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel_15 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel_16 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Player Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Select X or O");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPanelGrid.setBackground(new java.awt.Color(204, 204, 204));
        jPanelGrid.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_9);

        jPanel_10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_10.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton10.setText("-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel_10.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_10);

        jPanel_11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_11.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton11.setText("-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel_11.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_11);

        jPanel_12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_12.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton12.setText("-");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel_12.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_12);

        jPanel_13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_13.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton13.setText("-");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel_13.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_13);

        jPanel_14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_14.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel_14.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_14);

        jPanel_15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_15.setLayout(new java.awt.BorderLayout());

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton15.setText("-");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel_15.add(jButton15, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_15);

        jPanel_16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_16.setLayout(new java.awt.BorderLayout());

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton16.setText("-");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel_16.add(jButton16, java.awt.BorderLayout.CENTER);

        jPanelGrid.add(jPanel_16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
            .addComponent(jPanelGrid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jButton4.getText().equalsIgnoreCase("-"))
        {
            jButton4.setForeground(Color.GREEN);
            jButton4.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<15)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(jButton1.getText().equalsIgnoreCase("-"))
        {
            jButton1.setForeground(Color.GREEN);
            jButton1.setText(Player_Turn);
            turn++;
        }
         else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
         if(turn<8)
        ComputerPlayer();
         Winner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jButton2.getText().equalsIgnoreCase("-"))
        {
            jButton2.setForeground(Color.GREEN);
            jButton2.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jButton3.getText().equalsIgnoreCase("-"))
        {
            jButton3.setForeground(Color.GREEN);
            jButton3.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jButton5.getText().equalsIgnoreCase("-"))
        {
            jButton5.setForeground(Color.GREEN);
            jButton5.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jButton6.getText().equalsIgnoreCase("-"))
        {
            jButton6.setForeground(Color.GREEN);
            jButton6.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(jButton7.getText().equalsIgnoreCase("-"))
        {
            jButton7.setForeground(Color.GREEN);
            jButton7.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(jButton8.getText().equalsIgnoreCase("-"))
        {
            jButton8.setForeground(Color.GREEN);
            jButton8.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(jButton9.getText().equalsIgnoreCase("-"))
        {
            jButton9.setForeground(Color.GREEN);
            jButton9.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(jButton10.getText().equalsIgnoreCase("-"))
        {
            jButton10.setForeground(Color.GREEN);
            jButton10.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(jButton11.getText().equalsIgnoreCase("-"))
        {
            jButton11.setForeground(Color.GREEN);
            jButton11.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(jButton12.getText().equalsIgnoreCase("-"))
        {
            jButton12.setForeground(Color.GREEN);
            jButton12.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(jButton13.getText().equalsIgnoreCase("-"))
        {
            jButton13.setForeground(Color.GREEN);
            jButton13.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(jButton14.getText().equalsIgnoreCase("-"))
        {
            jButton14.setForeground(Color.GREEN);
            jButton14.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(jButton15.getText().equalsIgnoreCase("-"))
        {
            jButton15.setForeground(Color.GREEN);
            jButton15.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(jButton16.getText().equalsIgnoreCase("-"))
        {
            jButton16.setForeground(Color.GREEN);
            jButton16.setText(Player_Turn);
            turn++;
        }
        else
        {
            JOptionPane.showMessageDialog(this,"YOU CANT MARK THIS CELL","WARNING!",JOptionPane.INFORMATION_MESSAGE);
        }
        if(turn<8)
        ComputerPlayer();
        Winner();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        Player_Turn=jTextField2.getText();
        if(Player_Turn.equalsIgnoreCase("X"))
        {
            Computer_Turn="O";
        }
        else
        {
            Computer_Turn="X";
        }
        ComputerPlayer();
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGrid;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_10;
    private javax.swing.JPanel jPanel_11;
    private javax.swing.JPanel jPanel_12;
    private javax.swing.JPanel jPanel_13;
    private javax.swing.JPanel jPanel_14;
    private javax.swing.JPanel jPanel_15;
    private javax.swing.JPanel jPanel_16;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
