import java.util.Scanner;

public class caesarCipher {
    public void intToAscii() {
        Scanner dValue = new Scanner(System.in);
        System.out.println("What is the denary value of the ASCII Value?");
        int DenaryValue = dValue.nextInt();

        char ASCII_VALUE = (char)DenaryValue;

        System.out.println("The ASCII value of " + DenaryValue +  " is " + ASCII_VALUE);
    }

    public void ASCII_TO_INT() {
        Scanner aValue = new Scanner(System.in);
        System.out.print("What is the ASCII Value of the Letter? ");
        String S_VALUE = aValue.nextLine();

        char A_VALUE = S_VALUE.charAt(0);

        System.out.println("The Integer Value of " + A_VALUE + "is equal to " + (int) A_VALUE);
    }

    public void Name() {
        Scanner length = new Scanner(System.in);
        System.out.print("How many letters is in your name? ");
        int nLength = length.nextInt();

        int LettersinName[] = new int[nLength];

        for(int i = 0; i < nLength; i++) {
            int count = i + 1;
            Scanner Letter = new Scanner(System.in);
            System.out.println("Enter letter " + count + " of your name");
            String temp = Letter.nextLine();

            char letter = temp.charAt(0);

            LettersinName[i] = (int) letter;
        }

        for(int j = 0; j < nLength; j++) {
            System.out.print(LettersinName[j]);
            System.out.print(" ");
        }
    }

    public void CaesarCipher() {
        int key = 0;

        Scanner Key = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 25 to encrypt: ");
        key = Key.nextInt();
        Scanner String = new Scanner(System.in);
        System.out.println("Enter your string");
        String string = String.nextLine().replaceAll("\\s+", "");
        int length = string.length();
        for (int i = 0; i < length; i++ ) {
            char ascii = string.charAt(i);
            int integer = (int) ascii;
            integer = integer + key;

            if (integer > 27) {
                integer = integer - 26;
            }

            char encrypted = (char)integer;
            System.out.print(encrypted);



        }
    }
}
