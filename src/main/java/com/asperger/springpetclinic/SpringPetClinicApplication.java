package com.asperger.springpetclinic;

import com.asperger.springpetclinic.controller.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =
				SpringApplication.run(SpringPetClinicApplication.class, args);

		PetController petControllerBean =  (PetController) ctx.getBean(
				"petController");
		System.out.println(petControllerBean.whichPetIsTheBest());
	}

}
