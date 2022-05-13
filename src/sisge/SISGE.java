
package sisge;

import Interfaces.FrmLogin;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;

public class SISGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
             
        FrmLogin login = new FrmLogin();
        //login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmLogin().setVisible(true);
                } catch (SQLException ex) {
//                    Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
}
