
record Range(int lo, int hi) {
    Range {
        if (lo > hi)  // referring here to the implicit constructor parameters
            throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
    }
}

sealed interface Celestial 
    permits Planet, Star, Comet { ... }

final class Planet implements Celestial { ... }
final class Star   implements Celestial { ... }
final class Comet  implements Celestial { ... }

var path = Paths.get(fileName); // instead of Path path = ....
var bytes = Files.readAllBytes(path);

// As of Java 21
static void testStringNew(String response) {
    switch (response) {
        case null -> { }
        case String s
        when s.equalsIgnoreCase("YES") -> {
            System.out.println("You got it");
        }
        case String s
        when s.equalsIgnoreCase("NO") -> {
            System.out.println("Shame");
        }
        case String s -> {
            System.out.println("Sorry?");
        }
    }
}

int j = switch (day) {
    case MONDAY  -> 0;
    case TUESDAY -> 1;
    default      -> {
        int k = day.toString().length();
        int result = f(k);
        yield result;
    }
};
