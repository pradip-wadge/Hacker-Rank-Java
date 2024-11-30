class Program{
    public static void main(String[] args) {
        int number = 123;
        //String str = Integer.toString( number );    //Boxing : OK
        String str = String.valueOf(number);        //Boxing : OK
        System.out.println("Str :   "+str);
    }
    public static void main2(String[] args) {
        String str = "12c";
        int number = Integer.parseInt(str); //UnBoxing : NumberFormatException
        System.out.println("Number  :   "+number);
    }
    public static void main1(String[] args) {
        String str = "123";
        int number = Integer.parseInt(str); //UnBoxing : OK
        System.out.println("Number  :   "+number);
    }
}