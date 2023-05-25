package SetsAndMapsAdvancedExercises;

import java.util.*;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  user -> ip -> count
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split("//s+");
            String ip = inputParts[0].split("=")[1];
//            String message = inputParts[1].split("=")[1];
            String username = inputParts[2].split("=")[1];

            // username да не съществува
            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>() {{
                    put(ip, 1);
                }});
            }
            // username да същестува
            else {
                //текущия списък с Ip-ta
                Map<String, Integer> currentIps = data.get(username); // списък с Ip-ta
                // IP да е посетено (Има в списака)
                if (currentIps.containsKey(ip)) {
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes + 1);
                }
                // IP не е посещаване (няма в списъка)
                else {
                    currentIps.put(ip, 1);
                }
            }
            input = scanner.nextLine();
        }
        // "username"
        // {IP} => {count}, IP = count
        data.keySet().forEach(username -> {
            System.out.println(username + ":");
            Map<String, Integer> ips = data.get(username);
            // Запис: ip -> бр. Срещания
            int countIps = ips.size();
            ips.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " => " + entry.getValue() + ", ");
                //TODO: последното IP да се оптпечатва с точка на края
                // Ако е последното Ip във мапа
            });
        });
    }
}
