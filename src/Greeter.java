import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greeter {
	public static String greeting;

//this constructor sets the value of greeting variable
	public Greeter(String s) {
		this.greeting = s;

	}

	public String greet(String s) {
		return greeting + ", " + s + "!";

	}
}

class SimonGreeter extends Greeter {
//this constructor passes the value to its superclass's constructor
	public SimonGreeter(String s) {
		super(s);
	}

	public String greet(String s) {
		return "Simon says, " + "\"" + greeting + ", " + s + "!" + "\"";

	}
}

class LoudGreeter extends Greeter {
	// this constructor passes the value to its superclass's constructor
	public LoudGreeter(String s) {
		super(s);
	}

	private String extra = "!";

	// this method adds ans extra exclamation
	public void addVolume() {
		extra += "!";
	}

	public String greet(String s) {
		return greeting + ", " + s + "!" + extra;

	}
}

class HtmlGreeter extends Greeter {
	String tagname;

//this constructor only sets the default tagname and sends the greeting value to its superclass's constructor
	public HtmlGreeter(String s) {
		super(s);
		tagname = "h1";
	}

	// this constructor sets the tagname to user defined value and sends the
	// greeting value to its superclass's constructor
	public HtmlGreeter(String s, String tag) {
		super(s);
		tagname = tag;
	}

	public String greet(String s) {
		return "<" + tagname + ">" + greeting + ", " + s + "!" + "<" + "/" + tagname + ">";

	}

}

class GreeterApp {
	public static void main(String[] args) {
		int loop = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a greeting:");
		String s = input.nextLine();
		System.out.println("Enter your name:");
		String ss = input.nextLine();
		System.out.println("You will be prompted to select four greeters...");
		ArrayList<String> output = new ArrayList<>();
		while (loop < 4) {

			System.out.println("Select a greeter (normal, simon, loud, or html):");
			String option = input.nextLine();
			if (option.equals("html")) {
				System.out.println("Select an HTML tag:");
				String tag = input.nextLine();
				HtmlGreeter ob4 = new HtmlGreeter(s, tag);
				output.add(ob4.greet(ss));
			} else if (option.equals("simon")) {
				SimonGreeter ob2 = new SimonGreeter(s);
				output.add(ob2.greet(ss));
			} else if (option.equals("loud")) {
				System.out.println("How much volume to add? (0 to 10): ");
				// taking the input as string ans then converting it to an integar
				String count = input.nextLine();
				Integer c = Integer.parseInt(count);
				LoudGreeter ob3 = new LoudGreeter(s);
				for (int i = 1; i <= c; i++)
					ob3.addVolume();
				output.add(ob3.greet(ss));
			} else {
				Greeter ob1 = new Greeter(s);
				output.add(ob1.greet(ss));
			}

			loop++;

		}
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));

		}

	}
}
