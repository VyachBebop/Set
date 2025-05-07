import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1: ");
        String lineOne = "Олово";
        System.out.println(unique(lineOne));
        String lineTwo = "Ключ";
        System.out.println(unique(lineTwo));


        System.out.println("Задача 2: ");
        Set<Integer> InegerSetOne = new HashSet<>();
        InegerSetOne.add(1);
        InegerSetOne.add(2);
        Set<Integer> InegerSetTwo = new HashSet<>();
        InegerSetTwo.add(3);
        InegerSetTwo.add(4);

        Set<Integer> newSet = unification(InegerSetOne, InegerSetTwo);
        for (Integer item : newSet) {
            System.out.println(item);
        }

        System.out.println("Задача 5: ");
        Comparator<Product> productComparator = Comparator
                .comparingDouble((Product p) -> p.getPrice())
                .thenComparingInt(p -> -p.getRating());

        TreeSet<Product> products = new TreeSet<>(productComparator);
        products.add(new Product(43, 323, "Картошка"));
        products.add(new Product(23, 234, "Морковь"));
        products.add(new Product(16, 221, "Лук"));
        products.add(new Product(38, 114, "Чеснок"));
        products.add(new Product(40, 114, "Чеснок"));

        for (Product product : products) {
            System.out.println(product);
        }

    }
//    Задача 1: Проверка на уникальность
//    Напишите метод, который принимает на вход строку и проверяет, содержит ли она все уникальные символы.
//    Метод должен вернуть true, если все символы в строке уникальны, и false в противном случае.

    public static boolean unique(String line) {
        if (line == null || line.length() <= 1) {
            return true;
        }

        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (charSet.contains(currentChar)) {
                return false; //символ уже был
            }
            charSet.add(currentChar);
        }
        return true; //символы уникальны
    }


//    Задача 2: Объединение множеств
//    Напишите метод, который принимает на вход два множества Set и возвращает новое множество,
//    содержащее все элементы из обоих исходных множеств.

    public static <T> Set<T> unification(Set<T> first, Set<T> second) {

        Set<T> newSet = new HashSet<>(first);//Копия первого и в него добавляем все из второго
        newSet.addAll(second);
        return newSet;
    }

}