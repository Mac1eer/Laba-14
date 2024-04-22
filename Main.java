import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                System.out.println("Введите проверяемую строку: ");
                Scanner input = new Scanner(System.in);
                String STR = input.nextLine();
                String ipv6 = "([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4}|:)|" +
                        "([0-9a-fA-F]{1,4}:){1,7}:|" +
                        "([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|" +
                        "([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}:){1,2}|" +
                        "([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}:){1,3}|" +
                        "([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}:){1,4}|" +
                        "([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}:){1,5}|" +
                        "[0-9a-fA-F]{1,4}:(:[0-9a-fA-F]{1,4}){1,6}|" +
                        ":((:[0-9a-fA-F]{1,4}){1,7}|:)";
                String ipv4 = "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{2}|[0-9].){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{2}|[0-9])";
                Pattern pattern_iv6 = Pattern.compile(ipv6);
                Pattern pattern_iv4 = Pattern.compile(ipv4);
                Matcher matcher6 = pattern_iv6.matcher(STR);
                Matcher matcher4 = pattern_iv4.matcher(STR);
                if(matcher6.find()){
                    System.out.println("Найден ipv6: " + matcher6.group());
                }
                else if (matcher4.find()){
                    System.out.println("Найден ipv4: " + matcher4.group());
                }
                else {
                    System.out.println("Error");
                }
            }
        }
