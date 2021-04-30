package karatetest;

/*import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "classpath:src/main/java/feature/CountryTest.feature")
public class APITestRunner {

}*/

import com.intuit.karate.junit5.Karate;

public class APITestRunner {

    @Karate.Test
    Karate testSample() {
        return Karate.run("CountryTest").relativeTo(getClass());

    }

    @Karate.Test
    Karate testTags() {
        return Karate.run("tags").tags("@second").relativeTo(getClass());
    }

    @Karate.Test
    Karate testFullPath() {
         return Karate.run("classpath:karate/tags.feature")
                .tags("@first")
                .karateEnv("e2e")
                .systemProperty("foo", "bar");
    }

}
