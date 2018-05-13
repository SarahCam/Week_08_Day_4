import db.DBHelper;
import models.Guitar;
import models.MusicBook;
import models.MusicStand;
import models.Piano;

public class Runner {

    public static void main(String[] args) {
        Guitar guitar = new Guitar("Fender", "White", 6, 500, 700);
        Piano piano = new Piano("Yamaha", "HotPink", 1000, 1500);
        MusicStand musicStand = new MusicStand("Blue", 4, 6);
        MusicBook musicBook = new MusicBook("Learn music", 5, 10);

        DBHelper.saveOrUpdate(guitar);
        DBHelper.saveOrUpdate(piano);
        DBHelper.saveOrUpdate(musicStand);
        DBHelper.saveOrUpdate(musicBook);

        Guitar foundGuitar = DBHelper.find(Guitar.class, guitar.getId());
        Piano foundPiano = DBHelper.find(Piano.class, piano.getId());
        MusicStand foundStand = DBHelper.find(MusicStand.class, musicStand.getId());
        MusicBook foundBook = DBHelper.find(MusicBook.class, musicBook.getId());
    }
}
