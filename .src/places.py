#overall layout
graph = {
    'Main Gate (MG)':[('Way AAA', 50), ('Way AAL', 49)],
    'Institute for Science and Technology Research (ISTR)':[('Way ABE',18)],
    'North Oval Runway (NOR)':[('Way AAM', 12), ('East Oval Runway (EOR)', 96), ('West Oval Runway (WOR)',91)],
    'East Oval Runway (EOR)':[('North Oval Runway (NOR)',96), ('South Oval Runway (SOR)',96)],
    'West Oval Runway (WOR)':[('Way AAH',67), ('North Oval Runway (NOR)', 91), ('South Oval Runway (SOR)',91), ('Grand Stand',14)],
    'South Oval Runway (SOR)':[('West Oval Runway (WOR)',91), ('East Oval Runway (EOR)',96), ('Way AAH',19)],
    'Food Nutrition Building (FN)':[('Way AAF',28), ('Way AAG',29)],
    'Interfaith Chapel':[('Way AAD',35), ('Way AAE',35), ('Way AAG',35)],
    'North Wing ground (NW1)':[('Way AAE',27), ('North Wing ground (NW2)',18), ('East Wing ground (EW4)',14)],
    'North Wing ground (NW2)':[('Way AAP',14) , ('North Wing ground (NW1)',18), ('West Wing ground (WW3)',14)],
    'East Wing ground (EW4)':[('North Wing ground (NW1)',14), ('Way AAE',32), ('Way AAF',58),('South Wing ground (SW2)',17),('E1',6)],
    'East Wing ground (EW1)':[('Way AAF',29), ('Way AAI',10)],
    'East Wing ground (EW2)':[('Way AAI',10), ('Way AAJ',10)],
    'West Wing ground (WW1)':[('Way AAK', 29), ('Way AAN',14), ('U',12)],
    'West Wing ground (WW2)':[('Way AAN',12), ('Way AAO',11)],
    'West Wing ground (WW3)':[('North Wing ground (NW2)',14), ('North Wing ground (NW2)',14),('West Wing Stairs 1A',6),('South Wing ground (SW1)',19)],
    'PUP Swimming Pool(PSP)':[('Way ABA',32)],
    'Alumni Building (AL)':[('Way ABA',38)],
    'P.E Building (P.EB)':[('Way ABA',38)],
    'Grand Stand':[('West Oval Runway (WOR)',14)],
    'Ferry Terminal':[('Way AAJ',12)],
    'Linear Park':[('Way AAJ',59), ('Way AAK',18), ('Way AAN',25), ('Student Canteen',40)],
    'U':[('Way AAK',23), ('West Wing ground (WW1)',12), ('Way AAN',20)],
    'Sampaguita Building':[('Way AAO',21), ('Way AAN',11), ('Student Canteen',17)],
    'Student Canteen':[('Way AAN',30), ('Way AAO',25), ('linear park (LP)',40), ('Sampaguita Building', 17)],
    'linear park (LP)':[('Student Canteen',40),('Way AAJ',59),('Way AAK',18),('Way AAN',25)],
    'Charlie Del Rosario':[('Way AAO',29), ('Way AAW',28), ('Way AAX',31)],
    'Laboratory High School':[('Way AAY',31), ('Way AAZ',15)],
    'Printing Press Building':[('Way AAZ',13)],
    'PUP Tennis Court':[('Way AAQ',18)],
    'PUP Open Court':[('Way AAQ',27), ('Way AAR',26)],
    'PUP Swimming Pool':[('Way ABA',32)],
    'Alumni Building':[('Way ABA',38)],
    'P.E Building':[('Way ABA',30)],
    'Lagoon entrance (LE1)':[('Way AAU',18), ('Lagoon 2',50), ('Lagoon 1',28)],
    'Lagoon entrance (LE2)':[('Way AAW',19), ('Lagoon entrance (LE3)',33), ('Lagoon 3',30)],
    'Lagoon entrance (LE3)':[('Lagoon entrance (LE2)',33), ('Lagoon 2',35), ('Way AAP',10)],
    'Ampitheather (AT)':[('Lagoon 1',43), ('Lagoon 2',19)],
    'Ninoy Aquino Library and Learning Resource Center (NAL1)':[('Way AAY',53), ('Way AAX',42)],
    'Ninoy Aquino Library and Learning Resource Center (NAL2)':[('Way ABH',39)],
    'PUP Gymnasium (PG1)':[('Way ABD',10), ('Way ABE',16)],
    'Way AAA':[('Main Gate (MG)',50), ('Way AAL',9), ('Way AAB',70), ('Way AAQ',45), ('Way ABE',57)],
    'Way AAB':[('Way AAL',68), ('Way AAA',70), ('Way AAC',45)],
    'Way AAC':[('Way AAB',45), ('Way AAD',40)],
    'Way AAD':[('Way AAC',40), ('Way AAE',50), ('Interfaith Chapel',35), ('Way AAH',19)],
    'Way AAE':[('Way AAD',50), ('Way AAF',55), ('Interfaith Chapel',35), ('North Wing ground (NW1)',27), ('East Wing ground (EW4)',32)],
    'Way AAF':[('Way AAE',55), ('East Wing ground (EW4)',58), ('Food Nutrition Building (FN)',28), ('Way AAG',48), ('East Wing ground (EW1)',29)],
    'Way AAG':[('Way AAF',48), ('Food Nutrition Building (FN)',29), ('Interfaith Chapel',35), ('Way AAH',34), ('Way AAD',47)],
    'Way AAH':[('Way AAD',19), ('South Oval Runway (SOR)',42), ('West Oval Runway (WOR)',67), ('Way AAG',34)],
    'Way AAI':[('East Wing ground (EW2)',10), ('East Wing ground (EW1)',10)],
    'Way AAJ':[('East Wing ground (EW2)',40), ('Way AAK',40), ('Ferry Terminal (FT)',12), ('linear park (LP)',59)],
    'Ferry Terminal (FT)':[('Way AAJ',12)],
    'Way AAK':[('Way AAJ',40), ('West Wing ground (WW1)',29), ('linear park (LP)',18), ('U',23), ('Way AAN',42)],
    'Way AAL':[('Way AAA',9), ('Way AAB',68), ('Main Gate (MG)',49), ('Way AAM',38)],
    'Way AAM':[('Way AAL',38), ('North Oval Runway (NOR)',12)],
    'Way AAN':[('West Wing ground (WW1)',14), ('West Wing ground (WW2)',12), ('Way AAK',42), ('U',20), ('linear park (LP)',25), ('Sampaguita Building',11), ('Student Canteen',30), ('Way AAO',23)],
    'Way AAO':[('Way AAN',23), ('Student Canteen',25), ('West Wing ground (WW2)',11), ('Sampaguita Building',21), ('Charlie Del Rosario',29), ('Way AAV',37)],
    'Way AAP':[('Way AAV',22), ('West Wing ground (WW3)',14), ('North Wing ground (NW2)',14), ('Lagoon entrance (LE3)',10)],
    'Way AAQ':[('Way AAA',45), ('Way AAR',47), ('PUP Tennis Court',18), ('PUP Open Court',27)],
    'Way AAR':[('Way AAQ',47), ('PUP Open Court',26), ('Way AAS',28), ('Way AAT',18)],
    'Way AAS':[('Way AAU',27), ('Way ABA',18), ('Way AAR',28)],
    'Way AAT':[('Way AAR',18), ('Way AAU',20)],
    'Way AAU':[('Way AAS',27), ('Lagoon entrance (LE1)',18), ('Way AAT',20)],
    'Way AAV':[('Way AAW',33), ('Way AAP',22), ('Way AAO',37)],
    'Way AAW':[('Lagoon entrance (LE2)',19), ('Charlie Del Rosario',28), ('Way AAV',33), ('Way AAX',28)],
    'Way AAX':[('Charlie Del Rosario',31), ('Way AAW',28), ('Way AAY',82), ('Ninoy Aquino Library and Learning Resource Center (NAL1)',42)],
    'Way AAY':[('Way AAX',82), ('Way AAZ',45), ('Laboratory High School (LH1)',31), ('Ninoy Aquino Library and Learning Resource Center (NAL1)',53)],
    'Way AAZ':[('Way AAY',45), ('Laboratory High School (LH1)',15), ('Printing Press Building',13)],
    'Laboratory High School (LH1)':[('Way AAZ',15),('Way AAY',31)],
    'Way ABA':[('Way AAS',18), ('Way ABB',25), ('Way ABF',36), ('PUP Swimming Pool(PSP)',32), ('Alumni Building (AL)',38), ('P.E Building (P.EB)',30)],
    'Way ABB':[('Way ABA',25), ('Way ABC',38)],
    'Way ABC':[('Way ABB',38), ('Way ABD',50)],
    'Way ABD':[('Way ABE',25), ('PUP Gymnasium (PG1)',10), ('Way ABC',50)],
    'Way ABE':[('PUP Gymnasium (PG1)',10), ('Way ABD',25), ('Way AAA',57), ('Institute for Science and Technology Research (ISTR)',18)],
    'Way ABF':[('Way ABA',36), ('Way ABG',20)],
    'Way ABG':[('Way ABH',27), ('Way ABF',20)],
    'Way ABH':[('Ninoy Aquino Library and Learning Resource Center (NAL2)',39), ('Way ABG',27)],
    'Lagoon 1':[('Lagoon entrance (LE1)',28), ('Lagoon 2',24), ('Lagoon 3',35), ('Ampitheather (AT)',43)],
    'Lagoon 2':[('Ampitheather (AT)',19), ('Lagoon 1',20), ('Lagoon entrance (LE3)',35), ('Lagoon entrance (LE1)',50)],
    'Lagoon 3':[('Lagoon 3',35), ('Lagoon 2',20), ('Lagoon entrance (LE2)',30)],
    'West Wing Stairs 1A':[('W2',5),('West Wing Stairs 2A',8),('West Wing ground (WW3)',6)],
    'West Wing Stairs 1B':[('West Hallway 1st',5),('West Wing Stairs 2B',8)],
    'West Hallway 1st':[('W10',14),('W12',14),('West Wing Stairs 1B',5),('West Wing ground (WW1)',8),('West Wing ground (WW2)',8)],
    'W1':[('South Wing ground (SW1)',6),('W3',5)],
    'W2':[('West Wing Stairs 1A',5),('W4',15)],
    'W3':[('W1',5),('W5',5)],
    'W4':[('W6',10),('W2',15)],
    'W5':[('W3',5),('W7',5)],
    'W6':[('W4',10),('W8',10)],
    'W7':[('W5',5),('W9',5)],
    'W8':[('W6',10),('W10',10)],
    'W9':[('W7',5),('W11',5)],
    'W10':[('W8',10),('West Hallway 1st',14)],
    'W11':[('W9',5),('W12',5)],
    'W12':[('West Hallway 1st',14),('W11',5)],
    'South Wing ground (SW1)':[('West Wing ground (WW3)',19),('Dome Runway 1st',8),('South Wing ground (SW2)',13),('South Hallway A',9),('W1',6)],
    'South Wing ground (SW2)':[('East Wing ground (EW4)',17),('Dome Runway 1st',8),('South Wing ground (SW1)',13),('South Hallway A',9),('East Wing Stairs 1A',6)],
    'Dome Runway 1st':[('South Wing ground (SW1)',7),('South Wing ground (SW2)',7),('Dome Runway 2nd',28)],
    'East Wing Stairs 1A':[('E2',5),('East Wing Stairs 2A',8),('South Wing ground (SW2)',6)],
    'East Wing Stairs 1B':[('East Hallway 1st',5),('East Wing Stairs 2B',8)],
    'East Hallway 1st':[('E12',14),('E13',14),('East Wing Stairs 1B',5)],
    'E2':[('East Wing Stairs 1A',5),('E5',5)],
    'E1':[('E3',5),('East Wing ground (EW4)',6)],
    'E3':[('E4',5),('E1',5)],
    'E4':[('E3',5),('E6',5)],
    'E5':[('E2',5),('E7',15)],
    'E6':[('E8',10),('E4',5)],
    'E7':[('E5',10),('E10',10)],
    'E8':[('E9',5),('E6',10)],
    'E9':[('E8',5),('E11',5)],
    'E10':[('E12',10),('E7',10)],
    'E11':[('E13',10),('E9',5)],
    'E12':[('E10',10),('East Hallway 1st',14)],
    'E13':[('E11',10),('East Hallway 1st',14),],
    'South Wing Stairs 1A':[('South Hallway B',13),('S1',7),('S9',14),('S5',11),('South Wing Stairs 2A',8)],
    'South Hallway A':[('South Hallway B',17),('South Wing ground (SW1)',9),('South Wing ground (SW2)',9)],
    'South Hallway B':[('South Hallway A',17),('South Wing Stairs 1A',13),('S9',7),('S1',7)],
    'S1':[('South Wing Stairs 1A',7),('S2',7)],
    'S2':[('S1',7),('S3',7)],
    'S3':[('S2',7),('S4',21)],
    'S4':[('S3',21),('S5',7)],
    'S5':[('South Wing Stairs 1A',11),('S4',7),('S6',7)],
    'S6':[('S7',7),('S5',7)],
    'S7':[('S8',14),('S6',7)],
    'S8':[('S7',14),('S9',7)],
    'S9':[('S8',7),('South Wing Stairs 1A',7)],
    'West Wing Stairs 2A':[('W201',5),('West Wing Stairs 1A',8),('Dome West Hallway 2nd',11),('Dome North Hallway 2nd',15),('West Wing Stairs 3A',8)],
    'West Wing Stairs 2B':[('West Hallway 2nd',5),('West Wing Stairs 1B',8),('West Wing Stairs 3B',8)],
    'West Hallway 2nd':[('W220',14),('W219',14),('West Wing Stairs 3B',5)],
    'W200':[('W202',5),('Dome South Hallway 2nd',19),('Dome West Hallway 2nd',19)],
    'W202':[('W200',5),('W204',5),('Dome South Hallway 2nd',19)],
    'W201':[('West Wing Stairs 2A',5),('W203',5)],
    'W203':[('W201',5),('W205',5)],
    'W204':[('W206',5),('W202',5)],
    'W205':[('W203',5),('W207',5)],
    'W206':[('W204',5),('W208',5)],
    'W207':[('W205',5),('W209',5)],
    'W208':[('W206',5),('W210',5)],
    'W209':[('W207',5),('W211',5)],
    'W210':[('W208',5),('W212',5)],
    'W211':[('W209',5),('W213',5)],
    'W212':[('W210',5),('W214',5)],
    'W213':[('W211',5),('W215',5)],
    'W214':[('W212',5),('W216',5)],
    'W215':[('W213',5),('W217',5)],
    'W216':[('W214',5),('W218',5)],
    'W217':[('W215',5),('W219',5)],
    'W218':[('W216',5),('W220',5)],
    'W219':[('W217',5),('West Hallway 2nd',14)],
    'W220':[('West Hallway 2nd',14),('W218',5)],
    'Dome South Hallway 2nd':[('Dome East Hallway 2nd',14),('Dome West Hallway 2nd',14),('East Wing Stairs 2A',9),('South Hallway 2nd',20),('W200',9),('Dome Runway 2nd',7)],
    'Dome East Hallway 2nd':[('Dome North Hallway 2nd',17),('Dome South Hallway 2nd',14),('East Wing Stairs 2A',11),('E200',11)],
    'Dome North Hallway 2nd':[('Dome West Hallway 2nd',17),('Dome East Hallway 2nd',17),('West Wing Stairs 2A',15), ('E200',15)],
    'Dome West Hallway 2nd':[('West Wing Stairs 2A',11),('Dome South Hallway 2nd',14),('Dome North Hallway 2nd',17),('Dome Runway 2nd',7),('W200',11)],
    'Dome Runway 2nd':[('Dome West Hallway 2nd',7),('Dome South Hallway 2nd',7),('Dome Runway 1st',28),('Dome Runway 3rd',28)],
    'East Wing Stairs 2A':[('E201',5),('East Wing Stairs 1A',8),('East Wing Stairs 3A',8),('Dome South Hallway 2nd',9),('Dome East Hallway 2nd',11)],
    'East Wing Stairs 2B':[('East Hallway 2nd',5),('East Wing Stairs 1B',8),('East Wing Stairs 3B',8)],
    'E201':[('E203',5),('East Wing Stairs 2A',5)],
    'East Hallway 2nd':[('E220',14),('E217',14),('East Wing Stairs 2B',5)],
    'E200':[('E202',5),('Dome East Hallway 2nd',11),('Dome North Hallway 2nd',15)],
    'E202':[('E200',5),('E204',5)],
    'E203':[('E201',5),('E205',5)],
    'E204':[('E206',5),('E202',5)],
    'E205':[('E203',5),('E207',5)],
    'E206':[('E204',5),('E208',5)],
    'E207':[('E205',5),('E209',5)],
    'E208':[('E206',5),('E210',5)],
    'E209':[('E207',5),('E211',5)],
    'E210':[('E208',5),('E212',5)],
    'E211':[('E209',5),('E213',5)],
    'E212':[('E210',5),('E214',5)],
    'E213':[('E211',5),('E215',5)],
    'E214':[('E212',5),('E216',5)],
    'E215':[('E213',5),('E217',5)],
    'E216':[('E214',5),('E218',5)],
    'E217':[('E215',5),('East Hallway 2nd',14)],
    'E218':[('E216',5),('E220',5)],
    'E220':[('East Hallway 2nd',14),('E218',5)],
    'South Wing Stairs 2A':[('South Hallway 2nd',13),('S211',7),('S201',14),('S204',11),('South Wing Stairs 1A',8),('South Wing Stairs 3A',8)],
    'South Hallway 2nd':[('Dome South Hallway 2nd',20),('South Wing Stairs 2A',13),('S201',7) ,('S211',7)],
    'S201':[('South Wing Stairs 2A',7),('S202',28)],
    'S202':[('S201',28),('S203',7)],
    'S203':[('S204',7),('S202',7)],
    'S204':[('S203',7),('S205',14)],
    'S205':[('S204',14),('S206',7)],
    'S206':[('S207',7),('S205',7)],
    'S207':[('S208',7),('S209',7)],
    'S208':[('S209',7),('S210',7)],
    'S209':[('S211',7),('S210',7)],
    'S210':[('S209',7),('S211',7)],
    'S211':[('South Hallway 2nd',7),('S210',7)],
    'West Wing Stairs 3A':[('Female CR 3W',5),('West Wing Stairs 2A',8),('Dome West Hallway 3rd',11),('Dome North Hallway 3rd',15),('West Wing Stairs 4A',8)],
    'West Wing Stairs 3B':[('West Hallway 3rd',5),('West Wing Stairs 2B',8),('West Wing Stairs 4B',8)],
    'Female CR 3W':[('Male CR 3W',5),('West Wing Stairs 3A',5)],
    'Male CR 3W':[('W303',10),('Female CR 3W',5)],
    'West Hallway 3rd':[('W309',14),('W314',14),('West Wing Stairs 3B',5)],
    'W300':[('W302',5),('Dome West Hallway 3rd',15),('Dome South Hallway 3rd',9)],
    'W302':[('W300',5),('W304',5)],
    'W303':[('Male CR 3W',5),('W305',10)],
    'W304':[('W306',10),('W302',5)],
    'W305':[('W303',10),('W307',10)],
    'W306':[('W304',10),('W308',5)],
    'W307':[('W305',10),('W309',10)],
    'W308':[('W306',10),('W310',5)],
    'W309':[('W307',10),('West Hallway 3rd',14)],
    'W310':[('W308',5),('W312',5)],
    'W312':[('W310',5),('W314',5)],
    'W314':[('W312',5),('West Hallway 3rd',14)],
    'Dome South Hallway 3rd':[('Dome East Hallway 3rd',14),('Dome West Hallway 3rd',14),('East Wing Stairs 3A',9),('South Hallway 3rd',20),('W300',9)],
    'Dome East Hallway 3rd':[('Dome North Hallway 3rd',17),('Dome South Hallway 3rd',14),('East Wing Stairs 3A',11),('E300',11)],
    'Dome North Hallway 3rd':[('Dome West Hallway 3rd',17),('Dome East Hallway 3rd',17),('West Wing Stairs 3A',15), ('E300',15)],
    'Dome West Hallway 3rd':[('West Wing Stairs 3A',11),('Dome South Hallway 3rd',14),('Dome North Hallway 3rd',17),('Dome Runway 3rd',7),('W300',11)],
    'Dome Runway 3rd':[('Dome West Hallway 3rd',7),('Dome South Hallway 3rd',7),('Dome Runway 2nd',28),('Dome Runway 4th',28)],
    'East Wing Stairs 3A':[('Female CR 3W',5),('East Wing Stairs 2A',8),('East Wing Stairs 4A',8),('Dome South Hallway 3rd',9),('Dome East Hallway 3rd',11)],
    'East Wing Stairs 3B':[('East Hallway 3rd',5),('East Wing Stairs 2B',8),('East Wing Stairs 4B',8)],
    'Female CR 3W':[('Male CR 3E',5),('East Wing Stairs 3A',5)],
    'Male CR 3E':[('E303',5),('Female CR 3W',5)],
    'East Hallway 3rd':[('E313',14),('E310',14),('East Wing Stairs 3B',5)],
    'E300':[('E302',10),('Dome East Hallway 3rd',11),('Dome North Hallway 3rd',15)],
    'E302':[('E300',10),('E304',10)],
    'E303':[('Male CR 3E',5),('E305',10)],
    'E304':[('E306',10),('E302',10)],
    'E305':[('E303',10),('E307',10)],
    'E306':[('E304',10),('E308',10)],
    'E307':[('E305',10),('E309',5)],
    'E308':[('E306',10),('E310',10)],
    'E309':[('E307',5),('E311',5)],
    'E310':[('E308',10),('East Hallway 3rd',14)],
    'E311':[('E309',5),('E313',5)],
    'E313':[('E311',5),('East Hallway 3rd',14)],
    'South Wing Stairs 3A':[('South Hallway 3rd',13),('S316',7),('S301',14),('S308',11),('South Wing Stairs 2A',8),('South Wing Stairs 4A',8)],
    'South Hallway 3rd':[('Dome South Hallway 3rd',20),('South Wing Stairs 3A',13),('S301',7) ,('S316',7)],
    'S301':[('South Wing Stairs 3A',7),('S302',7)],
    'S302':[('S301',7),('S303',7)],
    'S303':[('S304',7),('S302',7)],
    'S304':[('S303',7),('S305',7)],
    'S305':[('S304',7),('S306',7)],
    'S306':[('S307',7),('S305',7)],
    'S307':[('S308',7),('S309',7)],
    'S308':[('S309',7),('S310',7)],
    'S309':[('S311',7),('S310',7)],
    'S310':[('S309',7),('S311',7)],
    'S311':[('S312',7),('S310',7)],
    'S312':[('S311',7),('S313',7)],
    'S313':[('S314',7),('S312',7)],
    'S314':[('S315',7),('S313',7)],
    'S315':[('S314',7),('S316',7)],
    'S316':[('S315',7),('South Hallway 3rd',7)],
    'West Wing Stairs 4A':[('Female CR 4W',5),('West Wing Stairs 3A',8),('Dome West Hallway 4th',11),('Dome North Hallway 4th',15),('West Wing Stairs 5A',8)],
    'West Wing Stairs 4B':[('West Hallway 4th',5),('West Wing Stairs 3B',8),('West Wing Stairs 5B',8)],
    'Female CR 4W':[('Male CR 4W',5),('West Wing Stairs 4A',5)],
    'Male CR 4W':[('W403',10),('Female CR 4W',5)],
    'West Hallway 4th':[('W418',14),('W417',14),('West Wing Stairs 4B',5)],
    'W400':[('W402',5),('Dome West Hallway 4th',15),('Dome South Hallway 4th',9)],
    'W402':[('W400',5),('W404',5)],
    'W403':[('Male CR 4W',10),('W405',5)],
    'W404':[('W406',5),('W402',5)],
    'W405':[('W403',5),('W407',5)],
    'W406':[('W404',5),('W408',5)],
    'W407':[('W405',5),('W409',5)],
    'W408':[('W406',5),('W410',5)],
    'W409':[('W407',5),('W411',5)],
    'W410':[('W408',5),('W412',5)],
    'W411':[('W409',5),('W413',5)],
    'W412':[('W410',5),('W414',5)],
    'W413':[('W411',5),('W415',5)],
    'W414':[('W412',5),('W416',5)],
    'W415':[('W413',5),('W417',5)],
    'W416':[('W414',5),('W418',5)],
    'W417':[('W415',5),('West Hallway 4th',14)],
    'W418':[('W416',5),('West Hallway 4th',14)],
    'Dome South Hallway 4th':[('Dome East Hallway 4th',14),('Dome West Hallway 4th',14),('East Wing Stairs 4A',9),('South Hallway 4th',20),('W400',9)],
    'Dome East Hallway 4th':[('Dome North Hallway 4th',17),('Dome South Hallway 4th',14),('East Wing Stairs 4A',11),('E400',11)],
    'Dome North Hallway 4th':[('Dome West Hallway 4th',17),('Dome East Hallway 4th',17),('West Wing Stairs 4A',15), ('E400',15)],
    'Dome West Hallway 4th':[('West Wing Stairs 4A',11),('Dome South Hallway 4th',14),('Dome North Hallway 4th',17),('Dome Runway 4th',7),('W400',11)],
    'Dome Runway 4th':[('Dome West Hallway 4th',7),('Dome South Hallway 4th',7),('Dome Runway 3rd',28),('Dome Runway 5th',28)],
    'East Wing Stairs 4A':[('Female CR 4W',5),('East Wing Stairs 3A',8),('East Wing Stairs 5A',8),('Dome South Hallway 4th',9),('Dome East Hallway 4th',11)],
    'East Wing Stairs 4B':[('East Hallway 4th',5),('East Wing Stairs 3B',8),('East Wing Stairs 5B',8)],
    'Female CR 4W':[('Male CR 4E',5),('East Wing Stairs 4A',5)],
    'Male CR 4E':[('E403',5),('Female CR 4W',5)],
    'East Hallway 4th':[('E418',14),('E417',14),('East Wing Stairs 4B',5)],
    'E400':[('E402',5),('Dome East Hallway 4th',11),('Dome North Hallway 4th',15)],
    'E402':[('E400',5),('E404',5)],
    'E403':[('Male CR 4E',5),('E405',5)],
    'E404':[('E406',5),('E402',5)],
    'E405':[('E403',5),('E407',5)],
    'E406':[('E404',5),('E408',5)],
    'E407':[('E405',5),('E409',5)],
    'E408':[('E406',5),('E410',5)],
    'E409':[('E407',5),('E411',5)],
    'E410':[('E408',5),('E412',5)],
    'E411':[('E409',5),('E413',5)],
    'E412':[('E410',5),('E414',5)],
    'E413':[('E411',5),('E415',5)],
    'E414':[('E412',5),('E416',5)],
    'E415':[('E413',5),('E417',5)],
    'E416':[('E414',5),('E418',5)],
    'E417':[('E415',5),('East Hallway 4th',14)],
    'E418':[('E416',5),('East Hallway 4th',14)],
    'South Wing Stairs 4A':[('South Hallway 4th',13),('S416',7),('S401',14),('S408',11),('South Wing Stairs 3A',8),('South Wing Stairs 5A',8)],
    'South Hallway 4th':[('Dome South Hallway 4th',20),('South Wing Stairs 4A',13),('S401',7) ,('S416',7)],
    'S401':[('South Wing Stairs 4A',7),('S402',7)],
    'S402':[('S401',7),('S403',7)],
    'S403':[('S404',7),('S402',7)],
    'S404':[('S403',7),('S405',7)],
    'S405':[('S404',7),('S406',7)],
    'S406':[('S407',7),('S405',7)],
    'S407':[('S408',7),('S409',7)],
    'S408':[('S409',7),('S410',7)],
    'S409':[('S411',7),('S410',7)],
    'S410':[('S409',7),('S411',7)],
    'S411':[('S412',7),('S410',7)],
    'S412':[('S411',7),('S413',7)],
    'S413':[('S414',7),('S412',7)],
    'S414':[('S415',7),('S413',7)],
    'S415':[('S414',7),('S416',7)],
    'S416':[('S415',7),('South Hallway 4th',7)],
    'West Wing Stairs 5A':[('Female CR 5W',5),('West Wing Stairs 4A',8),('Dome West Hallway 5th',11),('Dome North Hallway 5th',15),('West Wing Stairs 1A',8)],
    'West Wing Stairs 5B':[('West Hallway 5th',5),('West Wing Stairs 4B',8),('West Wing Stairs 6B',8)],
    'Female CR 5W':[('Male CR 5W',5),('West Wing Stairs 5A',5)],
    'Male CR 5W':[('W503',10),('Female CR 5W',5)],
    'West Hallway 5th':[('W515',14),('W518',14),('West Wing Stairs 5B',5)],
    'W500':[('W502',5),('Dome West Hallway 5th',15),('Dome South Hallway 5th',9)],
    'W502':[('W500',5),('W504',5)],
    'W503':[('Male CR 5W',10),('W505',5)],
    'W504':[('W506',5),('W502',5)],
    'W505':[('W503',5),('W507',5)],
    'W506':[('W504',5),('W508',5)],
    'W507':[('W505',5),('W509',5)],
    'W508':[('W506',5),('W510',5)],
    'W509':[('W507',5),('W511',5)],
    'W510':[('W508',5),('W512',5)],
    'W511':[('W509',5),('W513',5)],
    'W512':[('W510',5),('W514',5)],
    'W513':[('W511',5),('W515',5)],
    'W514':[('W512',5),('W516',5)],
    'W515':[('W513',5),('West Hallway 5th',14)],
    'W516':[('W514',5),('W618',5)],
    'W518':[('W516',5),('West Hallway 5th',14)],
    'Dome South Hallway 5th':[('Dome East Hallway 5th',14),('Dome West Hallway 5th',14),('East Wing Stairs 5A',9),('South Hallway 5th',20),('W500',9)],
    'Dome East Hallway 5th':[('Dome North Hallway 5th',17),('Dome South Hallway 5th',14),('East Wing Stairs 5A',11),('E500',11)],
    'Dome North Hallway 5th':[('Dome West Hallway 5th',17),('Dome East Hallway 5th',17),('West Wing Stairs 5A',15), ('E500',15)],
    'Dome West Hallway 5th':[('West Wing Stairs 5A',11),('Dome South Hallway 5th',14),('Dome North Hallway 5th',17),('Dome Runway 5th',7),('W500',11)],
    'Dome Runway 5th':[('Dome West Hallway 5th',7),('Dome South Hallway 5th',7),('Dome Runway 4th',28),('Dome Runway 6th',28)],
    'East Wing Stairs 5A':[('Female CR 5W',5),('East Wing Stairs 4A',8),('East Wing Stairs 1A',8),('Dome South Hallway 5th',9),('Dome East Hallway 5th',11)],
    'East Wing Stairs 5B':[('East Hallway 5th',5),('East Wing Stairs 4B',8),('East Wing Stairs 6B',8)],
    'Female CR 5W':[('Male CR 5E',5),('East Wing Stairs 5A',5)],
    'Male CR 5E':[('E503',5),('Female CR 5W',5)],
    'East Hallway 5th':[('E520',14),('E517',14),('East Wing Stairs 5B',5)],
    'E500':[('E502',5),('Dome East Hallway 5th',11),('Dome North Hallway 5th',15)],
    'E502':[('E500',5),('E504',5)],
    'E503':[('Male CR 5E',5),('E505',5)],
    'E504':[('E506',5),('E502',5)],
    'E505':[('E503',5),('E507',5)],
    'E506':[('E504',5),('E508',5)],
    'E507':[('E505',5),('E509',5)],
    'E508':[('E506',5),('E510',5)],
    'E509':[('E507',5),('E511',5)],
    'E510':[('E508',5),('E512',5)],
    'E511':[('E509',5),('E513',5)],
    'E512':[('E510',5),('E514',5)],
    'E513':[('E511',5),('E515',5)],
    'E514':[('E512',5),('E516',5)],
    'E515':[('E513',5),('E517',5)],
    'E516':[('E514',5),('E518',5)],
    'E517':[('E515',5),('East Hallway 5th',14)],
    'E518':[('E516',5),('E520',5)],
    'E520':[('East Hallway 5th',14),('E518',5)],
    'South Wing Stairs 5A':[('South Hallway 5th',13),('S516',7),('S501',14),('S508',11),('South Wing Stairs 4A',8),('South Wing Stairs 1A',8)],
    'South Hallway 5th':[('Dome South Hallway 5th',20),('South Wing Stairs 5A',13),('S501',7) ,('S516',7)],
    'S501':[('South Wing Stairs 5A',7),('S502',14)],
    'S502':[('S501',14),('S503',7)],
    'S503':[('S504',7),('S502',7)],
    'S504':[('S503',7),('S505',7)],
    'S505':[('S504',7),('S506',7)],
    'S506':[('S507',7),('S505',7)],
    'S507':[('S508',7),('S509',7)],
    'S508':[('S509',7),('S510',7)],
    'S509':[('S511',7),('S510',7)],
    'S510':[('S509',7),('S511',7)],
    'S511':[('S512',7),('S510',7)],
    'S512':[('S511',7),('S513',7)],
    'S513':[('S514',7),('S512',7)],
    'S514':[('S515',7),('S513',7)],
    'S515':[('S514',7),('S516',7)],
    'S516':[('S515',7),('South Hallway 5th',7)],
    'West Wing Stairs 6A':[('Female CR 6W',5),('West Wing Stairs 5A',8),('Dome West Hallway 6th',11),('Dome North Hallway 6th',15)],
    'West Wing Stairs 6B':[('West Hallway 6th',5),('West Wing Stairs 5B',8)],
    'Female CR 6W':[('Male CR 6W',5),('West Wing Stairs 6A',5)],
    'Male CR 6W':[('W603',5),('Female CR 6W',5)],
    'West Hallway 6th':[('W620',14),('W617',14),('West Wing Stairs 6B',5)],
    'W600':[('W602',5),('Dome West Hallway 6th',15),('Dome South Hallway 6th',9)],
    'W602':[('W600',5),('W604',5)],
    'W603':[('Male CR 6W',5),('W605',5)],
    'W604':[('W606',5),('W602',5)],
    'W605':[('W603',5),('W607',5)],
    'W606':[('W604',5),('W608',5)],
    'W607':[('W605',5),('W609',5)],
    'W608':[('W606',5),('W610',5)],
    'W609':[('W607',5),('W611',5)],
    'W610':[('W608',5),('W612',5)],
    'W611':[('W609',5),('W613',5)],
    'W612':[('W610',5),('W614',5)],
    'W613':[('W611',5),('W615',5)],
    'W614':[('W612',5),('W616',5)],
    'W615':[('W613',5),('W617',5)],
    'W616':[('W614',5),('W618',5)],
    'W617':[('W615',5),('West Hallway 6th',14)],
    'W618':[('W616',5),('W620',5)],
    'W620':[('West Hallway 6th',14),('W618',5)],
    'Dome South Hallway 6th':[('Dome East Hallway 6th',14),('Dome West Hallway 6th',14),('East Wing Stairs 6A',9),('South Hallway 6th',20),('W600',9)],
    'Dome East Hallway 6th':[('Dome North Hallway 6th',17),('Dome South Hallway 6th',14),('East Wing Stairs 6A',11),('E600',11)],
    'Dome North Hallway 6th':[('Dome West Hallway 6th',17),('Dome East Hallway 6th',17),('West Wing Stairs 6A',15), ('E600',15)],
    'Dome West Hallway 6th':[('West Wing Stairs 6A',11),('Dome South Hallway 6th',14),('Dome North Hallway 6th',17),('Dome Runway 6th',7),('W600',11)],
    'Dome Runway 6th':[('Dome West Hallway 6th',7),('Dome South Hallway 6th',7),('Dome Runway 5th',28)],
    'East Wing Stairs 6A':[('Female CR 6W',5),('East Wing Stairs 5A',8),('Dome South Hallway 6th',9),('Dome East Hallway 6th',11)],
    'East Wing Stairs 6B':[('East Hallway 6th',5),('East Wing Stairs 5B',8)],
    'Female CR 6W':[('Male CR 6E',5),('East Wing Stairs 6A',5)],
    'Male CR 6E':[('E603',5),('Female CR 6W',5)],
    'East Hallway 6th':[('E618',14),('E617',14),('East Wing Stairs 6B',5)],
    'E600':[('E602',5),('Dome East Hallway 6th',11),('Dome North Hallway 6th',15)],
    'E602':[('E600',5),('E604',5)],
    'E603':[('Male CR 6E',5),('E605',5)],
    'E604':[('E606',5),('E602',5)],
    'E605':[('E603',5),('E607',5)],
    'E606':[('E604',5),('E608',5)],
    'E607':[('E605',5),('E609',5)],
    'E608':[('E606',5),('E610',5)],
    'E609':[('E607',5),('E611',5)],
    'E610':[('E608',5),('E612',5)],
    'E611':[('E609',5),('E613',5)],
    'E612':[('E610',5),('E614',5)],
    'E613':[('E611',5),('E615',5)],
    'E614':[('E612',5),('E616',5)],
    'E615':[('E613',5),('E617',5)],
    'E616':[('E614',5),('E618',5)],
    'E617':[('E615',5),('East Hallway 6th',14)],
    'E618':[('E616',5),('East Hallway 6th',14)],
    'South Wing Stairs 6A':[('South Hallway 6th',13),('S601',7),('S609',14),('S608',11),('South Wing Stairs 5A',8)],
    'South Hallway 6th':[('Dome South Hallway 6th',20),('South Wing Stairs 6A',13),('S609',7),('S601',7)],
    'S601':[('South Wing Stairs 6A',7),('S602',7)],
    'S602':[('S601',7),('S603',7)],
    'S603':[('S604',4),('S605',15),('S602',7)],
    'S604':[('S603',4),('S605',4)],
    'S605':[('S604',4),('S606',7),('S603',15)],
    'S606':[('S607',7),('S605',7)],
    'S607':[('S608',7),('S606',7)],
    'S608':[('S614',14),('S607',7)],
    'S609':[('S610',7),('South Wing Stairs 6A',7)],
    'S610':[('S609',7),('S611',7)],
    'S611':[('S610',7),('S613',15),('S612',4)],
    'S612':[('S611',4),('S613',4)],
    'S613':[('S611',15),('S614',7),('S612',4)],
    'S614':[('S608',14),('S613',7)]
}





