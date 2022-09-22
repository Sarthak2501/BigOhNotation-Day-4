public class Qone4 {

    static void swap(String str,int a , int b ){
//        char firstWord = str.charAt(a);
//        char secondWord = str.charAt(b)
        char [] ch = str.toCharArray();
//        System.out.println(ch);
        char temp = ch[a];
        ch[a]  = ch[b];
        ch[b] = temp;
    }

    //Question1
    static int countChar(String str,char ch){
        int n = str.length();
        int count = 0;
        for (int i = 0 ; i < n ; i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
      return count;
    }

    static String substring(String str, int start, int end){
        int n = str.length();
        String newstr = "";
        for (int i = start; i < end ; i++ ) {
            newstr = newstr + str.charAt(i);
        }
        return newstr;
    }


    static String[] split(String str,char ch){
        String [] arr = new String[50];
        String ans = "";
        int n = str.length();
        for (int i = 0 ; i < n ; i++) {//ab cb db eb = {ab , cb , db , eb}
            int j = 0;
            ans  += str.charAt(i);
            if (str.charAt(i) == ch) {
                arr[j] = ans;
                j++;
            }
        }
    return arr;
    }

    static Boolean hasPattern(String str, String pattern){
    // Returns true if the given string (pattern) is found in the main string (str) otherwise false.
        int n = str.length(); // Sart 'hav' == 'hak'
        int patternLength = pattern.length();
        int pointerOne = 0;
        int pointerTwo = 0;
        for (pointerOne = 0 ; pointerOne < n ; pointerOne++){
            if (str.charAt(pointerOne) == pattern.charAt(pointerTwo)){
                pointerTwo++;
            }
        }
        if(pointerTwo != patternLength){
            return false;
        }

        return true;
    }

    static Boolean allWordsContainsChar(String str,char ch){
    //Returns true if all words of the given string (str) contain the given character (ch)  otherwise false.
            Boolean doesContain = false;
            int n = str.length();
            int countOfNumber = countChar(str,ch);
//            System.out.println(countOfNumber);
            if (countOfNumber == n){
                doesContain = true;
            }
            return doesContain;
    }

    static String reverse(String str){
    //Returns the reverse of the String (Without using extra String or array)
        int n = str.length();
        int start = 0;
        int end = n - 1;
        while(start < end){
//            System.out.println(start);
//            System.out.println(end);
//          if(str.charAt(start) == str.charAt(end)){
//              start++;
//              end--;
//           }
            swap(str,start,end);
            start++;
            end--;
        }
        return str;
    }

//    static String reverseVowels(String str) {
////    //Reverse only all the vowels in the string and return it ( Example :
////        //Input: s = "liipcoce"
////        //Output: "leopcici"
////        //Input: s = "hello"
////        //Output: "holle"
//
//    }

    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }


    static String reverseVowel(String str1) {

        int j = 0;

        char[] str = str1.toCharArray();

        String vowel = "";

        for (int i = 0; i < str.length; i++) {

            if (isVowel(str[i])) {

                j++;

                vowel += str[i];

            }

        }
        for (int i = 0; i < str.length; i++) {

            if (isVowel(str[i])) {
                str[i] = vowel.charAt(--j);
            }
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        String str = "Sarthak";
        String str1 = "abcbdbeb";
        //System.out.println(countChar(str1,'b'));
        String str2 = "aaaaaaa";
        char givenChar = 'a';
        String str3 = "liipcoce";

        System.out.println("----------------==============================================================-------------------------------");
        System.out.println("1.Occurrence of the given character : " + countChar(str1,'b'));
        System.out.println("2.Substring from the start index to the end index with all validation checks : "+substring(str,1,4));
        System.out.println("3.Array of strings broken according to the occurrence of the given character : "+split(str1,'b'));
        System.out.println("4.Given pattern is matched : " + hasPattern(str,"hak"));
        System.out.println("5.Found all words of the given string : "+ allWordsContainsChar(str2,'a'));
        System.out.println("6. Reverse String is :  " + reverse(str));
        System.out.println("7. Reverse of Vowel in a String : " + reverseVowel(str3));
        System.out.println("----------------==============================================================-------------------------------");
    }
}
