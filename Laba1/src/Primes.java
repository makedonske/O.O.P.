public class Primes {
    public Primes() {
    }
//Создайте программу, которая находит и выводит все простые числа
//меньше 100
    public static void main(String[] args) {
        for(int i = 2; i < 101; ++i) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    //метод определяющий прое ли число
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
