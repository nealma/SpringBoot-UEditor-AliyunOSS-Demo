package com.nealma.ext.ueditor.demo.ueditordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nealma")
public class UeditorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UeditorDemoApplication.class, args);
	}
}
