public class Homework11 {

    static int hw = 11 ;

    public static void main(String[] args) {
        printHwTitle();
        task_();
        printCompletionMessages();

    }

    public static void printHwTitle() {
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }

    public static void task_() {
        System.out.println("Problem #_");
        System.out.println("Solution to be provided soon");
        System.out.println("");
    }


    public static void printCompletionMessages() {
        String hwStatus = " в работе..." ;
        System.out.println("Домашнее задание " + hw + hwStatus);
        System.out.println(" ");
    }
}