package aworkout;

public class lesson2ForWhileDowhile {

    public static void main(String[] args){

//        for (int i = 1; i <= 10; i+=2) {
//            System.out.println("for = " + i);
//        }


//        int j = 0;              // пример с типо данных boolean
//        boolean isTrue = true;
//        while(isTrue) {
//            System.out.println("While = " + j);
//            j += 2;
//            if (j > 10)
//                isTrue = false; // можно заменить break;
//        }
        int j = 0;       // пример с числами
        while(j < 100) {
            j++;
            if (j % 2 == 0)
                continue;
            System.out.println("While = " + j);
        }
//
//        int x = 0;
//        do {
//            x++;
//            System.out.println("Do While = " + x);
//        } while (x < 10);
//
//
//        }
//        }
    }}