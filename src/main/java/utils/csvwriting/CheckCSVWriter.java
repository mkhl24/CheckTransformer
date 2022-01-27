package utils.csvwriting;

import com.opencsv.CSVWriter;
import models.checks.Check;
import models.subjects.Person;

import java.io.FileWriter;

public class CheckCSVWriter {


    private static Check checkPrint;
    private static Person personPrint;

    CheckCSVWriter(Check check, Person subject) {
        check = check;
        personPrint = subject;
    }

    public static void writeCheckToCSVFile() {
        String[] raws = new String[10];
        raws[0] = personPrint.toString();


        CSVWriter writer = new CSVWriter(new FileWriter());
    }
}
