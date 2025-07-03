// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class SwitchOld {
  public static void main(String[] args) {
    String day, result = "";
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Input Char: ");
      day = input.nextLine();
    }
    switch (day){
        case "M":
        case "W":
        case "F": {
            result = "MWF";
            break;
        }
        case "T":
        case "TH":
        case "S": {
            result = "TTS";
            break;
        }
        default: {
            result = "No day";
        }
    };
    System.out.format("Old switch results: %s", result);
  }
}
