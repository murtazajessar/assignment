public class escap {

    public static void main(String[] args) {
        String var = "I wish I was the \"MONSTER\" that you think i am.";
        System.out.println(var);
        String var2 = "It\'s alright.";
        System.out.println(var2);
        String var3 = "The character \\ is called backslash.";
        System.out.println(var3);

        // \n New Line
        // \r Carriage Return
        // \t Tab
        // \b Backspace
        // \f Form Feed

        String var4 = "Murtaza\nJessar";
        String var5 = "Murtaza\rJessar";
        String var6 = "Hello\tJessar";
        String var7 = "Murtaza\bJessar";
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
    }

}
