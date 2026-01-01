public class Main {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int age = read.nextInt();
            if(age < 18) {
                throw new RuntimeException("you cannot vote since your age is below 18");
            }
        }
    }
