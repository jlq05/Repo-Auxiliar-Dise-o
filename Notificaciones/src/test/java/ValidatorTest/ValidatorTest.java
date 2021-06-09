package ValidatorTest;

import org.junit.Assert;
import org.junit.Test;
import Validator.PasswordValidator;

import java.io.IOException;

public class ValidatorTest {

    private String password;
    private PasswordValidator validator;

    @Test
    public void comprobarContraseniaValida() throws IOException {
        this.password = "myPassIsStrong123";
        // Contraseña que sé que NO está en mi archivo del top 10000 peores contraseñas
        // Assert.assertEquals(result, true);
        Assert.assertTrue(this.validator.validate(password, false));
    }

    @Test
    public void comprobarContraseniaErronea() throws IOException {
        this.password = "password";
        // Contraseña que sé que SI está en mi archivo del top 10000 peores contraseñas
        Assert.assertEquals(this.validator.validate(this.password, false), false);
    }

}
