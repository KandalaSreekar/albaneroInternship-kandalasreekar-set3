public class question5{
    
    public static boolean checkWordIsAnIsogram(String word) {
        if(word == null)
            return false; 
        word = word.toLowerCase();
        char[] arr = word.toCharArray();
        for (char ch : arr) {
            if(word.indexOf(ch) != word.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
      System.out.println("Enter the input string");
      String inpString = sc.nextLine();
      boolean result = checkWordIsAnIsogram(inpString);
      if(result == true) {
        System.out.println("Your word is an Isogram ");
      }
      else {
        System.out.println("Your word is NOT an Isogram");
      }    
    }
}