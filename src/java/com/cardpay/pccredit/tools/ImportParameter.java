package com.cardpay.pccredit.tools;

public class ImportParameter {
	//定义sheet需要读取的最大行列
	public static String RowAndCol_jy[] = {"27","J"};
	public static String RowAndCol_jjbs[] = {"12","B"};
	public static String RowAndCol_jbzk[] = {"31","J"};
	public static String RowAndCol_jyzk[] = {"57","D"};
	public static String RowAndCol_sczt[] = {"65","F"};
	public static String RowAndCol_ddpz[] = {"15","C"};
	
	public static String RowAndCol_zf[] = {"37","R"};
	public static String RowAndCol_lrjb[] = {"35","H"};
	public static String RowAndCol_bzlrb[] = {"29","Q"};
	public static String RowAndCol_zyyw[] = {"36","R"};
	public static String RowAndCol_xjllb[] = {"35","P"};
	public static String RowAndCol_jc[] = {"67","L"};
	
	public static String RowAndCol_dhd[] = {"33","E"};
	public static String RowAndCol_gdzc[] = {"24","H"};
	public static String RowAndCol_yfys[] = {"14","H"};
	public static String RowAndCol_ysyf[] = {"14","H"};
	public static String RowAndCol_lsfx[] = {"32","S"};
	public static String RowAndCol_jyb[] = {"38","AN"};
	
	//可编辑的单元格
	public static String editAble_jy[] = {
				"B3","E3","G3",
				"B4","E4","G4","I4",
				"C6",
				"C7","C7",
				"D8",
				"C9",
				"D10","F10","H10","J10",
				"D11","F11","H11","J11",
				"D12","F12","H12","J12",
				"C13","G13","J13",
				"B15","E15","G15","J15",
				"B16","E16",
				"B17","E17","G17",
				"C18","D18","H18","I18","J18",
				"D19","E19","H19",
				"D20","H20",
				"B21","D21","F21","H21","J21",
				"B22","E22",
				"B23","D23","F23","H23","J23",
				"B24","D24","F24","H24",
				"B25","E25","G25",
				"B26","D26","G26","J26",
				"D27","G27","J27"
			};
	
	public static String editAble_jjbs[] = {
		"B2","B3","B4","B5","B6","B7","B8","B9","B10","B11","B12"
	};
	
	public static String editAble_jbzk[] = {
		"B2","F2","H2","J2",
		"B3","E3","G3","I3",
		"B4","E4","J4",
		"B5","J5",
		"C6","D6",
		"D7","H7",
		"B8","D8","JF8",
		"D9","F9",
		"B10","G10",
		"B12","G12",
		"B13","D13","F13","H13","J13",
		"B14","D14","F14","H14",
		"B15","D15","F15","H15","J15",
		"B17","D17","F17","H17","J17",
		"B18","D18","F18","H18","J18",
		"B19","D19","F19","J19",
		"B20","D20","F20","I20",
		"B21","G21",
		"B22","G22",
		"B24","G24",
		"B25","G25",
		"B26",
		"B28","D28","F28","I28",
		"B29","D29","F29","H29","J29",
		"B30","D30","F30","H30","J30",
		"B31"
	};
	
	public static String editAble_jyzk[] = {
		"D2","D3","D4","D5","D6","D7","D8","D9","D10","D11","D12","D13","D14","D15","D16","D17","D18","D19","D20","D21","D22","D23","D24","D25","D26",
		"D27","D28","D29","D30","D31","D32","D33","D34","D35","D36","D37","D38","D39","D40","D41","D42","D43","D44","D45","D46","D47","D48","D49","D50",
		"D51","D52","53","D54","D55","D56","D57"
	};
	
	public static String editAble_sczt[] = {
		"F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","F13","F14","F15","F16","F17","F18","F19","F20","F21","F22","F23","F24","F25","F26",
		"F27","F28","F29","F30","F31","F32","F33","F34","F35","F36","F37","F38","F39","F40","F41","F42","F43","F44","F45","F46","F47","F48","F49","F50",
		"F51","F52","53","F54","F55","F56","F57","F58","F59","F60","F61","F62","F63","F64","F65"
	};
	
	public static String editAble_ddpz[] = {
		"C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","C12","C13","C14","C15"
	};
	
	public static String editAble_fz[] = {
		"H4","Q4",
		"H5","O5","Q5",
		"A6","F6","H6","O6","Q6",
		"A7","F7","H7","O7","Q7",
		"F8","H8","Q8",
		"F9","H9","J9","O9","Q9",
		"F10","H10","J10","O10","Q10",
		"F11","H11","J11","O11","Q11",
		"H12","O12","Q12",
		"A13","F13","H13","O13","Q13",
		"A14","F14","H14","O14","Q14",
		"A15","F15","H15","Q15",
		"A16","F16","H16","Q16",
		"H17","Q17",
		"A20",
		"A24","B24","E24","G24","I24","J24","M24","O24","Q24","R24",
		"A25","B25","E25","G25","I25","J25","M25","O25","Q25","R25",
		"A26","B26","E26","G26","I26","J26","M26","O26","Q26","R26",
		"A27","B27","E27","G27","I27","J27","M27","O27","Q27","R27",
		"A28","B28","E28","G28","I28","J28","M28","O28","Q28","R28",
		"A29","B29","E29","G29","I29","J29","M29","O29","Q29","R29",
		"A30","B30","E30","G30","I30","J30","M30","O30","Q30","R30",
		"A32",
		"D36","M36",
		"D37","M37",
	};
	
