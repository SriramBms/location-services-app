package edu.buffalo.cse.locationapp.entity;

public class Location
{
    private int m_ID;
    private String m_Tag;
    private int m_xLocation;
    private int m_yLocation;
    private int m_MapID = 1;
    private int m_projectID = 1;

    public Location()
    {
    	this.m_Tag = "";
        this.m_xLocation = 0;
        this.m_yLocation = 0;
        this.m_MapID = 1;
        this.m_projectID = 1;
    }
 
    public Location(int xLocation, int yLocation, Map map)
    {
        this.m_xLocation = xLocation;
        this.m_yLocation = yLocation;
        this.m_MapID = 1;
        this.m_projectID = 1;
        //this.m_MapID = map.getMapID();
        //this.m_projectID = map.getProjectID();
    }
    
    public Location(String tag, int xLocation, int yLocation, Map map)
    {
    	this.m_Tag = tag;
        this.m_xLocation = xLocation;
        this.m_yLocation = yLocation;
        this.m_MapID = 1;
        this.m_projectID = 1;
        //this.m_MapID = map.getMapID();
        //this.m_projectID = map.getProjectID();
    }
    
    public Location(String tag, int xLocation, int yLocation, int mapID)
    {
    	this.m_Tag = tag;
        this.m_xLocation = xLocation;
        this.m_yLocation = yLocation;
        this.m_MapID = mapID;
        //this.m_projectID = map.getProjectID();
    }
    
    public Location(Location location) {
    	this.m_Tag = location.getTag();
    	this.m_xLocation = location.getXLocation();
    	this.m_yLocation = location.getYLocation();
    	this.m_MapID = location.getMapID();
    	this.m_projectID = location.getProjectID();
    }

	public int getID() {
		return m_ID;
	}

	public void setID(int m_ID) {
		this.m_ID = m_ID;
	}

	public String getTag() {
		return m_Tag;
	}

	public void setTag(String m_Tag) {
		this.m_Tag = m_Tag;
	}
	
	public int getXLocation() {
		return m_xLocation;
	}

	public void setXLocation(int m_xLocation) {
		this.m_xLocation = m_xLocation;
	}

	public int getYLocation() {
		return m_yLocation;
	}

	public void setYLocation(int m_yLocation) {
		this.m_yLocation = m_yLocation;
	}

	public int getMapID() {
		return m_MapID;
	}

	public void setMapID(int m_MapID) {
		this.m_MapID = m_MapID;
	}

	public int getProjectID() {
		return m_projectID;
	}

	public void setProjectID(int m_projectID) {
		this.m_projectID = m_projectID;
	}

}