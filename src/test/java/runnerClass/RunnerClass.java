package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/java/com/example/example1/sample.feature"},
    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/report.html"},
    glue = "com.example.example1",
    monochrome = true
    )
public class RunnerClass{

}
