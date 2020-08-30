package app.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import services.graphicService.GraphicBuilder;
import services.gameService.GameObject;

/**
 *
 * @author Jean Carlos Santoya Cabrera jeancarlosodi@gmail.com
 */
public class PressEnter extends GameObject{
    private GraphicBuilder gs;
    
    private JLabel lPressEnter;
    
    public PressEnter(int x, int y){
        super(x, y);
        
        gs = GraphicBuilder.getService();
        
        ImageIcon iPressStart = new ImageIcon(getClass().getResource("/resources/images/pressEnter.png"));
        
        lPressEnter = gs.getLabel(iPressStart, 0, 0);
        add(lPressEnter);
        
        setSize(800, 400);
    }

    @Override
    public void update() {
    }
    
}