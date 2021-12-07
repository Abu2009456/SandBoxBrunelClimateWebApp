package com.brunel.climate;


import com.brunel.climate.controller.RegistrationResource;
import org.springframework.data.jpa.repository.JpaRepository;

import com.brunel.climate.model.Fields;
import com.brunel.climate.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;


	@Component // <1>

	public class Preloader implements CommandLineRunner { // <2>

		private final RegistrationRepository repository;

		@Autowired // <3>
		public Preloader(RegistrationRepository repository) {
			this.repository = repository;
		}
	

	
	
		@Override
		public void run(String... strings) throws Exception { // <4>
			this.repository.save(new Fields("Abu", "Osarumwense", "2009456@brunel.ac.uk","123456",  4));
		}
	}
	// end::code[]
	
	
	
	
	
	
	
	
