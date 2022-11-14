package net.floodlightcontroller.mactracker;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = net.floodlightcontroller.mactracker.MACTrackSerializable.class)
public class MACTrackerClass {
    protected final String macAddress;
    protected final String attachmentPoint;


    public MACTrackerClass(String macAddress, String attachmentPoint) {
        this.macAddress = macAddress;
        this.attachmentPoint = attachmentPoint;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getAttachmentPoint() {
        return attachmentPoint;
    }
}
