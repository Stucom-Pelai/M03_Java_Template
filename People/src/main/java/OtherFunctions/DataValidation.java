/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OtherFunctions;

/**
 *
 * @author Fran Perez
 */
public class DataValidation {

    public static boolean validateNifNumber(char c) {
        return (48 <= c && c <= 57);
    }

    public static boolean validateNameLetter(char c) {
        //The name can contain uppercase and lowercase letters, whitespace, 
        //hyphens and code control
//        return (97 <= c && c <= 122) || (65 <= c && c <= 90) || (c == 32) || (c == 45);
        return Character.isLetter(c) || c==32 || c==45;
    }

    public static String calculateNifLetter(String nifNoLetter) {
        String [] letter = {"T","R","W","A","G","M","Y","F","P","D","X","B",
            "N","J","Z","S","Q","V","H","L","C","K","E"};
        return nifNoLetter + letter[Integer.parseInt(nifNoLetter)%23];
    }

}
