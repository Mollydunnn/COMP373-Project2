package model.maintenance;
import java.util.*;

public class MaintenanceService extends Order implements IMaintenance{

	HashMap <Integer, Date> schedule= new HashMap<Integer, Date>();
	ArrayList <String> listMaintenanceInfo= new ArrayList(); 
	ArrayList <String> requestList= new ArrayList();
	HashMap <String, Integer> inspections= new HashMap<String, Integer>();
	HashMap <Integer, String> facilityProblems= new HashMap<Integer, String>();
	String maintenanceInfo; 
	String maintRequest; 
	String maintenaceSchedule;
	int scheduleID;
	Date scheduleDate;
	public MaintenanceService() {
		
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	@Override
	public void listMaintenance() {
		for(int i=0;i<listMaintenance.size();i++)
			System.out.println(listMaintenance.get(i));
	}
	@Override
	public void listMaintRequest() {
		for(int i=0;i<=listMaintenance.size();i++)
			System.out.println(requestList.get(i));
		
	}

	@Override
	public void listInspections() {
		// TODO HashMap holds type of inspection and how many months it needs to occur (ex. Pest, 6 months)
		//list Inspections prints out the type of inspections 
		inspections.put("pest",  6);
		inspections.put("plumbing", 6);
		for(String i : inspections.keySet()) {
			System.out.print(i+" ");
		}
	}

	@Override
	public void listFacilityProblems() {
		// plumbing(1), electric(2), housekeeping(3)
		//HasshMap holds the order number as the key, then the type of problem as the string value
		
		for(Integer i : facilityProblems.keySet()) {
			System.out.println(i+" "+ facilityProblems.get(i));
		}
		
	}
	public void setFacilityProblems() {
		facilityProblems.put(orderID, "plumbing");
		
	}
	public int getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getMaintenanceInfo() {
		return maintenanceInfo;
	}

	public void setMaintenanceInfo(String maintenanceInfo) {
		maintenanceInfo = maintenanceInfo;
	}
	public String getMaintRequest() {
		requestList.add(maintRequest);
		return maintRequest;	
	}

	public void setMaintRequest(String maintRequest) {
		this.maintRequest = maintRequest;
	}
	public void scheduleMaintenance(int orderID) {
		scheduleID= orderID;
		schedule.put(scheduleID, scheduleDate);	
	}
	
	
	
}