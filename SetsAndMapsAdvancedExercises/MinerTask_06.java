package SetsAndMapsAdvancedExercises;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Име на човек -> Email

        Map<String, String> emailsData = new LinkedHashMap<>();
        String name = scanner.nextLine();


        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            // Съхраняваме данни само за хора, на които емейла не завършва на: uk, us, com

            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                // ако не завършва на едно от изброените добави ми ги в мапа, с компандата (endWith)
                emailsData.put(name, email);
            }


            name = scanner.nextLine();
        }
        // име -> емейл
        emailsData.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
