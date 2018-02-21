package kz.epam.util;

import java.util.Base64;

/**
 * @author Artyom Revinov
 */
public class Converter {

    public String convertToString(byte[]data){
        if (data != null) return Base64.getEncoder().encodeToString(data);
        else return  "";
    }

}
