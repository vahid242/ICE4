package ice4;

public class Ice4 {
    public static void main(String[] args) {      
        System.out.println(iteration('a', "benanna"));
        System.out.println(occurrences('a', 'n', "benanna"));
        System.out.println(specified('a', "benanna"));
    }
    
    public static int iteration(char letter, String word){
        int sum=0;
        char[] arr=word.toCharArray();
        for(char c:arr){
            if(c == letter){
                sum++;
            } 
        }
        return sum;
    }
    
    public static char occurrences(char firstLetter,char secondLetter, String word){
        char letter='$';
        int firstSum=0;
        int secondSum=0;
        char[] arr=word.toCharArray();
        for(char c:arr){
            if(c == firstLetter){
                firstSum++;
            }
            else if(c == secondLetter){
                secondSum++;
            }
        }
        if(firstSum > secondSum){
            letter =  firstLetter;
        }
        else if(secondSum > firstSum){
            letter =  secondLetter;
        }
        return letter;
    }
    
    public static boolean specified(char letter, String word){
        boolean exsist = false;
        char[] arr=word.toCharArray();
        for(char c:arr){
            if(c == letter){
                exsist = true;
            } 
        }
        return exsist;
    }
    
}
