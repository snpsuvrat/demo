import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class Anagram 
{ 
    public static void main(String[] args) 
    {
        String str1="School MAster";
        String str2="THe Classroom";
        
        //removing space
        str1=str1.replace(" ", "");
        str2=str2.replace(" ", "");
       // converting to lower case
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        // converting to array
        char []arr1=str1.toCharArray();
        char []arr2=str2.toCharArray();
        //Sorting arrays

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //comparing both array content


        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("they are Anagram");
        }
        else
        {
            System.out.println("They are not Anagram");
        }
        
    }
}