	public static String editAble_lrjb[] = {
		"F3",
		"C4","D4","E4","F4",
		"C5","D5","E5","F5",
		"C6","D6","E6","F6",
		"B7","C7","D7","E7","F7",
		
		"B9","C9","D9","E9","F9",
		"B10","C10","D10","E10","F10",
		"B11","C11","D11","E11","F11",
		"B12","C12","D12","E12","F12",
		"B13","C13","D13","E13","F13",
		"B14","C14","D14","E14","F14",
		"B15","C15","D15","E15","F15",
		"B16","C16","D16","E16","F16",
		"B17","C17","D17","E17","F17",
		"B18","C18","D18","E18","F18",
		"B19","C19","D19","E19","F19",
		"B20","C20","D20","E20","F20",
		"B21","C21","D21","E21","F21",
		"B22","C22","D22","E22","F22",
		"B23","C23","D23","E23","F23",
		
		"C25","D25","E25","F25",
		"C27","D27","E27","F27",
		"C28","D28","E28","F28",
		"C29","D29","E29","F29",
		"C30","D30","E30","F30",
		
		"C32",
		"B33","F33",
		"B34","D34","G34"
	};
	
	public static String editAble_bzlrb[] = {
		"C3","D3","E3","F3","G3","H3","I3","J3","K3","L3","M3","N3","O3",
		"C4","D4","E4","F4","G4","H4","I4","J4","K4","L4","M4","N4","O4",
		"B5","C5","D5","E5","F5","G5","H5","I5","J5","K5","L5","M5","N5","O5",
		
		"B8","C8","D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","O8",
		"B9","C9","D9","E9","F9","G9","H9","I9","J9","K9","L9","M9","N9","O9",
		"B10","C10","D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10","O10",
		"B11","C11","D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11",
		"B12","C12","D12","E12","F12","G12","H12","I12","J12","K12","L12","M12","N12","O12",
		"B13","C13","D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13",
		"B14","C14","D14","E14","F14","G14","H14","I14","J14","K14","L14","M14","N14","O14",
		"B15","C15","D15","E15","F15","G15","H15","I15","J15","K15","L15","M15","N15","O15",
		"B16","C16","D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16",
		"B17","C17","D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17",
		"B18","C18","D18","E18","F18","G18","H18","I18","J18","K18","L18","M18","N18","O18",
		"B19","C19","D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19",
		"B20","C20","D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20",
		"B21","C21","D21","E21","F21","G21","H21","I21","J21","K21","L21","M21","N21","O21",
		"B22","C22","D22","E22","F22","G22","H22","I22","J22","K22","L22","M22","N22","O22",
		
		"C23","D23","E23","F23","G23","H23","I23","J23","K23","L23","M23","N23","O23",
		
		"C25","D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25",
		"C26","D26","E26","F26","G26","H26","I26","J26","K26","L26","M26","N26","O26",
		"C27","D27","E27","F27","G27","H27","I27","J27","K27","L27","M27","N27","O27",
		"C28","D28","E28","F28","G28","H28","I28","J28","K28","L28","M28","N28","O28"
	};
	public static String editAble_zyyw[] = {
		"D4","E4","F4","G4","H4","I4","J4","K4","L4","M4","N4","O4","P4",
		"D5","E5","F5","G5","H5","I5","J5","K5","L5","M5","N5","O5","P5",
		"D7","E7","F7","G7","H7","I7","J7","K7","L7","M7","N7","O7","P7",
		"D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","O8","P8",
		"D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10","O10","P10",
		"D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11","P11",
		"D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13","P13",
		"D14","E14","F14","G14","H14","I14","J14","K14","L14","M14","N14","O14","P14",
		"D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16","P16",
		"D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17","P17",
		"D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19","P19",
		"D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20","P20",
		"D22","E22","F22","G22","H22","I22","J22","K22","L22","M22","N22","O22","P22",
		"D23","E23","F23","G23","H23","I23","J23","K23","L23","M23","N23","O23","P23",
		"D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25","P25",
		"D26","E26","F26","G26","H26","I26","J26","K26","L26","M26","N26","O26","P26",
		"D28","E28","F28","G28","H28","I28","J28","K28","L28","M28","N28","O28","P28",
		"D29","E29","F29","G29","H29","I29","J29","K29","L29","M29","N29","O29","P29",
		"D31","E31","F31","G31","H31","I31","J31","K31","L31","M31","N31","O31","P31",
		"D32","E32","F32","G32","H32","I32","J32","K32","L32","M32","N32","O32","P32"
	};
	public static String editAble_xjllb[] = {
		"C3","D3","E3","F3","G3","H3","I3","J3","K3","L3","M3","N3","O3",
		"C4","D4","E4","F4","G4","H4","I4","J4","K4","L4","M4","N4","O4",
		
		"C6","D6","E6","F6","G6","H6","I6","J6","K6","L6","M6","N6","O6",
		"C7","D7","E7","F7","G7","H7","I7","J7","K7","L7","M7","N7","O7",
		"C8","D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","O8",
		
		"C10","D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10","O10",
		"C11","D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11",
		"C12","D12","E12","F12","G12","H12","I12","J12","K12","L12","M12","N12","O12",
		"C13","D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13",
		
		"C16","D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16",
		"C17","D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17",
		
		"C19","D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19",
		"C20","D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20",
		"C21","D21","E21","F21","G21","H21","I21","J21","K21","L21","M21","N21","O21",
		
		"C24","D24","E24","F24","G24","H24","I24","J24","K24","L24","M24","N24","O24",
		"C25","D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25",
		
		"C27","D27","E27","F27","G27","H27","I27","J27","K27","L27","M27","N27","O27",
		"C28","D28","E28","F28","G28","H28","I28","J28","K28","L28","M28","N28","O28",
		
		"C30","D30","E30","F30","G30","H30","I30","J30","K30","L30","M30","N30","O30",
		"C31","D31","E31","F31","G31","H31","I31","J31","K31","L31","M31","N31","O31",
		"C32","D32","E32","F32","G32","H32","I32","J32","K32","L32","M32","N32","O32",
		
		"B35","K35"
	};
	
