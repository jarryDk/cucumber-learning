package cucumber.learning;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber")
@ConfigurationParameter( //
		key = PLUGIN_PROPERTY_NAME, //
		value = "pretty,json:target/cucumber.json,html:target/cucumber-reports.html,rerun:target/rerun.txt")
public class RunCucumberTest {
}
