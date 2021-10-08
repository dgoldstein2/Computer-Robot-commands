import java.awt.*;
import java.awt.Robot;
import java.awt.event.*;
import java.awt.Label;
import java.awt.Event;
import java.util.ArrayList;
public class BRobot
{
    public static void main(String[] args) throws Exception{
        Robot Alfred = new Robot();
        
        Alfred.delay(2000);
        Alfred.mouseMove(80,1050);
        Alfred.delay(2000);
        Alfred.mousePress(InputEvent.BUTTON1_MASK);
        Alfred.mouseRelease(InputEvent.BUTTON1_MASK);
        Alfred.delay(1000);
        
        
        Alfred.keyPress(KeyEvent.VK_C); 
        Alfred.keyPress(KeyEvent.VK_H); 
        Alfred.keyPress(KeyEvent.VK_R); 
        Alfred.keyPress(KeyEvent.VK_O); 
        Alfred.keyPress(KeyEvent.VK_M);
        Alfred.keyPress(KeyEvent.VK_E); 
        Alfred.delay(1000);
        Alfred.mouseMove(100,530);
        Alfred.delay(2000);
        Alfred.mousePress(InputEvent.BUTTON1_MASK);
        Alfred.mouseRelease(InputEvent.BUTTON1_MASK);
        Alfred.delay(5000);
        Alfred.mouseMove(400,60);
        Alfred.mousePress(InputEvent.BUTTON1_MASK);
        Alfred.mouseRelease(InputEvent.BUTTON1_MASK);
        Alfred.delay(1000);
        Alfred.keyPress(KeyEvent.VK_N);
        Alfred.keyPress(KeyEvent.VK_E);
        Alfred.keyPress(KeyEvent.VK_W);
        Alfred.keyPress(KeyEvent.VK_E);
        Alfred.keyPress(KeyEvent.VK_G);
        Alfred.keyPress(KeyEvent.VK_G);
        Alfred.delay(1000);
        Alfred.keyPress(KeyEvent.VK_ENTER);
        Alfred.keyRelease(KeyEvent.VK_ENTER);
        Alfred.delay(1000);
        Alfred.mouseMove(400,400);
        Alfred.mousePress(InputEvent.BUTTON1_MASK);
        Alfred.mouseRelease(InputEvent.BUTTON1_MASK);
        Alfred.delay(500);
        Alfred.keyPress(KeyEvent.VK_R);
        Alfred.keyPress(KeyEvent.VK_T);
        Alfred.keyPress(KeyEvent.VK_X);
        Alfred.keyPress(KeyEvent.VK_SPACE);
        Alfred.keyPress(KeyEvent.VK_3);
        Alfred.keyPress(KeyEvent.VK_0);
        Alfred.keyPress(KeyEvent.VK_8);
        Alfred.keyPress(KeyEvent.VK_0);
        Alfred.keyPress(KeyEvent.VK_ENTER);
        Alfred.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        
        
        
         
        
        
        
        
     
    }
}
