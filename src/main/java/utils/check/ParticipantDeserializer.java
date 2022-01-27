package utils.check;

import com.google.gson.*;
import models.checks.Participant;

import java.lang.reflect.Type;

public class ParticipantDeserializer implements JsonDeserializer<Participant> {
    @Override
    public Participant deserialize(JsonElement jsonElement, Type type,
                                   JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        Participant participant = new Participant();

        participant.setName(object.get("name").getAsString());
        if (object.has("role")) {
            participant.setRole(object.get("role").getAsString());
        } else {
            participant.setRole("");
        }
        if (object.has("article")) {
            participant.setArticle(object.get("article").getAsString());
        } else {
            participant.setArticle("");
        }
        if (object.has("sentence")) {
            participant.setSentence(object.get("sentence").getAsString());
        } else {
            participant.setSentence("");
        }
        if (object.has("inn")) {
            participant.setInn(object.get("inn").getAsString());
        } else {
            participant.setInn("");
        }
        if (object.has("kpp")) {
            participant.setKpp(object.get("kpp").getAsString());
        } else {
            participant.setKpp("");
        }
        if (object.has("ogrn")) {
            participant.setOgrn(object.get("ogrn").getAsString());
        } else {
            participant.setOgrn("");
        }


        return participant;
    }
}
