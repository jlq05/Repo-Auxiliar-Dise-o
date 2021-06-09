package FormaDeNotificacion;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;

public class FormaDeNotificacionSMS {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC505aeb6bc43d8ff59a5080301c8820b9";
    public static final String AUTH_TOKEN = "e0be12c170a4552a9b956513227ede90";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+541132510242"),
                "MG20320224f8a816340537484f051241f8",
                "hola mundo peoplo")
                .create();

        System.out.println(message.getSid());
    }
}
