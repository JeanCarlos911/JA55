package app.master;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.GraphicService;

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public abstract class Character extends JPanel{
    private JLabel lSprite;
    private GraphicService gs;
    
    public Character(int x, int y, int width, int height, String path, int xSprite, int ySprite){
        gs = GraphicService.getService();
        
        ImageIcon icono = new ImageIcon(getClass().getResource(path));
        
        lSprite = gs.getLabel(icono, xSprite, ySprite);
        add(lSprite);
        
        setBackground(null);
        setBounds(x, y, width, height);
        setLayout(null);
    }
    
}