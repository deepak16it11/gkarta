public class Alphabet {

    public static void main(String[] args) {

        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) 
        {
            System.out.println(c + "  theis an alphabet.");
        }
        else
        {
            System.out.println(c + " the is not an alphabet.");
        }
    }
}
