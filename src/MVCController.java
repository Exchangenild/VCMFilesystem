import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

class MVCController implements ActionListener { 
     
    private MVCView view; 
    private MVCModel model; 
     
    public MVCController(MVCView view) { 
        this.view = view; 
        this.model = new MVCModel(); 
    }
    // guzgufasf
    
    
    
    

    @Override 
    public void actionPerformed(ActionEvent e) { 
        view.setText(model.getText()); 
    } 
} 