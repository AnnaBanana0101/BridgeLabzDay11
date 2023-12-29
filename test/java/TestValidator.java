import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class TestValidator {
    
        //Name
    @Test
    public void validateNameHappy()
    {
        String name = "Anika Shukla";
        String valid_name = "^[A-Z][a-zA-Z]{2,}[\\s][A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(valid_name);
        Matcher matcher = pattern.matcher(name);
        assertTrue(matcher.matches());
    }

    @Test
    public void validateNameSad()
    {
        String name = "abchukla";
        String valid_name = "^[A-Z][a-zA-Z]{2,}[\\s][A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(valid_name);
        Matcher matcher = pattern.matcher(name);
        assertTrue(matcher.matches());
    }

    //Email
    @Test
    public void validateEmailHappy()
    {
        String email = "abc@gmail.com";
        String valid_email = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(.[a-zA-Z]{2,})*$";
        
        Pattern pattern = Pattern.compile(valid_email);
        Matcher matcher = pattern.matcher(email);
        assertTrue(matcher.matches());

    }

    @Test
    public void validateEmailSad()
    {
        String email = "abcgmail.com";
        String valid_email = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(.[a-zA-Z]{2,})*$";
        
        Pattern pattern = Pattern.compile(valid_email);
        Matcher matcher = pattern.matcher(email);
        assertTrue(matcher.matches());

    }

    //Phone Number

    @Test
    public void validateNumberHappy()
    {
        String number = "91 9152221342";
        String valid_number = "^[0-9]{2}\\s[0-9]{10}$";

        Pattern pattern = Pattern.compile(valid_number);
        Matcher matcher = pattern.matcher(number);
        assertTrue(matcher.matches());
    }

    @Test
    public void validateNumberSad()
    {
        String number = "9115222134";
        String valid_number = "^[0-9]{2}\\s[0-9]{10}$";

        Pattern pattern = Pattern.compile(valid_number);
        Matcher matcher = pattern.matcher(number);
        assertTrue(matcher.matches());
    }

    //Password

    @Test
    public void validatePasswordHappy()
    {
        String pass = "abcA9#gc6";
        String valid_pass = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$).{8,}";

        Pattern pattern = Pattern.compile(valid_pass);
        Matcher matcher = pattern.matcher(pass);
        assertTrue(matcher.matches());
    }

    @Test
    public void validatePasswordSad()
    {
        String pass = "abcA#gcb";
        String valid_pass = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$).{8,}";

        Pattern pattern = Pattern.compile(valid_pass);
        Matcher matcher = pattern.matcher(pass);
        assertTrue(matcher.matches());
    }
}
