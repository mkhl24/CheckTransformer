package utils.subject;

import com.google.gson.*;
import models.subjects.IdentityDocument;
import models.subjects.Person;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class PersonDeserializer implements JsonDeserializer<Person> {

    @Override
    public Person deserialize(JsonElement jsonElement, Type type,
                              JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Person person = new Person();

        person.setSubjectId(jsonObject.get("subjectId").getAsString());

        JsonObject personJsonObject = jsonObject.getAsJsonObject("person");

        person.setName(personJsonObject.get("name").getAsString());
        person.setSurname(personJsonObject.get("surname").getAsString());
        if (personJsonObject.has("patronymic")) {
            person.setPatronymic(personJsonObject.get("patronymic").getAsString());
        } else {
            person.setPatronymic("");
        }
        if (personJsonObject.has("snils")) {
            person.setSnils(personJsonObject.get("snils").getAsString());
        } else {
            person.setSnils("");
        }
        if (personJsonObject.has("inn")) {
            person.setInn(personJsonObject.get("inn").getAsString());
        } else {
            person.setInn("");
        }

        if (personJsonObject.has("birthDate")) {
            person.setBirthDate(jsonDeserializationContext.
                    deserialize(personJsonObject.get("birthDate"), LocalDate.class));
        }

        if (personJsonObject.has("identityDocument")) {
            person.setIdentityDocument(jsonDeserializationContext.
                    deserialize(personJsonObject.get("identityDocument"), IdentityDocument.class));
        } else {
            person.setIdentityDocument(IdentityDocument.setMockID());
        }

        return person;
    }
}
