package graphspr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> token = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("newStates.txt"));

        while (sc.hasNextLine()) {
            token.add(sc.nextLine());
        }

        sc.close();

        String[] usStates = token.toArray(new String[0]);
        System.out.println("\nPrint all States: \n" + Arrays.toString(usStates));

        Stream<String> statesWithR = Stream.of(usStates).filter(names -> names.contains("r"));
        System.out.println("\nPrint all States that contain the r character: \n" + statesWithR.collect(Collectors.toList()));

        Stream<String> multiple = Stream.of(usStates).filter(names -> names.contains(" "));
        System.out.println("\nPrint all States that has multiple words: \n" + multiple.collect(Collectors.toList()));
    }
}
