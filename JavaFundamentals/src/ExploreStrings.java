/**
 * @author Sinenhlanhla Mchunu
 * This class demonstrate the use of different methods
 *
 */

public class ExploreStrings {
    public  static void main( String[] args){
        String firstname= "Johnathan";
        String lastname= "Smith";
        String sentence= "Video provides a powerful way to help you prove your point.";

        System.out.println(firstname+"has"+firstname.length()+"letters");
        System.out.println("'m'is found at position(index):"+ lastname.indexOf("m")+ "from"+lastname);
        System.out.println("Is Smith=" + lastname+"?"+ lastname.equals("Smith"));
        System.out.println("The third letter from" + firstname+"is"+firstname.charAt(2));
        System.out.println("The last position of 'h' from"+firstname+"is"+firstname.lastIndexOf("h"));

        System.out.println(sentence.length());


        String noSpaces = sentence.replace(" ", "");
        System.out.println("Sentence without spaces: " + noSpaces);
        System.out.println("Number of letters (excluding spaces): " + noSpaces.length());
    }
}
