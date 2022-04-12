package robatortas.code.files;

public class Program {
	
	public int width=520, height=720/2;
	public String TITLE = "UNKWON PROGRAM";
	
	public Display display;
	
	public Program() {
		display = new Display(width, height, TITLE, this);
	}
	
}
