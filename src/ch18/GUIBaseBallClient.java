package ch18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIBaseBallClient extends JFrame implements ActionListener
{
    JPanel p1 = null;
    
    JTextField tf1 = null;
    
    JButton btn1 = null;
    
    JTextArea ta1 = null;
    
    JLabel lb = null;
    
    ObjectOutputStream oos;
    
    ObjectInputStream ois;
    
    Socket client = null;
    
    public GUIBaseBallClient()
    {
        super("클라이언트");
        p1 = new JPanel();
        ta1 = new JTextArea();
        tf1 = new JTextField(20);
        btn1 = new JButton("전송");
        lb = new JLabel(" ", JLabel.CENTER);
        p1.add(tf1);
        p1.add(btn1);
        add(ta1, "Center");
        add(p1, "South");
        add(lb, "North");
        setLocation(350, 200);
        setSize(600, 400);
        setVisible(true);
        String str = JOptionPane.showInputDialog("이름을입력하세요");
        if (str == null) System.exit(0);
        System.out.println(str);
        lb.setText(str);
        btn1.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
        try
        {
            oos.writeObject(tf1.getText());
            tf1.setText("");
            
        }
        catch (Exception e2)
        {
            // TODO: handle exception
            e2.printStackTrace();
        }
        
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        GUIBaseBallClient f = new GUIBaseBallClient();
        String ip = "211.63.89.96";
        
        String port = "5000";
        try
        {
            
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            
        }
        f.init(ip, port);
    }
    
    void init(String ip, String port)
    {
        // TODO Auto-generated method stub
        int sPort = 5000;
        try
        {
            sPort = Integer.parseInt(port);
            
        }
        catch (NumberFormatException e)
        {
            sPort = 5000;
        }
        try
        {
            client = new Socket(ip, sPort);
            oos = new ObjectOutputStream(client.getOutputStream());
            ois = new ObjectInputStream(client.getInputStream());
            String usr_id = lb.getText();
            oos.writeObject(usr_id);
            oos.flush();
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
            
        }
        Runnable rt = new ReceiverDataThread(); // 서버가 보낸 데이터를 받기(수신) 위한
        Thread t = new Thread(rt);
        t.start();
        tf1.requestFocus();
    }
    
    class ReceiverDataThread implements Runnable
    {
        String receiveData;
        
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        try
        {
            while(true)
            {
                receiveData = (String)ois.readObject();
                
                ta1.append(receiveData + "\n");
                tf1.requestFocus();
                if(receiveData.contains("정답"))
                {
                    ta1.append("5초후에 시스템을 종료합니다.\n");
                    Thread.sleep(5000);
                    System.exit(0);
                }
            }
        }
        catch (ClassNotFoundException e)
        {
            // TODO: handle exception
            System.out.println(e);
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
            System.out.println(e);
        }
        catch (Exception e)
        {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
    }
}