	public static String editAble_jc[] = {
		"D2",
		"C5","J5","L5",
		"B6","C6",
		"A7","A22","A25",
		"G7","H7","I7","J7","K7","L7",
		"G8","H8","I8","J8","K8","L8",
		"G9","H9","I9","J9","K9","L9",
		"G10","H10","I10","J10","K10","L10",
		"G11","H11","I11","J11","K11","L11",
		"G12","H12","I12","J12","K12","L12",
		"G13","H13","I13","J13","K13","L13",
		"G14","H14","I14","J14","K14","L14",
		"G15","H15","I15","J15","K15","L15",
		"G16","H16","I16","J16","K16","L16",
		"G17","H17","I17","J17","K17","L17",
		"G18","H18","I18","J18","K18","L18",
		"G19","H19","I19","J19","K19","L19",
		"G20","H20","I20","J20","K20","L20",
		"G21","H21","I21","J21","K21","L21",
		"G22","H22","I22","J22","K22","L22",
		"G23","H23","I23","J23","K23","L23",
		"G24","H24","I24","J24","K24","L24",
		"G25","H25","I25","J25","K25","L25",
		"G26","H26","I26","J26","K26","L26",
		"G27","H27","I27","J27","K27","L27",
		"G28","H28","I28","J28","K28","L28",
		"G29","H29","I29","J29","K29","L29",
		"G30","H30","I30","J30","K30","L30",
		"G31","H31","I31","J31","K31","L31",
		"G32","H32","I32","J32","K32","L32",
		"G33","H33","I33","J33","K33","L33",
		"G34","H34","I34","J34","K34","L34",
		"D36","E36","G36","H36","K36","L36",
		"D37","E37","G37","H37","K37","L37",
		"D38","E38","G38","H38","K38","L38",
		"D39","E39","G39","H39","K39","L39",
		"D40","E40","G40","H40","K40","L40",
		"D41","E41","G41","H41","K41","L41",
		"D42","E42","G42","H42","K42","L42",
		"D43","E43","G43","H43","K43","L43",
		"D44","E44","G44","H44","K44","L44",
		"D45","E45","G45","H45","K45","L45",
		"D46","E46","G46","H46","K46","L46",
		"D47","E47","G47","H47","K47","L47",
		"D48","E48","G48","H48","K48","L48",
		"D49","E49","G49","H49","K49","L49",
		"D51","E51","G51","H51",
		"D52","E52","G52","H52",
		"D53","E53","G53","H53",
		"D54","E54","G54","H54",
		"D55","E55","G55","H55",
		"D56","E56","G56","H56",
		"D57","E57","G57","H57",
		"D58","E58","G58","H58",
		"D59","E59","G59","H59",
		"D60","E60","G60","H60",
		"D61","E61","G61","H61",
		"D62","E62","G62","H62",
		"D63","E63","G63","H63",
		"D64","E64","G64","H64",
		"B66",
		"B67"
	};
	
