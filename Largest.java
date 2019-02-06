class Largest {

    public static void main(String[] args) {

        double n1 = 5.5, n2 = - 3.9, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
        {
            System.out.println(n1 + " the is  largest number.");
        }

        else if (n2 >= n1 && n2 >= n3)
        {
            System.out.println(n2 + "the is largest number.");
        }

        else
        {
            System.out.println(n3 + " the is largest number.");
        }
    }
}
