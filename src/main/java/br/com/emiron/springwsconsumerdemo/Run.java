package br.com.emiron.springwsconsumerdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.emiron.person.GetPersonResponse;
import br.com.emiron.springwsconsumerdemo.client.PersonClient;
import br.com.emiron.springwsconsumerdemo.config.PersonConfig;

public class Run{

     public static void main(String[] args){
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
          PersonClient client = context.getBean(PersonClient.class);
          GetPersonResponse response = client.getPerson("33989082841");
          System.out.println("Person response: " + response.getPerson().getName());
     }

}