	public static String editAble_dhd[] = {
		"A4","B4","C4","D4","E4",
		"A5","B5","C5","D5","E5",
		"A6","B6","C6","D6","E6",
		"A7","B7","C7","D7","E7",
		"A8","B8","C8","D8","E8",
		"A9","B9","C9","D9","E9",
		"A10","B10","C10","D10","E10",
		"A11","B11","C11","D11","E11",
		"A12","B12","C12","D12","E12",
		"A13","B13","C13","D13","E13",
		"A14","B14","C14","D14","E14",
		"A15","B15","C15","D15","E15",
		"A16","B16","C16","D16","E16",
		"A17","B17","C17","D17","E17",
		"A18","B18","C18","D18","E18",
		"A19","B19","C19","D19","E19",
		"A20","B20","C20","D20","E20",
		"A21","B21","C21","D21","E21",
		"A22","B22","C22","D22","E22",
		"A23","B23","C23","D23","E23",
		"A24","B24","C24","D24","E24",
		"A25","B25","C25","D25","E25",
		"A26","B26","C26","D26","E26",
		"A27","B27","C27","D27","E27",
		"A28","B28","C28","D28","E28",
		"A29","B29","C29","D29","E29",
		"A30","B30","C30","D30","E30",
		"A31","B31","C31","D31","E31",
		"A32","B32","C32","D32","E32",
		"A33","B33","C33","D33","E33"
	};
	
	public static String editAble_gdzc[] = {
		"B4","C4","D4","E4","F4","G4","H4",
		"B5","C5","D5","E5","F5","G5","H5",
		"B6","C6","D6","E6","F6","G6","H6",
		"B7","C7","D7","E7","F7","G7","H7",
		"B8","C8","D8","E8","F8","G8","H8",
		"B9","C9","D9","E9","F9","G9","H9",
		"B10","C10","D10","E10","F10","G10","H10",
		"B11","C11","D11","E11","F11","G11","H11",
		"B12","C12","D12","E12","F12","G12","H12",
		"B13","C13","D13","E13","F13","G13","H13",
		"B14","C14","D14","E14","F14","G14","H14",
		"B15","C15","D15","E15","F15","G15","H15",
		"B16","C16","D16","E16","F16","G16","H16",
		"B17","C17","D17","E17","F17","G17","H17",
		"B18","C18","D18","E18","F18","G18","H18",
		"B19","C19","D19","E19","F19","G19","H19",
		"B20","C20","D20","E20","F20","G20","H20",
		"B21","C21","D21","E21","F21","G21","H21",
		"B22","C22","D22","E22","F22","G22","H22",
		"B23","C23","D23","E23","F23","G23","H23"
	};
	
	public static String editAble_yfys[] = {
		"B4","C4","D4","E4","F4","G4","H4",
		"B5","C5","D5","E5","F5","G5","H5",
		"B6","C6","D6","E6","F6","G6","H6",
		"B7","C7","D7","E7","F7","G7","H7",
		"B8","C8","D8","E8","F8","G8","H8",
		"B9","C9","D9","E9","F9","G9","H9",
		"B10","C10","D10","E10","F10","G10","H10",
		"B11","C11","D11","E11","F11","G11","H11",
		"B12","C12","D12","E12","F12","G12","H12",
		"B13","C13","D13","E13","F13","G13","H13"
	};
	
	public static String editAble_ysyf[] = {
		"B4","C4","D4","E4","F4","G4","H4",
		"B5","C5","D5","E5","F5","G5","H5",
		"B6","C6","D6","E6","F6","G6","H6",
		"B7","C7","D7","E7","F7","G7","H7",
		"B8","C8","D8","E8","F8","G8","H8",
		"B9","C9","D9","E9","F9","G9","H9",
		"B10","C10","D10","E10","F10","G10","H10",
		"B11","C11","D11","E11","F11","G11","H11",
		"B12","C12","D12","E12","F12","G12","H12",
		"B13","C13","D13","E13","F13","G13","H13"
	};
	
