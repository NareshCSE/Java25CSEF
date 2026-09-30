package javaprograms;

public class CommonElements {
    public static void main(String[] args) {
        String[] arr1 = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        String[] arr2 = {"Mango", "Apple", "Watermelon", "Grapes", "Kiwi"};

        System.out.println("Common elements:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                    break; // avoid printing duplicates multiple times
                }
            }
        }
    }
}
