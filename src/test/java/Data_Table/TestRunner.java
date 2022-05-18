package Data_Table;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeaturesFiles\\DataTableDemo.feature",glue= {"Data_Table"})
public class TestRunner {

}
   