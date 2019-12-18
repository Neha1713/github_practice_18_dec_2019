package com.cucumber_17dec_pack1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
	features="Feature"
			,glue={"step_definition"}
)
public class TestRunner {

}
