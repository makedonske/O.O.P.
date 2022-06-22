import java.util.Arrays;

public class Task6 {

    /*1. Число Белла - это количество способов, которыми массив из n элементов может
    быть разбит на непустые подмножества. Создайте функцию, которая принимает
    число n и возвращает соответствующее число Белла.*/

    public static int bell(int num) {
        int[][] mass = new int[num + 1][num + 1];
        int sum = 0;
        mass[0][0] = 1;
        mass[num][num] = 1;
        for (int n = 1; n <= num; n++) {
            for (int i = 1; i < num; i++) {
                mass[n][i] = mass[n - 1][i - 1] + i * mass[n - 1][i];
            }
        }
        for (int i = 0; i <= num; i++) sum += mass[num][i];
        return sum;
    }

    /* 2. В «поросячей латыни» (свинский латинский) есть два очень простых правила:
            – Если слово начинается с согласного, переместите первую букву (буквы) слова до
    гласного до конца слова и добавьте «ay» в конец.*/

    public static String translateWord(String word){
        if (word.matches("[aeiouy]")) {
            word += "yay";
        }
        else {
            String newWord = word.split("[aeiouy]")[0];
            word = word.replaceFirst(newWord,"")+newWord+"ay";
        }
        return word;
    }

    public static String translateSentence(String word){
        String vow = "aeiouyAEIOUY";
        String[] newword = word.substring(0, word.length()-1).split(" ");
        word = "";
        for (int i = 0 ; i < newword.length; i++) {
            for (int j = 0; j < vow.length(); j++) {
                if (vow.indexOf(newword[i].charAt(j)) != -1) {
                    word += newword[i] + "yay ";
                    break;
                }
                else {
                    String newWord = newword[i].split("[aeiyouAEIYOU]")[0];
                    word += newword[i].replaceFirst(newWord, "") + newWord + "ay ";
                    break;
                }
            }
        }
        return word + ".";
    }

    /* 3. Учитывая параметры RGB (A) CSS, определите, является ли формат принимаемых
    значений допустимым или нет. Создайте функцию, которая принимает строку
            (например, " rgb(0, 0, 0)") и возвращает true, если ее формат правильный, в
    противном случае возвращает false.*/

    public static boolean validColor (String rgb){
        int num = rgb.indexOf('(');
        if (rgb.contains(" "))
            return false;
        String [] newrgb = rgb.substring(rgb.indexOf('(')+1,rgb.indexOf(')')).split(",");
        double [] n = new double [num];
        for (int i = 0 ; i < num; i++) {
            n[i] = Double.parseDouble(newrgb[i]);
            System.out.println(newrgb[i]);
        }
        for (int i = 0 ; i < num; i++) {
            if (n[i] >= 0 && n[i] <= 255 && num == newrgb.length)
                return true;
            else
                return false;
        }
        return false;
    }

    /* 4. Создайте функцию, которая принимает URL (строку), удаляет дублирующиеся
    параметры запроса и параметры, указанные во втором аргументе (который будет
    необязательным массивом).*/

    // https://edabit.com?a=1&b=2&a=2

    public static String stripUrlParams(String url, String ... parameters){
        String str = " ";
        if (!url.contains("?"))
            return url;
        else if(url.indexOf("?")!= url.length()){
            str = url.substring(url.indexOf("?")+1);
            url = url.substring(0, url.indexOf("?"));
        }
        return str;
    }

    /* 5. Напишите функцию, которая извлекает три самых длинных слова из заголовка
    газеты и преобразует их в хэштеги. Если несколько слов одинаковой длины,
    найдите слово, которое встречается первым.*/

    public static String [] getHashTags(String str){
        String[] hashtags = new String[]{""};
        return hashtags;
    }

    /* 6.Создайте функцию, которая принимает число n и возвращает n-е число в
    последовательности Улама.*/

    public static int ulma ( int n){
        return n;
    }

    /* 9. Создайте функцию, которая принимает строку и возвращает true или false в
    зависимости от того, является ли формула правильной или нет. */

    public static boolean formula (String formula){
        int ans = Integer.parseInt(formula.substring(formula.indexOf('=')));
        switch (formula){

        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("№ 1. " + bell(3));
        System.out.println("№ 2.1 " + translateWord("trebuchet"));
        System.out.println("№ 2.2 " + translateSentence("I like to eat honey waffles."));
        System.out.println("№ 3. " + validColor("rgba(0,0,0,0.123456789)"));
    }
}
