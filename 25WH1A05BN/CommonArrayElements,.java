package myproject;

public class CommonElements {

    public static void main(String[] args) {

        String[] a = {"Apple", "Mango", "Orange", "Banana"};
        String[] b = {"Grapes", "Mango", "Banana", "Apple"};

        System.out.println("Common elements:");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i].equals(b[j])) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
