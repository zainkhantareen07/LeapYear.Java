public class JadenCaseString {

    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] words = phrase.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String text = "how can mirrors be real if our eyes aren't real";

        System.out.println(toJadenCase(text));
    }
}