package string;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
  public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dictionary = new HashSet<>(wordDict);

//         int temp = 0;

//         for (int i = 1; i <= s.length(); i++) {
//             if (i == s.length() && !dictionary.contains(s.substring(temp, i))) {
//                 return false;
//             }
//             System.out.println(s.substring(temp, i));
//             if (dictionary.contains(s.substring(temp, i))) temp = i;
//         }

//         return true;

		if(s.isEmpty()){
		    return true;
	    }
	    //break the string at i+1 such that prefix text[...i] is in dict and suffix text[i+1...] is breakable
	    for(int i = 0; i<s.length(); i++){
		    if(dictionary.contains(s.substring(0, i+1)) && wordBreak(s.substring(i+1), dictionary.toArray(dictionary.size()))) {
			    return true;
		    }
	    }

	return false;
    }
}
