public class ExtraHWallweneed {
    public static void main(String[] args) {
        String[] wlone = {"круглосуточный","трех=звездный","полторы тонны","взаимный","обоюдный выигрыш", //wordListone
                "фронтенд","на основе веб-технологий","проникающий","умный","шесть сигм","динамичный"};
        String[] wltwo = {"уполномоченный", "трудный","чистый продукт","ориентированный", "цунтральный",//wordListtwo
                "распределенный", "класстиризованный","фирменный","нестандартный ум", "позиционный"," сетевой","неровный"};
        String[] wlthree ={"процесс","пункт загрузки","выход из положения","тип структуры","талант","подход","портал"};
        //Вычисляем, сколько слов в каждом списке                                                                             "путь наследования"};//wordListthree
        int wl1 = wlone.length;
        int wl2 = wltwo.length;
        int wl3 = wlthree.length;
        //Гененрируем 3 случайных числа
        int rand1 = (int) (Math.random()*wl1);
        int rand2 = (int) (Math.random()*wl2);
        int rand3 = (int) (Math.random()*wl3);
        //Теперь строим фразу
        String phrase = wlone[rand1]+" "+wltwo[rand2]+" "+wlthree[rand3];
        //Выведу на экран что у меня получилось
        System.out.println("Все, что в этой жизни нам нужно, - это"+" "+phrase);

    }

}