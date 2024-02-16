package javato;
import java.util.*;
import javato.Node_finder.Pair;

public class Data_Populator {
    public static HashMap<String, List<Pair<String, Integer>>> populateAllCharlie() {
        HashMap<String, List<Pair<String, Integer>>> all_charlie = new HashMap<>();
        // Populate all_charlie HashMap
        
        
        
        return all_charlie;
    }

    public static HashMap<String, List<Pair<String, Integer>>> populateAllNutrition() {
        HashMap<String, List<Pair<String, Integer>>> all_nutrition = new HashMap<>();
        // Populate all_nutrition HashMap
        all_nutrition.put("CW Room 4 (cwr4)", Arrays.asList(new Pair<>("CW Room 2 (cwr2)", 7),new Pair<>("CW Room 6 (cwr6)", 7)));
        return all_nutrition;
    }

    public static HashMap<String, List<Pair<String, Integer>>> populateAllground() {
        HashMap<String, List<Pair<String, Integer>>> all_ground = new HashMap<>();
        // Populate all_nutrition HashMap
        all_ground.put("CW Room 4 (cwr4)", Arrays.asList(new Pair<>("CW Room 2 (cwr2)", 7),new Pair<>("CW Room 6 (cwr6)", 7)));
        return all_ground;
    }