	public static String editAble_lsfx[] = {
		"B2","F2","P2","S2",
		"C3","I3","M3","Q3","S3",
		"C4","D4","E4","F4","G4","H4","I4","J4","K4","L4","M4","N4",
		"C5","D5","E5","F5","G5","H5","I5","J5","K5","L5","M5","N5","O5","P5",
		"C6","D6","E6","F6","G6","H6","I6","J6","K6","L6","M6","N6","O6","P6",
		"C7","D7","E7","F7","G7","H7","I7","J7","K7","L7","M7","N7","O7","P7",
		"C8","D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","P8",
		"C10","D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10",
		
		"C11","D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11","P11",
		"C12","D12","E12","F12","G12","H12","I12","J12","K12","L12","M12","N12","O12",
		"C13","D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13",
		"C14","D14","E14","F14","G14","H14","I14","J14","K14","L14","M14","N14","O14","P14",
		"C15","D15","E15","F15","G15","H15","I15","J15","K15","L15","M15","N15","O15",
		"C16","D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16",
		"C17","D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17","P17",
		"C18","D18","E18","F18","G18","H18","I18","J18","K18","L18","M18","N18","O18",
		"C19","D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19",
		"C20","D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20","P20",
		"C21","D21","E21","F21","G21","H21","I21","J21","K21","L21","M21","N21","O21",
		"C22","D22","E22","F22","G22","H22","I22","J22","K22","L22","M22","N22","O22",
		"C23","D23","E23","F23","G23","H23","I23","J23","K23","L23","M23","N23","O23","P23",
		"C24","D24","E24","F24","G24","H24","I24","J24","K24","L24","M24","N24","O24",
		"C25","D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25",
		
		"B27","L27",
		"B28"
	};
	public static String editAble_jyb[] = {
		"E3","N3","W3","AE3",
		"F5","N5","T5","Z5",
		"F7",
		"F9","U9",
		"F11","M11","U11",
		"F12","M12","U12",
		"F13","M13","U13",
		"F14","M14","U14",
		"F16","H16","M16","Q16","U16","AC16","AG16",
		"F17","H17","M17","Q17","U17","AC17","AG17",
		"F18","H18","M18","Q18","U18","AC18","AG18",
		"F19","H19","M19","Q19","U19","AC19","AG19",
		"AC20",
		"F21",
		"I24","Y24",
		"I25","X25","AJ25",
		"F33",
		"F34",
		"F36","R36","AD36",
		"F37","R37","AD37",
	};
	
	
	//取数据用做pad展示
		public static String padAble_jy[] = {
					"B3","E3","G3",
					"B4","E4","G4","I4",
					"C6",
					"C7","C7",
					"D8",
					"C9",
					"D10","F10","H10","J10",
					"D11","F11","H11","J11",
					"D12","F12","H12","J12",
					"C13","G13","J13",
					"B15","E15","G15","J15",
					"B16","E16",
					"B17","E17","G17",
					"C18","D18","H18","I18","J18",
					"D19","E19","H19",
					"D20","H20",
					"B21","D21","F21","H21","J21",
					"B22","E22",
					"B23","D23","F23","H23","J23",
					"B24","D24","F24","H24",
					"B25","E25","G25",
					"B26","D26","G26","J26",
					"D27","G27","J27"
				};
		
		public static String padAble_jjbs[] = {
			"B2","B3","B4","B5","B6","B7","B8","B9","B10","B11","B12"
		};
		
		public static String padAble_jbzk[] = {
			"B2","F2","H2","J2",
			"B3","E3","G3","I3",
			"B4","E4","J4",
			"B5","J5",
			"C6","D6",
			"D7","H7",
			"B8","D8","JF8",
			"D9","F9",
			"B10","G10",
			"B12","G12",
			"B13","D13","F13","H13","J13",
			"B14","D14","F14","H14",
			"B15","D15","F15","H15","J15",
			"B17","D17","F17","H17","J17",
			"B18","D18","F18","H18","J18",
			"B19","D19","F19","J19",
			"B20","D20","F20","I20",
			"B21","G21",
			"B22","G22",
			"B24","G24",
			"B25","G25",
			"B26",
			"B28","D28","F28","I28",
			"B29","D29","F29","H29","J29",
			"B30","D30","F30","H30","J30",
			"B31"
		};
		
		public static String padAble_jyzk[] = {
			"D2","D3","D4","D5","D6","D7","D8","D9","D10","D11","D12","D13","D14","D15","D16","D17","D18","D19","D20","D21","D22","D23","D24","D25","D26",
			"D27","D28","D29","D30","D31","D32","D33","D34","D35","D36","D37","D38","D39","D40","D41","D42","D43","D44","D45","D46","D47","D48","D49","D50",
			"D51","D52","53","D54","D55","D56","D57"
		};
		
		public static String padAble_sczt[] = {
			"F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","F13","F14","F15","F16","F17","F18","F19","F20","F21","F22","F23","F24","F25","F26",
			"F27","F28","F29","F30","F31","F32","F33","F34","F35","F36","F37","F38","F39","F40","F41","F42","F43","F44","F45","F46","F47","F48","F49","F50",
			"F51","F52","53","F54","F55","F56","F57","F58","F59","F60","F61","F62","F63","F64","F65"
		};
		
		public static String padAble_ddpz[] = {
			"C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","C12","C13","C14","C15"
		};
		
		public static String padAble_fz[] = {
			"F4","O4",
			"F5","O5",
			"F6","O6",
			"F7","O7",
			"F8","O8",
			"F9","O9",
			"F10","O10",
			"F11","O11",
			"F12","O12",
			"F13","O13",
			"F14","O14",
			"F15","O15",
			"F16","O16",
			"F17","O17",
			"A20",
			"A24","B24","E24","G24","I24","J24","M24","O24","Q24","R24",
			"A25","B25","E25","G25","I25","J25","M25","O25","Q25","R25",
			"A26","B26","E26","G26","I26","J26","M26","O26","Q26","R26",
			"A27","B27","E27","G27","I27","J27","M27","O27","Q27","R27",
			"A28","B28","E28","G28","I28","J28","M28","O28","Q28","R28",
			"A29","B29","E29","G29","I29","J29","M29","O29","Q29","R29",
			"A30","B30","E30","G30","I30","J30","M30","O30","Q30","R30",
			"A32",
			"D36","M36",
			"D37","M37",
		};
		
