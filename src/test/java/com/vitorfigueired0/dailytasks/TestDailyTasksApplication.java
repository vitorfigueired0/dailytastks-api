package com.vitorfigueired0.dailytasks;

import org.springframework.boot.SpringApplication;

public class TestDailyTasksApplication {

	public static void main(String[] args) {
		SpringApplication.from(DailyTasksApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
