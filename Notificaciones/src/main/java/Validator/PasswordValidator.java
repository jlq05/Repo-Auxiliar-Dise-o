package Validator;

import importerTXT.ImporterTXT;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class PasswordValidator {

    private ImporterTXT importerTXT;

    public Boolean validate(String pass, Boolean randomGeneration) throws IOException {
        int passLength = 8;
        if(randomGeneration) {
            passLength = 6;
        }
        List<String> worstPasswords = importerTXT.take10000WorstPass("C:\\top10000-worst-passwords.txt");
        Collections.sort(worstPasswords);
        return !(worstPasswords.contains(pass) || pass.length() < passLength || pass.length() > 64);
        // return !(worstPasswords.contains(pass) || checkLength(pass, passLength));
    }

    private Boolean checkLength(String pass, int minLength) {
        return (pass.length() > minLength && pass.length() < 64);
    }

}