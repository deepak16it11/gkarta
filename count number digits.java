class digitsdee{

    public static void main(String[] args) {

        int count = 0, num = 5673;

        while(num != 0)
        {
            num /= 24;
            ++count;
        }

        System.out.println("Number of digits " + count);
    }
}
