public class Ramc {
        public static void main(String[] args) {
            int num = 1;
            char letter = 'A';
            
            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.println(letter + " ");
                    letter++;
                }
            }
        }
    }
    

