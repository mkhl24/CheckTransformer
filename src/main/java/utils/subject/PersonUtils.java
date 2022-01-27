package utils.subject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.subjects.IdentityDocument;
import models.subjects.Person;
import utils.LocalDateDeserializer;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonUtils {

    public static void readPerson() {
        String json = "";

            try (Scanner scanner = new Scanner(new File("response_sub2.json"))) {
                StringBuilder sb = new StringBuilder();
                while(scanner.hasNext()) {
                    sb.append(scanner.nextLine());
                }
                json = sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Person person;
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                    .registerTypeAdapter(IdentityDocument.class, new IdentityDocumentDeserializer())
                    .registerTypeAdapter(Person.class, new PersonDeserializer())
                    .create();

            person = gson.fromJson(json, Person.class);
            System.out.println(person);
    }
}
