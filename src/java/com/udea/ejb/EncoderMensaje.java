/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.model.Mensaje;
import java.io.IOException;
import java.io.Writer;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import javax.websocket.Encoder;
import javax.websocket.EncodeException;
import javax.websocket.EndpointConfig;

/**
 *
 * @author Andres
 */
public class EncoderMensaje implements Encoder.TextStream<Mensaje>{

 @Override
 public void encode (Mensaje object, Writer writer)throws EncodeException, IOException{
   JsonObject json = Json.createObjectBuilder()
      .add("mensaje",object.getMensaje())
      .add("nombre", object.getNombre())
        .build();

 try(JsonWriter jsonWriter = Json.createWriter(writer)){
      jsonWriter.writeObject(json);
     }

  }
   @Override
   public void init(EndpointConfig config){}
    
   @Override
   public void destroy(){}

}
