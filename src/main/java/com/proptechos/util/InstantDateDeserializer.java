package com.proptechos.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InstantDateDeserializer extends JsonDeserializer<Date> {

  private static final Logger log
      = Logger.getLogger(InstantDateDeserializer.class.getName());

  private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

  @Override
  public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException {
    ObjectCodec oc = jsonParser.getCodec();
    JsonNode node = oc.readTree(jsonParser);
    if (node.get("$numberLong") != null) {
      long dateAsInstant = node.get("$numberLong").asLong();
      return dateAsInstant > 0 ? new Date(dateAsInstant) : null;
    } else {
      String dateAsString = node.asText();

      try {
        return formatter.parse(dateAsString);
      } catch (ParseException e) {
        log.log(Level.WARNING, "Couldn't parse date: " + dateAsString);
        return null;
      }
    }
  }
}
