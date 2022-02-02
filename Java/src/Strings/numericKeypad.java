package Strings;
//https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
//Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.
public class numericKeypad {
    public static void main(String[] args)
    {
        // storing the sequence of letters of english alphabet as per numeric keypad in array
        String[] str = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };

        String input = "ALOHOMORA";
        System.out.println(printSequence(str, input));
    }
    static String printSequence(String[] arr, String input) {
        StringBuilder output = new StringBuilder();

        // length of input string
        int n = input.length();
        for (int i = 0; i < n; i++)
        {
            // Checking for space
            if (input.charAt(i) == ' ')
                output.append("0");

            else
            {
                // Calculating index for each
                // character
                int position = input.charAt(i)-'A'; //subtracting A to find the index properly as input.charAt will give the ASCII value of the char
                //for eg- input.charAt(i)= B so it will give us 66, we finally subtract A which is 65 to get the index
                output.append(arr[position]);
            }
        }
        // Output sequence
        return output.toString();
    }
}
