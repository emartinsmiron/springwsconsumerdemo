package br.com.emiron.springwsconsumerdemo.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.emiron.person.GetPersonRequest;
import br.com.emiron.person.GetPersonResponse;

public class PersonClient extends WebServiceGatewaySupport{
     public GetPersonResponse getPerson(String id){
          GetPersonRequest request = new GetPersonRequest();
          request.setId(id);

          GetPersonResponse response = (GetPersonResponse) this.getWebServiceTemplate().marshalSendAndReceive(request);

          return response;

     }
}
