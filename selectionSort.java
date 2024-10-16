//Selection Sort
public class Main {
    public static void main(String[] args) {
        System.out.println("Selection Sort");
        
        int[] numbers = {3, 10, 20, 40, 15, 2, 1, 20};

        System.out.println(java.util.Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
    }
    
    public static void selectionSort(int[] numbers) {
        int length = numbers.length;
        
        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j; 
                }
            }
        
            swap(numbers, i, indexOfMin); 
        }
    }
    
    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
