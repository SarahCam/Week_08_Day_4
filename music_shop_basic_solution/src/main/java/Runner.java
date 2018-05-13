import db.DBHelper;
import models.Guitar;
import models.MusicBook;
import models.MusicStand;
import models.Piano;
import sun.security.pkcs11.Secmod;

public class Runner {

    public static void main(String[] args) {

        Guitar guitar = new Guitar("Fender", "black", 6, 600, 800);
        DBHelper.saveOrUpdate(guitar);

        Piano piano = new Piano("Steinway", "White", 1000, 1500);
        DBHelper.saveOrUpdate(piano);

        MusicBook musicBook = new MusicBook("Beethoven", 10, 20);
        DBHelper.saveOrUpdate(musicBook);

        MusicStand musicStand = new MusicStand("Blue", 20, 30);
        DBHelper.saveOrUpdate(musicStand);

        int guitarId = guitar.getId();

        Guitar foundGuitar = DBHelper.find(Guitar.class, guitar.getId());
        Piano foundPiano = DBHelper.find(Piano.class, piano.getId());

    }
}
