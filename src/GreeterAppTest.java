import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreeterAppTest {



    @Test
    void greet(){
        Greeter ob1=new Greeter("Hello");
        assertEquals("Hello, Liha!", ob1.greet("Liha"));
        ob1=new Greeter(">Buenos Dias");
        assertEquals(">Buenos Dias, Raha!", ob1.greet("Raha"));
        SimonGreeter ob2=new SimonGreeter("Hello");
        assertEquals("Simon says, \"Hello, Raha!\"", ob2.greet("Raha"));
        ob2=new SimonGreeter("Hey");
        assertEquals("Simon says, \"Hey, Nayra!\"", ob2.greet("Nayra"));
        LoudGreeter ob3=new LoudGreeter("Hello");
        assertEquals("Hello, Lima!!",ob3.greet("Lima"));
        ob3.addVolume();
        assertEquals("Hello, Lima!!!",ob3.greet("Lima"));
        HtmlGreeter ob4 = new HtmlGreeter("Hello");
        assertEquals("<h1>Hello, Julia!</h1>",ob4.greet("Julia"));
        ob4=new HtmlGreeter("Hello","p");
        assertEquals("<p>Hello, Julia!</p>",ob4.greet("Julia"));

    
    }

}

