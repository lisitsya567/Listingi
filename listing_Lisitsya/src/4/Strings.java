public class Strings {
    public static void main(String[] args) {
        String str = "Красота спасет ";
        String sentence = str.concat("мир");

        System.out.println(sentence);
        System.out.println(str);

        String s1 = "Произвольная строка символов - ";
        String s2 = "Присоединенная строка";
        String s3 = s1 + s2;

        StringBuffer sb = new StringBuffer();
        sb.append("Произвольная строка - ");
        sb.append("Присоединенная строка");
        s3 = sb.toString();

        // StringBuffer
        sb = new StringBuffer(52);
        sb.append("Произвольная строка - ");
        sb.append("Присоединенная строка");
        s3 = sb.toString();

        // Извлечение части строки
        int start = 6;
        int end = 11;
        String greetings = "Hello World!";
        String substr  = greetings.substring(start, end);
        System.out.println(substr);

        // Поиск текста
        int index;
        greetings = "Hello World!";
        index = greetings.indexOf("e");
        index = greetings.lastIndexOf("o");
        index = greetings.lastIndexOf("x");

        // Проверка на наличие записи в начале или в цонуе текста
        str = "Hello from Universe";
        boolean result;
        result = str.startsWith("Hell");
        result = str.endsWith("Universe");

        // Извлечение символа из строки
        char c = greetings.charAt(6);

        // Замена символов в строке
        String newString = greetings.replace("0", "a");

        // Изменение регистра всех букв в строке
        greetings = "Hello World";
        String lower = greetings.toLowerCase();
        String upper = greetings.toUpperCase();

        // Слияние строк
        greetings = "Hello";
        greetings += " ";
        greetings.concat("World!");

        // Преобразование строки в числовой тип
        double d = Double.parseDouble("421.5e10");
        float f = Float.parseFloat("421.5");
        long l = Long.parseLong("421");
        int i = Integer.parseInt("421");

        // перевод текста в кодировку Unicode и UTF-8
        try {
            String string = "abc\u5639\u563b";
            byte[] utf8 = string.getBytes("UTF-8");

            string = new String(utf8, "UTF-8");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    // Замена части строки
    static String replace(String str, String pattern, String replace) {
        int start = 0;
        int pos = 0;
        StringBuffer result = new StringBuffer();

        while ((pos = str.indexOf(pattern, start)) >= 0) {
            result.append(str.substring(start, pos));
            result.append(replace);
            start = pos + pattern.length();
        }

        result.append(str.substring(start));
        return result.toString();

    }
}