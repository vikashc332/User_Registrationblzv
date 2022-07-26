
public class UserDetailsRegexPattern {
    public static String FIRST_NAME_LAST_NAME = "^[A-Z][a-z]{2,}$";
    public static String EMAIL = "^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$";
    public static String PHONE_NUMBER = "^([1-9]+[0-9]+)[\\s][0-9]{10}$";
    public static String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.*[%^<>?/:'}{()*!|.,;_#&$+=@]).{8,}$";
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
S
