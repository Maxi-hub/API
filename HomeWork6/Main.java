import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * 2. Создать множество ноутбуков.
 * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebooks> notes = new ArrayList<>();
        notes.add(new Notebooks("iMAC", "16", "6", "MacOS", "grey"));
        notes.add(new Notebooks("Acer", "8", "4", "Windows", "black"));
        notes.add(new Notebooks("Intel", "4", "2", "Linux", "white"));
        notes.add(new Notebooks("Dell", "2", "2", "Windows", "black"));
        notes.add(new Notebooks("Asus", "8", "2", "Windows", "grey"));


        System.out.println("Что ищем? Введите цифру:\n 1-марка\n 2-объем RAM в Гб\n 3-объем HDD в Тб\n 4-операционная система\n 5-цвет");
        Scanner scanner = new Scanner(System.in);
        int firstSearch = scanner.nextInt();
        String search;
        switch (firstSearch) {
            case 1:
                System.out.println("Выберите название марки:\n iMAC, Acer, Intel, Dell, Asus");
                scanner = new Scanner(System.in);
                search = scanner.nextLine();
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i).getBrand().equalsIgnoreCase(search)) {
                        System.out.println(notes.get(i).toString());
                    }
                }
                break;
            case 2:
                System.out.println("Выберите объем RAM в Гб: 2, 4, 8, 16");
                scanner = new Scanner(System.in);
                search = scanner.nextLine();
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i).getRAM().equals(search)) {
                        System.out.println(notes.get(i).toString());
                    }
                }
                break;
            case 3:
                System.out.println("Выберите объем HDD в Тб: 2, 4, 6");
                scanner = new Scanner(System.in);
                search = scanner.nextLine();
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i).getHDD().equals(search)) {
                        System.out.println(notes.get(i).toString());
                    }
                }
                break;
            case 4:
                System.out.println("Выберите операционную систему: MacOS, Windows, Linux");
                scanner = new Scanner(System.in);
                search = scanner.nextLine();
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i).getOS().equalsIgnoreCase(search)) {
                        System.out.println(notes.get(i).toString());
                    }
                }
                break;
            case 5:
                System.out.println("Выберите цвет: grey, black, white");
                scanner = new Scanner(System.in);
                search = scanner.nextLine();
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i).getColor().equalsIgnoreCase(search)) {
                        System.out.println(notes.get(i).toString());
                    }
                }
                break;
            default:
                System.out.println(notes);
        }
    }
}

