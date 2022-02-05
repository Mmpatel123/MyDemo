import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

 @RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        dryRun = false,
        strict = true,
        tags =  "@smoke",
        plugin = "json:target/cucumber-report/cucumber.json")

public class RunCukesTest {
// a json report is generated as target/cucumber-report
    //open maven tab and click 'execute maven goal'
    //enter 'cluecumber-report:reporting' and click ok to build
    //report will generated in target folder as generated-report
    //to run from intellij
    //copy this code in edit configuration
    //-ea
    //-Durl="https://www.argos.co.uk"
    //-Dinstance="chrome"
    //-Dcucumber.options="--tags @nk"
    //to run from maven-execute maven goal and from terminal
    // mvn -Durl="https://www.argos.co.uk" -Dinstance=chrome -Dcucumber.options="--tags @nk" test
}



