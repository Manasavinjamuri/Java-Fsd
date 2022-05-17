package ai.jobiak.ifaces;

public class BDigital {
	Printable printable;
	public Printable getPrintable() {
		return printable;
		
	}
	public void setPrintable(Printable printable) {
		this.printable=printable;
	}
	public void publish() {
		printable.print();
	}

}
