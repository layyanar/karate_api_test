package karatetest;

import com.intuit.karate.KarateOptions;
//import org.junit.runner.RunWith;

/*@RunWith(Karate.class)
@KarateOptions(features = "classpath:src/main/java/feature/CountryTest.feature")
public class APITestRunner {

}*/

import com.intuit.karate.junit5.Karate;

public class APITestRunner {

    @Karate.Test
    Karate testSample() {
        return new Karate().feature("CountryTest").relativeTo(getClass());
    }

    @Karate.Test
    Karate testTags() {
        return new Karate().feature("tags").tags("@second").relativeTo(getClass());
    }

    @Karate.Test
    Karate testFullPath() {
        return new Karate()
                .feature("classpath:karate/tags.feature").tags("@first")
                .tags("@first");
    }

}