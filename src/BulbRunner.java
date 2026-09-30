import com.xworkz.bulbapp.bulb.Bulb;
import com.xworkz.bulbapp.bulb.cfl.Cfl;
import com.xworkz.bulbapp.bulb.halogen.Halogen;
import com.xworkz.bulbapp.bulb.incandescent.Incandescent;
import com.xworkz.bulbapp.bulb.led.Led;
import com.xworkz.bulbapp.bulb.oled.Oled;
import com.xworkz.bulbapp.bulb.tubelight.TubeLight;

public class BulbRunner {
    public static void main(String[] args) {
    Bulb bulb = new Cfl();
    bulb.provideLight();

    Bulb bulb1= new Halogen();
    bulb1.provideLight();

    Bulb bulb2 = new Led();
    bulb2.provideLight();

    Bulb bulb3= new Oled();
    bulb3.provideLight();

    Bulb bulb4= new Incandescent();
    bulb4.provideLight();

    Bulb bulb5= new TubeLight();
    bulb5.provideLight();

    }
}
