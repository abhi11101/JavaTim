package Section7_8_OOPS.Inheritence.StringFormatting;

public class StringMethods {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t\n");

        String hello = "Hello World";
        String helloLower = hello.toLowerCase();

        if(hello.equals(helloLower)){
            System.out.println("Value matches exactly");
        }
        if (hello.equalsIgnoreCase(helloLower)){
            System.out.println("Value match ignoring case");
        }

        if (hello.contentEquals("Hello World")){
            System.out.println("Value matches");
        }
        StringManipulation();
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length %d%n",length);
        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c%n",string.charAt(0));
        System.out.printf("Last char = %c%n",string.charAt(length-1));

    }

    public static void StringManipulation(){
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("starting index = " + startingIndex);
        System.out.println("Birth Year= " +birthDate.substring(startingIndex));

        String newDate = String.join("/","25","11","1982");
        System.out.println(newDate);

        System.out.println(newDate.replace('/','-'));
        System.out.println("ABC\n".repeat(3));
        System.out.println("ABC\n".repeat(3).indent(8));
    }
}
