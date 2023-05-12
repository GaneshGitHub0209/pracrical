package Slip9;

public class Q2 {
    public static void main(String[] args) {
        // String examples
        String str = "Hello";
        System.out.println("Original string: " + str);
        
        // setCharAt()
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(0, 'J');
        str = stringBuilder.toString();
        System.out.println("After setCharAt(): " + str);
        
        // setLength()
        StringBuilder sb = new StringBuilder(str);
        sb.setLength(3);
        str = sb.toString();
        System.out.println("After setLength(): " + str);
        
        // append()
        StringBuilder sb1 = new StringBuilder(str);
        sb1.append(" World");
        str = sb1.toString();
        System.out.println("After append(): " + str);
        
        // insert()
        StringBuilder sb2 = new StringBuilder(str);
        sb2.insert(5, " there");
        str = sb2.toString();
        System.out.println("After insert(): " + str);
        
        // concat()
        String str2 = "!";
        String concatenated = str.concat(str2);
        System.out.println("Concatenated string: " + concatenated);
        
        // equals()
        String str3 = "Hello World!";
        boolean isEqual = concatenated.equals(str3);
        System.out.println("Are the strings equal? " + isEqual);
    }
}