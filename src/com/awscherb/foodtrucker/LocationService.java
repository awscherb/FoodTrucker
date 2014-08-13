package com.awscherb.foodtrucker;

import java.util.concurrent.ConcurrentHashMap;

public class LocationService {

    public static final ConcurrentHashMap<String, GPSPoint> TABLE;
    
    static {
        TABLE = new ConcurrentHashMap<String, GPSPoint>();
        TABLE.put("(1) Back Bay, Copley Square West at Boylston St",    new GPSPoint(42.359702, -71.057489));
        TABLE.put("(11) South End, Harrison Ave and East Concord St",   new GPSPoint(42.349756, -71.078555));
        TABLE.put("(12) South End, Peters Park on Washington St",   new GPSPoint(42.351232, -71.075511));
        TABLE.put("(18) West End, Blossom St at Emerson Place",     new GPSPoint(42.348642, -71.075452));
        TABLE.put("(2) Back Bay, Copley Square North at Clarendon St",  new GPSPoint(42.345720, -71.082399));
        TABLE.put("(20) Cleveland Circle, Cassidy Park at Beacon St",   new GPSPoint(42.335792, -71.151114));
        TABLE.put("(22) Financial District, Milk and Kilby Streets",    new GPSPoint(42.349168, -71.101303));
        TABLE.put("(23) Chinatown/Park Street, Boylston St near Washington St",     new GPSPoint(42.350952, -71.112708));
        TABLE.put("(24) Financial District, Pearl Street at Franklin",  new GPSPoint(42.336613, -71.073226));
        TABLE.put("(25) Innovation District, Seaport Blvd at Thomson",  new GPSPoint(42.342569, -71.067331));
        TABLE.put("(27) Charlestown Navy Yard at Baxter Road",  new GPSPoint(42.374525, -71.054728));
        TABLE.put("(29) Fenway - Northeastern University on Opera Place at Huntington",     new GPSPoint(42.364257, -71.069117));
        TABLE.put("(3) Back Bay, Copley Square South at Trinity Place",     new GPSPoint(42.357945, -71.055269));
        TABLE.put("(30) Maverick Square at Sumner Street",  new GPSPoint(42.368956, -71.039693));
        TABLE.put("(31) Dudley Square at Dudley street",    new GPSPoint(42.329701, -71.084791));
        TABLE.put("(32) Design Ctr (Innovation and Design Building)",   new GPSPoint(42.344757, -71.030835));
        TABLE.put("(4) Prudential, on Belvidere Street",    new GPSPoint(42.352328, -71.062770));
        TABLE.put("(7) Boston University East, on Commonwealth Ave",    new GPSPoint(42.355817, -71.054552));
        TABLE.put("(8) Boston University West, on Commonwealth Ave",    new GPSPoint(42.352467, -71.046725));
        TABLE.put("City Hall Plaza, Fisher Park",   new GPSPoint(42.340669, -71.089131));
        TABLE.put("Rose Kennedy Greenway, Milk Street by Aquarium",     new GPSPoint(42.358837, -71.051624));
        TABLE.put("Greenway (at High St #1)",   new GPSPoint(42.356567, -71.051290));
        TABLE.put("Rose Kennedy Greenway, Dewey Square, South Station",     new GPSPoint(42.352973, -71.055549));
        TABLE.put("Rose Kennedy Greenway,Congress Street near Wharf",   new GPSPoint(42.353745, -71.053908));
        TABLE.put("SoWa Open Market, 500 Harrison Avenue",  new GPSPoint(42.342431, -71.065451));
    }
    
}
