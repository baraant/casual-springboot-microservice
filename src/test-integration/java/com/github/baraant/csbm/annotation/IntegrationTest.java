package com.github.baraant.csbm.annotation;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_CLASS;
import static org.springframework.test.annotation.DirtiesContext.MethodMode.AFTER_METHOD;

@SpringBootTest
@DirtiesContext(classMode = AFTER_CLASS, methodMode = AFTER_METHOD)
public @interface IntegrationTest {
}