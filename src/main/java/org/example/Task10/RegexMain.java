package org.example.Task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

    private static final WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.get("https://www.epam.com/about/who-we-are/contact");
        List<String> resultList = new ArrayList<>();
        List<String> titlesList = Arrays.asList("Street: ", "Apartment: ", "City: ", "Post code: ", "Country: ");

        String address = driver.findElement(By.cssSelector(".section__wrapper .text b")).getText();

        Matcher matcher = Pattern.compile("([\\w\\s]+)").matcher(address);

        while (matcher.find()) {
            resultList.add(matcher.group().replace("\n", ""));
        }

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(titlesList.get(i) + resultList.get(i));
        }

        System.out.println(checkRegex("ololo@gmail.com", "email"));
        System.out.println(checkRegex("192.168.1.6", "ip"));
        System.out.println(checkRegex("4441114412452521", "card"));

        driver.quit();
    }

    private static boolean checkRegex(String line, String regexType) {
        String email = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String ip = "(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}";
        String card = "^4[0-9]{12}(?:[0-9]{3})?$";

        switch (regexType) {
            case "email": {
                return line.matches(email);
            }
            case "ip": {
                return line.matches(ip);
            }
            case "card": {
                return line.matches(card);
            }
            default: {
                return false;
            }
        }
    }
}
