/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_assign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Muhaimenur
 */
public class DesignFrame extends javax.swing.JFrame {

    /**
     * Creates new form DesignFrame
     */
    private Timer timer;
    int mat[][] = new int[7][7];
    int par[][] = new int[7][7];
    int color[][] = new int[7][7];
    int dirts[][] = new int[7][7];
    int arr[] = new int[100];
    int ux, uy,p=2, tag=0;
    int cleanex, cleanery, desx, desy;
    int X[] = { 0, 0, 1, -1 };
    int Y[] = { 1, -1, 0, 0 };
    String text = "Left";
String text2 = "Right";
String text3 = "Up";
String text4 = "Down";
String text5 = "Clean";
private final static String newline = "\n";
    Queue<Integer> q = new LinkedList<Integer>();
    public DesignFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        FirstRun();
    }

   

    public void FirstRun()
    {
 
        for( int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
              mat[i][j]= 0;
              dirts[i][j]=0;
            }
        }
        for( int a=0;a<100;a++)
            arr[a]=0;
    }
    
    public void function()
    {
       
          //  int pp = 0;
         
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("vx "+arr[p]+"vy "+arr[p+1]);
                int a=arr[p];
                int b=arr[p+1];
                System.out.println("mat= "+mat[a][b]);
                if(arr[p]>arr[0] && arr[p+1]==arr[1])
                {
                    if(dirts[a][b]==1)
                    {
                        textField.append(text5 + newline);
                        textField.setCaretPosition(textField.getDocument().getLength());
                        dirts[a][b]=0;
                    }
                    else
                    {
                    textField.append(text4 + newline);
                    textField.setCaretPosition(textField.getDocument().getLength());
                    }
                }
                else if(arr[p]<arr[0] && arr[p+1]==arr[1])
                {
                    if(dirts[a][b]==1)
                    {
                        textField.append(text5 + newline);
                        textField.setCaretPosition(textField.getDocument().getLength());
                        dirts[a][b]=0;
                    }
                    else
                    {
                     textField.append(text3 + newline);
                     textField.setCaretPosition(textField.getDocument().getLength());
                    }
                }
                else if(arr[p]==arr[0] && arr[p+1]>arr[1])
                {
                    if(dirts[a][b]==1)
                    {
                        textField.append(text5 + newline);
                        textField.setCaretPosition(textField.getDocument().getLength());
                        dirts[a][b]=0;
                    }
                    else
                    {
                     textField.append(text2 + newline);
                     textField.setCaretPosition(textField.getDocument().getLength());
                    }
                }
                else if(arr[p]==arr[0] && arr[p+1]<arr[1])
                {
                    if(dirts[a][b]==1)
                    {
                        textField.append(text5 + newline);
                        textField.setCaretPosition(textField.getDocument().getLength());
                        dirts[a][b]=0;
                    }
                    else
                    {
                     textField.append(text + newline);
                     textField.setCaretPosition(textField.getDocument().getLength());
                    }
                }
                
                
                if(arr[p]==1 && arr[p+1]==1)
                    {

                        if(arr[p-2]==2 && arr[p-1]==1)
                           {
                               
                                 jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                 jLabel1.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                
                           }
                        else if(arr[p-2]==1 && arr[p-1]==2)
                           {
                                jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel1.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                       
                    }
                 
                else if(arr[p]==1 && arr[p+1]==2)
                    {

                        if(arr[p-2]==1 && arr[p-1]==1)
                           {
                               
                                 jLabel1.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                 jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                
                           }
                        else if(arr[p-2]==1 && arr[p-1]==3)
                           {
                                jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==2)
                           {
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                       // jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                       
                    }
                    else  if(arr[p]==1 && arr[p+1]==3)
                    {
                      // jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==1 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                    }
                    else if(arr[p]==1 && arr[p+1]==4)
                    {
                       //jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==1 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                     
                    }
                    else if(arr[p]==1 && arr[p+1]==5)
                    {
                       //jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                       else if(arr[p-2]==2 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                       
           
                    }
                    else if(arr[p]==2 && arr[p+1]==1)
                    {
                       //jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel1.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                 jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                 jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                 jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
   
                    }
                    else  if(arr[p]==2 && arr[p+1]==2)
                    {
                       //jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
  
                    }
                    else if(arr[p]==2 && arr[p+1]==3)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==2 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                    }
                    else if(arr[p]==2 && arr[p+1]==4)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==2 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==2 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                    }
                    else if(arr[p]==2 && arr[p+1]==5)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==1 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==2 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        
                    }
                    else if(arr[p]==3 && arr[p+1]==1)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==2 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                        else if(arr[p-2]==4 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                        else if(arr[p-2]==3 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }

                    }
                    else if(arr[p]==3 && arr[p+1]==2)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==2 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==3 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                    }
                    else if(arr[p]==3 && arr[p+1]==3)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==2 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==3 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                    }
                    else if(arr[p]==3 && arr[p+1]==4)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==2 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       
                        else if(arr[p-2]==3 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==3 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                    }
                    else if(arr[p]==3 && arr[p+1]==5)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==2 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==3 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        
                    }
                    else if(arr[p]==4 && arr[p+1]==1)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==3 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                        else if(arr[p-2]==4 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                        else if(arr[p-2]==5 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel21.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }

                    }
                    else if(arr[p]==4 && arr[p+1]==2)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==3 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==4 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==5 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                    }
                    else if(arr[p]==4 && arr[p+1]==3)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==3 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==4 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==5&& arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                    }
                    else if(arr[p]==4 && arr[p+1]==4)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==3 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==4 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==4 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==5 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                    }
                    else if(arr[p]==4 && arr[p+1]==5)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==3 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==4 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==5 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel25.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        
                    }
                    else if(arr[p]==5 && arr[p+1]==1)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==4 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel21.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                        else if(arr[p-2]==5 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel21.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                        
                    }
                    else if(arr[p]==5 && arr[p+1]==2)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==4 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==5 && arr[p-1]==1)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel21.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                         else if(arr[p-2]==5 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                         
                    }
                    else if(arr[p]==5 && arr[p+1]==3)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==4 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==5 && arr[p-1]==2)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==5 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        
                    }
                    else if(arr[p]==5 && arr[p+1]==4)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==4 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==5 && arr[p-1]==3)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                        else if(arr[p-2]==5 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel25.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }
                    }
                   else if(arr[p]==5 && arr[p+1]==5)
                    {
                       //jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        if(arr[p-2]==4 && arr[p-1]==5)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel25.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                        
                           }
                       else if(arr[p-2]==5 && arr[p-1]==4)
                           {
                                //jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                                jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\images.png"));
                                jLabel25.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
                           }

                    }
                  if(arr[p]==0 && arr[p+1]==0)
                {
                    timer.stop();
                }
                  arr[0]=arr[p];
                  arr[1]=arr[p+1];
                p= p+2;
    }
        });
        timer.start();
    }
    
    private void printpath(int desx, int desy) {
 
                if (cleanex == desx && cleanery == desy) {
                    q.add(cleanex);
                    q.add(cleanery);
                    return;
                } else {
                    int x, y;
                    x = par[desx][desy] / 10;
                    y = par[desx][desy] % 10;
                    printpath(x, y);
                    q.add(desx);
                    q.add(desy);
                }
 
            }
    
    private void bfs(int cleanex, int cleanery) {
 
                Integer ux = cleanex;
                Integer uy = cleanery;
                Integer vx, vy;
                color[ux][uy] = 1;
                Queue<Integer> xx = new LinkedList<Integer>();
                int c = 0;
                xx.add(ux);
                xx.add(uy);
                
                while (!xx.isEmpty()) {
 
                    ux = xx.remove();
                    uy = xx.remove();
                    for (int i = 0; i < 4; i++) {
                        vx = ux + X[i];
                        vy = uy + Y[i];
                        if ((vx >= 1 && vx <= 5) && (vy >= 1 && vy <= 5)) {
 
                            if (color[vx][vy] == 0) {
                                int x = ux * 10 + uy;
                                par[vx][vy] = x;
                                color[vx][vy] = 1;
                                if (mat[vx][vy] == 1) {
                                    c = 1;
                                    desx = vx;
                                    desy = vy;
                                    break;
                                }
                                xx.add(vx);
                                xx.add(vy);
                            }
 
                        }
                    }
                    if (c == 1) {
                        break;
 
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        x_axis = new javax.swing.JTextField();
        y_axis = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        dirt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ai_assign/images.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        start.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        start.setText("Start Cleaning");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("INITIALIZATION");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("X :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Y :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("DIRT :");

        textField.setColumns(20);
        textField.setRows(5);
        jScrollPane2.setViewportView(textField);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(start)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dirt)
                                    .addComponent(x_axis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(y_axis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x_axis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(y_axis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(27, 27, 27)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
            String a = x_axis.getText();
         String b = y_axis.getText();
         String c = dirt.getText();
         int num, num1,num3,m,n;
         num = Integer.parseInt(a);
         m=num;
         num1 = Integer.parseInt(b);
         n=num1;
         num3 = Integer.parseInt(c);
         
          if(num == 1 && num1 ==1)
         {
             jLabel1.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             
             mat[num][num1]=2;
             
         }
         else if(num == 1 && num1 ==2)
         {
             jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 1 && num1 ==3)
         {
             jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 1 && num1 ==4)
         {
             jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 1 && num1 ==5)
         {
             jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
            mat[num][num1]=2;
         }
         else if(num == 2 && num1 ==1)
         {
             jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 2 && num1 ==2)
         {
             jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 2 && num1 ==3)
         {
             jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 2 && num1 ==4)
         {
             jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 2 && num1 ==5)
         {
             jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 3 && num1 ==1)
         {
             jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 3 && num1 ==2)
         {
             jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 3 && num1 ==3)
         {
             jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 3 && num1 ==4)
         {
             jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 3 && num1 ==5)
         {
             jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 4 && num1 ==1)
         {
             jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 4 && num1 ==2)
         {
             jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
            mat[num][num1]=2;
         }
         else if(num == 4 && num1 ==3)
         {
             jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 4 && num1 ==4)
         {
             jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 4 && num1 ==5)
         {
             jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 5 && num1 ==1)
         {
             jLabel21.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 5 && num1 ==2)
         {
             jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 5 && num1 ==3)
         {
             jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 5 && num1 ==4)
         {
             jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
         else if(num == 5 && num1 ==5)
         {
             jLabel25.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\vacuum.png"));
             mat[num][num1]=2;
         }
          
          int l,i,j;
          
           for(l=1;l<=num3;l++)
           {
                  int random = (int) (Math.random()*6);
                  int random1 = (int) (Math.random()*6);  
                  
                if((random == 0 || random1==0)) 
                {
                    num3=num3+1;
                }
                else if(mat[random][random1]== 2)
                {
                     num3=num3+1;
                }
                else if(mat[random][random1]== 0)
                {
                    mat[random][random1]=1;
                    
                }

               
                }
           
             for( i=1;i<=5;i++)
                {
            for(j=1;j<=5;j++)
            {
                
                if(mat[i][j]==1)
                {
                    if(i == 1 && j ==1)
                    {
                        jLabel1.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 1 && j ==2)
                    {
                        jLabel2.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 1 && j ==3)
                    {
                        jLabel3.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 1 && j ==4)
                    {
                        jLabel4.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 1 && j ==5)
                    {
                        jLabel5.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 2 && j ==1)
                    {
                        jLabel6.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 2 && j ==2)
                    {
                        jLabel7.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 2 && j ==3)
                    {
                        jLabel8.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 2 && j ==4)
                    {
                        jLabel9.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 2 && j ==5)
                    {
                        jLabel10.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 3 && j ==1)
                    {
                        jLabel11.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 3 && j ==2)
                    {
                        jLabel12.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 3 && j ==3)
                    {
                        jLabel13.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 3 && j ==4)
                    {
                        jLabel14.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 3 && j ==5)
                    {
                        jLabel15.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 4 && j ==1)
                    {
                        jLabel16.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 4 && j ==2)
                    {
                        jLabel17.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 4 && j ==3)
                    {
                        jLabel18.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 4 && j ==4)
                    {
                        jLabel19.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 4 && j ==5)
                    {
                         jLabel20.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 5 && j ==1)
                    {
                        jLabel21.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 5 && j ==2)
                    {
                        jLabel22.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 5 && j ==3)
                    {
                        jLabel23.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 5 && j ==4)
                    {
                        jLabel24.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
                    else if(i == 5 && j ==5)
                    {
                    jLabel25.setIcon(new ImageIcon("C:\\Users\\Muhaimenur\\Desktop\\dirt.png"));
                    }
           } 
           
                }
                }    
           
           int cou = 0;
                for ( i = 1; i <= 5; i++) {
                    for (j = 1; j <= 5; j++) {
                        if (mat[i][j] == 2) {
 
                            cleanex = i;
                            cleanery = j;
                        } else if (mat[i][j] == 1) {
                            dirts[i][j]=1;
                            cou++;
                        }
                    }
                }
               
 
                int y =2;
                for ( i = 1; i <= cou; i++) {
                    for ( int k = 1; k <= 5; k++) {
                        for ( j = 1; j <= 5; j++) {
                            color[k][j] = 0;
                            par[k][j] = 0;
                        }
                    }
                    bfs(cleanex, cleanery);
                    printpath(desx, desy);
                    mat[desx][desy] = 0;
                    
                ux= q.remove();
                    
                uy= q.remove();
                if(tag==0)
                {
                   arr[0]=ux;
                   arr[1]=uy;
                }   
                    while (!q.isEmpty()) {
                        tag=1;
                        int vx = q.remove();
                        int vy = q.remove();
                        if(arr[y-2]==vx && arr[y-1]==vy)
                        {
                            
                        }
                        else{
                         arr[y]=vx;
                        y++;
                        arr[y]=vy;
                        y++;
                        }
                        
                        System.out.println("vx = "+vx +" vy = "+vy);
 
                        ux = vx;
                        uy = vy;
                    }
                   
                  
                    cleanex = ux;
                    cleanery = uy;
                }
                 function();
                 
    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(DesignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dirt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton start;
    private javax.swing.JTextArea textField;
    private javax.swing.JTextField x_axis;
    private javax.swing.JTextField y_axis;
    // End of variables declaration//GEN-END:variables
}
