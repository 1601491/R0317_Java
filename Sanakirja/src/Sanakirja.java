import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sanakirja
{
public static void main(String[] args)
{
    Map<String, String> hashmap = new HashMap<>();
    hashmap.put("kissa", "cat");
    hashmap.put("koira", "dog");
    hashmap.put("hevonen", "horse");
    hashmap.put("auto", "car");
    hashmap.put("vene", "boat");

Scanner lukija = new Scanner(System.in);
System.out.println("Sanakirjan sis�lt�: {vene=boat, auto=car, koira=dog, hevonen=horse, kissa=cat}");
System.out.print("Mink� sanan haluat tiet��? ");

        String token = lukija.nextLine();
        String[] result = token.split("\\s");
        for (int i = 0; i < result.length; i++)
        {
            if (hashmap.containsKey(result[i]))
            {
                result[i] = hashmap.get(result[i]);
                
                System.out.print("Sanan " + token + " k��nn�s on " + result[i]);
            }
            
            
        }
    }
}
