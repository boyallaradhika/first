package String;

public class String_immutable2 {
    public static void main(String[] args) {
        String name ="radhika"; //created string in String constant pool
        name = name.toUpperCase(); // changed to capital radhika  and stored in name
        System.out.println(name); // it prints "RADHIKA"
    }
}
