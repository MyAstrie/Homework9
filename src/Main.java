public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int[] arr) {
        var sum = java.util.Arrays.stream(arr).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public  static void task2(int[] arr){
        int maxValue = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        int minValue = arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей. " +
                "Максимальная сумма трат за день составила " + maxValue + " рублей");
    }

    public static void task3(int[] arr){
        var averageSum = java.util.Arrays.stream(arr).sum() / (double)arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", averageSum);
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }
}