		public static String padAble_lrjb[] = {
			"F3",
			"C4","D4","E4","F4",
			"C5","D5","E5","F5",
			"C6","D6","E6","F6","G6","H6",
			"B7","C7","D7","E7","F7","G7","H7",
			"C8","D8","E8","F8","G8","H8",
			"B9","C9","D9","E9","F9","G8","H8",
			"B10","C10","D10","E10","F10","G10","H10",
			"B11","C11","D11","E11","F11","G11","H11",
			"B12","C12","D12","E12","F12","G12","H12",
			"B13","C13","D13","E13","F13","G13","H13",
			"B14","C14","D14","E14","F14","G14","H14",
			"B15","C15","D15","E15","F15","G15","H15",
			"B16","C16","D16","E16","F16","G16","H16",
			"B17","C17","D17","E17","F17","G17","H17",
			"B18","C18","D18","E18","F18","G18","H18",
			"B19","C19","D19","E19","F19","G19","H19",
			"B20","C20","D20","E20","F20","G20","H20",
			"B21","C21","D21","E21","F21","G21","H21",
			"B22","C22","D22","E22","F22","G22","H22",
			"B23","C23","D23","E23","F23","G23","H23",
			"C24","D24","E24","F24","G24","H24",
			"C25","D25","E25","F25","G25","H25",
			"C26","D26","E26","F26","G26","H26",
			"C27","D27","E27","F27","G27","H27",
			"C28","D28","E28","F28","G28","H28",
			"C29","D29","E29","F29","G29","H29",
			"C30","D30","E30","F30","G30","H30",
			"C31","D31","E31","F31","G31","H31",
			"C32",
			"B33","F33",
			"B34","D34","G34"
		};
		
		public static String padAble_bzlrb[] = {
			"C3","D3","E3","F3","G3","H3","I3","J3","K3","L3","M3","N3","O3",
			"C4","D4","E4","F4","G4","H4","I4","J4","K4","L4","M4","N4","O4","P4","Q4",
			"B5","C5","D5","E5","F5","G5","H5","I5","J5","K5","L5","M5","N5","O5","P5","Q5",
			"C6","D6","E6","F6","G6","H6","I6","J6","K6","L6","M6","N6","O6","P6","Q6",
			"C7","D7","E7","F7","G7","H7","I7","J7","K7","L7","M7","N7","O7","P7","Q7",
			"B8","C8","D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","O8","P8","Q8",
			"B9","C9","D9","E9","F9","G9","H9","I9","J9","K9","L9","M9","N9","O9","P9","Q9",
			"B10","C10","D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10","O10","P10","Q10",
			"B11","C11","D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11","P11","Q11",
			"B12","C12","D12","E12","F12","G12","H12","I12","J12","K12","L12","M12","N12","O12","P12","Q12",
			"B13","C13","D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13","P13","Q13",
			"B14","C14","D14","E14","F14","G14","H14","I14","J14","K14","L14","M14","N14","O14","P14","Q14",
			"B15","C15","D15","E15","F15","G15","H15","I15","J15","K15","L15","M15","N15","O15","P15","Q15",
			"B16","C16","D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16","P16","Q16",
			"B17","C17","D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17","P17","Q17",
			"B18","C18","D18","E18","F18","G18","H18","I18","J18","K18","L18","M18","N18","O18","P18","Q18",
			"B19","C19","D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19","P19","Q19",
			"B20","C20","D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20","P20","Q20",
			"B21","C21","D21","E21","F21","G21","H21","I21","J21","K21","L21","M21","N21","O21","P21","Q21",
			"B22","C22","D22","E22","F22","G22","H22","I22","J22","K22","L22","M22","N22","O22","P22","Q22",
			
			"C23","D23","E23","F23","G23","H23","I23","J23","K23","L23","M23","N23","O23","P23","Q23",
			"C24","D24","E24","F24","G24","H24","I24","J24","K24","L24","M24","N24","O24","P24","Q24",
			"C25","D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25","P25","Q25",
			"C26","D26","E26","F26","G26","H26","I26","J26","K26","L26","M26","N26","O26","P26","Q26",
			"C27","D27","E27","F27","G27","H27","I27","J27","K27","L27","M27","N27","O27","P27","Q27",
			"C28","D28","E28","F28","G28","H28","I28","J28","K28","L28","M28","N28","O28","P28","Q28",
			"C29","D29","E29","F29","G29","H29","I29","J29","K29","L29","M29","N29","O29","P29","Q29"
		};
		
