package july26;
// Q3. In "Hoeololo Worolod" replace all "o" with '-' using String Builder ?
public class q3_replaceOwith_using_StringBuilder {
    public static void main(String[] args) {
        
    // by using StringBuilder

    StringBuilder strbuilder = new StringBuilder();

    strbuilder = strbuilder.append(("Hoeololo Worolod").replace("o","-"));

    System.out.println("By replacing o with - we get  : "+ strbuilder);
    }
}
