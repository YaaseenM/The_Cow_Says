// Main class where the configuration inputs are implemented
public class Cowsay {
    public static void main(String[] args) {
        Cow[] cows = HeiferGenerator.getCows();
        // Understands what was inputted and outputs a response for it.
        if (args[0].equals("-l")) {
            listCows(cows);
        } else if (args[0].equals("-n")) {
            Cow found = findCow(args[1], cows);
            if (findCow(args[1], cows) == null) {
                System.out.print("Could not find " + args[1] + " cow!");
            } else {
                for (int i = 2; i < args.length; i++) {
                    System.out.print(args[i] + " ");
                }
                System.out.println();
                assert found != null;
                System.out.println(found.getImage());
                // This section checks if the cow is a dragon and whether it is a normal dragon or an ice dragon.
                Dragon dragon = (Dragon) findCow(args[1], cows);
                assert dragon != null;
                if (!dragon.canBreathFire()) {
                    System.out.println("This dragon cannot breathe fire.");
                } else if (dragon.canBreathFire()) {
                    System.out.println("This dragon can breathe fire.");
                }
            }
        }
        // Default reply if there was no initial command.
        else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
            }
            System.out.println(cows[0].getImage());
        }

    }

    // Gives the list of cows that are saved in the array
    private static void listCows(Cow[] cows) {
        System.out.print("Cows available: ");
        for (int i = 0; i < cows.length; i++) {
            System.out.print(cows[i].getName() + "");
        }
    }

    // Finds the cow the user named. It also checks if it even exists.
    private static Cow findCow(String name, Cow[] cows) {
        for (int i = 0; i < cows.length; i++) {
            if (cows[i].getName().equals(name)) {
                return cows[i];
            }
        }
        return null;
    }
}
