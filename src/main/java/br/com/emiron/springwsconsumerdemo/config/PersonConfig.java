package br.com.emiron.springwsconsumerdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import br.com.emiron.springwsconsumerdemo.client.PersonClient;

@Configuration
public class PersonConfig{

     @Bean
     public Jaxb2Marshaller marshaller(){
          Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
          // this package must match the package in the <generatePackage>
          // specified in
          // pom.xml
          marshaller.setContextPath("br.com.emiron.person");
          return marshaller;
     }

     @Bean
     public PersonClient quoteClient(Jaxb2Marshaller marshaller){
          PersonClient person = new PersonClient();
          person.setDefaultUri("http://localhost:8089/ws/person");
          person.setMarshaller(marshaller);
          person.setUnmarshaller(marshaller);
          return person;
     }

}
