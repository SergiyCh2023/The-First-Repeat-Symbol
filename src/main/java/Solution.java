public class Solution {

    public char findFirstNoRepeatingSymbols(String s) {

        //String [] arrayString = s.split("");
       int count = 0;
       char temp = '0';
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                temp = s.charAt(i);
                if (s.charAt(i) == s.charAt(j)) count++;

            }
            if (count >=2) {
                break;
            }
            count =0;

        }
        if (temp == '0') System.out.println("Sorry, We don't have repeating symbols");
        return temp;



    }


}
