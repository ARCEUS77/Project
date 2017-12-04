/**
 * 
 */

/**
 * @author Tiago Kebas
 *
 */
public class Lamp {
	private boolean isOn;
	
	public Lamp() {
		isOn = false;
		}
	public void on() {
		isOn = true;
	}
	public void off() {
		isOn = false;
	}
	 public boolean LampIsOn() {
		 return isOn;
	 }
}
