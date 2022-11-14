package net.floodlightcontroller.mactracker;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class MACTrackSerializable extends JsonSerializer<net.floodlightcontroller.mactracker.MACTrackerClass> {
    @Override
    public void serialize(net.floodlightcontroller.mactracker.MACTrackerClass macTrack, JsonGenerator jGen, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jGen.writeStartObject();
        jGen.writeStringField("mac_address", macTrack.getMacAddress());
        jGen.writeStringField("attachment_point", macTrack.getAttachmentPoint());
        jGen.writeEndObject();
    }
}
