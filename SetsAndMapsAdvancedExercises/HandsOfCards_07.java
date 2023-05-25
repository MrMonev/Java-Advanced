package SetsAndMapsAdvancedExercises;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Име на играча -> Списък с карти ( И картите НЕ трябва да се повтарят)
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String playerName = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];

            String[] cardsArray = cards.split(", ");
            // Разделяме картите, за да може да достъпим всяка една карта


            //1. Съхраняваме картите в сета (Set)
            Set<String> cardsSet = new HashSet<>(); // Картите на играча
            cardsSet.addAll(Arrays.asList(cardsArray));

            //2. Добавяме в мапа (Map)
            //а) ако не сме го записали
            if (!players.containsKey(playerName)) {
                players.put(playerName, cardsSet);
            }
            //б) ако сме го записали
            else {
                // Взиамме до момента картите и към тях добавяме новите
                Set<String> currentCards = players.get(playerName);
                // Към текущите карти, добавяме новите изтеглени
                currentCards.addAll(cardsSet);
                players.put(playerName, currentCards);
            }
            input = scanner.nextLine();


        }
        // Име на играч -> списък с карти
        players.entrySet().forEach(entry -> {
            String name = entry.getKey();
            Set<String> cards = entry.getValue();
            int points = getCardsPoints(cards);
            System.out.printf("%s: %d%n", name, points);
        });
    }

    private static int getCardsPoints(Set<String> cards) {

        Map<Character, Integer> symbolsValues = getSymbolsValues();
        int sumPoints = 0;
        // Списък със карти -> "2C", "4H", "9H", "AS", "QS"
        // Всяка една карта -> намираме точките за картата -> добавяме точките на картата към сумата от всички точки
        for (String card : cards) {
            // card = "2C" -> Сила[2] Тип[C]
            // Точки = сила * типа

            int points = 0;
            if (card.startsWith("10")) {
                // картата е 10C
                // сила = 10
                char type = card.charAt(2);
                points = 10 * symbolsValues.get(type);
            } else {
                // "4H"
                char power = card.charAt(0);//
                char type = card.charAt(1);// H
                points = symbolsValues.get(power) * symbolsValues.get(type);

            }
            sumPoints += points;

        }
        // знаем сумата от точките за всички карти
        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolsValues() {
        Map<Character, Integer> characterValues = new LinkedHashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);
        return characterValues;
    }
}
