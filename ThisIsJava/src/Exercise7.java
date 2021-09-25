public class Exercise7 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1,5,3,8,2};

        for(int num : arr){
            if(max<num){
                max = num;
            }
        }

        System.out.println("max: " + max);
    }
}
