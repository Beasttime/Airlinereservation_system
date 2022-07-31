/*
 *Salif Guingani 
 * Date Last Updated: 07/30/2022
 * Purpose: Provide online ticket and seat reservation of National and 
 * International Flights and give us the information about flight departures
 */
import javax.swing.*;
import java.awt.*;

public class WindowUtilities 
{
	public static void setNativeLookAndFeel() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}