public class First20Prime {
    public static void main(String[] args) {
        showFirst20Prime();
    }
    public static void showFirst20Prime(){
        int count = 0;
        int number = 2;
        while (count < 20){
            boolean isPrime = true;
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
