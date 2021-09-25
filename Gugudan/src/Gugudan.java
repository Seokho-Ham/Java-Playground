public class Gugudan {
    public static int[] saveInArray(int num1, int num2){
        int[] result = new int[num2];

        for(int i=0; i<result.length; i++){
            result[i] = num1 * (i+1);
        }
        return result;
    }

    public static void printResult(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