		public static String padAble_xjllb[] = {
			"C3","D3","E3","F3","G3","H3","I3","J3","K3","L3","M3","N3","O3",
			"C5","D5","E5","F5","G5","H5","I5","J5","K5","L5","M5","N5","O5","P5",
			
			"C6","D6","E6","F6","G6","H6","I6","J6","K6","L6","M6","N6","O6","P6",
			"C7","D7","E7","F7","G7","H7","I7","J7","K7","L7","M7","N7","O7","P7",
			"C8","D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","O8","P8",
			"C9","D9","E9","F9","G9","H9","I9","J9","K9","L9","M9","N9","O9","P9",
			"C10","D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10","O10","P10",
			"C11","D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11","P11",
			"C12","D12","E12","F12","G12","H12","I12","J12","K12","L12","M12","N12","O12","P12",
			"C13","D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13","P13",
			"C14","D14","E14","F14","G14","H14","I14","J14","K14","L14","M14","N14","O14","P14",
			"C15","D15","E15","F15","G15","H15","I15","J15","K15","L15","M15","N15","O15","P15",
			"C16","D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16","P16",
			"C17","D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17","P17",
			"C18","D18","E18","F18","G18","H18","I18","J18","K18","L18","M18","N18","O18","P18",
			"C19","D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19","P19",
			"C20","D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20","P20",
			"C21","D21","E21","F21","G21","H21","I21","J21","K21","L21","M21","N21","O21","P21",
			"C22","D22","E22","F22","G22","H22","I22","J22","K22","L22","M22","N22","O22","P22",
			"C23","D23","E23","F23","G23","H23","I23","J23","K23","L23","M23","N23","O23","P23",
			"C24","D24","E24","F24","G24","H24","I24","J24","K24","L24","M24","N24","O24","P24",
			"C25","D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25","P25",
			"C26","D26","E26","F26","G26","H26","I26","J26","K26","L26","M26","N26","O26","P26",
			"C27","D27","E27","F27","G27","H27","I27","J27","K27","L27","M27","N27","O27","P27",
			"C28","D28","E28","F28","G28","H28","I28","J28","K28","L28","M28","N28","O28","P28",
			"C29","D29","E29","F29","G29","H29","I29","J29","K29","L29","M29","N29","O29","P29",
			"C30","D30","E30","F30","G30","H30","I30","J30","K30","L30","M30","N30","O30","P30",
			"C31","D31","E31","F31","G31","H31","I31","J31","K31","L31","M31","N31","O31","P31",
			"C32","D32","E32","F32","G32","H32","I32","J32","K32","L32","M32","N32","O32","P32",
			"C33","D33","E33","F33","G33","H33","I33","J33","K33","L33","M33","N33","O33","P33",
			"C34","D34","E34","F34","G34","H34","I34","J34","K34","L34","M34","N34","O34","P34",
			"B35","K35"
		};
		
		public static String padAble_jc[] = {
			"D2",
			"C5","J5","L5",
			"B6","C6",
			"A7","A22","A25",
			"G7","H7","I7","J7","K7","L7",
			"G8","H8","I8","J8","K8","L8",
			"G9","H9","I9","J9","K9","L9",
			"G10","H10","I10","J10","K10","L10",
			"G11","H11","I11","J11","K11","L11",
			"G12","H12","I12","J12","K12","L12",
			"G13",
			"G14",
			"H19","J19","L19",
			
			"I22","J22",
			"I23","J23",
			"I24","J24",
			"I25","J25",
			"I26","J26",
			"I27","J27",
			"I28","J28",
			"I29","J29",
			"I30","J30",
			"I31","J31",
			"I32","J32",
			"I33","J33",
			"I34","J34"
			
		};
		
		public static String padAble_dhd[] = {
			"A4","B4","C4","D4","E4",
			"A5","B5","C5","D5","E5",
			"A6","B6","C6","D6","E6",
			"A7","B7","C7","D7","E7",
			"A8","B8","C8","D8","E8",
			"A9","B9","C9","D9","E9",
			"A10","B10","C10","D10","E10",
			"A11","B11","C11","D11","E11",
			"A12","B12","C12","D12","E12",
			"A13","B13","C13","D13","E13",
			"A14","B14","C14","D14","E14",
			"A15","B15","C15","D15","E15",
			"A16","B16","C16","D16","E16",
			"A17","B17","C17","D17","E17",
			"A18","B18","C18","D18","E18",
			"A19","B19","C19","D19","E19",
			"A20","B20","C20","D20","E20",
			"A21","B21","C21","D21","E21",
			"A22","B22","C22","D22","E22",
			"A23","B23","C23","D23","E23",
			"A24","B24","C24","D24","E24",
			"A25","B25","C25","D25","E25",
			"A26","B26","C26","D26","E26",
			"A27","B27","C27","D27","E27",
			"A28","B28","C28","D28","E28",
			"A29","B29","C29","D29","E29",
			"A30","B30","C30","D30","E30",
			"A31","B31","C31","D31","E31",
			"A32","B32","C32","D32","E32",
			"A33","B33","C33","D33","E33"
		};
		
