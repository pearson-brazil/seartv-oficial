package br.com.pearson.seartv;

/**
 * Created by Willian on 17/01/2017.
 */

public class Utils {

    public static String getGoogleUrlToSearchPerson(String name) {
        String url = "https://www.google.com.br/#q=";
        url = url + name.toLowerCase().replace(" ", "+");
        return url;
    }

}
