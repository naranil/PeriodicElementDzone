/**
 * Created by anilnarassiguin on 09/08/16.
 */

import java.util.*;

public class PeriodicElement {

    public String elementName = "";

    // constructor
    public PeriodicElement(String elementName) {
        this.elementName = elementName;
    }

    protected List<Character> getElementCharList() {
        List<Character> characterList = new ArrayList<Character>();
        for (char c : elementName.toLowerCase().toCharArray()){
            characterList.add(c);
        }
        return characterList;
    }

    // get symbol
    protected List<Character> getSymbol() {

        List<Character> characterList = getElementCharList();
        int min = 0;
        int max = characterList.size();

        int firstPosition = min + (int)(Math.random() * ((max - min)));
        Character firstCharacter = characterList.get(firstPosition);
        min = firstPosition;

        int secondPosition = min + (int)(Math.random() * ((max - min)));
        Character secondCharacter = characterList.get(secondPosition);

        String finalSymbol = firstCharacter.toString().toUpperCase() + secondCharacter.toString().toLowerCase();
        //return finalSymbol;
        return characterList;

    }

    // check if symbol correct
    protected boolean checkSymbol(String symbol) {
        if (symbol.length() == 2) {
            List<Character> characterList = getElementCharList();
            int max = characterList.size();
            Character firstCharacter = symbol.toLowerCase().charAt(0);
            Character secondCharacter = symbol.toLowerCase().charAt(1);

            if (characterList.contains(firstCharacter) && characterList.contains(secondCharacter)) {
                int firstPosition = characterList.indexOf(firstCharacter);
                List<Character> remainingList = new ArrayList<Character>();

                for (int i = firstPosition + 1; i < max; i++) {
                    remainingList.add(characterList.get(i));
                }

                if (remainingList.contains(secondCharacter)) {
                    return true;
                }

            }

        }

        return false;
    }
}
