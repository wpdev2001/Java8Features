public class Main {
    public static void main(String[] args) {
        Employee se = () -> "Software Engineer";
        System.out.println(se.getName());

        Employee editor = () -> "Video Editor";
        System.out.println(editor.getName());
    }
}