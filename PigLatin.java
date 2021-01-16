

public class PigLatin
{
   private String original;
   private String converted;
   
   public PigLatin( String input ) {
   
      String word;
      
      original = input;
      
      converted = "";
      
         //trim all leading and trailing whitespaces
      StringBuilder s1 = new StringBuilder(input.trim() );
      
      while(s1.length() > 0) {
            //remove the first word from s1 and assign it to word
         word = popWord(s1);
         
            //convert the word to Pig Latin and add it to the converted sentence
         converted = converted + toPigLatin(word) + " ";
      }
   }
   
   public String popWord( StringBuilder s1) {
      int index = 0;
      
         //locate the first space, or the end of the string
      while(index < s1.length() && s1.charAt(index) !=' ') {
         index ++;
      }
      
         //get the word from the beginning of s1
      String word = s1.substring(0, index);
      
         //delete the word from s1
      s1.delete(0, index+1);
      
      return word;
   }
      
      //return the converted word
   public String toPigLatin(String word) {
         
      StringBuilder s2 = new StringBuilder( word );
         
         //get the first letter
      char first = s2.charAt(0);
         
         //add it to the end of the word
      s2.append( first );
         
         //add "AY" to the word
      s2.append("AY");
         
         //delete the first letter
      s2.deleteCharAt(0);
         
      return s2.toString();
      
   }
      
      public String getOriginal() {
      
         return original;
      
      }
      
      public String getConverted() {
      
         return converted;
      
      }
      
      
}//end class