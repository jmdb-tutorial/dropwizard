package jmdb.tutorial.dropwizard.app.applicationform;

import jmdb.tutorial.dropwizard.app.FreemarkerView;
import jmdb.tutorial.dropwizard.domain.applicationform.applicant.ApplicantName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import static org.slf4j.LoggerFactory.getLogger;

@Path("/applicationform")
@Produces(MediaType.TEXT_HTML)
public class ApplicationFormResource {

    private static final Logger log = getLogger(ApplicationFormResource.class);

    @GET
    public FreemarkerView blankApplicationForm() {
        return new FreemarkerView("applicationform/applicationForm.ftl");
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void submitApplication(ApplicantName applicantName) {

        log.info(applicantName.toString());

    }
}