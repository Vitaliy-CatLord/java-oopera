public class Theatre {

    public static void main(String[] args) {
        //1 создание всех актеров, режисеров, авторов музыки, хореографов
        Actor anatoliy = new Actor("Anatoliy", "Afanasiev", Gender.MALE , 175);
        Actor boris = new Actor("Boris", "Bodrov", Gender.MALE , 180);
        Actor carmen = new Actor("Carmen", "Covrizko", Gender.FEMALE , 160);

        Director directorD = new Director("David", "Dublin", Gender.MALE , 10);
        Director directorE = new Director("Elena", "Ermolina", Gender.FEMALE , 18);

        MusicAuthor musicAuthor = new MusicAuthor("Hans", "Cimer", Gender.MALE);
        Choreografer choreografer = new Choreografer("Tatyana", "Tarasova", Gender.FEMALE);

        //2 создание спектакля, оперы, балета
        Show show = new Show("Morozko", 90, directorD);
        Opera opera = new Opera("Carmen", 120, directorE, musicAuthor, "Libretto of Opera", 10);
        Ballet ballet = new Ballet("Don Kihot", 100, directorE, musicAuthor, "Libretto of Ballet", choreografer);

        //3 распределение актеров по спектаклям
        show.addActor(anatoliy);
        show.addActor(boris);

        // проверки, что такой же не добавляется такой же актер
        show.addActor(boris);
        Actor borya = new Actor("Boris", "Bodrov", Gender.MALE , 180);
        show.addActor(borya);

        opera.addActor(anatoliy);
        opera.addActor(boris);
        opera.addActor(carmen);

        ballet.addActor(boris);
        ballet.addActor(carmen);

        //4 распечатка актерского состава
        System.out.print("\nСпекталь ");
        show.printActors();
        System.out.println("\nОпера ");
        opera.printActors();
        System.out.println("\nБалет ");
        ballet.printActors();

        //5 замена Бориса на Анатолия в балете
        ballet.changeActor(boris, anatoliy);
        System.out.println("\nБалет ");
        ballet.printActors();

        //6 замена несуществующего(неучаствующего?) актера
        show.changeActor(carmen, boris);

        //7 распечатка либретто
        System.out.println();
        opera.printLibletto();
        ballet.printLibletto();

        //распечатка режисера
        System.out.println();
        System.out.println(opera.director);


    }

}
