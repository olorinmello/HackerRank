import java.util.Scanner;

class JavaEndOfFile {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while (sc.hasNext()) {
            lineNumber++;
            System.out.printf("%d %s%n", lineNumber, sc.nextLine());
        }
    }
}