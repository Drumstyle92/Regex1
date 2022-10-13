/**
 * @author Drumstyle92
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * main method where we find a string, a string method and its printing.
     */
    public static void main(String[] args) {
        // string created.
        String out = "I Like to code near the Lake with my friend Luke";
        System.out.println("---------------------------------------------");
        System.out.println(out.replaceAll("L[^u]ke","BLA"));
    }
}
