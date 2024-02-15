chk_first_floor = {
    'CHK Veranda': [('P.E Building', 1), ('CHK1FS1', 2), ('CHK 101', 2), ('CHK 102', 2)], 
    'CHK1FS1': [('CHK Veranda', 2), ('CHK PH1', 3), ('CHK 101', 2),('CHK2FS1', 1)],
    'CHK1FS2': [('CHK 108', 2), ('PH2', 3), ('CHK2FS2', 1)],
    'CHK PH1':[('CHKR 1', 1), ('CHKCR 1', 1), ('CHK1FS1', 3), ('CHK 101', 3)],
    'CHK PH2': [('CHK1FS2', 3), ('CHKR 2', 1), ('CHKCR 2', 1), ('CHK 108', 3)],
    'CHKR 1': [('CHK PH1', 1), ('CHKCR 1', 1)],
    'CHKR 2': [('CHK PH2', 1), ('CHKCR 2', 1)],
    'CHKCR 1': [('CHK PH1', 1), ('CHKR 1', 1)],
    'CHKCR 2': [('CHK PH2', 1), ('CHKR 2', 1)],
    'CHK 101': [('CHK1FS1', 2), ('CHK Veranda', 2), ('CHK 102', 2), ('CHK PH1', 3)],
    'CHK 102': [('CHK 101', 2), ('CHK 103', 2), ('CHK Veranda', 2)],
    'CHK 103': [('CHK 102', 2), ('CHK 104', 2)],
    'CHK 104': [('CHK 103', 2), ('CHK 105', 2)],
    'CHK 105': [('CHK 104', 2), ('CHK 106', 2)],
    'CHK 106': [('CHK 105', 2), ('CHK 107', 2)],
    'CHK 107': [('CHK 106', 2), ('CHK 108', 2)],
    'CHK 108': [('CHK 107', 2), ('CHK1FS2', 2), ('CHK PH2', 3)]
}

chk_second_floor = {
    'CHK2FS1': [('CHK 201', 1), ('CHK1FS1', 1)],
    'CHK2FS2':[('CHK 208', 1), ('CHK1FS1', 1)],
    'CHK 201': [('CHK2FS1', 1), ('CHK 202', 2)],
    'CHK 202': [('CHK 201', 2), ('CHK 203', 2)],
    'CHK 203': [('CHK 202', 2), ('CHK 204', 2)],
    'CHK 204': [('CHK 203', 2), ('CHK 205', 2)],
    'CHK 205': [('CHK 204',2), ('CHK 206', 2)],
    'CHK 206': [('CHK 205', 2), ('CHK 207', 2)],
    'CHK 207': [('CHK 206', 2), ('CHK 208', 2)],
    'CHK 208': [('CHK2FS2', 1), ('CHK 207', 2)]
}  

all_chk = {
    # entrance'P.E Building (P.EB)':[('Way ABA (ABA)',38), ('CHK Veranda',1)],
    # 1st and 2nd floor
    'CHK Veranda': [('P.E Building (P.EB)', 1), ('CHK1FS1', 2), ('CHK 101', 2), ('CHK 102', 2)], 
    'CHK1FS1': [('CHK Veranda', 2), ('CHK PH1', 3), ('CHK 101', 2),('CHK2FS1', 1)],
    'CHK1FS2': [('CHK 108', 2), ('PH2', 3), ('CHK2FS2', 1)],
    'CHK PH1':[('CHKR 1', 1), ('CHKCR 1', 1), ('CHK1FS1', 3), ('CHK 101', 3)],
    'CHK PH2': [('CHK1FS2', 3), ('CHKR 2', 1), ('CHKCR 2', 1), ('CHK 108', 3)],
    'CHKR 1': [('CHK PH1', 1), ('CHKCR 1', 1)],
    'CHKR 2': [('CHK PH2', 1), ('CHKCR 2', 1)],
    'CHKCR 1': [('CHK PH1', 1), ('CHKR 1', 1)],
    'CHKCR 2': [('CHK PH2', 1), ('CHKR 2', 1)],
    'CHK 101': [('CHK1FS1', 2), ('CHK Veranda', 2), ('CHK 102', 2), ('CHK PH1', 3)],
    'CHK 102': [('CHK 101', 2), ('CHK 103', 2), ('CHK Veranda', 2)],
    'CHK 103': [('CHK 102', 2), ('CHK 104', 2)],
    'CHK 104': [('CHK 103', 2), ('CHK 105', 2)],
    'CHK 105': [('CHK 104', 2), ('CHK 106', 2)],
    'CHK 106': [('CHK 105', 2), ('CHK 107', 2)],
    'CHK 107': [('CHK 106', 2), ('CHK 108', 2)],
    'CHK 108': [('CHK 107', 2), ('CHK1FS2', 2), ('CHK PH2', 3)],
    'CHK2FS1': [('CHK 201', 1), ('CHK1FS1', 1)],
    'CHK2FS2':[('CHK 208', 1), ('CHK1FS1', 1)],
    'CHK 201': [('CHK2FS1', 1), ('CHK 202', 2)],
    'CHK 202': [('CHK 201', 2), ('CHK 203', 2)],
    'CHK 203': [('CHK 202', 2), ('CHK 204', 2)],
    'CHK 204': [('CHK 203', 2), ('CHK 205', 2)],
    'CHK 205': [('CHK 204',2), ('CHK 206', 2)],
    'CHK 206': [('CHK 205', 2), ('CHK 207', 2)],
    'CHK 207': [('CHK 206', 2), ('CHK 208', 2)],
    'CHK 208': [('CHK2FS2', 1), ('CHK 207', 2)]
}