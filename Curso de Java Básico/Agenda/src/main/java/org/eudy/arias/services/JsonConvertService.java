package org.eudy.arias.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonConvertService {
    private static ObjectMapper mapper = new ObjectMapper();
    //private static Logger logger = LoggerFactory.getLogger(JsonConvert.class);
    public static <T> String serialize(T object) {
        String data = null;
        try {
            data = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            System.out.println ("Error en el proceso de serializacion. Detalles: " + e.getMessage());
        }
        return data;
    }
    public static <T> T deserialize(String json, Class<T> type) {
        T data = null;
        try {
            data = mapper.readValue(json, type);
        } catch (IOException e) {
            System.out.println ("Error en el proceso de deserializacion. Detalles: " + e.getMessage());
        }
        return data;
    }
}
