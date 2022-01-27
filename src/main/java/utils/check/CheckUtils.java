package utils.check;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.checks.*;
import models.checks.arbitration.*;
import models.checks.bankruptcy.BankruptDetails;
import models.checks.bankruptcy.BankruptcyCheck;
import models.checks.bankruptcy.BankruptcyProceeding;
import models.checks.commercialactivity.CommercialActivityCheck;
import models.checks.commercialactivity.InvolvedOrganization;
import models.checks.commercialactivity.OrganizationActivity;
import models.checks.courts.*;
import models.checks.fssp.FsspCheck;
import models.checks.rosfinmonitoring.PersonRFMCheck;
import models.checks.rosfinmonitoring.PersonTerroristResult;
import models.checks.rosfinmonitoring.RosfinmonitoringCheck;
import utils.LocalDateDeserializer;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class CheckUtils {

    public static void readChecks() {
        String json = "";

        try (Scanner scanner = new Scanner(new File("response_coincidents_5.json"))) {
            StringBuilder sb = new StringBuilder();
            while(scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            json = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Check check;
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class,
                        new LocalDateDeserializer())
                .registerTypeAdapter(Participant.class,
                        new ParticipantDeserializer())
                .registerTypeAdapter(FirstInstance.class,
                        new FirstInstanceDeserializer())
                .registerTypeAdapter(ComplaintAct.class,
                        new ComplaintActDeserializer())
                .registerTypeAdapter(Complaint.class,
                        new ComplaintDeserializer())
                .registerTypeAdapter(Supervision.class,
                        new SupervisionDeserializer())
                .registerTypeAdapter(Cassation.class,
                        new CassationDeserializer())
                .registerTypeAdapter(Appeal.class,
                        new AppealDeserializer())
                .registerTypeAdapter(PersonRFMCheck.class,
                        new PersonRFMCheckDeserializer())
                .registerTypeAdapter(PersonTerroristResult.class,
                        new PersonTerroristResultDeserializer())
                .registerTypeAdapter(InvolvedOrganization.class,
                        new InvolvedOrganizationDeserializer())
                .registerTypeAdapter(AdministrativeOffencesProceedingDetails.class,
                        new AdministrativeOffencesProceedingDetailsDeserializer())
                .registerTypeAdapter(AdministrativeAndCivilProceedingDetails.class,
                        new AdministrativeAndCivilProceedingDetailsDeserializer())
                .registerTypeAdapter(MaterialsProceedingDetails.class,
                        new MaterialsProceedingDetailsDeserializer())
                .registerTypeAdapter(OrganizationActivity.class,
                        new OrganizationActivityDeserializer())
                .registerTypeAdapter(Analytics.class,
                        new AnalyticsDeserializer())
                .registerTypeAdapter(InstanceDocument.class,
                        new InstanceDocumentDeserializer())
                .registerTypeAdapter(ArbitrationProceedingInstance.class,
                        new ArbitrationProceedingInstanceDeserializer())
                .registerTypeAdapter(ArbitrationProceeding.class,
                        new ArbitrationProceedingDeserializer())
                .registerTypeAdapter(BankruptDetails.class,
                        new BankruptDetailsDeserializer())
                .registerTypeAdapter(BankruptcyProceeding.class,
                        new BankruptcyProceedingDeserializer())
                .registerTypeAdapter(ArbitrationCheckResult.class,
                        new ArbitrationCheckResultDeserializer())

                .registerTypeAdapter(Check.class,
                        new ChecksDeserializer())
                .registerTypeAdapter(FsspCheck.class,
                        new FsspCheckDeserializer())
                .registerTypeAdapter(CourtCheck.class,
                        new CourtCheckDeserializer())
                .registerTypeAdapter(RosfinmonitoringCheck.class,
                        new RosfinmonitoringCheckDeserializer())
                .registerTypeAdapter(CommercialActivityCheck.class,
                        new CommercialActivityCheckDeserializer())
                .registerTypeAdapter(PassportCheck.class,
                        new PassportCheckDeserializer())
                .registerTypeAdapter(SnilsCheck.class,
                        new SnilsCheckDeserializer())
                .registerTypeAdapter(PowerOfAttorneyCheck.class,
                        new PowerOfAttorneyCheckDeserializer())
                .registerTypeAdapter(BankruptcyCheck.class,
                        new BankruptcyCheckDeserializer())
                .registerTypeAdapter(ArbitrationCheck.class,
                        new ArbitrationCheckDeserializer())

                .create();

        check = gson.fromJson(json, Check.class);

        System.out.println(check);

    }
}
