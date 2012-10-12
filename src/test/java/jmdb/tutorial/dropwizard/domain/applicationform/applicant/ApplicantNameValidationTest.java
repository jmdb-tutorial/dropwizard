package jmdb.tutorial.dropwizard.domain.applicationform.applicant;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.constraint.Assert;
import net.sf.oval.constraint.MinLength;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.expression.ExpressionLanguageGroovyImpl;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class ApplicantNameValidationTest {

        @Test
        public void should_(){
            ApplicantName applicantName = new ApplicantName("","COWIE", null, null);

            Validator validator = new Validator();
            List<ConstraintViolation> violations = validator.validate(applicantName);

            logViolations(violations);
        }

        @Test
        public void should_test_password_violation(){
            Password p = new Password("password", "password");
            Validator validator = new Validator();
            validator.getExpressionLanguageRegistry().registerExpressionLanguage("groovy", new ExpressionLanguageGroovyImpl());
            List<ConstraintViolation> violations = validator.validate(p);
            assertEquals(1, violations.size());
            logViolations(violations);
        }

    private void logViolations(List<ConstraintViolation> violations) {
        if(!violations.isEmpty()) {
            for(ConstraintViolation violation : violations) {
                System.out.println(violation.toString());
            }
        }
    }

    private class Password {
        @NotNull
        @MinLength(6)
        private String password;
        @NotNull
        @Assert(expr = "_this.password == _this.confirmPassword",  lang = "groovy", message="Password confirmation does not match password")
        private String confirmPassword;

        private Password(String password, String confirmPassword) {
            this.password = password;
            this.confirmPassword = confirmPassword;
        }
    }
}
