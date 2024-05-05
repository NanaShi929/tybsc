import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({ Square_Area_Test.class, Square_Perimeter_Test.class })
public class AllTests {

}