		public static String padAble_gdzc[] = {
			"B4","C4","D4","E4","F4","G4","H4",
			"B5","C5","D5","E5","F5","G5","H5",
			"B6","C6","D6","E6","F6","G6","H6",
			"B7","C7","D7","E7","F7","G7","H7",
			"B8","C8","D8","E8","F8","G8","H8",
			"B9","C9","D9","E9","F9","G9","H9",
			"B10","C10","D10","E10","F10","G10","H10",
			"B11","C11","D11","E11","F11","G11","H11",
			"B12","C12","D12","E12","F12","G12","H12",
			"B13","C13","D13","E13","F13","G13","H13",
			"B14","C14","D14","E14","F14","G14","H14",
			"B15","C15","D15","E15","F15","G15","H15",
			"B16","C16","D16","E16","F16","G16","H16",
			"B17","C17","D17","E17","F17","G17","H17",
			"B18","C18","D18","E18","F18","G18","H18",
			"B19","C19","D19","E19","F19","G19","H19",
			"B20","C20","D20","E20","F20","G20","H20",
			"B21","C21","D21","E21","F21","G21","H21",
			"B22","C22","D22","E22","F22","G22","H22",
			"B23","C23","D23","E23","F23","G23","H23"
		};
		
		public static String padAble_yfys[] = {
			"B4","C4","D4","E4","F4","G4","H4",
			"B5","C5","D5","E5","F5","G5","H5",
			"B6","C6","D6","E6","F6","G6","H6",
			"B7","C7","D7","E7","F7","G7","H7",
			"B8","C8","D8","E8","F8","G8","H8",
			"B9","C9","D9","E9","F9","G9","H9",
			"B10","C10","D10","E10","F10","G10","H10",
			"B11","C11","D11","E11","F11","G11","H11",
			"B12","C12","D12","E12","F12","G12","H12",
			"B13","C13","D13","E13","F13","G13","H13"
		};
		
		public static String padAble_ysyf[] = {
			"B4","C4","D4","E4","F4","G4","H4",
			"B5","C5","D5","E5","F5","G5","H5",
			"B6","C6","D6","E6","F6","G6","H6",
			"B7","C7","D7","E7","F7","G7","H7",
			"B8","C8","D8","E8","F8","G8","H8",
			"B9","C9","D9","E9","F9","G9","H9",
			"B10","C10","D10","E10","F10","G10","H10",
			"B11","C11","D11","E11","F11","G11","H11",
			"B12","C12","D12","E12","F12","G12","H12",
			"B13","C13","D13","E13","F13","G13","H13"
		};
		
		public static String padAble_lsfx[] = {
			"B2","F2","P2","S2",
			"C3","I3","M3","Q3","S3",
			"C4","D4","E4","F4","G4","H4","I4","J4","K4","L4","M4","N4",
			"C5","D5","E5","F5","G5","H5","I5","J5","K5","L5","M5","N5","O5","P5",
			"C6","D6","E6","F6","G6","H6","I6","J6","K6","L6","M6","N6","O6","P6",
			"C7","D7","E7","F7","G7","H7","I7","J7","K7","L7","M7","N7","O7","P7",
			"C8","D8","E8","F8","G8","H8","I8","J8","K8","L8","M8","N8","P8",
			"C10","D10","E10","F10","G10","H10","I10","J10","K10","L10","M10","N10",
			
			"C11","D11","E11","F11","G11","H11","I11","J11","K11","L11","M11","N11","O11","P11",
			"C12","D12","E12","F12","G12","H12","I12","J12","K12","L12","M12","N12","O12",
			"C13","D13","E13","F13","G13","H13","I13","J13","K13","L13","M13","N13","O13",
			"C14","D14","E14","F14","G14","H14","I14","J14","K14","L14","M14","N14","O14","P14",
			"C15","D15","E15","F15","G15","H15","I15","J15","K15","L15","M15","N15","O15",
			"C16","D16","E16","F16","G16","H16","I16","J16","K16","L16","M16","N16","O16",
			"C17","D17","E17","F17","G17","H17","I17","J17","K17","L17","M17","N17","O17","P17",
			"C18","D18","E18","F18","G18","H18","I18","J18","K18","L18","M18","N18","O18",
			"C19","D19","E19","F19","G19","H19","I19","J19","K19","L19","M19","N19","O19",
			"C20","D20","E20","F20","G20","H20","I20","J20","K20","L20","M20","N20","O20","P20",
			"C21","D21","E21","F21","G21","H21","I21","J21","K21","L21","M21","N21","O21",
			"C22","D22","E22","F22","G22","H22","I22","J22","K22","L22","M22","N22","O22",
			"C23","D23","E23","F23","G23","H23","I23","J23","K23","L23","M23","N23","O23","P23",
			"C24","D24","E24","F24","G24","H24","I24","J24","K24","L24","M24","N24","O24",
			"C25","D25","E25","F25","G25","H25","I25","J25","K25","L25","M25","N25","O25",
			
			"B27","L27",
			"B28"
		};
}
