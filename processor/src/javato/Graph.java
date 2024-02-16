package javato;
import java.util.*;
import javato.Node_finder.Pair;

public class Graph {
    private static Map<String, List<Pair<String, Integer>>> graph = new HashMap<>();

    static {
        //Main Gate (MG)
        graph.put("Main Gate (MG)", Arrays.asList(new Pair<>("Way AAA (AAA)", 50),new Pair<>("Way AAL (AAL)", 49)));

        //Institute for Science and Technology Research (ISTR)
        graph.put("Institute for Science and Technology Research (ISTR)", Arrays.asList(new Pair<>("Way ABE (ABE)", 18)));

        //North Oval Runway (NOR)
        graph.put("North Oval Runway (NOR)", Arrays.asList(new Pair<>("Way AAM (AAM)", 12),new Pair<>("East Oval Runway (EOR)", 96),new Pair<>("West Oval Runway (WOR)", 91)));

        //East Oval Runway (EOR)
        graph.put("East Oval Runway (EOR)", Arrays.asList(new Pair<>("North Oval Runway (NOR)", 96),new Pair<>("South Oval Runway (SOR)", 96)));

        //West Oval Runway (WOR)
        graph.put("West Oval Runway (WOR)", Arrays.asList(new Pair<>("Way AAH (AAH)", 67),new Pair<>("North Oval Runway (NOR)", 91),new Pair<>("South Oval Runway (SOR)", 91),new Pair<>("Grand Stand", 14)));

        //South Oval Runway (SOR)
        graph.put("South Oval Runway (SOR)", Arrays.asList(new Pair<>("West Oval Runway (WOR)", 91),new Pair<>("East Oval Runway (EOR)", 96),new Pair<>("Way AAH (AAH)", 19)));

        //Food Nutrition Building (FN)
        graph.put("Food Nutrition Building (FN)", Arrays.asList(new Pair<>("Way AAF (AAF)", 28),new Pair<>("Way AAG (AAG)", 29),new Pair<>("Nutrition Veranda (NV)", 3)));

        //Interfaith Chapel (IC)
        graph.put("Interfaith Chapel (IC)", Arrays.asList(new Pair<>("Way AAD (AAD)", 35),new Pair<>("Way AAE (AAE)", 35),new Pair<>("Way AAG (AAG)", 35)));

        //East Wing ground (EW4)
        graph.put("East Wing ground (EW4)", Arrays.asList(new Pair<>("Way AAE (AAE)", 32),new Pair<>("Way AAF (AAF)", 58),new Pair<>("Public Assitance Complaint Desk (PACD)", 22),new Pair<>("Medical Clinic (MC)", 7),new Pair<>("Dome East Hallway 1st (DEH1)", 13)));

        //East Wing ground (EW2)
        graph.put("East Wing ground (EW2)", Arrays.asList(new Pair<>("Way AAF (AAF)", 10),new Pair<>("Way AAJ (AAJ)", 10),new Pair<>("East Hallway 1 (EH1)", 2)));

        //West Wing ground (WW2)
        graph.put("West Wing ground (WW2)", Arrays.asList(new Pair<>("Way AAK (AAK)", 42),new Pair<>("U", 20),new Pair<>("Linear Park (LP2)", 25),new Pair<>("Sampaguita Building (SB)", 11),new Pair<>("Student Canteen (SC)", 30),new Pair<>("Way AAO (AAO)", 23),new Pair<>("West Hallway 1 (WH2)", 2)));     

        //West Wing ground (WW3)
        graph.put("West Wing ground (WW3)", Arrays.asList(new Pair<>("Dome West Hallway 1st (DWH1)", 12),new Pair<>("Public Assitance Complaint Desk (PACD)", 6),new Pair<>("West Wing Stairs 1A (WS1A)", 3),new Pair<>("Way AAP (AAP)", 14)));

        //PUP Swimming Pool(PSP)
        graph.put("PUP Swimming Pool(PSP)", Arrays.asList(new Pair<>("Way ABA (ABA)", 32)));

        //Alumni Building (AL)
        graph.put("Alumni Building (AL)", Arrays.asList(new Pair<>("Way ABA (ABA)", 38)));

        //P.E Building (P.EB)
        graph.put("P.E Building (P.EB)", Arrays.asList(new Pair<>("Way ABA (ABA)", 38),new Pair<>("CHK Veranda", 1)));

        //Grand Stand
        graph.put("Grand Stand", Arrays.asList(new Pair<>("West Oval Runway (WOR)", 14)));

        //Ferry Terminal
        graph.put("Ferry Terminal", Arrays.asList(new Pair<>("Way AAJ (AAJ)", 12)));

        //Linear Park (LP1)
        graph.put("Linear Park (LP1)", Arrays.asList(new Pair<>("Way AAJ (AAJ)", 59),new Pair<>("Way AAK (AAK)", 18),new Pair<>("West Wing ground (WW2)", 25),new Pair<>("Student Canteen (SC)", 40)));

        //Linear Park (LP3)
        graph.put("Linear Park (LP3)", Arrays.asList(new Pair<>("Student Canteen (SC)", 40)));

        //U
        graph.put("U", Arrays.asList(new Pair<>("Way AAK (AAK)", 23),new Pair<>("West Wing ground (WW2)", 12),new Pair<>("West Wing ground (WW2)", 20)));

        //Sampaguita Building (SB)
        graph.put("Sampaguita Building (SB)", Arrays.asList(new Pair<>("Way AAO (AAO)", 21),new Pair<>("West Wing ground (WW2)", 11),new Pair<>("Student Canteen (SC)", 17)));

        //Student Canteen (SC)
        graph.put("Student Canteen (SC)", Arrays.asList(new Pair<>("West Wing ground (WW2)", 30),new Pair<>("Way AAO (AAO)", 25),new Pair<>("Linear Park (LP3)", 40),new Pair<>("Sampaguita Building (SB)", 17)));

        //Linear Park (LP2)
        graph.put("Linear Park (LP2)", Arrays.asList(new Pair<>("Student Canteen (SC)", 40),new Pair<>("Way AAJ (AAJ)", 59),new Pair<>("Way AAK (AAK)", 18),new Pair<>("West Wing ground (WW2)", 25)));

        //Charlie Del Rosario (CDR)
        graph.put("Charlie Del Rosario (CDR)", Arrays.asList(new Pair<>("Way AAO (AAO)", 29),new Pair<>("Way AAW (AAW)", 28),new Pair<>("Way AAX (AAX)", 31),new Pair<>("Charlie Entrance (CE)", 5)));

        //Laboratory High School
        graph.put("Laboratory High School", Arrays.asList(new Pair<>("Way AAY (AAY)", 31),new Pair<>("Way AAZ (AAZ)", 15)));

        //Printing Press Building
        graph.put("Printing Press Building", Arrays.asList(new Pair<>("Way AAZ (AAZ)", 13)));

        //PUP Tennis Court (PTC)
        graph.put("PUP Tennis Court (PTC)", Arrays.asList(new Pair<>("Way AAP (AAQ)", 18)));

        //PUP Open Court (POC)
        graph.put("PUP Open Court (POC)", Arrays.asList(new Pair<>("Way AAP (AAQ)", 27),new Pair<>("Way AAR (AAR)", 26)));

        //PUP Swimming Pool
        graph.put("PUP Swimming Pool", Arrays.asList(new Pair<>("Way ABA (ABA)", 32)));

        //Alumni Building
        graph.put("Alumni Building", Arrays.asList(new Pair<>("Way ABA (ABA)", 38)));

        //Lagoon entrance (LE1)
        graph.put("Lagoon entrance (LE1)", Arrays.asList(new Pair<>("Way AAU (AAU)", 18),new Pair<>("Lagoon 2 (L2)", 50),new Pair<>("Lagoon 1 (L1)", 28)));

        //Lagoon entrance (LE2)
        graph.put("Lagoon entrance (LE2)", Arrays.asList(new Pair<>("Way AAW (AAW)", 19),new Pair<>("Lagoon entrance (LE3)", 33),new Pair<>("Lagoon 3 (L3)", 30)));

        //Lagoon entrance (LE3)
        graph.put("Lagoon entrance (LE3)", Arrays.asList(new Pair<>("Lagoon entrance (LE2)", 33),new Pair<>("Lagoon 2 (L2)", 35),new Pair<>("Way AAP (AAP)", 10)));

        //Ampitheather (AT)
        graph.put("Ampitheather (AT)", Arrays.asList(new Pair<>("Lagoon 1 (L1)", 43),new Pair<>("Lagoon 2 (L2)", 19)));

        //Ninoy Aquino Library and Learning Resource Center (NAL1)
        graph.put("Ninoy Aquino Library and Learning Resource Center (NAL1)", Arrays.asList(new Pair<>("Way AAY (AAY)", 53),new Pair<>("Way AAX (AAX)", 42),new Pair<>("Main Lobby Library (mll)", 7)));

        //Ninoy Aquino Library and Learning Resource Center (NAL2)
        graph.put("Ninoy Aquino Library and Learning Resource Center (NAL2)", Arrays.asList(new Pair<>("Way ABH (ABH)", 39),new Pair<>("hallway library left (hll)", 8)));

        //PUP Gymnasium (PG1)
        graph.put("PUP Gymnasium (PG1)", Arrays.asList(new Pair<>("Way ABD (ABD)", 10),new Pair<>("Way ABE (ABE)", 16)));

        //Way AAA (AAA)
        graph.put("Way AAA (AAA)", Arrays.asList(new Pair<>("Main Gate (MG)", 50),new Pair<>("Way AAL (AAL)", 9),new Pair<>("Way AAB (AAB)", 70),new Pair<>("Way AAP (AAQ)", 45),new Pair<>("Way ABE (ABE)", 57)));

        //Way AAB (AAB)
        graph.put("Way AAB (AAB)", Arrays.asList(new Pair<>("Way AAL (AAL)", 68),new Pair<>("Way AAA (AAA)", 70),new Pair<>("Way AAC (AAC)", 45)));

        //Way AAC (AAC)
        graph.put("Way AAC (AAC)", Arrays.asList(new Pair<>("Way AAB (AAB)", 45),new Pair<>("Way AAD (AAD)", 40)));

        //Way AAD (AAD)
        graph.put("Way AAD (AAD)", Arrays.asList(new Pair<>("Way AAC (AAC)", 40),new Pair<>("Way AAE (AAE)", 50),new Pair<>("Interfaith Chapel (IC)", 35),new Pair<>("Way AAH (AAH)", 19)));

        //Way AAE (AAE)
        graph.put("Way AAE (AAE)", Arrays.asList(new Pair<>("Way AAD (AAD)", 50),new Pair<>("Way AAF (AAF)", 55),new Pair<>("Interfaith Chapel (IC)", 35),new Pair<>("East Wing ground (EW4)", 32)));

        //Way AAF (AAF)
        graph.put("Way AAF (AAF)", Arrays.asList(new Pair<>("Way AAE (AAE)", 55),new Pair<>("East Wing ground (EW4)", 58),new Pair<>("Food Nutrition Building (FN)", 28),new Pair<>("Way AAG (AAG)", 48),new Pair<>("East Wing ground (EW2)", 29)));

        //Way AAG (AAG)
        graph.put("Way AAG (AAG)", Arrays.asList(new Pair<>("Way AAF (AAF)", 48),new Pair<>("Food Nutrition Building (FN)", 29),new Pair<>("Interfaith Chapel (IC)", 35),new Pair<>("Way AAH (AAH)", 34),new Pair<>("Way AAD (AAD)", 47)));

        //Way AAH (AAH)
        graph.put("Way AAH (AAH)", Arrays.asList(new Pair<>("Way AAD (AAD)", 19),new Pair<>("South Oval Runway (SOR)", 42),new Pair<>("West Oval Runway (WOR)", 67),new Pair<>("Way AAG (AAG)", 34)));

        //Way AAJ (AAJ)
        graph.put("Way AAJ (AAJ)", Arrays.asList(new Pair<>("East Wing ground (EW2)", 40),new Pair<>("Way AAK (AAK)", 40),new Pair<>("Ferry Terminal (FT)", 12),new Pair<>("Linear Park (LP1)", 59)));

        //Ferry Terminal (FT)
        graph.put("Ferry Terminal (FT)", Arrays.asList(new Pair<>("Way AAJ (AAJ)", 12)));

        //Way AAK (AAK)
        graph.put("Way AAK (AAK)", Arrays.asList(new Pair<>("Way AAJ (AAJ)", 40),new Pair<>("West Wing ground (WW2)", 29),new Pair<>("Linear Park (LP1)", 18),new Pair<>("U", 23),new Pair<>("West Wing ground (WW2)", 42)));

        //Way AAL (AAL)
        graph.put("Way AAL (AAL)", Arrays.asList(new Pair<>("Way AAA (AAA)", 9),new Pair<>("Way AAB (AAB)", 68),new Pair<>("Main Gate (MG)", 49),new Pair<>("Way AAM (AAM)", 38)));

        //Way AAM (AAM)
        graph.put("Way AAM (AAM)", Arrays.asList(new Pair<>("Way AAL (AAL)", 38),new Pair<>("North Oval Runway (NOR)", 12)));

        //Way AAO (AAO)
        graph.put("Way AAO (AAO)", Arrays.asList(new Pair<>("West Wing ground (WW2)", 23),new Pair<>("Student Canteen (SC)", 25),new Pair<>("West Wing ground (WW2)", 11),new Pair<>("Sampaguita Building (SB)", 21),new Pair<>("Charlie Del Rosario (CDR)", 29),new Pair<>("Way AAV (AAV)", 37)));

        //Way AAP (AAP)
        graph.put("Way AAP (AAP)", Arrays.asList(new Pair<>("Way AAV (AAV)", 22),new Pair<>("West Wing ground (WW3)", 14),new Pair<>("Lagoon entrance (LE3)", 10)));

        //Way AAP (AAQ)
        graph.put("Way AAP (AAQ)", Arrays.asList(new Pair<>("Way AAA (AAA)", 45),new Pair<>("Way AAR (AAR)", 47),new Pair<>("PUP Tennis Court (PTC)", 18),new Pair<>("PUP Open Court (POC)", 27)));

        //Way AAR (AAR)
        graph.put("Way AAR (AAR)", Arrays.asList(new Pair<>("Way AAP (AAQ)", 47),new Pair<>("PUP Open Court (POC)", 26),new Pair<>("Way AAS (AAS)", 28),new Pair<>("Way AAT (AAT)", 18)));

        //Way AAS (AAS)
        graph.put("Way AAS (AAS)", Arrays.asList(new Pair<>("Way AAU (AAU)", 27),new Pair<>("Way ABA (ABA)", 18),new Pair<>("Way AAR (AAR)", 28)));

        //Way AAT (AAT)
        graph.put("Way AAT (AAT)", Arrays.asList(new Pair<>("Way AAR (AAR)", 18),new Pair<>("Way AAU (AAU)", 20)));

        //Way AAU (AAU)
        graph.put("Way AAU (AAU)", Arrays.asList(new Pair<>("Way AAS (AAS)", 27),new Pair<>("Lagoon entrance (LE1)", 18),new Pair<>("Way AAT (AAT)", 20)));

        //Way AAV (AAV)
        graph.put("Way AAV (AAV)", Arrays.asList(new Pair<>("Way AAW (AAW)", 33),new Pair<>("Way AAP (AAP)", 22),new Pair<>("Way AAO (AAO)", 37)));

        //Way AAW (AAW)
        graph.put("Way AAW (AAW)", Arrays.asList(new Pair<>("Lagoon entrance (LE2)", 19),new Pair<>("Charlie Del Rosario (CDR)", 28),new Pair<>("Way AAV (AAV)", 33),new Pair<>("Way AAX (AAX)", 28)));

        //Way AAX (AAX)
        graph.put("Way AAX (AAX)", Arrays.asList(new Pair<>("Charlie Del Rosario (CDR)", 31),new Pair<>("Way AAW (AAW)", 28),new Pair<>("Way AAY (AAY)", 82),new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL1)", 42)));

        //Way AAY (AAY)
        graph.put("Way AAY (AAY)", Arrays.asList(new Pair<>("Way AAX (AAX)", 82),new Pair<>("Way AAZ (AAZ)", 45),new Pair<>("Laboratory High School (LH1)", 31),new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL1)", 53)));

        //Way AAZ (AAZ)
        graph.put("Way AAZ (AAZ)", Arrays.asList(new Pair<>("Way AAY (AAY)", 45),new Pair<>("Laboratory High School (LH1)", 15),new Pair<>("Printing Press Building", 13)));

        //Laboratory High School (LH1)
        graph.put("Laboratory High School (LH1)", Arrays.asList(new Pair<>("Way AAZ (AAZ)", 15),new Pair<>("Way AAY (AAY)", 31)));

        //Way ABA (ABA)
        graph.put("Way ABA (ABA)", Arrays.asList(new Pair<>("Way AAS (AAS)", 18),new Pair<>("Way ABB (ABB)", 25),new Pair<>("Way ABF (ABF)", 36),new Pair<>("PUP Swimming Pool(PSP)", 32),new Pair<>("Alumni Building (AL)", 38),new Pair<>("P.E Building (P.EB)", 30)));

        //Way ABB (ABB)
        graph.put("Way ABB (ABB)", Arrays.asList(new Pair<>("Way ABA (ABA)", 25),new Pair<>("Way ABC (ABC)", 38)));

        //Way ABC (ABC)
        graph.put("Way ABC (ABC)", Arrays.asList(new Pair<>("Way ABB (ABB)", 38),new Pair<>("Way ABD (ABD)", 50)));

        //Way ABD (ABD)
        graph.put("Way ABD (ABD)", Arrays.asList(new Pair<>("Way ABE (ABE)", 25),new Pair<>("PUP Gymnasium (PG1)", 10),new Pair<>("Way ABC (ABC)", 50)));

        //Way ABE (ABE)
        graph.put("Way ABE (ABE)", Arrays.asList(new Pair<>("PUP Gymnasium (PG1)", 10),new Pair<>("Way ABD (ABD)", 25),new Pair<>("Way AAA (AAA)", 57),new Pair<>("Institute for Science and Technology Research (ISTR)", 18)));

        //Way ABF (ABF)
        graph.put("Way ABF (ABF)", Arrays.asList(new Pair<>("Way ABA (ABA)", 36),new Pair<>("Way ABG (ABG)", 20)));

        //Way ABG (ABG)
        graph.put("Way ABG (ABG)", Arrays.asList(new Pair<>("Way ABH (ABH)", 27),new Pair<>("Way ABF (ABF)", 20)));

        //Way ABH (ABH)
        graph.put("Way ABH (ABH)", Arrays.asList(new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL2)", 39),new Pair<>("Way ABG (ABG)", 27)));

        //Lagoon 1 (L1)
        graph.put("Lagoon 1 (L1)", Arrays.asList(new Pair<>("Lagoon entrance (LE1)", 28),new Pair<>("Lagoon 2 (L2)", 24),new Pair<>("Lagoon 3 (L3)", 35),new Pair<>("Ampitheather (AT)", 43)));

        //Lagoon 2 (L2)
        graph.put("Lagoon 2 (L2)", Arrays.asList(new Pair<>("Ampitheather (AT)", 19),new Pair<>("Lagoon 1 (L1)", 20),new Pair<>("Lagoon entrance (LE3)", 35),new Pair<>("Lagoon entrance (LE1)", 50)));

        //Lagoon 3 (L3)
        graph.put("Lagoon 3 (L3)", Arrays.asList(new Pair<>("Lagoon 3 (L3)", 35),new Pair<>("Lagoon 2 (L2)", 20),new Pair<>("Lagoon entrance (LE2)", 30)));

        //Nutrition Veranda (NV)
        graph.put("Nutrition Veranda (NV)", Arrays.asList(new Pair<>("Food Nutrition Building (FN)", 3),new Pair<>("NFS 103", 1),new Pair<>("NFS 104", 1)));

        //N1FS1
        graph.put("N1FS1", Arrays.asList(new Pair<>("N1FCR 1", 2),new Pair<>("N2FS1", 5)));

        //N1FS2
        graph.put("N1FS2", Arrays.asList(new Pair<>("NFS 105", 5),new Pair<>("NDNT1FSR", 5),new Pair<>("N2FS2", 5)));

        //N1FS3
        graph.put("N1FS3", Arrays.asList(new Pair<>("N1FCR 2", 2),new Pair<>("N2FS3", 3)));

        //N1FCR 1
        graph.put("N1FCR 1", Arrays.asList(new Pair<>("N1FS1", 1),new Pair<>("NFS 101", 5)));

        //N1FCR 2
        graph.put("N1FCR 2", Arrays.asList(new Pair<>("FS 203", 5),new Pair<>("N1FS3", 2)));

        //NDNT1FSR
        graph.put("NDNT1FSR", Arrays.asList(new Pair<>("N1FS2", 2),new Pair<>("FS 201", 5)));

        //NFS 101
        graph.put("NFS 101", Arrays.asList(new Pair<>("N1FCR 1", 5),new Pair<>("NFS 102", 5)));

        //NFS 102
        graph.put("NFS 102", Arrays.asList(new Pair<>("NFS 101", 5),new Pair<>("NFS 103", 5)));

        //NFS 103
        graph.put("NFS 103", Arrays.asList(new Pair<>("Nutrition Veranda (NV)", 1),new Pair<>("NFS 104", 5),new Pair<>("NFS 102", 5)));

        //NFS 104
        graph.put("NFS 104", Arrays.asList(new Pair<>("Nutrition Veranda (NV)", 1),new Pair<>("NFS 103", 5),new Pair<>("NFS 105", 5)));

        //NFS 105
        graph.put("NFS 105", Arrays.asList(new Pair<>("N1FS2", 5),new Pair<>("NFS 104", 5)));

        //FS 201
        graph.put("FS 201", Arrays.asList(new Pair<>("NDNT1FSR", 5),new Pair<>("FS 202", 5)));

        //FS 202
        graph.put("FS 202", Arrays.asList(new Pair<>("FS 201", 5),new Pair<>("FS 203", 5)));

        //FS 203
        graph.put("FS 203", Arrays.asList(new Pair<>("FS 202", 5),new Pair<>("N1FCR 2", 5)));

        //N2FS1
        graph.put("N2FS1", Arrays.asList(new Pair<>("LH1", 1),new Pair<>("N1FS1", 5)));

        //N2FS2
        graph.put("N2FS2", Arrays.asList(new Pair<>("LH4", 3),new Pair<>("LH5", 3),new Pair<>("N1FS2", 5)));

        //N2FS3
        graph.put("N2FS3", Arrays.asList(new Pair<>("LH6", 3),new Pair<>("N1FS3", 5)));

        //N2FCR 1
        graph.put("N2FCR 1", Arrays.asList(new Pair<>("LH2", 4)));

        //NDNT2FSR 1
        graph.put("NDNT2FSR 1", Arrays.asList(new Pair<>("LH2", 3),new Pair<>("LH3", 3)));

        //NDNT2FSR 2
        graph.put("NDNT2FSR 2", Arrays.asList(new Pair<>("LH5", 4)));

        //NDNT2FSR 3
        graph.put("NDNT2FSR 3", Arrays.asList(new Pair<>("UH4", 2),new Pair<>("LH6", 4)));

        //LH1
        graph.put("LH1", Arrays.asList(new Pair<>("N2FS1", 1),new Pair<>("LH2", 3)));

        //LH2
        graph.put("LH2", Arrays.asList(new Pair<>("N2FCR 1", 4),new Pair<>("NDNT2FSR 1", 3),new Pair<>("LH3", 3),new Pair<>("LH1", 3)));

        //LH3
        graph.put("LH3", Arrays.asList(new Pair<>("UH1", 6),new Pair<>("LH2", 3),new Pair<>("NDNT2FSR 1", 3)));

        //LH4
        graph.put("LH4", Arrays.asList(new Pair<>("N2FS2", 3),new Pair<>("LH5", 6)));

        //LH5
        graph.put("LH5", Arrays.asList(new Pair<>("N2FS2", 3),new Pair<>("NDNT2FSR 2", 4),new Pair<>("UH3", 6),new Pair<>("LH4", 6)));

        //LH6
        graph.put("LH6", Arrays.asList(new Pair<>("UH4", 6),new Pair<>("NDNT2FSR 3", 4),new Pair<>("N2FS3", 3)));

        //UH1
        graph.put("UH1", Arrays.asList(new Pair<>("LH3", 6),new Pair<>("FT 203", 4)));

        //UH2
        graph.put("UH2", Arrays.asList(new Pair<>("FT 202", 4),new Pair<>("LH4", 6)));

        //UH3
        graph.put("UH3", Arrays.asList(new Pair<>("LH5", 6),new Pair<>("ND 203", 4)));

        //UH4
        graph.put("UH4", Arrays.asList(new Pair<>("NDNT2FSR 3", 2),new Pair<>("ND 201", 4),new Pair<>("LH6", 6)));

        //FT 201
        graph.put("FT 201", Arrays.asList(new Pair<>("FT 202", 5),new Pair<>("UH2", 4)));

        //FT 202
        graph.put("FT 202", Arrays.asList(new Pair<>("FT 203", 5),new Pair<>("FT 201", 5)));

        //FT 203
        graph.put("FT 203", Arrays.asList(new Pair<>("UH1", 4),new Pair<>("FT 202", 5)));

        //ND 201
        graph.put("ND 201", Arrays.asList(new Pair<>("ND 202", 5),new Pair<>("UH4", 4)));

        //ND 202
        graph.put("ND 202", Arrays.asList(new Pair<>("ND 203", 5),new Pair<>("ND 201", 5)));

        //ND 203
        graph.put("ND 203", Arrays.asList(new Pair<>("UH3", 4),new Pair<>("ND 202", 5)));

        //Charlie Entrance (CE)
        graph.put("Charlie Entrance (CE)", Arrays.asList(new Pair<>("Charlie Del Rosario (CDR)", 5),new Pair<>("CH1FS1", 6),new Pair<>("Charlie Lobby", 20)));

        //Charlie Lobby
        graph.put("Charlie Lobby", Arrays.asList(new Pair<>("Charlie Entrance (CE)", 20),new Pair<>("CH1FS1", 19),new Pair<>("CH1FS2", 34)));

        //CH1FS1
        graph.put("CH1FS1", Arrays.asList(new Pair<>("Charlie Entrance (CE)", 6),new Pair<>("Charlie Lobby", 19),new Pair<>("CH2FS1", 8)));

        //CH1FS2
        graph.put("CH1FS2", Arrays.asList(new Pair<>("Charlie Lobby", 34),new Pair<>("CH2FS2", 8)));

        //CH2FS1
        graph.put("CH2FS1", Arrays.asList(new Pair<>("SH1", 3),new Pair<>("CH1FS1", 8)));

        //CH2FS2
        graph.put("CH2FS2", Arrays.asList(new Pair<>("CR 212", 3),new Pair<>("MH2", 4),new Pair<>("CH1FS2", 8)));

        //SH1
        graph.put("SH1", Arrays.asList(new Pair<>("CH2FS1", 3),new Pair<>("SH2", 5)));

        //SH2
        graph.put("SH2", Arrays.asList(new Pair<>("SH1", 5),new Pair<>("MH1", 6)));

        //MH1
        graph.put("MH1", Arrays.asList(new Pair<>("PH1", 6),new Pair<>("CR 201", 4),new Pair<>("CR 202", 5)));

        //MH2
        graph.put("MH2", Arrays.asList(new Pair<>("PH2", 6),new Pair<>("CR 211", 5),new Pair<>("CR 212", 4),new Pair<>("CH2FS2", 4),new Pair<>("CR 210", 6)));

        //PH1
        graph.put("PH1", Arrays.asList(new Pair<>("MH1", 6),new Pair<>("CCR 1", 1),new Pair<>("CR 1", 1)));

        //PH2
        graph.put("PH2", Arrays.asList(new Pair<>("MH2", 6),new Pair<>("CCR 2", 1),new Pair<>("CR 2", 1)));

        //CR 1
        graph.put("CR 1", Arrays.asList(new Pair<>("PH1", 1),new Pair<>("CCR 1", 1)));

        //CR 2
        graph.put("CR 2", Arrays.asList(new Pair<>("PH2", 1),new Pair<>("CCR 2", 1)));

        //CCR 1
        graph.put("CCR 1", Arrays.asList(new Pair<>("PH1", 1),new Pair<>("CR 1", 1)));

        //CCR 2
        graph.put("CCR 2", Arrays.asList(new Pair<>("PH1", 1),new Pair<>("CR 1", 1)));

        //CR 201
        graph.put("CR 201", Arrays.asList(new Pair<>("CR 203", 4),new Pair<>("MH1", 4)));

        //CR 202
        graph.put("CR 202", Arrays.asList(new Pair<>("MH1", 5),new Pair<>("CR 204", 4),new Pair<>("CR 203", 11)));

        //CR 203
        graph.put("CR 203", Arrays.asList(new Pair<>("CR 205", 4),new Pair<>("CR 201", 4),new Pair<>("CR 204", 8),new Pair<>("CR 202", 11)));

        //CR 204
        graph.put("CR 204", Arrays.asList(new Pair<>("CR 202", 4),new Pair<>("CR 206", 4),new Pair<>("CR 203", 8)));

        //CR 205
        graph.put("CR 205", Arrays.asList(new Pair<>("CR 207", 4),new Pair<>("CR 203", 4),new Pair<>("CR 206", 8)));

        //CR 206
        graph.put("CR 206", Arrays.asList(new Pair<>("CR 204", 4),new Pair<>("CR 208", 4),new Pair<>("CR 207", 9),new Pair<>("CR 205", 8)));

        //CR 207
        graph.put("CR 207", Arrays.asList(new Pair<>("CR 209", 4),new Pair<>("CR 205", 4),new Pair<>("CR 206", 9)));

        //CR 208
        graph.put("CR 208", Arrays.asList(new Pair<>("CR 206", 4),new Pair<>("CR 210", 4),new Pair<>("CR 209", 8)));

        //CR 209
        graph.put("CR 209", Arrays.asList(new Pair<>("CR 211", 4),new Pair<>("CR 207", 4),new Pair<>("CR 210", 9),new Pair<>("CR 208", 8)));

        //CR 210
        graph.put("CR 210", Arrays.asList(new Pair<>("CR 208", 4),new Pair<>("CR 212", 4),new Pair<>("CR 209", 9),new Pair<>("MH2", 6)));

        //CR 211
        graph.put("CR 211", Arrays.asList(new Pair<>("MH2", 5),new Pair<>("CR 209", 4)));

        //CR 212
        graph.put("CR 212", Arrays.asList(new Pair<>("CR 210", 4),new Pair<>("CH2FS2", 3),new Pair<>("MH2", 4)));

        //CHK Veranda
        graph.put("CHK Veranda", Arrays.asList(new Pair<>("P.E Building (P.EB)", 1),new Pair<>("CHK1FS1", 2),new Pair<>("CHK 101", 2),new Pair<>("CHK 102", 2)));

        //CHK1FS1
        graph.put("CHK1FS1", Arrays.asList(new Pair<>("CHK Veranda", 2),new Pair<>("CHK PH1", 3),new Pair<>("CHK 101", 2),new Pair<>("CHK2FS1", 1)));

        //CHK1FS2
        graph.put("CHK1FS2", Arrays.asList(new Pair<>("CHK 108", 2),new Pair<>("PH2", 3),new Pair<>("CHK2FS2", 1)));

        //CHK PH1
        graph.put("CHK PH1", Arrays.asList(new Pair<>("CHKR 1", 1),new Pair<>("CHKCR 1", 1),new Pair<>("CHK1FS1", 3),new Pair<>("CHK 101", 3)));

        //CHK PH2
        graph.put("CHK PH2", Arrays.asList(new Pair<>("CHK1FS2", 3),new Pair<>("CHKR 2", 1),new Pair<>("CHKCR 2", 1),new Pair<>("CHK 108", 3)));

        //CHKR 1
        graph.put("CHKR 1", Arrays.asList(new Pair<>("CHK PH1", 1),new Pair<>("CHKCR 1", 1)));

        //CHKR 2
        graph.put("CHKR 2", Arrays.asList(new Pair<>("CHK PH2", 1),new Pair<>("CHKCR 2", 1)));

        //CHKCR 1
        graph.put("CHKCR 1", Arrays.asList(new Pair<>("CHK PH1", 1),new Pair<>("CHKR 1", 1)));

        //CHKCR 2
        graph.put("CHKCR 2", Arrays.asList(new Pair<>("CHK PH2", 1),new Pair<>("CHKR 2", 1)));

        //CHK 101
        graph.put("CHK 101", Arrays.asList(new Pair<>("CHK1FS1", 2),new Pair<>("CHK Veranda", 2),new Pair<>("CHK 102", 2),new Pair<>("CHK PH1", 3)));

        //CHK 102
        graph.put("CHK 102", Arrays.asList(new Pair<>("CHK 101", 2),new Pair<>("CHK 103", 2),new Pair<>("CHK Veranda", 2)));

        //CHK 103
        graph.put("CHK 103", Arrays.asList(new Pair<>("CHK 102", 2),new Pair<>("CHK 104", 2)));

        //CHK 104
        graph.put("CHK 104", Arrays.asList(new Pair<>("CHK 103", 2),new Pair<>("CHK 105", 2)));

        //CHK 105
        graph.put("CHK 105", Arrays.asList(new Pair<>("CHK 104", 2),new Pair<>("CHK 106", 2)));

        //CHK 106
        graph.put("CHK 106", Arrays.asList(new Pair<>("CHK 105", 2),new Pair<>("CHK 107", 2)));

        //CHK 107
        graph.put("CHK 107", Arrays.asList(new Pair<>("CHK 106", 2),new Pair<>("CHK 108", 2)));

        //CHK 108
        graph.put("CHK 108", Arrays.asList(new Pair<>("CHK 107", 2),new Pair<>("CHK1FS2", 2),new Pair<>("CHK PH2", 3)));

        //CHK2FS1
        graph.put("CHK2FS1", Arrays.asList(new Pair<>("CHK 201", 1),new Pair<>("CHK1FS1", 1)));

        //CHK2FS2
        graph.put("CHK2FS2", Arrays.asList(new Pair<>("CHK 208", 1),new Pair<>("CHK1FS1", 1)));

        //CHK 201
        graph.put("CHK 201", Arrays.asList(new Pair<>("CHK2FS1", 1),new Pair<>("CHK 202", 2)));

        //CHK 202
        graph.put("CHK 202", Arrays.asList(new Pair<>("CHK 201", 2),new Pair<>("CHK 203", 2)));

        //CHK 203
        graph.put("CHK 203", Arrays.asList(new Pair<>("CHK 202", 2),new Pair<>("CHK 204", 2)));

        //CHK 204
        graph.put("CHK 204", Arrays.asList(new Pair<>("CHK 203", 2),new Pair<>("CHK 205", 2)));

        //CHK 205
        graph.put("CHK 205", Arrays.asList(new Pair<>("CHK 204", 2),new Pair<>("CHK 206", 2)));

        //CHK 206
        graph.put("CHK 206", Arrays.asList(new Pair<>("CHK 205", 2),new Pair<>("CHK 207", 2)));

        //CHK 207
        graph.put("CHK 207", Arrays.asList(new Pair<>("CHK 206", 2),new Pair<>("CHK 208", 2)));

        //CHK 208
        graph.put("CHK 208", Arrays.asList(new Pair<>("CHK2FS2", 1),new Pair<>("CHK 207", 2)));

        //Main Lobby Library (mll)
        graph.put("Main Lobby Library (mll)", Arrays.asList(new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL1)", 7),new Pair<>("main library stairs (mls)", 10),new Pair<>("main 1st entrance (m1e)", 12),new Pair<>("main 2nd entrance (m2e)", 13)));

        //main library stairs (mls)
        graph.put("main library stairs (mls)", Arrays.asList(new Pair<>("Main Lobby Library (mll)", 10),new Pair<>("main 1st entrance (m1e)", 15),new Pair<>("main 2nd entrance (m2e)", 7),new Pair<>("2nd floor library stairs (2fls)", 6),new Pair<>("basement library stairs (bls)", 6)));

        //main 1st entrance (m1e)
        graph.put("main 1st entrance (m1e)", Arrays.asList(new Pair<>("Main Lobby Library (mll)", 12),new Pair<>("main library stairs (mls)", 15)));

        //main 2nd entrance (m2e)
        graph.put("main 2nd entrance (m2e)", Arrays.asList(new Pair<>("Main Lobby Library (mll)", 13),new Pair<>("main library stairs (mls)", 7)));

        //2nd floor library stairs (2fls)
        graph.put("2nd floor library stairs (2fls)", Arrays.asList(new Pair<>("information desk library (idl)", 7),new Pair<>("3rd floor library stairs (3fls)", 6),new Pair<>("main library stairs (mls)", 6)));

        //information desk library (idl)
        graph.put("information desk library (idl)", Arrays.asList(new Pair<>("right wing library (rwl)", 3),new Pair<>("study room library (srl)", 8),new Pair<>("2nd floor library stairs (2fls)", 7)));

        //right wing library (rwl)
        graph.put("right wing library (rwl)", Arrays.asList(new Pair<>("information desk library (idl)", 3)));

        //study room library (srl)
        graph.put("study room library (srl)", Arrays.asList(new Pair<>("information desk library (idl)", 10),new Pair<>("left wing library (lwl)", 4)));

        //left wing library (lwl)
        graph.put("left wing library (lwl)", Arrays.asList(new Pair<>("study room library (srl)", 4)));

        //3rd floor library stairs (3fls)
        graph.put("3rd floor library stairs (3fls)", Arrays.asList(new Pair<>("Office of student services (oss)", 6),new Pair<>("INE room (iner)", 7),new Pair<>("Bulwagang Bonifacio Library (bbl)", 13),new Pair<>("2nd floor library stairs (2fls)", 7)));

        //Office of student services (oss)
        graph.put("Office of student services (oss)", Arrays.asList(new Pair<>("3rd floor library stairs (3fls)", 6),new Pair<>("Bulwagang balagtas E1 (bbe1)", 13),new Pair<>("Bulwagang balagtas E2 (bbe2)", 10)));

        //Bulwagang balagtas E1 (bbe1)
        graph.put("Bulwagang balagtas E1 (bbe1)", Arrays.asList(new Pair<>("Office of student services (oss)", 13),new Pair<>("Bulwagang balagtas E2 (bbe2)", 4)));

        //Bulwagang balagtas E2 (bbe2)
        graph.put("Bulwagang balagtas E2 (bbe2)", Arrays.asList(new Pair<>("Office of student services (oss)", 10),new Pair<>("Bulwagang balagtas E1 (bbe1)", 4)));

        //INE room (iner)
        graph.put("INE room (iner)", Arrays.asList(new Pair<>("3rd floor library stairs (3fls)", 7),new Pair<>("Institute of ODE (iode)", 7),new Pair<>("Bulwagang Bonifacio Library (bbl)", 1)));

        //Bulwagang Bonifacio Library (bbl)
        graph.put("Bulwagang Bonifacio Library (bbl)", Arrays.asList(new Pair<>("ICPD (ICPD)", 15),new Pair<>("3rd floor library stairs (3fls)", 13),new Pair<>("INE room (iner)", 1),new Pair<>("Institute of ODE (iode)", 7)));

        //Institute of ODE (iode)
        graph.put("Institute of ODE (iode)", Arrays.asList(new Pair<>("INE room (iner)", 7),new Pair<>("Institute of NSTP and ETEEAP (ine)", 7),new Pair<>("Bulwagang Bonifacio Library (bbl)", 7)));

        //Institute of NSTP and ETEEAP (ine)
        graph.put("Institute of NSTP and ETEEAP (ine)", Arrays.asList(new Pair<>("Institute of ODE (iode)", 7),new Pair<>("Office for OTLD (ootld)", 7),new Pair<>("OUS conference room (ouscr)", 10),new Pair<>("ICPD (ICPD)", 1)));

        //ICPD (ICPD)
        graph.put("ICPD (ICPD)", Arrays.asList(new Pair<>("Bulwagang Bonifacio Library (bbl)", 15),new Pair<>("OUS conference room (ouscr)", 7),new Pair<>("Office for OTLD (ootld)", 7),new Pair<>("Institute of NSTP and ETEEAP (ine)", 1)));

        //OUS conference room (ouscr)
        graph.put("OUS conference room (ouscr)", Arrays.asList(new Pair<>("ICPD (ICPD)", 7),new Pair<>("Institute of NSTP and ETEEAP (ine)", 10),new Pair<>("Office for OTLD (ootld)", 1)));

        //Office for OTLD (ootld)
        graph.put("Office for OTLD (ootld)", Arrays.asList(new Pair<>("Institute of NSTP and ETEEAP (ine)", 7),new Pair<>("ICPD (ICPD)", 10),new Pair<>("OUS conference room (ouscr)", 1)));

        //basement library stairs (bls)
        graph.put("basement library stairs (bls)", Arrays.asList(new Pair<>("RW Room 1 (rwr1)", 14),new Pair<>("Student lounge library (sll)", 11),new Pair<>("main library stairs (mls)", 6)));

        //RW Room 1 (rwr1)
        graph.put("RW Room 1 (rwr1)", Arrays.asList(new Pair<>("basement library stairs (bls)", 14),new Pair<>("RW Room 2 (rwr2)", 7),new Pair<>("RW Room 3 (rwr3)", 7)));

        //RW Room 2 (rwr2)
        graph.put("RW Room 2 (rwr2)", Arrays.asList(new Pair<>("RW Room 1 (rwr1)", 7),new Pair<>("RW Room 3 (rwr3)", 7),new Pair<>("RW Room 4 (rwr4)", 7)));

        //RW Room 3 (rwr3)
        graph.put("RW Room 3 (rwr3)", Arrays.asList(new Pair<>("RW Room 1 (rwr1)", 7),new Pair<>("RW Room 5 (rwr5)", 7)));

        //RW Room 4 (rwr4)
        graph.put("RW Room 4 (rwr4)", Arrays.asList(new Pair<>("RW Room 2 (rwr2)", 7),new Pair<>("RW Room 6 (rwr6)", 7)));

        //RW Room 5 (rwr5)
        graph.put("RW Room 5 (rwr5)", Arrays.asList(new Pair<>("RW Room 3 (rwr3)", 7),new Pair<>("RW Room 7 (rwr7)", 7)));

        //RW Room 6 (rwr6)
        graph.put("RW Room 6 (rwr6)", Arrays.asList(new Pair<>("RW Room 4 (rwr4)", 7),new Pair<>("RW Room 8 (rwr8)", 7),new Pair<>("RW Room 9 (rwr9)", 7)));

        //RW Room 7 (rwr7)
        graph.put("RW Room 7 (rwr7)", Arrays.asList(new Pair<>("RW Room 5 (rwr5)", 7),new Pair<>("RW Room 9 (rwr9)", 7),new Pair<>("RW Room 8 (rwr8)", 7)));

        //RW Room 8 (rwr8)
        graph.put("RW Room 8 (rwr8)", Arrays.asList(new Pair<>("RW Room 6 (rwr6)", 7),new Pair<>("RW Room 7 (rwr7)", 7)));

        //RW Room 9 (rwr9)
        graph.put("RW Room 9 (rwr9)", Arrays.asList(new Pair<>("RW Room 7 (rwr7)", 7),new Pair<>("RW Room 6 (rwr6)", 7)));

        //Student lounge library (sll)
        graph.put("Student lounge library (sll)", Arrays.asList(new Pair<>("basement library stairs (bls)", 11),new Pair<>("CR left wing (crlw)", 20),new Pair<>("CW Room 1 (cwr1)", 12)));

        //CW Room 1 (cwr1)
        graph.put("CW Room 1 (cwr1)", Arrays.asList(new Pair<>("Student lounge library (sll)", 28),new Pair<>("CW Room 2 (cwr2)", 7),new Pair<>("CW Room 3 (cwr3)", 7)));

        //CW Room 2 (cwr2)
        graph.put("CW Room 2 (cwr2)", Arrays.asList(new Pair<>("CW Room 1 (cwr1)", 7),new Pair<>("CW Room 3 (cwr3)", 7),new Pair<>("CW Room 4 (cwr4)", 7)));

        //CW Room 3 (cwr3)
        graph.put("CW Room 3 (cwr3)", Arrays.asList(new Pair<>("CW Room 1 (cwr1)", 7),new Pair<>("CW Room 5 (cwr5)", 7)));

        //CW Room 4 (cwr4)
        graph.put("CW Room 4 (cwr4)", Arrays.asList(new Pair<>("CW Room 2 (cwr2)", 7),new Pair<>("CW Room 6 (cwr6)", 7)));

        //CW Room 5 (cwr5)
        graph.put("CW Room 5 (cwr5)", Arrays.asList(new Pair<>("CW Room 3 (cwr3)", 7),new Pair<>("CW Room 7 (cwr7)", 7)));

        //CW Room 6 (cwr6)
        graph.put("CW Room 6 (cwr6)", Arrays.asList(new Pair<>("CW Room 4 (cwr4)", 7),new Pair<>("CW Room 8 (cwr8)", 7),new Pair<>("CW Room 9 (cwr9)", 7)));

        //CW Room 7 (cwr7)
        graph.put("CW Room 7 (cwr7)", Arrays.asList(new Pair<>("CW Room 5 (cwr5)", 7),new Pair<>("CW Room 9 (cwr9)", 7),new Pair<>("CW Room 8 (cwr8)", 7)));

        //CW Room 8 (cwr8)
        graph.put("CW Room 8 (cwr8)", Arrays.asList(new Pair<>("CW Room 6 (cwr6)", 7),new Pair<>("CW Room 7 (cwr7)", 7)));

        //CW Room 9 (cwr9)
        graph.put("CW Room 9 (cwr9)", Arrays.asList(new Pair<>("CW Room 7 (cwr7)", 7),new Pair<>("CW Room 6 (cwr6)", 7)));

        //CR left wing (crlw)
        graph.put("CR left wing (crlw)", Arrays.asList(new Pair<>("Student lounge library (sll)", 12),new Pair<>("hallway library left (hll)", 3)));

        //hallway library left (hll)
        graph.put("hallway library left (hll)", Arrays.asList(new Pair<>("LW Room 1 (lwr1)", 5),new Pair<>("LW Room 3 (lwr3)", 5),new Pair<>("CR left wing (crlw)", 3),new Pair<>("Ninoy Aquino Library and Learning Resource Center (NAL2)", 8)));

        //LW Room 1 (lwr1)
        graph.put("LW Room 1 (lwr1)", Arrays.asList(new Pair<>("LW Room 2 (lwr2)", 7),new Pair<>("hallway library left (hll)", 5)));

        //LW Room 2 (lwr2)
        graph.put("LW Room 2 (lwr2)", Arrays.asList(new Pair<>("LW Room 1 (lwr1)", 7),new Pair<>("LW Room 4 (lwr4)", 7)));

        //LW Room 3 (lwr3)
        graph.put("LW Room 3 (lwr3)", Arrays.asList(new Pair<>("LW Room 5 (lwr5)", 7),new Pair<>("hallway library left (hll)", 5)));

        //LW Room 4 (lwr4)
        graph.put("LW Room 4 (lwr4)", Arrays.asList(new Pair<>("LW Room 2 (lwr2)", 7),new Pair<>("LW Room 6 (lwr6)", 7)));

        //LW Room 5 (lwr5)
        graph.put("LW Room 5 (lwr5)", Arrays.asList(new Pair<>("LW Room 3 (lwr3)", 7),new Pair<>("LW Room 7 (lwr7)", 7)));

        //LW Room 6 (lwr6)
        graph.put("LW Room 6 (lwr6)", Arrays.asList(new Pair<>("LW Room 4 (lwr4)", 7),new Pair<>("LW Room 8 (lwr8)", 7)));

        //LW Room 7 (lwr7)
        graph.put("LW Room 7 (lwr7)", Arrays.asList(new Pair<>("LW Room 5 (lwr5)", 7),new Pair<>("LW Room 9 (lwr9)", 7)));

        //LW Room 8 (lwr8)
        graph.put("LW Room 8 (lwr8)", Arrays.asList(new Pair<>("LW Room 6 (lwr6)", 7),new Pair<>("LW Room 9 (lwr9)", 7)));

        //LW Room 9 (lwr9)
        graph.put("LW Room 9 (lwr9)", Arrays.asList(new Pair<>("LW Room 7 (lwr7)", 7),new Pair<>("LW Room 8 (lwr8)", 7)));

        //Accounting Office Extension (AOE)
        graph.put("Accounting Office Extension (AOE)", Arrays.asList(new Pair<>("UR: Records Retrieval R3 (URRR3)", 10),new Pair<>("UR: Records Retrieval R5 (URRR5)", 10)));

        //Admission and Registration Services Section (ARSS)
        graph.put("Admission and Registration Services Section (ARSS)", Arrays.asList(new Pair<>("UR: Records Retrieval R6 (URRR6)", 10),new Pair<>("W115", 5)));

        //CR East 1 (CRE1)
        graph.put("CR East 1 (CRE1)", Arrays.asList(new Pair<>("Department of Military Science and Tactics (DMST)", 5),new Pair<>("Inspection Management Office (IMO)", 10)));

        //CCHO
        graph.put("CCHO", Arrays.asList(new Pair<>("Department of Military Science and Tactics (DMST)", 5),new Pair<>("Facility Management Office (FAMO)", 5)));

        //Department of Military Science and Tactics (DMST)
        graph.put("Department of Military Science and Tactics (DMST)", Arrays.asList(new Pair<>("CCHO", 5),new Pair<>("CR East 1 (CRE1)", 5)));

        //Dental Clinic (DC)
        graph.put("Dental Clinic (DC)", Arrays.asList(new Pair<>("Medical Health Services Director (MHSD)", 15),new Pair<>("PUP Multi-Purpose Cooperative (PUPMPC)", 20)));

        //Dome East Hallway 1st (DEH1)
        graph.put("Dome East Hallway 1st (DEH1)", Arrays.asList(new Pair<>("Dome Runway 1st (DR1)", 12),new Pair<>("Dome South Hallway 1st (DSH1)", 12),new Pair<>("Dome West Hallway 1st (DWH1)", 24),new Pair<>("East Wing Stairs 1A (ES1A)", 12),new Pair<>("Medical Clinic (MC)", 12),new Pair<>("East Wing ground (EW4)", 13)));

        //Dome South Hallway 1st (DSH1)
        graph.put("Dome South Hallway 1st (DSH1)", Arrays.asList(new Pair<>("Dome East Hallway 1st (DEH1)", 12),new Pair<>("Dome Runway 1st (DR1)", 12),new Pair<>("UR: Records Retrieval R5 (URRR5)", 20),new Pair<>("South Hallway 1A (SH1A)", 24),new Pair<>("East Wing Stairs 1A (ES1A)", 7),new Pair<>("Dome West Hallway 1st (DWH1)", 12),new Pair<>("Inspection Management Office (IMO)", 22)));

        //Dome West Hallway 1st (DWH1)
        graph.put("Dome West Hallway 1st (DWH1)", Arrays.asList(new Pair<>("Dome East Hallway 1st (DEH1)", 24),new Pair<>("Dome Runway 1st (DR1)", 12),new Pair<>("Dome South Hallway 1st (DSH1)", 12),new Pair<>("UR: Records Retrieval R5 (URRR5)", 26),new Pair<>("West Wing Stairs 1A (WS1A)", 12),new Pair<>("West Wing ground (WW3)", 12)));

        //Dome Runway 1st (DR1)
        graph.put("Dome Runway 1st (DR1)", Arrays.asList(new Pair<>("Dome East Hallway 1st (DEH1)", 12),new Pair<>("Dome South Hallway 1st (DSH1)", 12),new Pair<>("Dome West Hallway 1st (DWH1)", 12),new Pair<>("Internal Audit Office (IAO)", 2)));     

        //East Hallway 1 (EH1)
        graph.put("East Hallway 1 (EH1)", Arrays.asList(new Pair<>("East Wing Stairs 1B (ES1B)", 1),new Pair<>("Facility Management Office (FAMO)", 16),new Pair<>("PUP Multi-Purpose Cooperative (PUPMPC)", 16),new Pair<>("East Wing ground (EW2)", 2)));
        //East Wing Stairs 1A (ES1A)
        graph.put("East Wing Stairs 1A (ES1A)", Arrays.asList(new Pair<>("Dome East Hallway 1st (DEH1)", 12),new Pair<>("Dome South Hallway 1st (DSH1)", 7),new Pair<>("Inspection Management Office (IMO)", 20),new Pair<>("East Wing Stairs 2A (ES2A)", 6)));

        //East Wing Stairs 1B (ES1B)
        graph.put("East Wing Stairs 1B (ES1B)", Arrays.asList(new Pair<>("East Hallway 1 (EH1)", 1),new Pair<>("East Wing Stairs 2B (ES2B)", 6)));

        //Fire Exit 1 (FR1)
        graph.put("Fire Exit 1 (FR1)", Arrays.asList(new Pair<>("S105 Office of the University Registrar 1 (OUR1)", 9)));

        //Fire Exit 2 (FR2)
        graph.put("Fire Exit 2 (FR2)", Arrays.asList(new Pair<>("S103 Budget Services (BS)", 9)));

        //Facility Management Office (FAMO)
        graph.put("Facility Management Office (FAMO)", Arrays.asList(new Pair<>("CCHO", 5),new Pair<>("East Hallway 1 (EH1)", 16)));

        //Internal Audit Office (IAO)
        graph.put("Internal Audit Office (IAO)", Arrays.asList(new Pair<>("Dome Runway 1st (DR1)", 2)));

        //Inspection Management Office (IMO)
        graph.put("Inspection Management Office (IMO)", Arrays.asList(new Pair<>("CR East 1 (CRE1)", 10),new Pair<>("East Wing Stairs 1A (ES1A)", 20),new Pair<>("Dome South Hallway 1st (DSH1)", 22)));

        //Medical Clinic (MC)
        graph.put("Medical Clinic (MC)", Arrays.asList(new Pair<>("Dome East Hallway 1st (DEH1)", 12),new Pair<>("Medical Health Services Director (MHSD)", 15),new Pair<>("East Wing ground (EW4)", 7)));

        //Medical Health Services Director (MHSD)
        graph.put("Medical Health Services Director (MHSD)", Arrays.asList(new Pair<>("Dental Clinic (DC)", 15),new Pair<>("Medical Clinic (MC)", 15)));

        //Public Assitance Complaint Desk (PACD)
        graph.put("Public Assitance Complaint Desk (PACD)", Arrays.asList(new Pair<>("West Wing ground (WW3)", 5),new Pair<>("East Wing ground (EW4)", 22)));

        //PUP Multi-Purpose Cooperative (PUPMPC)
        graph.put("PUP Multi-Purpose Cooperative (PUPMPC)", Arrays.asList(new Pair<>("Dental Clinic (DC)", 20),new Pair<>("East Hallway 1 (EH1)", 16)));

        //Scholarahip Office (OSFA)
        graph.put("Scholarahip Office (OSFA)", Arrays.asList(new Pair<>("Scholarship and Financial Assistance Services (SFAS)", 10),new Pair<>("West Hallway 1 (WH2)", 16)));

        //Scholarship and Financial Assistance Services (SFAS)
        graph.put("Scholarship and Financial Assistance Services (SFAS)", Arrays.asList(new Pair<>("Scholarahip Office (OSFA)", 10),new Pair<>("W115", 10)));

        //Office of the University Registrar: Records Retrieval Section (OURRRS)
        graph.put("Office of the University Registrar: Records Retrieval Section (OURRRS)", Arrays.asList(new Pair<>("West Hallway 1 (WH2)", 16),new Pair<>("UR: Records Retrieval R3 (URRR3)", 10)));

        //South Hallway 1A (SH1A)
        graph.put("South Hallway 1A (SH1A)", Arrays.asList(new Pair<>("S109 Accounting Office (AO)", 10),new Pair<>("Dome South Hallway 1st (DSH1)", 24),new Pair<>("South Hallway 1B (SH1B)", 22),new Pair<>("South Hallway 1D (SH1D)", 22),new Pair<>("South Wing Stairs 1B (SS1B)", 6)));

        //South Hallway 1B (SH1B)
        graph.put("South Hallway 1B (SH1B)", Arrays.asList(new Pair<>("South Wing Stairs 1A (SS1A)", 4),new Pair<>("S107 Accounting Division Student Services Section (ADSSS)", 4),new Pair<>("S108 (S108)", 4),new Pair<>("South Hallway 1A (SH1A)", 22),new Pair<>("South Hallway 1C (SH1C)", 4)));

        //South Hallway 1C (SH1C)
        graph.put("South Hallway 1C (SH1C)", Arrays.asList(new Pair<>("S106 Payroll Section (PS)", 4),new Pair<>("South Hallway 1B (SH1B)", 4)));

        //South Hallway 1D (SH1D)
        graph.put("South Hallway 1D (SH1D)", Arrays.asList(new Pair<>("S101 Fund Management Office (FMO)", 4),new Pair<>("South Hallway 1A (SH1A)", 22),new Pair<>("South Hallway 1E (SH1E)", 4),new Pair<>("South Wing Stairs 1C (SS1C)", 4)));

        //South Hallway 1E (SH1E)
        graph.put("South Hallway 1E (SH1E)", Arrays.asList(new Pair<>("S103 Budget Services (BS)", 4),new Pair<>("S102 (S102)", 4),new Pair<>("South Hallway 1D (SH1D)", 4)));

        //S101 Fund Management Office (FMO)
        graph.put("S101 Fund Management Office (FMO)", Arrays.asList(new Pair<>("South Hallway 1D (SH1D)", 4)));

        //S102 (S102)
        graph.put("S102 (S102)", Arrays.asList(new Pair<>("South Hallway 1E (SH1E)", 4)));

        //S103 Budget Services (BS)
        graph.put("S103 Budget Services (BS)", Arrays.asList(new Pair<>("Fire Exit 2 (FR2)", 9),new Pair<>("S104 Office of the University Registrar 2 (OUR2)", 20),new Pair<>("South Hallway 1E (SH1E)", 4)));

        //S104 Office of the University Registrar 2 (OUR2)
        graph.put("S104 Office of the University Registrar 2 (OUR2)", Arrays.asList(new Pair<>("S103 Budget Services (BS)", 20),new Pair<>("S105 Office of the University Registrar 1 (OUR1)", 20),new Pair<>("South Wing Stairs 1B (SS1B)", 10)));        

        //S105 Office of the University Registrar 1 (OUR1)
        graph.put("S105 Office of the University Registrar 1 (OUR1)", Arrays.asList(new Pair<>("Fire Exit 1 (FR1)", 9),new Pair<>("S104 Office of the University Registrar 2 (OUR2)", 20),new Pair<>("S106 Payroll Section (PS)", 4)));

        //S106 Payroll Section (PS)
        graph.put("S106 Payroll Section (PS)", Arrays.asList(new Pair<>("S105 Office of the University Registrar 1 (OUR1)", 4),new Pair<>("South Hallway 1C (SH1C)", 4)));

        //S107 Accounting Division Student Services Section (ADSSS)
        graph.put("S107 Accounting Division Student Services Section (ADSSS)", Arrays.asList(new Pair<>("South Hallway 1B (SH1B)", 4)));

        //S108 (S108)
        graph.put("S108 (S108)", Arrays.asList(new Pair<>("S109 Accounting Office (AO)", 10),new Pair<>("South Hallway 1B (SH1B)", 4)));

        //S109 Accounting Office (AO)
        graph.put("S109 Accounting Office (AO)", Arrays.asList(new Pair<>("S108 (S108)", 10),new Pair<>("South Hallway 1A (SH1A)", 10)));

        //South Wing Stairs 1A (SS1A)
        graph.put("South Wing Stairs 1A (SS1A)", Arrays.asList(new Pair<>("South Hallway 1B (SH1B)", 4),new Pair<>("South Wing Stairs 2A (SS2A)", 6)));

        //South Wing Stairs 1B (SS1B)
        graph.put("South Wing Stairs 1B (SS1B)", Arrays.asList(new Pair<>("South Hallway 1A (SH1A)", 6),new Pair<>("S104 Office of the University Registrar 2 (OUR2)", 10),new Pair<>("South Wing Stairs 2B (SS2B)", 6)));

        //South Wing Stairs 1C (SS1C)
        graph.put("South Wing Stairs 1C (SS1C)", Arrays.asList(new Pair<>("South Hallway 1D (SH1D)", 4),new Pair<>("South Wing Stairs 2C (SS2C)", 6)));

        //West Hallway 1 (WH2)
        graph.put("West Hallway 1 (WH2)", Arrays.asList(new Pair<>("Scholarahip Office (OSFA)", 16),new Pair<>("Office of the University Registrar: Records Retrieval Section (OURRRS)", 16),new Pair<>("West Wing Stairs 1B (WS1B)", 2),new Pair<>("West Wing ground (WW2)", 2)));

        //West Wing Stairs 1B (WS1B)
        graph.put("West Wing Stairs 1B (WS1B)", Arrays.asList(new Pair<>("West Hallway 1 (WH2)", 2),new Pair<>("West Wing Stairs 2B (WS2B)", 6)));

        //West Wing Stairs 1A (WS1A)
        graph.put("West Wing Stairs 1A (WS1A)", Arrays.asList(new Pair<>("Dome West Hallway 1st (DWH1)", 12),new Pair<>("UR: Records Retrieval R6 (URRR6)", 5),new Pair<>("West Wing ground (WW3)", 4),new Pair<>("West Wing Stairs 2A (WS2A)", 6)));      

        //West Wing ground (WW3)
        graph.put("West Wing ground (WW3)", Arrays.asList(new Pair<>("Dome West Hallway 1st (DWH1)", 12),new Pair<>("Public Assitance Complaint Desk (PACD)", 5),new Pair<>("West Wing Stairs 1A (WS1A)", 4)));

        //W115
        graph.put("W115", Arrays.asList(new Pair<>("Admission and Registration Services Section (ARSS)", 5),new Pair<>("Scholarship and Financial Assistance Services (SFAS)", 10)));

        //UR: Records Retrieval R3 (URRR3)
        graph.put("UR: Records Retrieval R3 (URRR3)", Arrays.asList(new Pair<>("Accounting Office Extension (AOE)", 10),new Pair<>("Office of the University Registrar: Records Retrieval Section (OURRRS)", 10)));

        //UR: Records Retrieval R5 (URRR5)
        graph.put("UR: Records Retrieval R5 (URRR5)", Arrays.asList(new Pair<>("Accounting Office Extension (AOE)", 10),new Pair<>("Dome South Hallway 1st (DSH1)", 20),new Pair<>("Dome West Hallway 1st (DWH1)", 26)));

        //UR: Records Retrieval R6 (URRR6)
        graph.put("UR: Records Retrieval R6 (URRR6)", Arrays.asList(new Pair<>("Admission and Registration Services Section (ARSS)", 10),new Pair<>("West Wing Stairs 1A (WS1A)", 5)));

        //CR West 2 (CRW2)
        graph.put("CR West 2 (CRW2)", Arrays.asList(new Pair<>("W219", 4),new Pair<>("West Hallway 2 (WH2)", 8)));

        //CR South 2B (CRS2B)
        graph.put("CR South 2B (CRS2B)", Arrays.asList(new Pair<>("South Hallway 2E (SH2E)", 4)));

        //CR South 2A (CRS2A)
        graph.put("CR South 2A (CRS2A)", Arrays.asList(new Pair<>("South Hallway 2C (SH2C)", 4)));

        //Dome East Hallway 2nd (DEH2)
        graph.put("Dome East Hallway 2nd (DEH2)", Arrays.asList(new Pair<>("Dome Runway 2nd (DR2)", 12),new Pair<>("Dome South Hallway 2nd (DSH2)", 12),new Pair<>("Dome West Hallway 2nd (DWH2)", 24),new Pair<>("East Wing Stairs 2A (ES2A)", 12),new Pair<>("E200 Office of the Unyon ng Mga Guro sa PUP (E200)", 12)));

        //Dome Runway 2nd (DR2)
        graph.put("Dome Runway 2nd (DR2)", Arrays.asList(new Pair<>("Dome East Hallway 2nd (DEH2)", 12),new Pair<>("Resource Generation Office (RGO)", 2),new Pair<>("Dome South Hallway 2nd (DSH2)", 12),new Pair<>("Dome West Hallway 2nd (DWH2)", 12)));
        //Resource Generation Office (RGO)
        graph.put("Resource Generation Office (RGO)", Arrays.asList(new Pair<>("Dome Runway 2nd (DR2)", 2)));

        //Dome South Hallway 2nd (DSH2)
        graph.put("Dome South Hallway 2nd (DSH2)", Arrays.asList(new Pair<>("Dome East Hallway 2nd (DEH2)", 12),new Pair<>("Dome Runway 2nd (DR2)", 12),new Pair<>("Dome West Hallway 2nd (DWH2)", 12),new Pair<>("East Wing Stairs 2A (ES2A)", 10),new Pair<>("South Hallway 2A (SH2A)", 24),new Pair<>("W200", 12)));

        //Dome West Hallway 2nd (DWH2)
        graph.put("Dome West Hallway 2nd (DWH2)", Arrays.asList(new Pair<>("Dome East Hallway 2nd (DEH2)", 24),new Pair<>("Dome Runway 2nd (DR2)", 12),new Pair<>("Dome South Hallway 2nd (DSH2)", 12),new Pair<>("W200", 12),new Pair<>("West Wing Stairs 2A (WS2A)", 12)));

        //South Wing Stairs 2A (SS2A)
        graph.put("South Wing Stairs 2A (SS2A)", Arrays.asList(new Pair<>("South Hallway 2B (SH2B)", 4),new Pair<>("South Wing Stairs 1A (SS1A)", 6),new Pair<>("South Wing Stairs 3A (SS3A)", 6)));

        //South Wing Stairs 2B (SS2B)
        graph.put("South Wing Stairs 2B (SS2B)", Arrays.asList(new Pair<>("S209 Dr. Pablo T. Mateo Jr. Conference Room (S209)", 10),new Pair<>("South Hallway 2A (SH2A)", 6),new Pair<>("South Wing Stairs 1B (SS1B)", 6),new Pair<>("South Wing Stairs 3B (SS3B)", 6)));

        //South Wing Stairs 2C (SS2C)
        graph.put("South Wing Stairs 2C (SS2C)", Arrays.asList(new Pair<>("South Hallway 2D (SH2D)", 4),new Pair<>("South Wing Stairs 1C (SS1C)", 6),new Pair<>("South Wing Stairs 3C (SS3C)", 6)));

        //South Hallway 2A (SH2A)
        graph.put("South Hallway 2A (SH2A)", Arrays.asList(new Pair<>("Dome South Hallway 2nd (DSH2)", 24),new Pair<>("S201 Networks Operation Center - Server Room (S201)", 7),new Pair<>("S215 Office of the Vice President for Student Services - OVPSS (S215)", 7),new Pair<>("South Wing Stairs 2B (SS2B)", 6)));

        //South Hallway 2B (SH2B)
        graph.put("South Hallway 2B (SH2B)", Arrays.asList(new Pair<>("S213 Dr. Ofelia M. Carague Conference Room (S213)", 4),new Pair<>("S212 Office of the Vice President for Administration - OVPA (S212)", 4),new Pair<>("South Hallway 2C (SH2C)", 4),new Pair<>("South Wing Stairs 2A (SS2A)", 4)));

        //South Hallway 2C (SH2C)
        graph.put("South Hallway 2C (SH2C)", Arrays.asList(new Pair<>("CR South 2A (CRS2A)", 4),new Pair<>("S211 Office of the Vice President for Branch and Campuses - OVPBC (S211)", 4),new Pair<>("South Hallway 2B (SH2B)", 4)));

        //South Hallway 2D (SH2D)
        graph.put("South Hallway 2D (SH2D)", Arrays.asList(new Pair<>("S203 Office of the Vice President for Finance - OVPF (S203)", 4),new Pair<>("S204 Office of the Vice President for Research and Extension Development - OVPREPD (S204)", 4),new Pair<>("South Hallway 2E (SH2E)", 4),new Pair<>("South Wing Stairs 2C (SS2C)", 4)));

        //South Hallway 2E (SH2E)
        graph.put("South Hallway 2E (SH2E)", Arrays.asList(new Pair<>("CR South 2B (CRS2B)", 4),new Pair<>("S205 Dr. Zenaida A. Olonan Conference Room (S205)", 4),new Pair<>("S206 Office of the University Board Secretary (S206)", 4),new Pair<>("South Hallway 2D (SH2D)", 4)));

        //S201 Networks Operation Center - Server Room (S201)
        graph.put("S201 Networks Operation Center - Server Room (S201)", Arrays.asList(new Pair<>("S202", 7),new Pair<>("South Hallway 2A (SH2A)", 7)));

        //S202
        graph.put("S202", Arrays.asList(new Pair<>("S201 Networks Operation Center - Server Room (S201)", 7),new Pair<>("S203 Office of the Vice President for Finance - OVPF (S203)", 7)));

        //S203 Office of the Vice President for Finance - OVPF (S203)
        graph.put("S203 Office of the Vice President for Finance - OVPF (S203)", Arrays.asList(new Pair<>("S202", 7),new Pair<>("South Hallway 2D (SH2D)", 4)));

        //S204 Office of the Vice President for Research and Extension Development - OVPREPD (S204)
        graph.put("S204 Office of the Vice President for Research and Extension Development - OVPREPD (S204)", Arrays.asList(new Pair<>("South Hallway 2D (SH2D)", 4)));

        //S205 Dr. Zenaida A. Olonan Conference Room (S205)
        graph.put("S205 Dr. Zenaida A. Olonan Conference Room (S205)", Arrays.asList(new Pair<>("South Hallway 2E (SH2E)", 4)));

        //S206 Office of the University Board Secretary (S206)
        graph.put("S206 Office of the University Board Secretary (S206)", Arrays.asList(new Pair<>("South Hallway 2E (SH2E)", 4),new Pair<>("S207", 7)));

        //S207
        graph.put("S207", Arrays.asList(new Pair<>("S208 Office of the President (S208)", 7),new Pair<>("S206 Office of the University Board Secretary (S206)", 7)));

        //S208 Office of the President (S208)
        graph.put("S208 Office of the President (S208)", Arrays.asList(new Pair<>("S209 Dr. Pablo T. Mateo Jr. Conference Room (S209)", 7),new Pair<>("S207", 7)));

        //S209 Dr. Pablo T. Mateo Jr. Conference Room (S209)
        graph.put("S209 Dr. Pablo T. Mateo Jr. Conference Room (S209)", Arrays.asList(new Pair<>("S210 Office of the Executive Vice President - OEVP (S210)", 14),new Pair<>("S208 Office of the President (S208)", 7),new Pair<>("South Wing Stairs 2B (SS2B)", 10)));

        //S210 Office of the Executive Vice President - OEVP (S210)
        graph.put("S210 Office of the Executive Vice President - OEVP (S210)", Arrays.asList(new Pair<>("S209 Dr. Pablo T. Mateo Jr. Conference Room (S209)", 7),new Pair<>("S211 Office of the Vice President for Branch and Campuses - OVPBC (S211)", 7)));

        //S211 Office of the Vice President for Branch and Campuses - OVPBC (S211)
        graph.put("S211 Office of the Vice President for Branch and Campuses - OVPBC (S211)", Arrays.asList(new Pair<>("S210 Office of the Executive Vice President - OEVP (S210)", 7),new Pair<>("South Hallway 2C (SH2C)", 4)));

        //S212 Office of the Vice President for Administration - OVPA (S212)
        graph.put("S212 Office of the Vice President for Administration - OVPA (S212)", Arrays.asList(new Pair<>("South Hallway 2B (SH2B)", 4)));

        //S213 Dr. Ofelia M. Carague Conference Room (S213)
        graph.put("S213 Dr. Ofelia M. Carague Conference Room (S213)", Arrays.asList(new Pair<>("S214 Office of the Vice President for Administration - OVPA (S214)", 7),new Pair<>("South Hallway 2B (SH2B)", 4)));

        //S214 Office of the Vice President for Administration - OVPA (S214)
        graph.put("S214 Office of the Vice President for Administration - OVPA (S214)", Arrays.asList(new Pair<>("S213 Dr. Ofelia M. Carague Conference Room (S213)", 7),new Pair<>("S215 Office of the Vice President for Student Services - OVPSS (S215)", 7)));

        //S215 Office of the Vice President for Student Services - OVPSS (S215)
        graph.put("S215 Office of the Vice President for Student Services - OVPSS (S215)", Arrays.asList(new Pair<>("S214 Office of the Vice President for Administration - OVPA (S214)", 7),new Pair<>("South Hallway 2A (SH2A)", 7)));

        //East Hallway 2 (EH2)
        graph.put("East Hallway 2 (EH2)", Arrays.asList(new Pair<>("E219", 12),new Pair<>("E220", 12),new Pair<>("East Wing Stairs 2B (ES2B)", 2)));

        //East Wing Stairs 2B (ES2B)
        graph.put("East Wing Stairs 2B (ES2B)", Arrays.asList(new Pair<>("East Hallway 2 (EH2)", 2),new Pair<>("East Wing Stairs 1B (ES1B)", 6),new Pair<>("East Wing Stairs 3B (ES3B)", 6)));

        //East Wing Stairs 2A (ES2A)
        graph.put("East Wing Stairs 2A (ES2A)", Arrays.asList(new Pair<>("Dome East Hallway 2nd (DEH2)", 12),new Pair<>("E201 DCSD Reading Area (E201)", 5),new Pair<>("Dome South Hallway 2nd (DSH2)", 10),new Pair<>("East Wing Stairs 1A (ES1A)", 6),new Pair<>("East Wing Stairs 3A (ES3A)", 6)));

        //E200 Office of the Unyon ng Mga Guro sa PUP (E200)
        graph.put("E200 Office of the Unyon ng Mga Guro sa PUP (E200)", Arrays.asList(new Pair<>("Dome East Hallway 2nd (DEH2)", 12),new Pair<>("E202 National Service Training Program - NSTP Office (E202)", 5)));

        //E201 DCSD Reading Area (E201)
        graph.put("E201 DCSD Reading Area (E201)", Arrays.asList(new Pair<>("E203 DCSD Faculty Room (E203)", 5),new Pair<>("East Wing Stairs 2A (ES2A)", 5)));

        //E202 National Service Training Program - NSTP Office (E202)
        graph.put("E202 National Service Training Program - NSTP Office (E202)", Arrays.asList(new Pair<>("E204 College of Social Sciences and Development Faculty - CSSD (E204)", 5),new Pair<>("E200 Office of the Unyon ng Mga Guro sa PUP (E200)", 5)));

        //E203 DCSD Faculty Room (E203)
        graph.put("E203 DCSD Faculty Room (E203)", Arrays.asList(new Pair<>("E205 DCSD Faculty Room (E205)", 5),new Pair<>("E201 DCSD Reading Area (E201)", 5)));

        //E204 College of Social Sciences and Development Faculty - CSSD (E204)
        graph.put("E204 College of Social Sciences and Development Faculty - CSSD (E204)", Arrays.asList(new Pair<>("E202 National Service Training Program - NSTP Office (E202)", 5),new Pair<>("E206", 5)));

        //E205 DCSD Faculty Room (E205)
        graph.put("E205 DCSD Faculty Room (E205)", Arrays.asList(new Pair<>("E203 DCSD Faculty Room (E203)", 5),new Pair<>("E207", 5)));

        //E206
        graph.put("E206", Arrays.asList(new Pair<>("E204 College of Social Sciences and Development Faculty - CSSD (E204)", 5),new Pair<>("E208 Unaka PUP Office (E208)", 5)));

        //E207
        graph.put("E207", Arrays.asList(new Pair<>("E205 DCSD Faculty Room (E205)", 5),new Pair<>("E209", 5)));

        //E208 Unaka PUP Office (E208)
        graph.put("E208 Unaka PUP Office (E208)", Arrays.asList(new Pair<>("E206", 5),new Pair<>("E210", 5)));

        //E209
        graph.put("E209", Arrays.asList(new Pair<>("E207", 5),new Pair<>("E211", 5)));

        //E210
        graph.put("E210", Arrays.asList(new Pair<>("E212", 5),new Pair<>("E208 Unaka PUP Office (E208)", 5)));

        //E211
        graph.put("E211", Arrays.asList(new Pair<>("E209", 5),new Pair<>("E213", 5)));

        //E212
        graph.put("E212", Arrays.asList(new Pair<>("E210", 5),new Pair<>("E214", 5)));

        //E213
        graph.put("E213", Arrays.asList(new Pair<>("E211", 5),new Pair<>("E215", 5)));

        //E214
        graph.put("E214", Arrays.asList(new Pair<>("E212", 5),new Pair<>("E216", 5)));

        //E215
        graph.put("E215", Arrays.asList(new Pair<>("E213", 5),new Pair<>("E217", 5)));

        //E216
        graph.put("E216", Arrays.asList(new Pair<>("E214", 5),new Pair<>("E218", 5)));

        //E217
        graph.put("E217", Arrays.asList(new Pair<>("E215", 5),new Pair<>("E219", 5)));

        //E218
        graph.put("E218", Arrays.asList(new Pair<>("E216", 5),new Pair<>("E220", 5)));

        //E219
        graph.put("E219", Arrays.asList(new Pair<>("E217", 5),new Pair<>("East Hallway 2 (EH2)", 12)));

        //E220
        graph.put("E220", Arrays.asList(new Pair<>("E218", 5),new Pair<>("East Hallway 2 (EH2)", 12)));

        //West Hallway 2 (WH2)
        graph.put("West Hallway 2 (WH2)", Arrays.asList(new Pair<>("CR West 2 (CRW2)", 4),new Pair<>("W220", 12)));

        //West Wing Stairs 2B (WS2B)
        graph.put("West Wing Stairs 2B (WS2B)", Arrays.asList(new Pair<>("West Hallway 2 (WH2)", 1),new Pair<>("West Wing Stairs 1B (WS1B)", 6),new Pair<>("West Wing Stairs 3B (WS3B)", 6)));

        //West Wing Stairs 2A (WS2A)
        graph.put("West Wing Stairs 2A (WS2A)", Arrays.asList(new Pair<>("W201 Disaster Resilience Institute - DRI (W201)", 5),new Pair<>("Dome West Hallway 2nd (DWH2)", 12),new Pair<>("West Wing Stairs 1A (WS1A)", 6),new Pair<>("West Wing Stairs 3A (WS3A)", 6)));

        //W200
        graph.put("W200", Arrays.asList(new Pair<>("Dome South Hallway 2nd (DSH2)", 10),new Pair<>("Dome West Hallway 2nd (DWH2)", 12),new Pair<>("W202", 5)));

        //W201 Disaster Resilience Institute - DRI (W201)
        graph.put("W201 Disaster Resilience Institute - DRI (W201)", Arrays.asList(new Pair<>("W203", 5),new Pair<>("West Wing Stairs 2A (WS2A)", 5)));

        //W202
        graph.put("W202", Arrays.asList(new Pair<>("W200", 5),new Pair<>("W204", 5)));

        //W203
        graph.put("W203", Arrays.asList(new Pair<>("W201 Disaster Resilience Institute - DRI (W201)", 5),new Pair<>("W205", 5)));

        //W204
        graph.put("W204", Arrays.asList(new Pair<>("W202", 5),new Pair<>("W206", 5)));

        //W205
        graph.put("W205", Arrays.asList(new Pair<>("W203", 5),new Pair<>("W207", 5)));

        //W206
        graph.put("W206", Arrays.asList(new Pair<>("W204", 5),new Pair<>("W208", 5)));

        //W207
        graph.put("W207", Arrays.asList(new Pair<>("W205", 5),new Pair<>("W209 PUP SHS Department Admission Office (W209)", 5)));

        //W208
        graph.put("W208", Arrays.asList(new Pair<>("W206", 5),new Pair<>("W210", 5)));

        //W209 PUP SHS Department Admission Office (W209)
        graph.put("W209 PUP SHS Department Admission Office (W209)", Arrays.asList(new Pair<>("W211 PUP SHS Department Office of the Principal Office of the Registrar (W211)", 5),new Pair<>("W207", 5)));

        //W210
        graph.put("W210", Arrays.asList(new Pair<>("W208", 5),new Pair<>("W212", 5)));

        //W211 PUP SHS Department Office of the Principal Office of the Registrar (W211)
        graph.put("W211 PUP SHS Department Office of the Principal Office of the Registrar (W211)", Arrays.asList(new Pair<>("W209 PUP SHS Department Admission Office (W209)", 5),new Pair<>("W213", 5)));

        //W212
        graph.put("W212", Arrays.asList(new Pair<>("W210", 5),new Pair<>("W214", 5)));

        //W213
        graph.put("W213", Arrays.asList(new Pair<>("W215 Commission on Audit: Storage Room (W215)", 5),new Pair<>("W211 PUP SHS Department Office of the Principal Office of the Registrar (W211)", 5)));

        //W214
        graph.put("W214", Arrays.asList(new Pair<>("W212", 5),new Pair<>("W216", 5)));

        //W215 Commission on Audit: Storage Room (W215)
        graph.put("W215 Commission on Audit: Storage Room (W215)", Arrays.asList(new Pair<>("W213", 5),new Pair<>("W217", 5)));

        //W217
        graph.put("W217", Arrays.asList(new Pair<>("W215 Commission on Audit: Storage Room (W215)", 5),new Pair<>("W219", 5)));

        //W216
        graph.put("W216", Arrays.asList(new Pair<>("W214", 5),new Pair<>("W218", 5)));

        //W218
        graph.put("W218", Arrays.asList(new Pair<>("W216", 5),new Pair<>("W220", 5)));

        //W219
        graph.put("W219", Arrays.asList(new Pair<>("W217", 5),new Pair<>("CR West 2 (CRW2)", 8)));

        //W220
        graph.put("W220", Arrays.asList(new Pair<>("W218", 5),new Pair<>("West Wing Stairs 2B (WS2B)", 5),new Pair<>("West Hallway 2 (WH2)", 12)));

        //CR South 3A (CRS3A)
        graph.put("CR South 3A (CRS3A)", Arrays.asList(new Pair<>("South Hallway 3C (SH3C)", 4)));

        //CR South 3B (CRS3B)
        graph.put("CR South 3B (CRS3B)", Arrays.asList(new Pair<>("South Hallway 3E (SH3E)", 4)));

        //CR East 3 (CRE3)
        graph.put("CR East 3 (CRE3)", Arrays.asList(new Pair<>("Dome South Hallway 3rd (DSH3)", 10),new Pair<>("E301 (E301)", 5),new Pair<>("East Wing Stairs 3A (ES3A)", 5)));

        //CR West 3A (CRW3A)
        graph.put("CR West 3A (CRW3A)", Arrays.asList(new Pair<>("Dome Runway 3rd (DR3)", 10),new Pair<>("W301 (W301)", 5),new Pair<>("West Wing Stairs 3A (WS3A)", 5)));

        //COED Dean and Chairperson's Office
        graph.put("COED Dean and Chairperson's Office", Arrays.asList(new Pair<>("Dome Runway 3rd (DR3)", 2)));

        //Dome Runway 3rd (DR3)
        graph.put("Dome Runway 3rd (DR3)", Arrays.asList(new Pair<>("Dome West Hallway 3rd (DWH3)", 12),new Pair<>("COED Dean and Chairperson's Office", 2),new Pair<>("West Wing Stairs 3A (WS3A)", 10),new Pair<>("CR West 3A (CRW3A)", 10)));

        //Dome South Hallway 3rd (DSH3)
        graph.put("Dome South Hallway 3rd (DSH3)", Arrays.asList(new Pair<>("Dome West Hallway 3rd (DWH3)", 12),new Pair<>("East Wing Stairs 3A (ES3A)", 6),new Pair<>("Dome East Hallway 3rd (DEH3)", 12),new Pair<>("CR East 3 (CRE3)", 10),new Pair<>("South Hallway 3A (SH3A)", 24),new Pair<>("W300 College of Education Faculty Room (W300)", 8)));

        //Dome East Hallway 3rd (DEH3)
        graph.put("Dome East Hallway 3rd (DEH3)", Arrays.asList(new Pair<>("Dome West Hallway 3rd (DWH3)", 24),new Pair<>("Dome South Hallway 3rd (DSH3)", 12),new Pair<>("E300 (E300)", 12),new Pair<>("East Wing Stairs 3A (ES3A)", 12)));

        //Dome West Hallway 3rd (DWH3)
        graph.put("Dome West Hallway 3rd (DWH3)", Arrays.asList(new Pair<>("West Wing Stairs 3A (WS3A)", 12),new Pair<>("Dome South Hallway 3rd (DSH3)", 12),new Pair<>("Dome East Hallway 3rd (DEH3)", 24),new Pair<>("W300 College of Education Faculty Room (W300)", 12),new Pair<>("Dome Runway 3rd (DR3)", 12)));

        //E300 (E300)
        graph.put("E300 (E300)", Arrays.asList(new Pair<>("Dome East Hallway 3rd (DEH3)", 5),new Pair<>("E302 (E302)", 5)));

        //E301 (E301)
        graph.put("E301 (E301)", Arrays.asList(new Pair<>("CR East 3 (CRE3)", 5),new Pair<>("E303 (E303)", 5)));

        //E302 (E302)
        graph.put("E302 (E302)", Arrays.asList(new Pair<>("E300 (E300)", 5),new Pair<>("E304 (E304)", 5)));

        //E303 (E303)
        graph.put("E303 (E303)", Arrays.asList(new Pair<>("E301 (E301)", 5),new Pair<>("E305 (E305)", 5)));

        //E304 (E304)
        graph.put("E304 (E304)", Arrays.asList(new Pair<>("E302 (E302)", 5),new Pair<>("E306 (E306)", 5)));

        //E305 (E305)
        graph.put("E305 (E305)", Arrays.asList(new Pair<>("E303 (E303)", 5),new Pair<>("E307 (E307)", 5)));

        //E306 (E306)
        graph.put("E306 (E306)", Arrays.asList(new Pair<>("E304 (E304)", 5),new Pair<>("E308 (E308)", 5)));

        //E307 (E307)
        graph.put("E307 (E307)", Arrays.asList(new Pair<>("E305 (E305)", 5),new Pair<>("E309 (E309)", 5)));

        //E308 (E308)
        graph.put("E308 (E308)", Arrays.asList(new Pair<>("E306 (E306)", 5),new Pair<>("E310 Department of Office Administration: Computer Laboratory (E310)", 5)));

        //E309 (E309)
        graph.put("E309 (E309)", Arrays.asList(new Pair<>("E307 (E307)", 5),new Pair<>("E311 (E311)", 5)));

        //E310 Department of Office Administration: Computer Laboratory (E310)
        graph.put("E310 Department of Office Administration: Computer Laboratory (E310)", Arrays.asList(new Pair<>("E308 (E308)", 5),new Pair<>("E312 Department of Office Administration: Stenography Laboratory (E312)", 5)));

        //E311 (E311)
        graph.put("E311 (E311)", Arrays.asList(new Pair<>("E313 (E313)", 5),new Pair<>("E309 (E309)", 5)));

        //E312 Department of Office Administration: Stenography Laboratory (E312)
        graph.put("E312 Department of Office Administration: Stenography Laboratory (E312)", Arrays.asList(new Pair<>("E310 Department of Office Administration: Computer Laboratory (E310)", 5),new Pair<>("E314 (E314)", 5)));

        //E313 (E313)
        graph.put("E313 (E313)", Arrays.asList(new Pair<>("E311 (E311)", 5),new Pair<>("E315 (E315)", 5)));

        //E314 (E314)
        graph.put("E314 (E314)", Arrays.asList(new Pair<>("E312 Department of Office Administration: Stenography Laboratory (E312)", 5),new Pair<>("E316 (E316)", 5)));

        //E315 (E315)
        graph.put("E315 (E315)", Arrays.asList(new Pair<>("East Hallway 3 (EH3)", 12),new Pair<>("E313 (E313)", 5)));

        //E316 (E316)
        graph.put("E316 (E316)", Arrays.asList(new Pair<>("E314 (E314)", 5),new Pair<>("E318 (E318)", 5)));

        //E318 (E318)
        graph.put("E318 (E318)", Arrays.asList(new Pair<>("East Hallway 3 (EH3)", 12),new Pair<>("E316 (E316)", 5)));

        //East Hallway 3 (EH3)
        graph.put("East Hallway 3 (EH3)", Arrays.asList(new Pair<>("East Wing Stairs 3B (ES3B)", 2),new Pair<>("E315 (E315)", 12),new Pair<>("E318 (E318)", 12)));

        //East Wing Stairs 3A (ES3A)
        graph.put("East Wing Stairs 3A (ES3A)", Arrays.asList(new Pair<>("Dome South Hallway 3rd (DSH3)", 6),new Pair<>("Dome East Hallway 3rd (DEH3)", 12),new Pair<>("CR East 3 (CRE3)", 5),new Pair<>("East Wing Stairs 2A (ES2A)", 6),new Pair<>("East Wing Stairs 4A (ES4A)", 6)));

        //East Wing Stairs 3B (ES3B)
        graph.put("East Wing Stairs 3B (ES3B)", Arrays.asList(new Pair<>("East Hallway 3 (EH3)", 2),new Pair<>("East Wing Stairs 2B (ES2B)", 6),new Pair<>("East Wing Stairs 4B (ES4B)", 6)));

        //South Hallway 3A (SH3A)
        graph.put("South Hallway 3A (SH3A)", Arrays.asList(new Pair<>("Dome South Hallway 3rd (DSH3)", 24),new Pair<>("S318 Procurement Management Office (S318)", 5),new Pair<>("South Wing Stairs 3B (SS3B)", 6),new Pair<>("S301 (S301)", 5)));

        //South Hallway 3B (SH3B)
        graph.put("South Hallway 3B (SH3B)", Arrays.asList(new Pair<>("South Hallway 3C (SH3C)", 4),new Pair<>("S315 BAC Conference Room (S315)", 4),new Pair<>("South Wing Stairs 3A (SS3A)", 4)));

        //South Hallway 3C (SH3C)
        graph.put("South Hallway 3C (SH3C)", Arrays.asList(new Pair<>("CR South 3A (CRS3A)", 4),new Pair<>("S314 Institutional Planning Office (S314)", 4),new Pair<>("S313 Physical Planning and Development Office (S313)", 4),new Pair<>("South Hallway 3B (SH3B)", 4)));

        //South Hallway 3D (SH3D)
        graph.put("South Hallway 3D (SH3D)", Arrays.asList(new Pair<>("S304 Office of International Affairs (S304)", 4),new Pair<>("S306 (S306)", 4),new Pair<>("South Wing Stairs 3C (SS3C)", 4),new Pair<>("South Hallway 3E (SH3E)", 4)));

        //South Hallway 3E (SH3E)
        graph.put("South Hallway 3E (SH3E)", Arrays.asList(new Pair<>("CR South 3B (CRS3B)", 4),new Pair<>("South Hallway 3D (SH3D)", 4),new Pair<>("S307 (S307)", 4),new Pair<>("S308 University Legal Office (S308)", 4)));

        //South Hallway 3F (SH3F)
        graph.put("South Hallway 3F (SH3F)", Arrays.asList(new Pair<>("South Wing Stairs 3B (SS3B)", 10),new Pair<>("S311 General Services Office (S311)", 4),new Pair<>("S310 (S310)", 4)));

        //South Wing Stairs 3A (SS3A)
        graph.put("South Wing Stairs 3A (SS3A)", Arrays.asList(new Pair<>("South Hallway 3B (SH3B)", 4),new Pair<>("South Wing Stairs 2A (SS2A)", 6),new Pair<>("South Wing Stairs 4A (SS4A)", 6)));

        //South Wing Stairs 3B (SS3B)
        graph.put("South Wing Stairs 3B (SS3B)", Arrays.asList(new Pair<>("South Hallway 3A (SH3A)", 6),new Pair<>("South Hallway 3F (SH3F)", 10),new Pair<>("South Wing Stairs 2B (SS2B)", 6),new Pair<>("South Wing Stairs 4B (SS4B)", 6)));

        //South Wing Stairs 3C (SS3C)
        graph.put("South Wing Stairs 3C (SS3C)", Arrays.asList(new Pair<>("South Hallway 3D (SH3D)", 4),new Pair<>("South Wing Stairs 2C (SS2C)", 6),new Pair<>("South Wing Stairs 4C (SS4C)", 6)));

        //S301 (S301)
        graph.put("S301 (S301)", Arrays.asList(new Pair<>("South Hallway 3A (SH3A)", 5),new Pair<>("S302 Special Programs and Projects Office (S302)", 5)));

        //S302 Special Programs and Projects Office (S302)
        graph.put("S302 Special Programs and Projects Office (S302)", Arrays.asList(new Pair<>("S301 (S301)", 5),new Pair<>("S303 Provident Fund Office (S303)", 5)));

        //S303 Provident Fund Office (S303)
        graph.put("S303 Provident Fund Office (S303)", Arrays.asList(new Pair<>("S302 Special Programs and Projects Office (S302)", 5),new Pair<>("S304 Office of International Affairs (S304)", 5)));

        //S304 Office of International Affairs (S304)
        graph.put("S304 Office of International Affairs (S304)", Arrays.asList(new Pair<>("South Hallway 3D (SH3D)", 4),new Pair<>("S303 Provident Fund Office (S303)", 5)));

        //S306 (S306)
        graph.put("S306 (S306)", Arrays.asList(new Pair<>("South Hallway 3D (SH3D)", 4)));

        //S307 (S307)
        graph.put("S307 (S307)", Arrays.asList(new Pair<>("South Hallway 3E (SH3E)", 4)));

        //S308 University Legal Office (S308)
        graph.put("S308 University Legal Office (S308)", Arrays.asList(new Pair<>("South Hallway 3E (SH3E)", 4),new Pair<>("S309 University Legal Office (S309)", 6)));

        //S309 University Legal Office (S309)
        graph.put("S309 University Legal Office (S309)", Arrays.asList(new Pair<>("S308 University Legal Office (S308)", 6),new Pair<>("S310 (S310)", 6)));

        //S310 (S310)
        graph.put("S310 (S310)", Arrays.asList(new Pair<>("South Hallway 3F (SH3F)", 6),new Pair<>("S311 General Services Office (S311)", 6)));

        //S311 General Services Office (S311)
        graph.put("S311 General Services Office (S311)", Arrays.asList(new Pair<>("South Hallway 3F (SH3F)", 6),new Pair<>("S312 Physical Planning and Development Office (S312)", 6)));

        //S312 Physical Planning and Development Office (S312)
        graph.put("S312 Physical Planning and Development Office (S312)", Arrays.asList(new Pair<>("S311 General Services Office (S311)", 6),new Pair<>("S313 Physical Planning and Development Office (S313)", 6)));

        //S313 Physical Planning and Development Office (S313)
        graph.put("S313 Physical Planning and Development Office (S313)", Arrays.asList(new Pair<>("South Hallway 3C (SH3C)", 4),new Pair<>("S312 Physical Planning and Development Office (S312)", 6)));

        //S314 Institutional Planning Office (S314)
        graph.put("S314 Institutional Planning Office (S314)", Arrays.asList(new Pair<>("South Hallway 3C (SH3C)", 4)));

        //S315 BAC Conference Room (S315)
        graph.put("S315 BAC Conference Room (S315)", Arrays.asList(new Pair<>("South Hallway 3B (SH3B)", 4),new Pair<>("S316 PMO-BAC Secretariat Section (S316)", 5)));

        //S316 PMO-BAC Secretariat Section (S316)
        graph.put("S316 PMO-BAC Secretariat Section (S316)", Arrays.asList(new Pair<>("S315 BAC Conference Room (S315)", 5),new Pair<>("S317 BAC Office (S317)", 5)));

        //S317 BAC Office (S317)
        graph.put("S317 BAC Office (S317)", Arrays.asList(new Pair<>("S316 PMO-BAC Secretariat Section (S316)", 5),new Pair<>("S318 Procurement Management Office (S318)", 5)));

        //S318 Procurement Management Office (S318)
        graph.put("S318 Procurement Management Office (S318)", Arrays.asList(new Pair<>("South Hallway 3A (SH3A)", 5),new Pair<>("S317 BAC Office (S317)", 5)));

        //W300 College of Education Faculty Room (W300)
        graph.put("W300 College of Education Faculty Room (W300)", Arrays.asList(new Pair<>("Dome West Hallway 3rd (DWH3)", 12),new Pair<>("Dome South Hallway 3rd (DSH3)", 8),new Pair<>("W302 College of Education Faculty Room (W302)", 5)));

        //W301 (W301)
        graph.put("W301 (W301)", Arrays.asList(new Pair<>("CR West 3A (CRW3A)", 5),new Pair<>("W303 Department of Office Administration Keyboarding Laboratory (W303)", 5)));

        //W302 College of Education Faculty Room (W302)
        graph.put("W302 College of Education Faculty Room (W302)", Arrays.asList(new Pair<>("W300 College of Education Faculty Room (W300)", 5),new Pair<>("W304 (W304)", 5)));

        //W303 Department of Office Administration Keyboarding Laboratory (W303)
        graph.put("W303 Department of Office Administration Keyboarding Laboratory (W303)", Arrays.asList(new Pair<>("W305 (W305)", 5),new Pair<>("W301 (W301)", 5)));

        //W304 (W304)
        graph.put("W304 (W304)", Arrays.asList(new Pair<>("W306 (W306)", 5),new Pair<>("W302 College of Education Faculty Room (W302)", 5)));

        //W305 (W305)
        graph.put("W305 (W305)", Arrays.asList(new Pair<>("W303 Department of Office Administration Keyboarding Laboratory (W303)", 5),new Pair<>("W307 Department of Office Administration Keyboarding Laboratory (W307)", 5)));

        //W306 (W306)
        graph.put("W306 (W306)", Arrays.asList(new Pair<>("W304 (W304)", 5),new Pair<>("W308 (W308)", 5)));

        //W307 Department of Office Administration Keyboarding Laboratory (W307)
        graph.put("W307 Department of Office Administration Keyboarding Laboratory (W307)", Arrays.asList(new Pair<>("W309 (W309)", 5),new Pair<>("W305 (W305)", 5)));

        //W308 (W308)
        graph.put("W308 (W308)", Arrays.asList(new Pair<>("W306 (W306)", 5),new Pair<>("W310 (W310)", 5)));

        //W309 (W309)
        graph.put("W309 (W309)", Arrays.asList(new Pair<>("W307 Department of Office Administration Keyboarding Laboratory (W307)", 5),new Pair<>("W311 (W311)", 5)));

        //W310 (W310)
        graph.put("W310 (W310)", Arrays.asList(new Pair<>("W312 (W312)", 5),new Pair<>("W308 (W308)", 5)));

        //W311 (W311)
        graph.put("W311 (W311)", Arrays.asList(new Pair<>("W309 (W309)", 5),new Pair<>("W313 (W313)", 5)));

        //W312 (W312)
        graph.put("W312 (W312)", Arrays.asList(new Pair<>("W310 (W310)", 5),new Pair<>("W314 (W314)", 5)));

        //W313 (W313)
        graph.put("W313 (W313)", Arrays.asList(new Pair<>("CR West 3B (CRW3B)", 5),new Pair<>("W311 (W311)", 5)));

        //W314 (W314)
        graph.put("W314 (W314)", Arrays.asList(new Pair<>("W312 (W312)", 5),new Pair<>("W316 (W316)", 5)));

        //W316 (W316)
        graph.put("W316 (W316)", Arrays.asList(new Pair<>("W314 (W314)", 5),new Pair<>("W318 (W318)", 5)));

        //W318 (W318)
        graph.put("W318 (W318)", Arrays.asList(new Pair<>("W316 (W316)", 5),new Pair<>("W320 (W320)", 5)));

        //W320 (W320)
        graph.put("W320 (W320)", Arrays.asList(new Pair<>("West Hallway 3 (WH3)", 12),new Pair<>("W318 (W318)", 5)));

        //CR West 3B (CRW3B)
        graph.put("CR West 3B (CRW3B)", Arrays.asList(new Pair<>("West Hallway 3 (WH3)", 8),new Pair<>("W313 (W313)", 4)));

        //West Hallway 3 (WH3)
        graph.put("West Hallway 3 (WH3)", Arrays.asList(new Pair<>("CR West 3B (CRW3B)", 8),new Pair<>("West Wing Stairs 3B (WS3B)", 2),new Pair<>("W320 (W320)", 12)));

        //West Wing Stairs 3B (WS3B)
        graph.put("West Wing Stairs 3B (WS3B)", Arrays.asList(new Pair<>("West Hallway 3 (WH3)", 2),new Pair<>("West Wing Stairs 2B (WS2B)", 6),new Pair<>("West Wing Stairs 4B (WS4B)", 6)));

        //West Wing Stairs 3A (WS3A)
        graph.put("West Wing Stairs 3A (WS3A)", Arrays.asList(new Pair<>("Dome West Hallway 3rd (DWH3)", 12),new Pair<>("Dome Runway 3rd (DR3)", 10),new Pair<>("CR West 3A (CRW3A)", 5),new Pair<>("West Wing Stairs 2A (WS2A)", 6),new Pair<>("West Wing Stairs 4A (WS4A)", 6)));
        
        //CR South 4A (CRS4A)
        graph.put("CR South 4A (CRS4A)", Arrays.asList(new Pair<>("South Hallway 4C (SH4C)", 4)));

        //CR South 4B (CRS4B)
        graph.put("CR South 4B (CRS4B)", Arrays.asList(new Pair<>("South Hallway 4E (SH4E)", 4)));

        //CR East 4 (CRE4)
        graph.put("CR East 4 (CRE4)", Arrays.asList(new Pair<>("E401 (E401)", 5),new Pair<>("Dome South Hallway 4th (DSH4)", 6),new Pair<>("East Wing Stairs 4A (ES4A)", 5)));

        //CR West 4A (CRW4A)
        graph.put("CR West 4A (CRW4A)", Arrays.asList(new Pair<>("West Wing Stairs 4A (WS4A)", 5),new Pair<>("Dome West Hallway 4th (DWH4)", 12),new Pair<>("W401 (W401)", 5)));

        //Dome Runway 4th (DR4)
        graph.put("Dome Runway 4th (DR4)", Arrays.asList(new Pair<>("Dome South Hallway 4th (DSH4)", 10),new Pair<>("Dome East Hallway 4th (DEH4)", 8),new Pair<>("Dome West Hallway 4th (DWH4)", 8)));

        //Dome South Hallway 4th (DSH4)
        graph.put("Dome South Hallway 4th (DSH4)", Arrays.asList(new Pair<>("Dome Runway 4th (DR4)", 10),new Pair<>("Dome East Hallway 4th (DEH4)", 14),new Pair<>("East Wing Stairs 4A (ES4A)", 8),new Pair<>("Dome West Hallway 4th (DWH4)", 14),new Pair<>("South Hallway 4A (SH4A)", 22),new Pair<>("CR East 4 (CRE4)", 6),new Pair<>("W400 (W400)", 12)));

        //Dome East Hallway 4th (DEH4)
        graph.put("Dome East Hallway 4th (DEH4)", Arrays.asList(new Pair<>("Dome Runway 4th (DR4)", 8),new Pair<>("Dome South Hallway 4th (DSH4)", 14),new Pair<>("Dome West Hallway 4th (DWH4)", 16),new Pair<>("East Wing Stairs 4A (ES4A)", 12),new Pair<>("E400 (E400)", 12)));

        //Dome West Hallway 4th (DWH4)
        graph.put("Dome West Hallway 4th (DWH4)", Arrays.asList(new Pair<>("Dome East Hallway 4th (DEH4)", 16),new Pair<>("Dome Runway 4th (DR4)", 8),new Pair<>("Dome South Hallway 4th (DSH4)", 14),new Pair<>("West Wing Stairs 4A (WS4A)", 11),new Pair<>("CR West 4A (CRW4A)", 12),new Pair<>("W400 (W400)", 12)));

        //E400 (E400)
        graph.put("E400 (E400)", Arrays.asList(new Pair<>("Dome East Hallway 4th (DEH4)", 12),new Pair<>("E402 (E402)", 5)));

        //E401 (E401)
        graph.put("E401 (E401)", Arrays.asList(new Pair<>("CR East 4 (CRE4)", 5),new Pair<>("E403 (E403)", 5)));

        //E402 (E402)
        graph.put("E402 (E402)", Arrays.asList(new Pair<>("E400 (E400)", 5),new Pair<>("E404 (E404)", 5)));

        //E403 (E403)
        graph.put("E403 (E403)", Arrays.asList(new Pair<>("E401 (E401)", 5),new Pair<>("E405 (E405)", 5)));

        //E404 (E404)
        graph.put("E404 (E404)", Arrays.asList(new Pair<>("E402 (E402)", 5),new Pair<>("E406 (E406)", 5)));

        //E405 (E405)
        graph.put("E405 (E405)", Arrays.asList(new Pair<>("E403 (E403)", 5),new Pair<>("E407 (E407)", 5)));

        //E406 (E406)
        graph.put("E406 (E406)", Arrays.asList(new Pair<>("E404 (E404)", 5),new Pair<>("E408 (E408)", 5)));

        //E407 (E407)
        graph.put("E407 (E407)", Arrays.asList(new Pair<>("E405 (E405)", 5),new Pair<>("E409 (E409)", 5)));

        //E408 (E408)
        graph.put("E408 (E408)", Arrays.asList(new Pair<>("E406 (E406)", 5),new Pair<>("E410 (E410)", 5)));

        //E409 (E409)
        graph.put("E409 (E409)", Arrays.asList(new Pair<>("E407 (E407)", 5),new Pair<>("E411 (E411)", 5)));

        //E410 (E410)
        graph.put("E410 (E410)", Arrays.asList(new Pair<>("E408 (E408)", 5),new Pair<>("E412 (E412)", 5)));

        //E411 (E411)
        graph.put("E411 (E411)", Arrays.asList(new Pair<>("E409 (E409)", 5),new Pair<>("E413 (E413)", 5)));

        //E412 (E412)
        graph.put("E412 (E412)", Arrays.asList(new Pair<>("E410 (E410)", 5),new Pair<>("E414 (E414)", 5)));

        //E413 (E413)
        graph.put("E413 (E413)", Arrays.asList(new Pair<>("E411 (E411)", 5),new Pair<>("E415 (E415)", 5)));

        //E414 (E414)
        graph.put("E414 (E414)", Arrays.asList(new Pair<>("E412 (E412)", 5),new Pair<>("E416 (E416)", 5)));

        //E415 (E415)
        graph.put("E415 (E415)", Arrays.asList(new Pair<>("E413 (E413)", 5),new Pair<>("E417 (E417)", 5)));

        //E416 (E416)
        graph.put("E416 (E416)", Arrays.asList(new Pair<>("E414 (E414)", 5),new Pair<>("E418 (E418)", 5)));

        //E417 (E417)
        graph.put("E417 (E417)", Arrays.asList(new Pair<>("E415 (E415)", 5),new Pair<>("IBITS InfoBits (IBITS)", 5)));

        //E418 (E418)
        graph.put("E418 (E418)", Arrays.asList(new Pair<>("E416 (E416)", 5),new Pair<>("E420 (E420)", 5)));

        //E420 (E420)
        graph.put("E420 (E420)", Arrays.asList(new Pair<>("E418 (E418)", 5),new Pair<>("East Hallway 4 (EH4)", 5)));

        //IBITS InfoBits (IBITS)
        graph.put("IBITS InfoBits (IBITS)", Arrays.asList(new Pair<>("E417 (E417)", 7),new Pair<>("East Hallway 4 (EH4)", 7)));

        //East Hallway 4 (EH4)
        graph.put("East Hallway 4 (EH4)", Arrays.asList(new Pair<>("IBITS InfoBits (IBITS)", 7),new Pair<>("E420 (E420)", 10),new Pair<>("East Wing Stairs 4B (ES4B)", 2)));

        //East Wing Stairs 4A (ES4A)
        graph.put("East Wing Stairs 4A (ES4A)", Arrays.asList(new Pair<>("Dome East Hallway 4th (DEH4)", 12),new Pair<>("Dome South Hallway 4th (DSH4)", 8),new Pair<>("CR East 4 (CRE4)", 5),new Pair<>("East Wing Stairs 5A (ES5A)", 6),new Pair<>("East Wing Stairs 3A (ES3A)", 6)));

        //East Wing Stairs 4B (ES4B)
        graph.put("East Wing Stairs 4B (ES4B)", Arrays.asList(new Pair<>("East Hallway 4 (EH4)", 2),new Pair<>("East Wing Stairs 5B (ES5B)", 6),new Pair<>("East Wing Stairs 3B (ES3B)", 6)));

        //South Hallway 4A (SH4A)
        graph.put("South Hallway 4A (SH4A)", Arrays.asList(new Pair<>("S401-S402 Dr. Nemesio E. Prudente Conference Room (S401)", 4),new Pair<>("South Wing Stairs 4B (SS4B)", 6),new Pair<>("S425 Publications (S425)", 5),new Pair<>("Dome South Hallway 4th (DSH4)", 22)));

        //South Hallway 4B (SH4B)
        graph.put("South Hallway 4B (SH4B)", Arrays.asList(new Pair<>("S421-S420 Extension Management Office (S421)", 4),new Pair<>("South Wing Stairs 4A (SS4A)", 4),new Pair<>("S422 (S422)", 4),new Pair<>("South Hallway 4C (SH4C)", 4)));

        //South Hallway 4C (SH4C)
        graph.put("South Hallway 4C (SH4C)", Arrays.asList(new Pair<>("CR South 4A (CRS4A)", 4),new Pair<>("S417 (S417)", 4),new Pair<>("S418-S419 CAL Laboratoryong Pangwika CAL Language Laboratory (S418)", 4),new Pair<>("South Hallway 4B (SH4B)", 4)));

        //South Hallway 4D (SH4D)
        graph.put("South Hallway 4D (SH4D)", Arrays.asList(new Pair<>("South Wing Stairs 4C (SS4C)", 4),new Pair<>("S405 Institute for Culture and Language Studies (S405)", 4),new Pair<>("S406 (S406)", 4),new Pair<>("S407 Intellectual Property Management Office Innovations and Technology Support (S407)", 2)));

        //South Hallway 4E (SH4E)
        graph.put("South Hallway 4E (SH4E)", Arrays.asList(new Pair<>("CR South 4B (CRS4B)", 4),new Pair<>("S408 Institute for Science and Technology Research (S408)", 4),new Pair<>("S409 (S09)", 4),new Pair<>("S407 Intellectual Property Management Office Innovations and Technology Support (S407)", 2)));

        //South Wing Stairs 4A (SS4A)
        graph.put("South Wing Stairs 4A (SS4A)", Arrays.asList(new Pair<>("South Hallway 4B (SH4B)", 4),new Pair<>("South Wing Stairs 5A (SS5A)", 6),new Pair<>("South Wing Stairs 3A (SS3A)", 6)));

        //South Wing Stairs 4B (SS4B)
        graph.put("South Wing Stairs 4B (SS4B)", Arrays.asList(new Pair<>("South Hallway 4A (SH4A)", 4),new Pair<>("South Wing Stairs 5B (SS5B)", 6),new Pair<>("South Wing Stairs 3B (SS3B)", 6),new Pair<>("S413 Research Institute for Human and Social Development Studies (S413)", 10)));

        //South Wing Stairs 4C (SS4C)
        graph.put("South Wing Stairs 4C (SS4C)", Arrays.asList(new Pair<>("South Hallway 4D (SH4D)", 4),new Pair<>("South Wing Stairs 5C (SS5C)", 6),new Pair<>("South Wing Stairs 3C (SS3C)", 6)));

        //S401-S402 Dr. Nemesio E. Prudente Conference Room (S401)
        graph.put("S401-S402 Dr. Nemesio E. Prudente Conference Room (S401)", Arrays.asList(new Pair<>("South Hallway 4A (SH4A)", 4),new Pair<>("S403 Institutional Quality Management System Office (S403)", 8)));

        //S403 Institutional Quality Management System Office (S403)
        graph.put("S403 Institutional Quality Management System Office (S403)", Arrays.asList(new Pair<>("S401-S402 Dr. Nemesio E. Prudente Conference Room (S401)", 8),new Pair<>("S404 Center for Language and Literature Studies (S404)", 4)));

        //S404 Center for Language and Literature Studies (S404)
        graph.put("S404 Center for Language and Literature Studies (S404)", Arrays.asList(new Pair<>("S403 Institutional Quality Management System Office (S403)", 4),new Pair<>("S405 Institute for Culture and Language Studies (S405)", 4)));

        //S405 Institute for Culture and Language Studies (S405)
        graph.put("S405 Institute for Culture and Language Studies (S405)", Arrays.asList(new Pair<>("South Hallway 4D (SH4D)", 4),new Pair<>("S404 Center for Language and Literature Studies (S404)", 4)));

        //S406 (S406)
        graph.put("S406 (S406)", Arrays.asList(new Pair<>("South Hallway 4D (SH4D)", 4)));

        //S407 Intellectual Property Management Office Innovations and Technology Support (S407)
        graph.put("S407 Intellectual Property Management Office Innovations and Technology Support (S407)", Arrays.asList(new Pair<>("South Hallway 4D (SH4D)", 2),new Pair<>("South Hallway 4E (SH4E)", 2)));

        //S408 Institute for Science and Technology Research (S408)
        graph.put("S408 Institute for Science and Technology Research (S408)", Arrays.asList(new Pair<>("South Hallway 4E (SH4E)", 4)));

        //S409 (S09)
        graph.put("S409 (S09)", Arrays.asList(new Pair<>("South Hallway 4E (SH4E)", 4),new Pair<>("S410 Center for Labor and Industrial Relations Studies (S410)", 4)));

        //S410 Center for Labor and Industrial Relations Studies (S410)
        graph.put("S410 Center for Labor and Industrial Relations Studies (S410)", Arrays.asList(new Pair<>("S409 (S09)", 4),new Pair<>("S411 Center for Environmental Studies (S411)", 4)));

        //S411 Center for Environmental Studies (S411)
        graph.put("S411 Center for Environmental Studies (S411)", Arrays.asList(new Pair<>("S410 Center for Labor and Industrial Relations Studies (S410)", 4),new Pair<>("S412 Center for Heritage Studies (S412)", 4)));

        //S412 Center for Heritage Studies (S412)
        graph.put("S412 Center for Heritage Studies (S412)", Arrays.asList(new Pair<>("S413 Research Institute for Human and Social Development Studies (S413)", 4),new Pair<>("S411 Center for Environmental Studies (S411)", 4)));

        //S413 Research Institute for Human and Social Development Studies (S413)
        graph.put("S413 Research Institute for Human and Social Development Studies (S413)", Arrays.asList(new Pair<>("S412 Center for Heritage Studies (S412)", 4),new Pair<>("S414 (S414)", 4),new Pair<>("South Wing Stairs 4B (SS4B)", 10)));

        //S414 (S414)
        graph.put("S414 (S414)", Arrays.asList(new Pair<>("S413 Research Institute for Human and Social Development Studies (S413)", 4),new Pair<>("S415 (S415)", 4)));

        //S415 (S415)
        graph.put("S415 (S415)", Arrays.asList(new Pair<>("S414 (S414)", 4),new Pair<>("S416 (S416)", 4)));

        //S416 (S416)
        graph.put("S416 (S416)", Arrays.asList(new Pair<>("S415 (S415)", 4),new Pair<>("S417 (S417)", 4)));

        //S417 (S417)
        graph.put("S417 (S417)", Arrays.asList(new Pair<>("South Hallway 4C (SH4C)", 4),new Pair<>("S416 (S416)", 4)));

        //S418-S419 CAL Laboratoryong Pangwika CAL Language Laboratory (S418)
        graph.put("S418-S419 CAL Laboratoryong Pangwika CAL Language Laboratory (S418)", Arrays.asList(new Pair<>("South Hallway 4C (SH4C)", 4)));

        //S421-S420 Extension Management Office (S421)
        graph.put("S421-S420 Extension Management Office (S421)", Arrays.asList(new Pair<>("South Hallway 4B (SH4B)", 4)));

        //S422 (S422)
        graph.put("S422 (S422)", Arrays.asList(new Pair<>("South Hallway 4B (SH4B)", 4),new Pair<>("S423 Research Management Office (S423)", 5)));

        //S423 Research Management Office (S423)
        graph.put("S423 Research Management Office (S423)", Arrays.asList(new Pair<>("S424 Office of the Director (S424)", 5),new Pair<>("S422 (S422)", 5)));

        //S424 Office of the Director (S424)
        graph.put("S424 Office of the Director (S424)", Arrays.asList(new Pair<>("S423 Research Management Office (S423)", 5),new Pair<>("S425 Publications (S425)", 5)));

        //S425 Publications (S425)
        graph.put("S425 Publications (S425)", Arrays.asList(new Pair<>("South Hallway 4A (SH4A)", 5),new Pair<>("S424 Office of the Director (S424)", 5)));

        //W400 (W400)
        graph.put("W400 (W400)", Arrays.asList(new Pair<>("Dome West Hallway 4th (DWH4)", 12),new Pair<>("Dome South Hallway 4th (DSH4)", 12),new Pair<>("W402 (W402)", 5)));

        //W401 (W401)
        graph.put("W401 (W401)", Arrays.asList(new Pair<>("CR West 4A (CRW4A)", 5),new Pair<>("W403 (W403)", 5)));

        //W402 (W402)
        graph.put("W402 (W402)", Arrays.asList(new Pair<>("W400 (W400)", 5),new Pair<>("W404 (W404)", 5)));

        //W403 (W403)
        graph.put("W403 (W403)", Arrays.asList(new Pair<>("W401 (W401)", 5),new Pair<>("W405 (W405)", 5)));

        //W404 (W404)
        graph.put("W404 (W404)", Arrays.asList(new Pair<>("W402 (W402)", 5),new Pair<>("W406 (W406)", 5)));

        //W405 (W405)
        graph.put("W405 (W405)", Arrays.asList(new Pair<>("W403 (W403)", 5),new Pair<>("W407 (W407)", 5)));

        //W406 (W406)
        graph.put("W406 (W406)", Arrays.asList(new Pair<>("W404 (W404)", 5),new Pair<>("W408 (W408)", 5)));

        //W407 (W407)
        graph.put("W407 (W407)", Arrays.asList(new Pair<>("W405 (W405)", 5),new Pair<>("W409 (W409)", 5)));

        //W408 (W408)
        graph.put("W408 (W408)", Arrays.asList(new Pair<>("W406 (W406)", 5),new Pair<>("W410 (W410)", 5)));

        //W409 (W409)
        graph.put("W409 (W409)", Arrays.asList(new Pair<>("W407 (W407)", 5),new Pair<>("W411 (W411)", 5)));

        //W410 (W410)
        graph.put("W410 (W410)", Arrays.asList(new Pair<>("W408 (W408)", 5),new Pair<>("W412 (W412)", 5)));

        //W411 (W411)
        graph.put("W411 (W411)", Arrays.asList(new Pair<>("W409 (W409)", 5),new Pair<>("W413 (W413)", 5)));

        //W412 (W412)
        graph.put("W412 (W412)", Arrays.asList(new Pair<>("W410 (W410)", 5),new Pair<>("W414 (W414)", 5)));

        //W413 (W413)
        graph.put("W413 (W413)", Arrays.asList(new Pair<>("W411 (W411)", 5),new Pair<>("W415 (W415)", 5)));

        //W414 (W414)
        graph.put("W414 (W414)", Arrays.asList(new Pair<>("W412 (W412)", 5),new Pair<>("W416 (W416)", 5)));

        //W415 (W415)
        graph.put("W415 (W415)", Arrays.asList(new Pair<>("W413 (W413)", 5),new Pair<>("W417 (W417)", 5)));

        //W416 (W416)
        graph.put("W416 (W416)", Arrays.asList(new Pair<>("W414 (W414)", 5),new Pair<>("W418 (W418)", 5)));

        //W417 (W417)
        graph.put("W417 (W417)", Arrays.asList(new Pair<>("W415 (W415)", 5),new Pair<>("CR West 4B (CRW4B)", 5)));

        //W418 (W418)
        graph.put("W418 (W418)", Arrays.asList(new Pair<>("W416 (W416)", 5),new Pair<>("West Hallway 4 (WH4)", 5)));

        //CR West 4B (CRW4B)
        graph.put("CR West 4B (CRW4B)", Arrays.asList(new Pair<>("W417 (W417)", 7),new Pair<>("West Hallway 4 (WH4)", 7)));

        //West Hallway 4 (WH4)
        graph.put("West Hallway 4 (WH4)", Arrays.asList(new Pair<>("CR West 4B (CRW4B)", 7),new Pair<>("W418 (W418)", 10),new Pair<>("West Wing Stairs 4B (WS4B)", 2)));

        //West Wing Stairs 4B (WS4B)
        graph.put("West Wing Stairs 4B (WS4B)", Arrays.asList(new Pair<>("West Hallway 4 (WH4)", 2),new Pair<>("West Wing Stairs 3B (WS3B)", 6),new Pair<>("West Wing Stairs 5B (WS5B)", 6)));

        //West Wing Stairs 4A (WS4A)
        graph.put("West Wing Stairs 4A (WS4A)", Arrays.asList(new Pair<>("Dome West Hallway 4th (DWH4)", 11),new Pair<>("CR West 4A (CRW4A)", 5),new Pair<>("West Wing Stairs 3A (WS3A)", 6),new Pair<>("West Wing Stairs 5A (WS5A)", 6)));

        //CR South 5A (CRS5A)
        graph.put("CR South 5A (CRS5A)", Arrays.asList(new Pair<>("South Hallway 5B (SH5B)", 4)));

        //CR South 5B (CRS5B)
        graph.put("CR South 5B (CRS5B)", Arrays.asList(new Pair<>("South Wing Stairs 5C (SS5C)", 4),new Pair<>("S512 CCIS Dean & Chairperson's Office (S512)", 4)));

        //CR East 5 (CRE5)
        graph.put("CR East 5 (CRE5)", Arrays.asList(new Pair<>("Dome South Hallway 5th (DSH5)", 12),new Pair<>("E501 (E501)", 5),new Pair<>("East Wing Stairs 5A (ES5A)", 5)));

        //CR West 5A (CRW5A)
        graph.put("CR West 5A (CRW5A)", Arrays.asList(new Pair<>("West Wing Stairs 5A (WS5A)", 5),new Pair<>("W501 (W501)", 5)));

        //CR West 5B (CRW5B)
        graph.put("CR West 5B (CRW5B)", Arrays.asList(new Pair<>("W517 (W517)", 5),new Pair<>("West Hallway 5 (WH5)", 12)));

        //Dome Runway 5th (DR5)
        graph.put("Dome Runway 5th (DR5)", Arrays.asList(new Pair<>("Dome East Hallway 5th (DEH5)", 12),new Pair<>("Dome South Hallway 5th (DSH5)", 11),new Pair<>("Dome West Hallway 5th (DWH5)", 12)));

        //Dome South Hallway 5th (DSH5)
        graph.put("Dome South Hallway 5th (DSH5)", Arrays.asList(new Pair<>("Dome East Hallway 5th (DEH5)", 12),new Pair<>("South Hallway 5A (SH5A)", 24),new Pair<>("Dome West Hallway 5th (DWH5)", 12),new Pair<>("East Wing Stairs 5A (ES5A)", 10),new Pair<>("CR East 5 (CRE5)", 12),new Pair<>("W500 (W500)", 12),new Pair<>("Dome Runway 5th (DR5)", 
        11)));

        //Dome East Hallway 5th (DEH5)
        graph.put("Dome East Hallway 5th (DEH5)", Arrays.asList(new Pair<>("East Wing Stairs 5A (ES5A)", 12),new Pair<>("E500 (E500)", 12),new Pair<>("Dome Runway 5th (DR5)", 12),new Pair<>("Dome West Hallway 5th (DWH5)", 24),new Pair<>("Dome South Hallway 5th (DSH5)", 12)));

        //Dome West Hallway 5th (DWH5)
        graph.put("Dome West Hallway 5th (DWH5)", Arrays.asList(new Pair<>("Dome East Hallway 5th (DEH5)", 24),new Pair<>("Dome South Hallway 5th (DSH5)", 12),new Pair<>("Dome Runway 5th (DR5)", 12),new Pair<>("W500 (W500)", 12),new Pair<>("West Wing Stairs 5A (WS5A)", 12)));

        //E500 (E500)
        graph.put("E500 (E500)", Arrays.asList(new Pair<>("Dome East Hallway 5th (DEH5)", 12),new Pair<>("E502 Audio - Visual Room P&A Grant Thornton (E502)", 7)));

        //E501 (E501)
        graph.put("E501 (E501)", Arrays.asList(new Pair<>("CR East 5 (CRE5)", 5),new Pair<>("E503 (E503)", 5)));

        //E502 Audio - Visual Room P&A Grant Thornton (E502)
        graph.put("E502 Audio - Visual Room P&A Grant Thornton (E502)", Arrays.asList(new Pair<>("E504 (E504)", 7),new Pair<>("E500 (E500)", 7)));

        //E503 (E503)
        graph.put("E503 (E503)", Arrays.asList(new Pair<>("E501 (E501)", 5),new Pair<>("E505 (E505)", 5)));

        //E504 (E504)
        graph.put("E504 (E504)", Arrays.asList(new Pair<>("E502 Audio - Visual Room P&A Grant Thornton (E502)", 7),new Pair<>("E506 (E506)", 5)));

        //E505 (E505)
        graph.put("E505 (E505)", Arrays.asList(new Pair<>("E503 (E503)", 5),new Pair<>("E507 (E507)", 5)));

        //E506 (E506)
        graph.put("E506 (E506)", Arrays.asList(new Pair<>("E504 (E504)", 5),new Pair<>("E508 (E508)", 5)));

        //E507 (E507)
        graph.put("E507 (E507)", Arrays.asList(new Pair<>("E509 (E509)", 5),new Pair<>("E505 (E505)", 5)));

        //E508 (E508)
        graph.put("E508 (E508)", Arrays.asList(new Pair<>("E506 (E506)", 5),new Pair<>("E510 (E510)", 5)));

        //E509 (E509)
        graph.put("E509 (E509)", Arrays.asList(new Pair<>("E507 (E507)", 5),new Pair<>("E511 (E511)", 5)));

        //E510 (E510)
        graph.put("E510 (E510)", Arrays.asList(new Pair<>("E508 (E508)", 5),new Pair<>("E512 (E512)", 5)));

        //E511 (E511)
        graph.put("E511 (E511)", Arrays.asList(new Pair<>("E509 (E509)", 5),new Pair<>("E513 (E513)", 5)));

        //E512 (E512)
        graph.put("E512 (E512)", Arrays.asList(new Pair<>("E510 (E510)", 5),new Pair<>("E514 (E514)", 5)));

        //E513 (E513)
        graph.put("E513 (E513)", Arrays.asList(new Pair<>("E511 (E511)", 5),new Pair<>("E515 (E515)", 5)));

        //E514 (E514)
        graph.put("E514 (E514)", Arrays.asList(new Pair<>("E516 (E516)", 5),new Pair<>("E512 (E512)", 5)));

        //E515 (E515)
        graph.put("E515 (E515)", Arrays.asList(new Pair<>("E513 (E513)", 5),new Pair<>("E517 (E517)", 5)));

        //E516 (E516)
        graph.put("E516 (E516)", Arrays.asList(new Pair<>("E514 (E514)", 5),new Pair<>("E518 (E518)", 5)));

        //E517 (E517)
        graph.put("E517 (E517)", Arrays.asList(new Pair<>("E519 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E519)", 6),new Pair<>("E515 (E515)", 5)));

        //E518 (E518)
        graph.put("E518 (E518)", Arrays.asList(new Pair<>("East Hallway 5 (EH5)", 12),new Pair<>("E516 (E516)", 5)));

        //E519 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E519)
        graph.put("E519 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E519)", Arrays.asList(new Pair<>("East Hallway 5 (EH5)", 6),new Pair<>("E517 (E517)", 6)));

        //East Hallway 5 (EH5)
        graph.put("East Hallway 5 (EH5)", Arrays.asList(new Pair<>("East Wing Stairs 5B (ES5B)", 2),new Pair<>("E518 (E518)", 12),new Pair<>("E519 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E519)", 6)));

        //East Wing Stairs 5A (ES5A)
        graph.put("East Wing Stairs 5A (ES5A)", Arrays.asList(new Pair<>("Dome East Hallway 5th (DEH5)", 12),new Pair<>("Dome South Hallway 5th (DSH5)", 10),new Pair<>("CR East 5 (CRE5)", 5),new Pair<>("East Wing Stairs 4A (ES4A)", 6),new Pair<>("East Wing Stairs 6A (ES6A)", 6)));

        //East Wing Stairs 5B (ES5B)
        graph.put("East Wing Stairs 5B (ES5B)", Arrays.asList(new Pair<>("East Hallway 5 (EH5)", 2),new Pair<>("East Wing Stairs 4B (ES4B)", 6),new Pair<>("East Wing Stairs 6B (ES6B)", 6)));

        //South Hallway 5A (SH5A)
        graph.put("South Hallway 5A (SH5A)", Arrays.asList(new Pair<>("S501 (S501)", 7),new Pair<>("Dome South Hallway 5th (DSH5)", 24),new Pair<>("South Wing Stairs 5B (SS5B)", 6),new Pair<>("S518  College of Accountancy & Finance (S518)", 7)));

        //South Hallway 5B (SH5B)
        graph.put("South Hallway 5B (SH5B)", Arrays.asList(new Pair<>("CR South 5A (CRS5A)", 4),new Pair<>("S505 CCMIT LAB 5 (S505)", 4),new Pair<>("S506 College of Computer and Information Sciences Faculty Room (S506)", 4),new Pair<>("25 Consultation Room (CONR)", 2)));

        //South Hallway 5C (SH5C)
        graph.put("South Hallway 5C (SH5C)", Arrays.asList(new Pair<>("S515 College of Science Chairperson's Office (S515)", 4),new Pair<>("S514 College of Science Faculty Room (S514)", 4),new Pair<>("South Wing Stairs 5C (SS5C)", 4)));

        //South Wing Stairs 5A (SS5A)
        graph.put("South Wing Stairs 5A (SS5A)", Arrays.asList(new Pair<>("S504 (S504)", 2),new Pair<>("S505 CCMIT LAB 5 (S505)", 2),new Pair<>("South Wing Stairs 4A (SS4A)", 6),new Pair<>("South Wing Stairs 6A (SS6A)", 6)));

        //South Wing Stairs 5B (SS5B)
        graph.put("South Wing Stairs 5B (SS5B)", Arrays.asList(new Pair<>("S511 (S511)", 10),new Pair<>("South Hallway 5A (SH5A)", 6),new Pair<>("South Wing Stairs 4B (SS4B)", 6),new Pair<>("South Wing Stairs 6B (SS6B)", 6)));

        //South Wing Stairs 5C (SS5C)
        graph.put("South Wing Stairs 5C (SS5C)", Arrays.asList(new Pair<>("CR South 5B (CRS5B)", 4),new Pair<>("South Hallway 5C (SH5C)", 4),new Pair<>("South Wing Stairs 4C (SS4C)", 6),new Pair<>("South Wing Stairs 6C (SS6C)", 6)));

        //S501 (S501)
        graph.put("S501 (S501)", Arrays.asList(new Pair<>("South Hallway 5A (SH5A)", 7),new Pair<>("S502 (S502)", 7)));

        //S502 (S502)
        graph.put("S502 (S502)", Arrays.asList(new Pair<>("S503 (S503)", 7),new Pair<>("S501 (S501)", 7)));

        //S503 (S503)
        graph.put("S503 (S503)", Arrays.asList(new Pair<>("S504 (S504)", 2),new Pair<>("S502 (S502)", 7)));

        //S504 (S504)
        graph.put("S504 (S504)", Arrays.asList(new Pair<>("South Wing Stairs 5A (SS5A)", 2),new Pair<>("S503 (S503)", 2)));

        //S505 CCMIT LAB 5 (S505)
        graph.put("S505 CCMIT LAB 5 (S505)", Arrays.asList(new Pair<>("South Hallway 5B (SH5B)", 4),new Pair<>("South Wing Stairs 5A (SS5A)", 2)));

        //25 Consultation Room (CONR)
        graph.put("25 Consultation Room (CONR)", Arrays.asList(new Pair<>("South Hallway 5B (SH5B)", 2)));

        //S506 College of Computer and Information Sciences Faculty Room (S506)
        graph.put("S506 College of Computer and Information Sciences Faculty Room (S506)", Arrays.asList(new Pair<>("South Hallway 5B (SH5B)", 4),new Pair<>("S507 Lab Head Office (S507)", 4)));

        //S507 Lab Head Office (S507)
        graph.put("S507 Lab Head Office (S507)", Arrays.asList(new Pair<>("S506 College of Computer and Information Sciences Faculty Room (S506)", 4),new Pair<>("S508 (S508)", 7)));

        //S508 (S508)
        graph.put("S508 (S508)", Arrays.asList(new Pair<>("S507 Lab Head Office (S507)", 7),new Pair<>("S510 (S510)", 7)));

        //S510 (S510)
        graph.put("S510 (S510)", Arrays.asList(new Pair<>("S511 (S511)", 7),new Pair<>("S508 (S508)", 7)));

        //S511 (S511)
        graph.put("S511 (S511)", Arrays.asList(new Pair<>("South Wing Stairs 5B (SS5B)", 10),new Pair<>("S512B (S512B)", 7)));

        //S512 CCIS Dean & Chairperson's Office (S512)
        graph.put("S512 CCIS Dean & Chairperson's Office (S512)", Arrays.asList(new Pair<>("S512A (S512A)", 7),new Pair<>("CR South 5B (CRS5B)", 4)));

        //S512A (S512A)
        graph.put("S512A (S512A)", Arrays.asList(new Pair<>("S512B (S512B)", 7),new Pair<>("S512 CCIS Dean & Chairperson's Office (S512)", 7)));

        //S512B (S512B)
        graph.put("S512B (S512B)", Arrays.asList(new Pair<>("S511 (S511)", 7),new Pair<>("S512A (S512A)", 7)));

        //S514 College of Science Faculty Room (S514)
        graph.put("S514 College of Science Faculty Room (S514)", Arrays.asList(new Pair<>("South Hallway 5C (SH5C)", 4)));

        //S515 College of Science Chairperson's Office (S515)
        graph.put("S515 College of Science Chairperson's Office (S515)", Arrays.asList(new Pair<>("South Hallway 5C (SH5C)", 4),new Pair<>("S516 CAF Computer Laboratory Office (S516)", 2)));

        //S516 CAF Computer Laboratory Office (S516)
        graph.put("S516 CAF Computer Laboratory Office (S516)", Arrays.asList(new Pair<>("S517 (S517)", 7),new Pair<>("S515 College of Science Chairperson's Office (S515)", 2)));

        //S517 (S517)
        graph.put("S517 (S517)", Arrays.asList(new Pair<>("S518  College of Accountancy & Finance (S518)", 7),new Pair<>("S516 CAF Computer Laboratory Office (S516)", 7)));

        //S518  College of Accountancy & Finance (S518)
        graph.put("S518  College of Accountancy & Finance (S518)", Arrays.asList(new Pair<>("South Hallway 5A (SH5A)", 7),new Pair<>("S517 (S517)", 7)));

        //W500 (W500)
        graph.put("W500 (W500)", Arrays.asList(new Pair<>("Dome South Hallway 5th (DSH5)", 12),new Pair<>("W502 (W502)", 5),new Pair<>("Dome West Hallway 5th (DWH5)", 12)));

        //W501 (W501)
        graph.put("W501 (W501)", Arrays.asList(new Pair<>("CR West 5A (CRW5A)", 5),new Pair<>("W503 (W503)", 5)));

        //W502 (W502)
        graph.put("W502 (W502)", Arrays.asList(new Pair<>("W502 (W502)", 5),new Pair<>("W504 (W504)", 5)));

        //W503 (W503)
        graph.put("W503 (W503)", Arrays.asList(new Pair<>("W501 (W501)", 5),new Pair<>("W505 (W505)", 5)));

        //W504 (W504)
        graph.put("W504 (W504)", Arrays.asList(new Pair<>("W506 (W506)", 5),new Pair<>("W502 (W502)", 5)));

        //W505 (W505)
        graph.put("W505 (W505)", Arrays.asList(new Pair<>("W503 (W503)", 5),new Pair<>("W507 (W507)", 5)));

        //W506 (W506)
        graph.put("W506 (W506)", Arrays.asList(new Pair<>("W504 (W504)", 5),new Pair<>("W508 (W508)", 5)));

        //W507 (W507)
        graph.put("W507 (W507)", Arrays.asList(new Pair<>("W505 (W505)", 5),new Pair<>("W509 (W509)", 5)));

        //W508 (W508)
        graph.put("W508 (W508)", Arrays.asList(new Pair<>("W510 (W510)", 5),new Pair<>("W506 (W506)", 5)));

        //W509 (W509)
        graph.put("W509 (W509)", Arrays.asList(new Pair<>("W507 (W507)", 5),new Pair<>("W511 (W511)", 5)));

        //W510 (W510)
        graph.put("W510 (W510)", Arrays.asList(new Pair<>("W508 (W508)", 5),new Pair<>("W512 (W512)", 5)));

        //W511 (W511)
        graph.put("W511 (W511)", Arrays.asList(new Pair<>("W509 (W509)", 5),new Pair<>("W513 (W513)", 5)));

        //W512 (W512)
        graph.put("W512 (W512)", Arrays.asList(new Pair<>("W514 (W514)", 5),new Pair<>("W510 (W510)", 5)));

        //W513 (W513)
        graph.put("W513 (W513)", Arrays.asList(new Pair<>("W511 (W511)", 5),new Pair<>("W515 (W515)", 5)));

        //W514 (W514)
        graph.put("W514 (W514)", Arrays.asList(new Pair<>("W512 (W512)", 5),new Pair<>("W516 (W516)", 5)));

        //W515 (W515)
        graph.put("W515 (W515)", Arrays.asList(new Pair<>("W513 (W513)", 5),new Pair<>("W517 (W517)", 5)));

        //W516 (W516)
        graph.put("W516 (W516)", Arrays.asList(new Pair<>("W518 (W518)", 5),new Pair<>("W514 (W514)", 5)));

        //W517 (W517)
        graph.put("W517 (W517)", Arrays.asList(new Pair<>("CR West 5B (CRW5B)", 5),new Pair<>("W515 (W515)", 5)));

        //W518 (W518)
        graph.put("W518 (W518)", Arrays.asList(new Pair<>("W516 (W516)", 5),new Pair<>("W520 (W520)", 5)));

        //W520 (W520)
        graph.put("W520 (W520)", Arrays.asList(new Pair<>("W518 (W518)", 5),new Pair<>("West Hallway 5 (WH5)", 12)));

        //West Hallway 5 (WH5)
        graph.put("West Hallway 5 (WH5)", Arrays.asList(new Pair<>("CR West 5B (CRW5B)", 12),new Pair<>("West Wing Stairs 5B (WS5B)", 2),new Pair<>("W520 (W520)", 12)));

        //West Wing Stairs 5B (WS5B)
        graph.put("West Wing Stairs 5B (WS5B)", Arrays.asList(new Pair<>("West Hallway 5 (WH5)", 2),new Pair<>("West Wing Stairs 4B (WS4B)", 6),new Pair<>("West Wing Stairs 6B (WS6B)", 6)));

        //West Wing Stairs 5A (WS5A)
        graph.put("West Wing Stairs 5A (WS5A)", Arrays.asList(new Pair<>("Dome West Hallway 5th (DWH5)", 12),new Pair<>("CR West 5A (CRW5A)", 5),new Pair<>("West Wing Stairs 4A (WS4A)", 6),new Pair<>("West Wing Stairs 6A (WS6A)", 6)));

        //CR South 6A (CRS6A)
        graph.put("CR South 6A (CRS6A)", Arrays.asList(new Pair<>("South Hallway 6C (SH6C)", 4)));

        //CR South 6B (CRS6B)
        graph.put("CR South 6B (CRS6B)", Arrays.asList(new Pair<>("South Hallway 6E (SH6E)", 4)));

        //CR East 6 (CRE6)
        graph.put("CR East 6 (CRE6)", Arrays.asList(new Pair<>("Dome South Hallway 6th (DSH6)", 10),new Pair<>("E601 (E601)", 5),new Pair<>("East Wing Stairs 6A (ES6A)", 5)));

        //CR West 6A (CRW6A)
        graph.put("CR West 6A (CRW6A)", Arrays.asList(new Pair<>("W601 (W601)", 5),new Pair<>("West Wing Stairs 6A (WS6A)", 5)));

        //CR West 6B (CRW6B)
        graph.put("CR West 6B (CRW6B)", Arrays.asList(new Pair<>("CR West 6B (CRW6B)", 4),new Pair<>("W617 (W617)", 8)));

        //26 College of Science (CS)
        graph.put("26 College of Science (CS)", Arrays.asList(new Pair<>("Dome Runway 6th (DR6)", 1)));

        //Dome Runway 6th (DR6)
        graph.put("Dome Runway 6th (DR6)", Arrays.asList(new Pair<>("26 College of Science (CS)", 1),new Pair<>("Dome South Hallway 6th (DSH6)", 12),new Pair<>("Dome East Hallway 6th (DEH6)", 12),new Pair<>("Dome West Hallway 6th (DWH6)", 12)));

        //Dome South Hallway 6th (DSH6)
        graph.put("Dome South Hallway 6th (DSH6)", Arrays.asList(new Pair<>("CR East 6 (CRE6)", 10),new Pair<>("Dome Runway 6th (DR6)", 12),new Pair<>("W600 (W600)", 10),new Pair<>("Dome East Hallway 6th (DEH6)", 12),new Pair<>("Dome West Hallway 6th (DWH6)", 12),new Pair<>("East Wing Stairs 6A (ES6A)", 10),new Pair<>("South Hallway 6A (SH6A)", 
        24)));

        //Dome East Hallway 6th (DEH6)
        graph.put("Dome East Hallway 6th (DEH6)", Arrays.asList(new Pair<>("Dome South Hallway 6th (DSH6)", 12),new Pair<>("Dome Runway 6th (DR6)", 12),new Pair<>("Dome West Hallway 6th (DWH6)", 12),new Pair<>("East Wing Stairs 6A (ES6A)", 12),new Pair<>("E600 (E600)", 12)));

        //Dome West Hallway 6th (DWH6)
        graph.put("Dome West Hallway 6th (DWH6)", Arrays.asList(new Pair<>("Dome South Hallway 6th (DSH6)", 12),new Pair<>("Dome Runway 6th (DR6)", 12),new Pair<>("Dome East Hallway 6th (DEH6)", 12),new Pair<>("West Wing Stairs 6A (WS6A)", 12),new Pair<>("W600 (W600)", 12)));

        //E600 (E600)
        graph.put("E600 (E600)", Arrays.asList(new Pair<>("Dome East Hallway 6th (DEH6)", 12),new Pair<>("E602 (E602)", 5)));

        //E601 (E601)
        graph.put("E601 (E601)", Arrays.asList(new Pair<>("CR East 6 (CRE6)", 5),new Pair<>("E603 (E603)", 5)));

        //E602 (E602)
        graph.put("E602 (E602)", Arrays.asList(new Pair<>("E600 (E600)", 5),new Pair<>("E604 (E604)", 5)));

        //E603 (E603)
        graph.put("E603 (E603)", Arrays.asList(new Pair<>("E601 (E601)", 5),new Pair<>("E605 (E605)", 5)));

        //E604 (E604)
        graph.put("E604 (E604)", Arrays.asList(new Pair<>("E602 (E602)", 5),new Pair<>("E606 (E606)", 5)));

        //E605 (E605)
        graph.put("E605 (E605)", Arrays.asList(new Pair<>("E603 (E603)", 5),new Pair<>("E607 (E607)", 5)));

        //E606 (E606)
        graph.put("E606 (E606)", Arrays.asList(new Pair<>("E604 (E604)", 5),new Pair<>("E608 College of Science Faculty Room (E608)", 5)));

        //E607 (E607)
        graph.put("E607 (E607)", Arrays.asList(new Pair<>("E605 (E605)", 5),new Pair<>("E609 (E609)", 5)));

        //E608 College of Science Faculty Room (E608)
        graph.put("E608 College of Science Faculty Room (E608)", Arrays.asList(new Pair<>("E606 (E606)", 5),new Pair<>("E610 (E610)", 5)));

        //E609 (E609)
        graph.put("E609 (E609)", Arrays.asList(new Pair<>("E607 (E607)", 5),new Pair<>("E611 (E611)", 5)));

        //E610 (E610)
        graph.put("E610 (E610)", Arrays.asList(new Pair<>("E612 (E612)", 5),new Pair<>("E608 College of Science Faculty Room (E608)", 5)));

        //E611 (E611)
        graph.put("E611 (E611)", Arrays.asList(new Pair<>("E609 (E609)", 5),new Pair<>("E613 (E613)", 5)));

        //E612 (E612)
        graph.put("E612 (E612)", Arrays.asList(new Pair<>("E610 (E610)", 5),new Pair<>("E614 (E614)", 5)));

        //E613 (E613)
        graph.put("E613 (E613)", Arrays.asList(new Pair<>("E611 (E611)", 5),new Pair<>("E615 CS Lab Storage Room (E615)", 5)));

        //E614 (E614)
        graph.put("E614 (E614)", Arrays.asList(new Pair<>("E612 (E612)", 5),new Pair<>("E616 CS Lab Storage Room (E616)", 5)));

        //E615 CS Lab Storage Room (E615)
        graph.put("E615 CS Lab Storage Room (E615)", Arrays.asList(new Pair<>("E615 CS Lab Storage Room (E615)", 5),new Pair<>("E617 CS Lab Storage Room (E617)", 5)));

        //E616 CS Lab Storage Room (E616)
        graph.put("E616 CS Lab Storage Room (E616)", Arrays.asList(new Pair<>("E614 (E614)", 5),new Pair<>("E618 (E618)", 5)));

        //E617 CS Lab Storage Room (E617)
        graph.put("E617 CS Lab Storage Room (E617)", Arrays.asList(new Pair<>("E619 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E619)", 8),new Pair<>("E615 CS Lab Storage Room (E615)", 5)));

        //E618 (E618)
        graph.put("E618 (E618)", Arrays.asList(new Pair<>("E620 (E620)", 5),new Pair<>("E616 CS Lab Storage Room (E616)", 5)));

        //E619 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E619)
        graph.put("E619 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E619)", Arrays.asList(new Pair<>("East Hallway 6 (EH6)", 4),new Pair<>("E617 CS Lab Storage Room (E617)", 8)));

        //E620 (E620)
        graph.put("E620 (E620)", Arrays.asList(new Pair<>("East Hallway 6 (EH6)", 12),new Pair<>("E618 (E618)", 5)));

        //East Hallway 6 (EH6)
        graph.put("East Hallway 6 (EH6)", Arrays.asList(new Pair<>("East Wing Stairs 6B (ES6B)", 2),new Pair<>("E619 Sentral na Konseho ng Mag aaral SAMASA Early Alliance (E619)", 4),new Pair<>("E620 (E620)", 12)));

        //East Wing Stairs 6A (ES6A)
        graph.put("East Wing Stairs 6A (ES6A)", Arrays.asList(new Pair<>("CR East 6 (CRE6)", 5),new Pair<>("Dome South Hallway 6th (DSH6)", 10),new Pair<>("Dome East Hallway 6th (DEH6)", 12),new Pair<>("East Wing Stairs 5A (ES5A)", 6)));

        //East Wing Stairs 6B (ES6B)
        graph.put("East Wing Stairs 6B (ES6B)", Arrays.asList(new Pair<>("East Hallway 6 (EH6)", 2),new Pair<>("East Wing Stairs 5B (ES5B)", 6)));

        //South Hallway 6A (SH6A)
        graph.put("South Hallway 6A (SH6A)", Arrays.asList(new Pair<>("Dome South Hallway 6th (DSH6)", 24),new Pair<>("South Wing Stairs 6B (SS6B)", 6),new Pair<>("S601 College of Arts and Letters - Office of the Dean (S601)", 7),new Pair<>("S614 Office of Counseling and Psychological Services (S614)", 7)));

        //South Hallway 6B (SH6B)
        graph.put("South Hallway 6B (SH6B)", Arrays.asList(new Pair<>("S605 College of Business Administration - Graduate Studies (S605)", 4),new Pair<>("S604 College of Education - Graduate Studies (S604)", 4),new Pair<>("South Wing Stairs 6A (SS6A)", 4),new Pair<>("South Hallway 6C (SH6C)", 4)));

        //South Hallway 6C (SH6C)
        graph.put("South Hallway 6C (SH6C)", Arrays.asList(new Pair<>("CR South 6A (CRS6A)", 4),new Pair<>("South Hallway 6B (SH6B)", 4),new Pair<>("S606 (S606)", 4),new Pair<>("S607 College of Arts and Letters Chairpersons Office (S607)", 8)));

        //South Hallway 6D (SH6D)
        graph.put("South Hallway 6D (SH6D)", Arrays.asList(new Pair<>("South Wing Stairs 6C (SS6C)", 4),new Pair<>("South Hallway 6E (SH6E)", 4),new Pair<>("S611 (S611)", 4),new Pair<>("S612 College of Social Sciences and Development Chairperson Office (S612)", 4)));

        //South Hallway 6E (SH6E)
        graph.put("South Hallway 6E (SH6E)", Arrays.asList(new Pair<>("CR South 6B (CRS6B)", 4),new Pair<>("South Hallway 6D (SH6D)", 4),new Pair<>("S609 (S609)", 4),new Pair<>("S610 Institute for Data and Statistical Analysis (S610)", 4)));

        //South Wing Stairs 6A (SS6A)
        graph.put("South Wing Stairs 6A (SS6A)", Arrays.asList(new Pair<>("South Hallway 6B (SH6B)", 4),new Pair<>("South Wing Stairs 5A (SS5A)", 6)));

        //South Wing Stairs 6B (SS6B)
        graph.put("South Wing Stairs 6B (SS6B)", Arrays.asList(new Pair<>("South Hallway 6A (SH6A)", 6),new Pair<>("Claro M.Recto Hall (cmrh1)", 10),new Pair<>("South Wing Stairs 5B (SS5B)", 6)));

        //South Wing Stairs 6C (SS6C)
        graph.put("South Wing Stairs 6C (SS6C)", Arrays.asList(new Pair<>("South Hallway 6D (SH6D)", 4),new Pair<>("South Wing Stairs 5C (SS5C)", 6)));

        //Claro M.Recto Hall (cmrh1)
        graph.put("Claro M.Recto Hall (cmrh1)", Arrays.asList(new Pair<>("South Wing Stairs 6B (SS6B)", 10)));

        //Claro M.Recto Hall (cmrh2)
        graph.put("Claro M.Recto Hall (cmrh2)", Arrays.asList(new Pair<>("S607 College of Arts and Letters Chairpersons Office (S607)", 5)));

        //Claro M.Recto Hall (cmrh3)
        graph.put("Claro M.Recto Hall (cmrh3)", Arrays.asList(new Pair<>("S609 (S609)", 5)));

        //S601 College of Arts and Letters - Office of the Dean (S601)
        graph.put("S601 College of Arts and Letters - Office of the Dean (S601)", Arrays.asList(new Pair<>("South Hallway 6A (SH6A)", 7),new Pair<>("S602 CPSPA Graduate Studies (S602)", 7)));

        //S602 CPSPA Graduate Studies (S602)
        graph.put("S602 CPSPA Graduate Studies (S602)", Arrays.asList(new Pair<>("S601 College of Arts and Letters - Office of the Dean (S601)", 7),new Pair<>("S603 College of Political Science and Public Administration Dean's and Chairpersons Office (S603)", 7)));

        //S603 College of Political Science and Public Administration Dean's and Chairpersons Office (S603)
        graph.put("S603 College of Political Science and Public Administration Dean's and Chairpersons Office (S603)", Arrays.asList(new Pair<>("S602 CPSPA Graduate Studies (S602)", 7),new Pair<>("S604 College of Education - Graduate Studies (S604)", 2)));

        //S604 College of Education - Graduate Studies (S604)
        graph.put("S604 College of Education - Graduate Studies (S604)", Arrays.asList(new Pair<>("South Hallway 6B (SH6B)", 4),new Pair<>("S603 College of Political Science and Public Administration Dean's and Chairpersons Office (S603)", 2)));

        //S605 College of Business Administration - Graduate Studies (S605)
        graph.put("S605 College of Business Administration - Graduate Studies (S605)", Arrays.asList(new Pair<>("South Hallway 6B (SH6B)", 4)));

        //S606 (S606)
        graph.put("S606 (S606)", Arrays.asList(new Pair<>("South Hallway 6C (SH6C)", 4)));

        //S607 College of Arts and Letters Chairpersons Office (S607)
        graph.put("S607 College of Arts and Letters Chairpersons Office (S607)", Arrays.asList(new Pair<>("South Hallway 6C (SH6C)", 8),new Pair<>("Claro M.Recto Hall (cmrh2)", 5)));

        //S609 (S609)
        graph.put("S609 (S609)", Arrays.asList(new Pair<>("South Hallway 6E (SH6E)", 4),new Pair<>("Claro M.Recto Hall (cmrh3)", 5)));

        //S610 Institute for Data and Statistical Analysis (S610)
        graph.put("S610 Institute for Data and Statistical Analysis (S610)", Arrays.asList(new Pair<>("South Hallway 6E (SH6E)", 4)));

        //S611 (S611)
        graph.put("S611 (S611)", Arrays.asList(new Pair<>("South Hallway 6D (SH6D)", 4)));

        //S612 College of Social Sciences and Development Chairperson Office (S612)
        graph.put("S612 College of Social Sciences and Development Chairperson Office (S612)", Arrays.asList(new Pair<>("South Hallway 6D (SH6D)", 4),new Pair<>("S613 College of Social Sciences and Development Office of the Dean (S613)", 7)));

        //S613 College of Social Sciences and Development Office of the Dean (S613)
        graph.put("S613 College of Social Sciences and Development Office of the Dean (S613)", Arrays.asList(new Pair<>("S612 College of Social Sciences and Development Chairperson Office (S612)", 7),new Pair<>("S614 Office of Counseling and Psychological Services (S614)", 7)));

        //S614 Office of Counseling and Psychological Services (S614)
        graph.put("S614 Office of Counseling and Psychological Services (S614)", Arrays.asList(new Pair<>("South Hallway 6A (SH6A)", 7),new Pair<>("S613 College of Social Sciences and Development Office of the Dean (S613)", 7)));

        //W600 (W600)
        graph.put("W600 (W600)", Arrays.asList(new Pair<>("Dome South Hallway 6th (DSH6)", 10),new Pair<>("Dome West Hallway 6th (DWH6)", 12),new Pair<>("W604 (W604)", 10)));

        //W601 (W601)
        graph.put("W601 (W601)", Arrays.asList(new Pair<>("CR West 6A (CRW6A)", 5),new Pair<>("W603 (W603)", 5)));

        //W603 (W603)
        graph.put("W603 (W603)", Arrays.asList(new Pair<>("W601 (W601)", 5),new Pair<>("W605 (W605)", 5)));

        //W604 (W604)
        graph.put("W604 (W604)", Arrays.asList(new Pair<>("W600 (W600)", 10),new Pair<>("W606 (W606)", 5)));

        //W605 (W605)
        graph.put("W605 (W605)", Arrays.asList(new Pair<>("W603 (W603)", 5),new Pair<>("W607 (W607)", 5)));

        //W606 (W606)
        graph.put("W606 (W606)", Arrays.asList(new Pair<>("W604 (W604)", 5),new Pair<>("W608 (W608)", 5)));

        //W607 (W607)
        graph.put("W607 (W607)", Arrays.asList(new Pair<>("W609 (W609)", 5),new Pair<>("W605 (W605)", 5)));

        //W608 (W608)
        graph.put("W608 (W608)", Arrays.asList(new Pair<>("W606 (W606)", 5),new Pair<>("W610 (W610)", 5)));

        //W609 (W609)
        graph.put("W609 (W609)", Arrays.asList(new Pair<>("W607 (W607)", 5),new Pair<>("W611 (W611)", 5)));

        //W610 (W610)
        graph.put("W610 (W610)", Arrays.asList(new Pair<>("W608 (W608)", 5),new Pair<>("W612 (W612)", 5)));

        //W611 (W611)
        graph.put("W611 (W611)", Arrays.asList(new Pair<>("W609 (W609)", 5),new Pair<>("W613 (W613)", 5)));

        //W612 (W612)
        graph.put("W612 (W612)", Arrays.asList(new Pair<>("W610 (W610)", 5),new Pair<>("W614 (W614)", 5)));

        //W613 (W613)
        graph.put("W613 (W613)", Arrays.asList(new Pair<>("W615 (W615)", 5),new Pair<>("W611 (W611)", 5)));

        //W614 (W614)
        graph.put("W614 (W614)", Arrays.asList(new Pair<>("W616 (W616)", 5),new Pair<>("W612 (W612)", 5)));

        //W615 (W615)
        graph.put("W615 (W615)", Arrays.asList(new Pair<>("W617 (W617)", 5),new Pair<>("W613 (W613)", 5)));

        //W616 (W616)
        graph.put("W616 (W616)", Arrays.asList(new Pair<>("W614 (W614)", 5),new Pair<>("W618 (W618)", 5)));

        //W617 (W617)
        graph.put("W617 (W617)", Arrays.asList(new Pair<>("CR West 6B (CRW6B)", 4),new Pair<>("W615 (W615)", 5)));

        //W618 (W618)
        graph.put("W618 (W618)", Arrays.asList(new Pair<>("W620 (W620)", 5),new Pair<>("W616 (W616)", 5)));

        //W620 (W620)
        graph.put("W620 (W620)", Arrays.asList(new Pair<>("West Hallway 6 (WH6)", 12),new Pair<>("W618 (W618)", 5)));

        //West Hallway 6 (WH6)
        graph.put("West Hallway 6 (WH6)", Arrays.asList(new Pair<>("West Wing Stairs 6B (WS6B)", 2),new Pair<>("CR West 6B (CRW6B)", 4),new Pair<>("W620 (W620)", 12)));

        //West Wing Stairs 6B (WS6B)
        graph.put("West Wing Stairs 6B (WS6B)", Arrays.asList(new Pair<>("West Hallway 6 (WH6)", 2),new Pair<>("West Wing Stairs 5B (WS5B)", 6)));

        //West Wing Stairs 6A (WS6A)
        graph.put("West Wing Stairs 6A (WS6A)", Arrays.asList(new Pair<>("CR West 6A (CRW6A)", 5),new Pair<>("Dome West Hallway 6th (DWH6)", 12),new Pair<>("West Wing Stairs 5A (WS5A)", 6)));
    }

    public static List<Pair<String, Integer>> getNeighbors(String node) {
        return graph.getOrDefault(node, Collections.emptyList());
    }

    public static Set<String> getAllNodes() {
        return graph.keySet();
    }
}
