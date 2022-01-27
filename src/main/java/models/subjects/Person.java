package models.subjects;

import java.time.LocalDate;

public class Person extends Subject {

    private String subjectId;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthDate;
    private String snils;
    private String inn;
    private IdentityDocument identityDocument;

    public Person () {

    }



    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }

    @Override
    public String toString() {
        String result;
        StringBuilder sb = new StringBuilder();
        sb.append("Фамилия " + surname + "\n");
        sb.append("Имя " + name + "\n");
        if (patronymic.length() != 0) {
            sb.append("Отчество " + patronymic + "\n");
        } else {
            sb.append("Отчество \n");
        }


        result = sb.toString();
        return result;
    }
}
