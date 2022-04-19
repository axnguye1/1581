//Amanda Nguyen Problem 2 RGBColor
public class RGBColor{
	private int red;
	private int blue;
	private int green;

	public RGBColor(int red, int green, int blue){
		this.red=red;
		this.green=green;
		this.blue=blue;
	}
	public int getRed(){
		return this.red;
	}
	public int getGreen(){
		return this.green;
	}
	public int getBlue(){
		return this.blue;
	}
	public boolean equals(RGBColor other){
		boolean isSame = false;
		if((this.red==(other.red)) && (this.green==(other.green)) && (this.blue==(other.blue))){
			isSame = true;
		}
		return isSame;
	}
	public String toString(){
		return String.format("rgb(%d,%d,%d)", this.red, this.green, this.blue);
	}
	public String toHex(){
		return String.format("#%02x%02%02x", this.red, this.green, this.blue);
	}
}