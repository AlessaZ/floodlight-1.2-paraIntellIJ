package net.floodlightcontroller.mactracker;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.util.ArrayList;
import java.util.List;

public class MACTrackerHistoryResource extends ServerResource {
    @Get("json")
    public List<MACTrackerClass> retrieve() {
        MACTrackerHistoryService macT= (MACTrackerHistoryService) getContext().getAttributes().get(MACTrackerHistoryService.class.getCanonicalName());
        List<MACTrackerClass> l = new ArrayList<MACTrackerClass>();
        l.addAll((macT.getListAdresses()));
        return l;
    }
}
