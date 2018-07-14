package com.pranav.demospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

//@ComponentScan(basePackages= {"com.pranav.demospring"})
public class AppConfig {
	@Bean(name="alien")
	@Primary
	public Buyer getBuyer() {
		Buyer obj=new Buyer();
		obj.setPname("ravi");
	    //obj.setLap(getLaptop());
		return obj;
			}
	@Bean(name="laptop")
	@Primary
	public Computer getLaptop() {
		Computer lap1=new Laptop();

		lap1.setBrand("lenova");
		lap1.setPrice(600);
		return lap1;
	}
	@Bean(name="desktop")
	@Primary
	public Computer getDesktop() {
		Computer desk1=new Desktop();

		desk1.setBrand("sony");
		desk1.setPrice(600);
		return desk1;
	}
	

}
