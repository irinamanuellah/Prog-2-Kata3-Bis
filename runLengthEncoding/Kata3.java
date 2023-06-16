public class Kata3 {
    public static String runLengthEncoding(String input) {
        StringBuilder phrase = new StringBuilder();
        int count = 0;
        char motActuelle = input.charAt(0);


        for (int i = 0; i < input.length(); i++) {

            char motAvant = input.charAt(i);

            if (motAvant == motActuelle) {
                count++;
            } else {
                if (count > 2) {
                    phrase.append(count);
                    phrase.append(motActuelle);
                } else {
                    phrase.append(motActuelle).append(motActuelle);
                }
                count = 1;
                motActuelle = motAvant;
            }
        }

        if (count > 2) {
            phrase.append(count);
            phrase.append(motActuelle);
        } else {
            phrase.append(motActuelle).append(motActuelle);
        }
        return phrase.toString();
    }

    public static void main(String[] args) {
        String input1 = "eeeeeaaaaa";
        System.out.println(runLengthEncoding(input1));

        String input2 = "bbddb";
        System.out.println(runLengthEncoding(input2));

        String input3 = "cccccfffdd";
        System.out.println(runLengthEncoding(input3));
    }
}


