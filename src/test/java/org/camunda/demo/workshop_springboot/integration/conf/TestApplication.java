package org.camunda.demo.workshop_springboot.integration.conf;

import org.camunda.demo.workshop_springboot.CamundaApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {CamundaApplication.class})
@EnableAutoConfiguration
@TestConfiguration
public class TestApplication {

}
