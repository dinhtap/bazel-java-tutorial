package src.main.java.com.example.cmdline;

import src.main.java.com.example.Greeting;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.DefaultParser;


public class Runner {
    public static void main(String args[]) throws ParseException {
        Greeting.sayHi();

        Options options = new Options();
        options.addOption("x", false, "dummy option");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        if (cmd.hasOption("x")) {
            System.out.println("Used option -x, nice");
        }
    }
}
