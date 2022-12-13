

package src;

/**
 *
 * @author hilal
 * @server adiyaksa
 */
public class Login {
    //main file,run file nya dari sini
   
    public static void main(String[]args){
    loginFrame frame = new loginFrame();
    frame.setTitle("Login");
    frame.setVisible(true);
    frame.setBounds(0,0,370,600);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(loginFrame.DO_NOTHING_ON_CLOSE);
    }
}