    public static HashMap<String, List<Pair<String, Integer>>> populateAllLibrary() {
        HashMap<String, List<Pair<String, Integer>>> all_library = new HashMap<>();
        //Ninoy Aquino Library and Learning Resource Center (NAL1)
        all_library.put("Ninoy Aquino Library and Learning Resource Center (NAL1)", Arrays.asList(new Pair<>("Way AAY (AAY)", 53),new Pair<>("Way AAX (AAX)", 42),new Pair<>("Main Lobby Library (mll)", 7)));

        //Ninoy Aquino Library and Learning Resource Center (NAL2)
        all_library.put("Ninoy Aquino Library and Learning Resource Center (NAL2)", Arrays.asList(new Pair<>("Way ABH (ABH)", 39),new Pair<>("hallway library left (hll)", 8)));

        //Main Lobby Library (mll)
        all_library.put("Main Lobby Library (mll)", Arrays.asList(new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL1)", 7),new Pair<>("main library stairs (mls)", 10),new Pair<>("main 1st entrance (m1e)", 12),new Pair<>("main 2nd entrance (m2e)", 13)));

        //main library stairs (mls)
        all_library.put("main library stairs (mls)", Arrays.asList(new Pair<>("Main Lobby Library (mll)", 10),new Pair<>("main 1st entrance (m1e)", 15),new Pair<>("main 2nd entrance (m2e)", 7),new Pair<>("2nd floor library stairs (2fls)", 6),new Pair<>("basement library stairs (bls)", 6)));

        //main 1st entrance (m1e)
        all_library.put("main 1st entrance (m1e)", Arrays.asList(new Pair<>("Main Lobby Library (mll)", 12),new Pair<>("main library stairs (mls)", 15)));

        //main 2nd entrance (m2e)
        all_library.put("main 2nd entrance (m2e)", Arrays.asList(new Pair<>("Main Lobby Library (mll)", 13),new Pair<>("main library stairs (mls)", 7)));

        //2nd floor library stairs (2fls)
        all_library.put("2nd floor library stairs (2fls)", Arrays.asList(new Pair<>("information desk library (idl)", 7),new Pair<>("3rd floor library stairs (3fls)", 6),new Pair<>("main library stairs (mls)", 6)));

        //information desk library (idl)
        all_library.put("information desk library (idl)", Arrays.asList(new Pair<>("right wing library (rwl)", 3),new Pair<>("study room library (srl)", 8),new Pair<>("2nd floor library stairs (2fls)", 7)));

        //right wing library (rwl)
        all_library.put("right wing library (rwl)", Arrays.asList(new Pair<>("information desk library (idl)", 3)));

        //study room library (srl)
        all_library.put("study room library (srl)", Arrays.asList(new Pair<>("information desk library (idl)", 10),new Pair<>("left wing library (lwl)", 4)));

        //left wing library (lwl)
        all_library.put("left wing library (lwl)", Arrays.asList(new Pair<>("study room library (srl)", 4)));

        //3rd floor library stairs (3fls)
        all_library.put("3rd floor library stairs (3fls)", Arrays.asList(new Pair<>("Office of student services (oss)", 6),new Pair<>("INE room (iner)", 7),new Pair<>("Bulwagang Bonifacio Library (bbl)", 13),new Pair<>("2nd floor library stairs (2fls)", 7)));

        //Office of student services (oss)
        all_library.put("Office of student services (oss)", Arrays.asList(new Pair<>("3rd floor library stairs (3fls)", 6),new Pair<>("Bulwagang balagtas E1 (bbe1)", 13),new Pair<>("Bulwagang balagtas E2 (bbe2)", 10)));

        //Bulwagang balagtas E1 (bbe1)
        all_library.put("Bulwagang balagtas E1 (bbe1)", Arrays.asList(new Pair<>("Office of student services (oss)", 13),new Pair<>("Bulwagang balagtas E2 (bbe2)", 4)));

        //Bulwagang balagtas E2 (bbe2)
        all_library.put("Bulwagang balagtas E2 (bbe2)", Arrays.asList(new Pair<>("Office of student services (oss)", 10),new Pair<>("Bulwagang balagtas E1 (bbe1)", 4)));

        //INE room (iner)
        all_library.put("INE room (iner)", Arrays.asList(new Pair<>("3rd floor library stairs (3fls)", 7),new Pair<>("Institute of ODE (iode)", 7),new Pair<>("Bulwagang Bonifacio Library (bbl)", 1)));

        //Bulwagang Bonifacio Library (bbl)
        all_library.put("Bulwagang Bonifacio Library (bbl)", Arrays.asList(new Pair<>("ICPD (ICPD)", 15),new Pair<>("3rd floor library stairs (3fls)", 13),new Pair<>("INE room (iner)", 1),new Pair<>("Institute of ODE (iode)", 7)));

        //Institute of ODE (iode)
        all_library.put("Institute of ODE (iode)", Arrays.asList(new Pair<>("INE room (iner)", 7),new Pair<>("Institute of NSTP and ETEEAP (ine)", 7),new Pair<>("Bulwagang Bonifacio Library (bbl)", 7)));

        //Institute of NSTP and ETEEAP (ine)
        all_library.put("Institute of NSTP and ETEEAP (ine)", Arrays.asList(new Pair<>("Institute of ODE (iode)", 7),new Pair<>("Office for OTLD (ootld)", 7),new Pair<>("OUS conference room (ouscr)", 10),new Pair<>("ICPD (ICPD)", 1)));

        //ICPD (ICPD)
        all_library.put("ICPD (ICPD)", Arrays.asList(new Pair<>("Bulwagang Bonifacio Library (bbl)", 15),new Pair<>("OUS conference room (ouscr)", 7),new Pair<>("Office for OTLD (ootld)", 7),new Pair<>("Institute of NSTP and ETEEAP (ine)", 1)));

        //OUS conference room (ouscr)
        all_library.put("OUS conference room (ouscr)", Arrays.asList(new Pair<>("ICPD (ICPD)", 7),new Pair<>("Institute of NSTP and ETEEAP (ine)", 10),new Pair<>("Office for OTLD (ootld)", 1)));

        //Office for OTLD (ootld)
        all_library.put("Office for OTLD (ootld)", Arrays.asList(new Pair<>("Institute of NSTP and ETEEAP (ine)", 7),new Pair<>("ICPD (ICPD)", 10),new Pair<>("OUS conference room (ouscr)", 1)));

        //basement library stairs (bls)
        all_library.put("basement library stairs (bls)", Arrays.asList(new Pair<>("RW Room 1 (rwr1)", 14),new Pair<>("Student lounge library (sll)", 11),new Pair<>("main library stairs (mls)", 6)));

        //RW Room 1 (rwr1)
        all_library.put("RW Room 1 (rwr1)", Arrays.asList(new Pair<>("basement library stairs (bls)", 14),new Pair<>("RW Room 2 (rwr2)", 7),new Pair<>("RW Room 3 (rwr3)", 7)));

        //RW Room 2 (rwr2)
        all_library.put("RW Room 2 (rwr2)", Arrays.asList(new Pair<>("RW Room 1 (rwr1)", 7),new Pair<>("RW Room 3 (rwr3)", 7),new Pair<>("RW Room 4 (rwr4)", 7)));

        //RW Room 3 (rwr3)
        all_library.put("RW Room 3 (rwr3)", Arrays.asList(new Pair<>("RW Room 1 (rwr1)", 7),new Pair<>("RW Room 5 (rwr5)", 7)));

        //RW Room 4 (rwr4)
        all_library.put("RW Room 4 (rwr4)", Arrays.asList(new Pair<>("RW Room 2 (rwr2)", 7),new Pair<>("RW Room 6 (rwr6)", 7)));

        //RW Room 5 (rwr5)
        all_library.put("RW Room 5 (rwr5)", Arrays.asList(new Pair<>("RW Room 3 (rwr3)", 7),new Pair<>("RW Room 7 (rwr7)", 7)));

        //RW Room 6 (rwr6)
        all_library.put("RW Room 6 (rwr6)", Arrays.asList(new Pair<>("RW Room 4 (rwr4)", 7),new Pair<>("RW Room 8 (rwr8)", 7),new Pair<>("RW Room 9 (rwr9)", 7)));

        //RW Room 7 (rwr7)
        all_library.put("RW Room 7 (rwr7)", Arrays.asList(new Pair<>("RW Room 5 (rwr5)", 7),new Pair<>("RW Room 9 (rwr9)", 7),new Pair<>("RW Room 8 (rwr8)", 7)));

        //RW Room 8 (rwr8)
        all_library.put("RW Room 8 (rwr8)", Arrays.asList(new Pair<>("RW Room 6 (rwr6)", 7),new Pair<>("RW Room 7 (rwr7)", 7)));

        //RW Room 9 (rwr9)
        all_library.put("RW Room 9 (rwr9)", Arrays.asList(new Pair<>("RW Room 7 (rwr7)", 7),new Pair<>("RW Room 6 (rwr6)", 7)));

        //Student lounge library (sll)
        all_library.put("Student lounge library (sll)", Arrays.asList(new Pair<>("basement library stairs (bls)", 11),new Pair<>("CR left wing (crlw)", 20),new Pair<>("CW Room 1 (cwr1)", 12)));

        //CW Room 1 (cwr1)
        all_library.put("CW Room 1 (cwr1)", Arrays.asList(new Pair<>("Student lounge library (sll)", 28),new Pair<>("CW Room 2 (cwr2)", 7),new Pair<>("CW Room 3 (cwr3)", 7)));

        //CW Room 2 (cwr2)
        all_library.put("CW Room 2 (cwr2)", Arrays.asList(new Pair<>("CW Room 1 (cwr1)", 7),new Pair<>("CW Room 3 (cwr3)", 7),new Pair<>("CW Room 4 (cwr4)", 7)));

        //CW Room 3 (cwr3)
        all_library.put("CW Room 3 (cwr3)", Arrays.asList(new Pair<>("CW Room 1 (cwr1)", 7),new Pair<>("CW Room 5 (cwr5)", 7)));

        //CW Room 4 (cwr4)
        all_library.put("CW Room 4 (cwr4)", Arrays.asList(new Pair<>("CW Room 2 (cwr2)", 7),new Pair<>("CW Room 6 (cwr6)", 7)));

        //CW Room 5 (cwr5)
        all_library.put("CW Room 5 (cwr5)", Arrays.asList(new Pair<>("CW Room 3 (cwr3)", 7),new Pair<>("CW Room 7 (cwr7)", 7)));

        //CW Room 6 (cwr6)
        all_library.put("CW Room 6 (cwr6)", Arrays.asList(new Pair<>("CW Room 4 (cwr4)", 7),new Pair<>("CW Room 8 (cwr8)", 7),new Pair<>("CW Room 9 (cwr9)", 7)));

        //CW Room 7 (cwr7)
        all_library.put("CW Room 7 (cwr7)", Arrays.asList(new Pair<>("CW Room 5 (cwr5)", 7),new Pair<>("CW Room 9 (cwr9)", 7),new Pair<>("CW Room 8 (cwr8)", 7)));

        //CW Room 8 (cwr8)
        all_library.put("CW Room 8 (cwr8)", Arrays.asList(new Pair<>("CW Room 6 (cwr6)", 7),new Pair<>("CW Room 7 (cwr7)", 7)));

        //CW Room 9 (cwr9)
        all_library.put("CW Room 9 (cwr9)", Arrays.asList(new Pair<>("CW Room 7 (cwr7)", 7),new Pair<>("CW Room 6 (cwr6)", 7)));

        //CR left wing (crlw)
        all_library.put("CR left wing (crlw)", Arrays.asList(new Pair<>("Student lounge library (sll)", 12),new Pair<>("hallway library left (hll)", 3)));

        //hallway library left (hll)
        all_library.put("hallway library left (hll)", Arrays.asList(new Pair<>("LW Room 1 (lwr1)", 5),new Pair<>("LW Room 3 (lwr3)", 5),new Pair<>("CR left wing (crlw)", 3),new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL2)", 8)));

        //LW Room 1 (lwr1)
        all_library.put("LW Room 1 (lwr1)", Arrays.asList(new Pair<>("LW Room 2 (lwr2)", 7),new Pair<>("hallway library left (hll)", 5)));

        //LW Room 2 (lwr2)
        all_library.put("LW Room 2 (lwr2)", Arrays.asList(new Pair<>("LW Room 1 (lwr1)", 7),new Pair<>("LW Room 4 (lwr4)", 7)));

        //LW Room 3 (lwr3)
        all_library.put("LW Room 3 (lwr3)", Arrays.asList(new Pair<>("LW Room 5 (lwr5)", 7),new Pair<>("hallway library left (hll)", 5)));

        //LW Room 4 (lwr4)
        all_library.put("LW Room 4 (lwr4)", Arrays.asList(new Pair<>("LW Room 2 (lwr2)", 7),new Pair<>("LW Room 6 (lwr6)", 7)));

        //LW Room 5 (lwr5)
        all_library.put("LW Room 5 (lwr5)", Arrays.asList(new Pair<>("LW Room 3 (lwr3)", 7),new Pair<>("LW Room 7 (lwr7)", 7)));

        //LW Room 6 (lwr6)
        all_library.put("LW Room 6 (lwr6)", Arrays.asList(new Pair<>("LW Room 4 (lwr4)", 7),new Pair<>("LW Room 8 (lwr8)", 7)));

        //LW Room 7 (lwr7)
        all_library.put("LW Room 7 (lwr7)", Arrays.asList(new Pair<>("LW Room 5 (lwr5)", 7),new Pair<>("LW Room 9 (lwr9)", 7)));

        //LW Room 8 (lwr8)
        all_library.put("LW Room 8 (lwr8)", Arrays.asList(new Pair<>("LW Room 6 (lwr6)", 7),new Pair<>("LW Room 9 (lwr9)", 7)));

        //LW Room 9 (lwr9)
        all_library.put("LW Room 9 (lwr9)", Arrays.asList(new Pair<>("LW Room 7 (lwr7)", 7),new Pair<>("LW Room 8 (lwr8)", 7)));
        return all_library;
    }
}