charlie_first_floor = {
    'Charlie Entrance (CE)': [('Charlie Del Rosario (CDR)', 5),('CH1FS1', 6), ('Charlie Lobby', 20)],
    'Charlie Lobby': [('Charlie Entrance (CE)', 20), ('CH1FS1', 19), ('CH1FS2', 34)],
    'CH1FS1': [('Charlie Entrance (CE)', 6), ('Charlie Lobby', 19), ('CH2FS1', 8)],
    'CH1FS2': [('Charlie Lobby', 34), ('CH2FS2', 8)]
}

charlie_second_floor = {
    'CH2FS1': [('SH1', 3),('CH1FS1', 8)],
    'CH2FS2': [('CR 212', 3), ('MH2', 4), ('CH1FS2', 8)],
    'SH1': [('CH2FS1', 3), ('SH2', 5)],
    'SH2': [('SH1', 5), ('MH1', 6)],
    'MH1': [('PH1', 6), ('CR 201', 4), ('CR 202', 5) ],
    'MH2': [('PH2', 6), ('CR 211', 5), ('CR 212', 4), ('CH2FS2', 4), ('CR 210', 6)] ,
    'PH1': [('MH1', 6), ('CCR 1', 1), ('CR 1', 1)],
    'PH2': [('MH2', 6), ('CCR 2', 1), ('CR 2', 1)],
    'CR 1': [('PH1', 1), ('CCR 1', 1)],
    'CR 2': [('PH2', 1), ('CCR 2', 1)],
    'CCR 1': [('PH1', 1), ('CR 1', 1)],
    'CCR 2': [('PH1', 1), ('CR 1', 1)],
    'CR 201': [('CR 203', 4), ('MH1', 4 )],
    'CR 202': [('MH1', 5), ('CR 204', 4), ('CR 203', 11)],
    'CR 203': [('CR 205', 4), ('CR 201', 4), ('CR 204', 8), ('CR 202', 11)],
    'CR 204': [('CR 202', 4), ('CR 206', 4), ('CR 203', 8)],
    'CR 205': [('CR 207', 4), ('CR 203', 4), ('CR 206', 8)],
    'CR 206': [('CR 204', 4), ('CR 208', 4), ('CR 207', 9), ('CR 205', 8)],
    'CR 207': [('CR 209', 4), ('CR 205', 4), ('CR 206', 9)],
    'CR 208': [('CR 206', 4), ('CR 210', 4), ('CR 209', 8)],
    'CR 209': [('CR 211', 4), ('CR 207', 4), ('CR 210', 9), ('CR 208', 8)],
    'CR 210': [('CR 208', 4), ('CR 212', 4), ('CR 209', 9), ('MH2', 6)],
    'CR 211': [('MH2', 5), ('CR 209', 4)],
    'CR 212': [('CR 210', 4), ('CH2FS2', 3), ('MH2', 4)]
}

all_charlie = {
    # entrance 'Charlie Del Rosario (CDR)':[('Way AAO (AAO)',29), ('Way AAW (AAW)',28), ('Way AAX (AAX)',31), ('Charlie Entrance (CE)', 5)],
    # 1st and 2nd floor
    'Charlie Entrance (CE)': [('Charlie Del Rosario (CDR)', 5),('CH1FS1', 6), ('Charlie Lobby', 20)],
    'Charlie Lobby': [('Charlie Entrance (CE)', 20), ('CH1FS1', 19), ('CH1FS2', 34)],
    'CH1FS1': [('Charlie Entrance (CE)', 6), ('Charlie Lobby', 19), ('CH2FS1', 8)],
    'CH1FS2': [('Charlie Lobby', 34), ('CH2FS2', 8)],
    'CH2FS1': [('SH1', 3),('CH1FS1', 8)],
    'CH2FS2': [('CR 212', 3), ('MH2', 4), ('CH1FS2', 8)],
    'SH1': [('CH2FS1', 3), ('SH2', 5)],
    'SH2': [('SH1', 5), ('MH1', 6)],
    'MH1': [('PH1', 6), ('CR 201', 4), ('CR 202', 5) ],
    'MH2': [('PH2', 6), ('CR 211', 5), ('CR 212', 4), ('CH2FS2', 4), ('CR 210', 6)] ,
    'PH1': [('MH1', 6), ('CCR 1', 1), ('CR 1', 1)],
    'PH2': [('MH2', 6), ('CCR 2', 1), ('CR 2', 1)],
    'CR 1': [('PH1', 1), ('CCR 1', 1)],
    'CR 2': [('PH2', 1), ('CCR 2', 1)],
    'CCR 1': [('PH1', 1), ('CR 1', 1)],
    'CCR 2': [('PH1', 1), ('CR 1', 1)],
    'CR 201': [('CR 203', 4), ('MH1', 4 )],
    'CR 202': [('MH1', 5), ('CR 204', 4), ('CR 203', 11)],
    'CR 203': [('CR 205', 4), ('CR 201', 4), ('CR 204', 8), ('CR 202', 11)],
    'CR 204': [('CR 202', 4), ('CR 206', 4), ('CR 203', 8)],
    'CR 205': [('CR 207', 4), ('CR 203', 4), ('CR 206', 8)],
    'CR 206': [('CR 204', 4), ('CR 208', 4), ('CR 207', 9), ('CR 205', 8)],
    'CR 207': [('CR 209', 4), ('CR 205', 4), ('CR 206', 9)],
    'CR 208': [('CR 206', 4), ('CR 210', 4), ('CR 209', 8)],
    'CR 209': [('CR 211', 4), ('CR 207', 4), ('CR 210', 9), ('CR 208', 8)],
    'CR 210': [('CR 208', 4), ('CR 212', 4), ('CR 209', 9), ('MH2', 6)],
    'CR 211': [('MH2', 5), ('CR 209', 4)],
    'CR 212': [('CR 210', 4), ('CH2FS2', 3), ('MH2', 4)]
}

