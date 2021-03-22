package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import static org.junit.Assert.*;
import org.launchcode.techjobs_oo.*;
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job jobId = new Job();
        Job secondJobId = new Job();
        int expected = 5;
        int actual = jobId.getId();
        int secondActual = secondJobId.getId();
        assertEquals(expected, actual);
        assertEquals(6, secondActual);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job allInfo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "Product tester";
        String actual = allInfo.getName();
        Employer employer = allInfo.getEmployer();
        Location location = allInfo.getLocation();
        PositionType positionType = allInfo.getPositionType();
        CoreCompetency coreCompetency = allInfo.getCoreCompetency();
        assertEquals("Product tester", actual);
        assertEquals("ACME", employer.getValue());
        assertEquals("Desert", location.getValue());
        assertEquals("Quality control", positionType.getValue());
        assertEquals("Persistence", coreCompetency.getValue());
    }
    @Test
    public void testJobsForEquality (){
        Job idClass = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job noId = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        boolean actual = idClass.equals(noId);
        // int actual = idClass.getId();
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void toStringTest (){
        Job objectToString = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "id: "+"_"+objectToString.getId()+"_"+ "\n" +
                "name: " +"_"+objectToString.getName()+ "_"+ "\n" +
                "employer: "+"_"+objectToString.getEmployer()+"_"+"\n" +
                "location: "+"_"+objectToString.getLocation()+"_"+ "\n" +
                "position type: "+"_"+objectToString.getPositionType()+"_"+ "\n" +
                "core competency: "+"_"+objectToString.getCoreCompetency()+"_"+ "\n";
        String actual = objectToString.toString();
        assertEquals(expected, actual);
    }
}