package string_class;

public class StringPractice2
{
    public static void main(String[] args) {
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));

        for(int i=0;i<str1.length();i++)
        {
            System.out.println(str1.charAt(i));
        }
        //System.out.println(str1.charAt(9));

        String str2="www.Udemy.com";
        System.out.println(str2.indexOf("Udemy"));


    }
}
