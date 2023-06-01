package SetsAndMapsAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class WarNumberGame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {
            // check if someone has no cards
            if(firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if(secondPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }
            // get card from first player
                int firstPlayerCard = firstPlayer.iterator().next();
            // get card from second player
                int secondPlayerCard = secondPlayer.iterator().next();

                // remove the cards from players
                firstPlayer.remove(firstPlayerCard);
                secondPlayer.remove(secondPlayerCard);

            // compare cards
            if(firstPlayerCard > secondPlayerCard) {
                // add the crd to the winner
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if(secondPlayerCard > firstPlayerCard){
                // add the crd to the winner
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }  else {
                firstPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }

        // compare the desks of the player

        int firstPlayerDeckSize = firstPlayer.size();
        int secondPlayerDeckSize = secondPlayer.size();

        if(firstPlayerDeckSize > secondPlayerDeckSize) {
            System.out.println("First player win!");
        } else if (secondPlayerDeckSize > firstPlayerDeckSize){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
    private  static Integer getTopValueFromPlayer(LinkedHashSet<Integer> player) {
        for (Integer card : player) {
            return card;
        }
        return 0;
    }
}
